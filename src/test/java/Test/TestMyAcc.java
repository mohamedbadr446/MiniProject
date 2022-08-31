package Test;

import Connexion.SetUp;
import Pages.Myaccount;
import org.testng.annotations.Test;

public class TestMyAcc extends SetUp{
    @Test
    public void run()
    {
        Myaccount myaccount=new Myaccount(driver);
        myaccount.cliqueMyaccount();
        myaccount.cliqueLogo();
    }
}
