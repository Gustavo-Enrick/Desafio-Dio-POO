package desafio.telefone;

class Contatos {
    private String nome;
    private String numero;
    Contatos(String nome,String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getName(){
        return nome;
    }

    public String getNumero(){
        return numero;
    }

    @Override
    public String toString(){
        return "O contato " + getName() + " possui o número " + getNumero(); 
    }
}
