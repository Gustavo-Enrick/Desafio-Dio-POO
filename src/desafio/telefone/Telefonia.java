package desafio.telefone;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import desafio.exeções.ContatoNaoExiste;

public class Telefonia{
    public Map<String, Contatos> mapaDeContatos = new HashMap<>();

    public void adicionarContato(String nome, String numero) {
        boolean contatoExistente = false;

        for (Contatos contato : mapaDeContatos.values()) {
            if (contato.getName().equals(nome)) {
                contatoExistente = true;
                System.out.println("O contato " + nome + " já existe!");
                break;
            }
        }

        if (!contatoExistente) {
            Contatos novoContato = new Contatos(nome, numero);
            mapaDeContatos.put(nome, novoContato);
            System.out.println("Contato " + nome + " adicionado com sucesso.");
        }
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
    private String assuntos []= {"Cinema","Desenho","Comida","Música","Video-game"};
    public void ligarContatos(String nome){
        int tentativa = 0;
        Contatos contato = verificaNome(nome);
        System.out.println("Ligando para " + contato.getName());
        do {
            if(ligarTentiva()){
                System.out.println("Contato realizado com sucesso na tentativa " + (tentativa + 1) + "!");
                atenderTelefone();
                break;
            }else if(tentativa < 3){
                System.out.println("Tentativa " + (tentativa + 1) + " falhou!");
                
            }else if(tentativa == 2){
                iniciarCorrerioVoz();
            }
            tentativa++;
        } while (tentativa < 3);
    }

    private boolean ligarTentiva(){
        int numeroAleatorio = random.nextInt(2) + 1;
        return numeroAleatorio == 1;
    }

    private void atenderTelefone(){
        String assuntoAleatorio = assuntos[random.nextInt(5)];
        int duracaoConversa = random.nextInt(16);
        System.out.println("A conversa durou " + duracaoConversa +" minutos!");
        System.out.println("O tema da conversa foi " + assuntoAleatorio + "!");
    }

    public Contatos verificaNome(String nome) {
        Contatos contatoRetorna = null;
        for (Contatos contato : mapaDeContatos.values()) {
            if (contato.getName().equals(nome)) {
                contatoRetorna = contato;
                break;
            }
        }
        return contatoRetorna;
    }
    
    

    private void iniciarCorrerioVoz(){
        String assuntoAleatorio = assuntos[random.nextInt(5)];
        System.out.println("Iniciando Correio de Voz..");
        System.out.println("Gravando mensagem sobre o assunto " + assuntoAleatorio);
    }
}
