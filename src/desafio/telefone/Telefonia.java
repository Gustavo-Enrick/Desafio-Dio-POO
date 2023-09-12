package desafio.telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Telefonia extends LigarParaContatos{
    List<Contatos> listaContatos = new ArrayList<>();
    
    public void adicionarContato(String nome, String numero){
    boolean contatoExistente = false;
    
    for (Contatos contato : listaContatos) {
        if (contato.getName().equals(nome)) {
            contatoExistente = true;
            System.out.println("O contato " + nome + " já existe!");
            break;
        }
    }

    
    if (!contatoExistente) {
        Contatos novoContato = new Contatos(nome, numero);
        listaContatos.add(novoContato);
        System.out.println("Contato " + nome + " adicionado com sucesso.");
    }
}

    public void mostrarListaContatos(){
        for (Contatos contato: listaContatos){
            System.out.println(contato);
        }
    }

    public void excluirContato(String nomeExcluir) {
        Iterator<Contatos> iterator = listaContatos.iterator();
        
        while (iterator.hasNext()) {
            Contatos contato = iterator.next();
            if (contato.getName().equals(nomeExcluir)) {
                iterator.remove();
                System.out.println("Contato " + nomeExcluir + " excluído com sucesso.");
                break;
            }
        }
    }
}
