import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TrelloSteps {
    @Dado("^que esteja logado no trello$")
    public void queEstejaLogadoNoTrello() {
    }

    @E("^acesso o board$")
    public void acessoOBoard() {
    }

    @Quando("^crio um card com o nome \"([^\"]*)\"$")
    public void crioUmCardComONome(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^o card deve estar na lista$")
    public void oCardDeveEstarNaLista() {
    }

    @Quando("^excluo o card$")
    public void excluoOCard() {
        
    }

    @Então("^o card não existe mais$")
    public void oCardNãoExisteMais() {
    }
}
