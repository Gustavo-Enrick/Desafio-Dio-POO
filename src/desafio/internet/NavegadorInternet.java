package desafio.internet;

public class NavegadorInternet {
    private int paginasAbertas = 0;
    public void abrirNavegador(){
            System.out.println("Inicializando o navegador...");
            System.out.println("Navegador aberto!");
            adicionarAba();

    }

    public void adicionarAba(){
        System.out.println("Aba aberta!");
        paginasAbertas++;
    }

    public void fecharAba(){
        System.out.println("Fechando aba!");
        paginasAbertas--;
    }

    public void atualizarAba(){
        System.out.println("Atualizando a aba...");
    }

    public void fecharNavegador(){
        System.out.println("Fechando " + paginasAbertas + " aba(s)");
        System.out.println("Fechando navegador!");
        paginasAbertas = 0;
    }


}
