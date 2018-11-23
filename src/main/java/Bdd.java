public class Bdd {
    public stati void main(String[] args){
        #language: pt
        #encoding: UTF-8
        @ui

        Funcionalidade: Trello UI
        Esquema de cenario: Criando, comentando e deletando um card
        DADO: que esteja logado no trello
        E: acesso o board
        QUANDO: crio um card com o nome "<card_name>"
        E: comento "<comment>"
        ENTÃO: o card deve estar na lista
        QuANDO: excluo o card
        ENTÃO: o card não existe mais

        Exemplo:
        Tabela:
        card_name							|comment
        Alex card							|comentario alex card
        Alex card 2							|comentario

    }
}
