package step.definitions;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

public class MyStepdefsRussian {
    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void наСчетеПользователяИмеетсяРублей(String arg1) {
        System.out.println("Invoked method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void пользовательСнимаетСоСчетаРублей(int arg1) {
        System.out.println("Invoked method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void появляетсяПредупреждение(String arg1) {
        System.out.println("Invoked method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}