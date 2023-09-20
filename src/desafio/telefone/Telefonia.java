package desafio.telefone;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import desafio.exeções.ContatoNaoExiste;

public class Telefonia {
    private Map<String, Contatos> mapaDeContatos = new HashMap<>();

    public void adicionarContato(String nome, String numero) {
        if (!verificarContato(nome)) {
            Contatos novoContato = new Contatos(nome, numero);
            mapaDeContatos.put(nome, novoContato);
            System.out.println("Contato " + nome + " adicionado com sucesso.");
        }else{
            System.out.println("O contato " + nome + " já existe!");
        }
    }

    private boolean verificarContato(String nomeContato){
        boolean contatoExistente = false;

        for (Contatos contato : mapaDeContatos.values()) {
            if (contato.getName().equals(nomeContato)) {
                contatoExistente = true;
                break;
            }
        }
        return contatoExistente;
    }

    public void mostrarListaContatos() throws ContatoNaoExiste {
        if (mapaDeContatos.isEmpty()) {
            throw new ContatoNaoExiste("A lista de contatos está vazia.");
        }

        for (Contatos contato : mapaDeContatos.values()) {
            System.out.println(contato);
        }
    }

    public void excluirContato(String nomeExcluir) {
        if (mapaDeContatos.containsKey(nomeExcluir)) {
            mapaDeContatos.remove(nomeExcluir);
            System.out.println("Contato " + nomeExcluir + " excluído com sucesso.");
        } else {
            System.out.println("Contato não encontrado: " + nomeExcluir);
        }
    }

    Random random = new Random();
    private String assuntos[] = { "Cinema", "Desenho", "Comida", "Música", "Video-game" };

    public void ligarContatos(String nome) throws ContatoNaoExiste {
        int tentativa = 0;
        Contatos contato = verificaNome(nome);

        if (contato != null) {
            System.out.println("Ligando para " + contato.getName());

            boolean sucesso = false;

            while (tentativa < 3) {
                if (ligarTentiva()) {
                    System.out.println("Contato realizado com sucesso na tentativa " + (tentativa + 1) + "!");
                    atenderTelefone();
                    sucesso = true;
                    break;
                } else {
                    System.out.println("Tentativa " + (tentativa + 1) + " falhou!");
                }

                tentativa++;
            }

            if (!sucesso) {
                iniciarCorreioVoz();
            }
        } else {
            throw new ContatoNaoExiste("Contato não encontrado: " + nome);
        }
    }

    private boolean ligarTentiva() {
        int numeroAleatorio = random.nextInt(2) + 1;
        return numeroAleatorio == 1;
    }

    private void atenderTelefone() {
        String assuntoAleatorio = assuntos[random.nextInt(5)];
        int duracaoConversa = random.nextInt(16);
        System.out.println("A conversa durou " + (duracaoConversa + 1) + " minutos!");
        System.out.println("O tema da conversa foi " + assuntoAleatorio + "!");
    }

    private Contatos verificaNome(String nome) {
        Contatos contatoRetorna = null;
        for (Contatos contato : mapaDeContatos.values()) {
            if (contato.getName().equals(nome)) {
                contatoRetorna = contato;
                break;
            }
        }
        return contatoRetorna;
    }

    private void iniciarCorreioVoz() {
        String assuntoAleatorio = assuntos[random.nextInt(5)];
        System.out.println("Iniciando Correio de Voz..");
        System.out.println("Gravando mensagem sobre o assunto " + assuntoAleatorio);
    }
}
