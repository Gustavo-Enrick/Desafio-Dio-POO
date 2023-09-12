package desafio.telefone;
import java.util.Random;

public class LigarParaContatos{
    Random random = new Random();
    private String assuntos []= {"Cinema","Desenho","Comida","Música","Video-game"};
    public void ligarContatos(Contatos contato){
        int tentativa = 0;
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

    public boolean ligarTentiva(){
        int numeroAleatorio = random.nextInt(2) + 1;
        return numeroAleatorio == 1;
    }

    public void atenderTelefone(){
        String assuntoAleatorio = assuntos[random.nextInt(5)];
        int duracaoConversa = random.nextInt(16);
        System.out.println("A conversa durou " + duracaoConversa +" minutos!");
        System.out.println("O tema da conversa foi " + assuntoAleatorio + "!");
    }

    public void iniciarCorrerioVoz(){
        String assuntoAleatorio = assuntos[random.nextInt(5)];
        System.out.println("Iniciando Correio de Voz..");
        System.out.println("Gravando mensagem sobre o assunto " + assuntoAleatorio);
    }

}

