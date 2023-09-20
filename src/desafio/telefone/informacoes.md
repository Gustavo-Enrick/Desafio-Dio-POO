# Guia sobre as funções dos arquivos Contatos e Telefonia.
#
### Contatos.
Classe a qual não foi feita para o usuário interagir,nela os objetos do tipo contatos são criados e devem ser mantidos privados do usuário.O objeto leva 2 atributos:
* Nome do tipo **String**.
* Numero do tipo  **String**.

### Telefonia.
#
| Funções  | Resposabilidade |
| ------------- | ------------- |
|adicionarContato | Adiconará um contato,sendo nescessário passar 2 argumentos:Nome(**String**),Número(**String**).  |
|excluirContato | Excluirá um contato da lista,sendo nescessário passar um argumento,o nome do contato(**String**). |
|mostrarListaContatos | Mostrará todos os contatos adicionadas,menos os que foram excluídos. |
|ligarContatos | Ligará para algum contato,o sendo nescessário passar um argumento,nome do contato(**String**).  | 
#
![Comportamento Esperado](<../../imagens/Captura de tela 2023-09-20 113443.png>)
#
#Observação
* O código é apenas para fins didáticos,por isso não faz nada milagroso.
## Autor:
#### - Gustavo
