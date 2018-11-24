package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TrelloSteps {
    @Dado("^que esteja logado no trello$")
    public void queEstejaLogadoNoTrello() {
        System.out.println("queEstejaLogadoNoTrello");
    }

    @E("^acesso o board$")
    public void acessoOBoard() {
        System.out.println("acessoOBoard");
    }

    @Quando("^crio um card com o nome \"([^\"]*)\"$")
    public void crioUmCardComONome(String arg0) throws Throwable {
        System.out.println("crioUmCardComONome");
    }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0) throws Throwable {
        System.out.println("comento");

    }

    @Então("^o card deve estar na lista$")
    public void oCardDeveEstarNaLista() {
        System.out.println("oCardDeveEstarNaLista");

    }

    @Quando("^excluo o card$")
    public void excluoOCard() {
        System.out.println("excluoOCard");
    }

    @Então("^o card não existe mais$")
    public void oCardNãoExisteMais() {
        System.out.println("oCardNãoExisteMais");
    }
}
