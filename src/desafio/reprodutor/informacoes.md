# Guia sobre as funções dos arquivos Musica e ReprodutorMusical
#
### Musica
Classe a qual não foi feita para o usuário interagir,nela os objetos do tipo música são criados e devem ser mantidos privados do usuário.O objeto leva 4 atributos:
* Nome da música do tipo **String**.
* Artista do tipo **String**.
* Duracao em segundos do tipo **int**.
* Ano de lançamento do tipo **int**.
#
#
### ReprodutorMusical
#
| Funções  | Resposabilidade |
| ------------- | ------------- |
|adicionarMusica | Adiconará uma música,sendo nescessário passar 4 argumentos:Nome da música(**String**),Artista(**String**),Duracao em segundos(**int**),Ano de lançamento(**int**).  |
|excluirMusica | excluirá uma música da lista,sendo nescessário passar um argumento,nome da música(**String**). |
|comecarMusica | Mostrará uma mensagem de que a música está começando,sendo nescessário passar um argumento,nome da música(**String**). |
|mostrarLista | Mostrará todos as músicas adicionadas,menos as que foram excluídas. |
|excluirLista | Limpará a lista,excluindo todas as músicas.  |

#
![Comportamento Esperado](<../../imagens/Captura de tela 2023-09-20 113721.png>)
#
 
#Observação
* O código é apenas para fins didáticos,por isso não faz nada milagroso.
#

## Autor:
#### - Gustavo