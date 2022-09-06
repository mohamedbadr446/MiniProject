package Test;

import Connexion.SetUp;
import Constante.JDD;
import Pages.Myaccount;
import com.xpandit.testng.annotations.Xray;
import org.testng.annotations.Test;

public class TestMyAcc extends SetUp{
    @Test
    @Xray(requirement = "BACBPI-158", test = "BACBPI-240")
    public void run()
    {
        Myaccount myaccount=new Myaccount(driver);
        myaccount.cliqueMyaccount();
        myaccount.cliqueLogo();
        myaccount.verifhome(JDD.msgVerifMyAcount);
    }
}
