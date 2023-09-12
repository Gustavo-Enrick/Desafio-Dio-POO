package desafio.reprodutor;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    List<Musica> listaDeMusicas = new ArrayList<>();

    public void adicionarMusica(String nomeMusica, String artista, int duracaoEmSegundos, int anoLancamento) {
        if (!verificarMusica(nomeMusica)) {
            Musica musicaNova = new Musica(nomeMusica, artista, duracaoEmSegundos, anoLancamento);
            listaDeMusicas.add(musicaNova);
            System.out.println(musicaNova);
        }

    }

    public boolean verificarMusica(String nomeMusica) {
        boolean existe = false;
        for (Musica musica : listaDeMusicas) {
            if (musica.getNomeMusica().equals(nomeMusica)) {
                System.out.println("Musica já existente!");
                existe = !existe;
            }
        }
        return existe;
    }

    public void comecarMusica() {
        System.out.println("Começando música...");
    }
}
