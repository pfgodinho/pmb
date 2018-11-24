#language: pt
#encoding: UTF-8
@ui

Funcionalidade: Meu Trello UI
  @ui

  Esquema do Cenario: Criar um card
    Dado "<user>" logado no trello
    E acesso o "<board>"
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
