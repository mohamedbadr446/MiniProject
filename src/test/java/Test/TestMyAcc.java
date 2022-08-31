package Test;

import Connexion.Connexion;
import Pages.Myaccount;
import org.testng.annotations.Test;

public class TestMyAcc extends Connexion {
    @Test
    public void run()
    {
        Myaccount myaccount=new Myaccount(driver);
        myaccount.cliqueMyaccount();
        myaccount.cliqueLogo();
    }
}
