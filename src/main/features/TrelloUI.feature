#language: pt
#encoding: UTF-8
@ui

Funcionalidade: Trello UI
  @ui
  Esquema do Cenario: Criando, comentando e deletando um card
  Dado que esteja logado no trello
  E acesso o board
  Quando crio um card com o nome "<card_name>"
  E comento "<comment>"
  Entao  o card deve estar na lista
  Quando  excluo o card
  Entao  o card não existe mais

  Exemplos:
  |card_name | comment
  |Alex card | comentario alex card
  |Alex card 2| comentario