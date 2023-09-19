package desafio.exeções;

public class ContatoNaoExiste extends Exception{
    public ContatoNaoExiste(String mensagem) {
        super(mensagem);
    }
}
