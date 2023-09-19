package desafio.reprodutor;

import java.util.*;

import desafio.exeções.MusicaNaoEncontradaException;

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

    public void mostrarLista() throws MusicaNaoEncontradaException {
    if (mapaDeMusicas.isEmpty()) {
        throw new MusicaNaoEncontradaException("Não há músicas.");
    }

    for (Musica musica : mapaDeMusicas.values()) {
        System.out.println(musica);
    }
}

    public void excluirLista(){
        mapaDeMusicas.clear();
        System.out.println("Lista excluida");
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
