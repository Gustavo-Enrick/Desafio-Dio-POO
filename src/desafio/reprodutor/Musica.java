package desafio.reprodutor;

class Musica {
    private String nomeMusica;
    private String artista;
    private int duracaoEmSegundos;
    private int anoLancamento;

    Musica(String nomeMusica,String artista,int duracaoEmSegundos,int anoLancamento){
        this.nomeMusica = nomeMusica;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.anoLancamento = anoLancamento;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String toString() {
        return "O nome da música é " + getNomeMusica() + " do(a) artista " + getArtista() + ", foi lançada no ano " + getAnoLancamento() +" e tem duração de " + getDuracaoEmSegundos() + " segundos.";
    }
}
