#language: pt
#encoding: UTF-8
@ui

Funcionalidade: Meu Trello UI
  @ui

  Esquema do Cenario: Criar um card
    Dado "<user>" logado
    E acesso ao "<board>"
    Quando Clicar em adicionar um cartão
    E Inserir um "<titulo>"
    E "<clicar>"
    Entao o "<card>" é mostrado

    Exemplos:
    |user           |board    |titulo   |clicar             |card    |
    |felipegodinho2 |BDD      |Titulo 1 |fora               |Titulo 1|
    |felipegodinho2 |BDD      |Titulo 2 |Adiciona Cartão    |Titulo 1|
    |felipegodinho2 |         |         |        |          |
    |fffffffff      |         |         |        |          |

  Esquema do Cenario: Comentar um card
    Dado "<user>" logado
    E acesso ao "<board>"
    Quando Clicar no card
    E quadro Adicionar Comentário
    E Inserir um "<texto>"
    E "<clicar>" em salvar
    Então "<comentario>" é apresentado abaixo
    Exemplos:
    |user               |board        |texto            |clicar         |comentario     |
    |felipegodinho2     |BDD          |Comentario um    |Salvar         |Comentario um  |
    |felipegodinho2     |BDD          |Comentario dois  |Fora           |               |
    |felipegodinho2     |BDD          |Comentario dois  |X(fora)        |               |
    |felipegodinho2     |BDD          |Comentario dois  |               |               |

    Esquema do Cenario: Excluir um card
      Dado "<user>" logado
      E acesso ao "<board>"
      E possua um "<card>"
      Quando Clicar no card
      E clicar no link Compartilhar e mais
      E clicar no link Excluir
      E clicar "<botao>"
      Entao o "<card>" será apresentado

      Exemplos:
      |user              |card      |board            |botao              |card              |
      |felipegodinho2    |Titulo    |BDD              |Excluir            |                  |
      |felipegodinho2    |Titulo2   |BDD              |Fora               |Titulo2           |
      |fe                |          |                 |                   |                  |

