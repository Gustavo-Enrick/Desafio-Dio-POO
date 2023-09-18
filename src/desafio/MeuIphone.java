package desafio;

import desafio.reprodutor.ReprodutorMusical;

public class MeuIphone {
    public static void main(String[] args) throws Exception {
       ReprodutorMusical reprodutor = new ReprodutorMusical();
       reprodutor.adicionarMusica("Bohemian Rhapsody", "Queen", 354, 1975);
       reprodutor.adicionarMusica("Shape of You", "Ed Sheeran", 234, 2017);
       reprodutor.mostrarLista();
       reprodutor.excluirMusica("Shape of You");
       reprodutor.mostrarLista();
    }
}
