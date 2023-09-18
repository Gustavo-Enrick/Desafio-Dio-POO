package desafio.reprodutor;
import java.util.*;

public class ReprodutorMusical {
    private Map<String, Musica> mapaDeMusicas = new HashMap<>();

    public void adicionarMusica(String nomeMusica, String artista, int duracaoEmSegundos, int anoLancamento) {
        if (!mapaDeMusicas.containsKey(nomeMusica)) {
            Musica musicaNova = new Musica(nomeMusica, artista, duracaoEmSegundos, anoLancamento);
            mapaDeMusicas.put(nomeMusica, musicaNova);
            System.out.println(musicaNova);
        } else {
            System.out.println("Música já existente!");
        }
    }

    public void comecarMusica(String nomeMusica) {
        Musica musica = mapaDeMusicas.get(nomeMusica);
        if (musica != null) {
            System.out.println("Começando música " + musica.getNomeMusica() + " de " + musica.getArtista());
        } else {
            System.out.println("Música não encontrada.");
        }
    }

    public void mostrarLista() {
        for (Musica musica : mapaDeMusicas.values()) {
            System.out.println(musica);
        }
    }

    public void excluirMusica(String nomeMusica) {
        if (mapaDeMusicas.containsKey(nomeMusica)) {
            mapaDeMusicas.remove(nomeMusica);
            System.out.println("Música removida: " + nomeMusica);
        } else {
            System.out.println("Música não encontrada.");
        }
    }
}
