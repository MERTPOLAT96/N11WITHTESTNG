package GUN02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    @Test
    void EqualOrnek(){

        String s1="N11";
        String s2="N11";

        // Actual (oluşan) , Expected(beklenen) , Mesaj(opsiyonel)

        Assert.assertEquals(s1,s2,"karşılaştırma doğru oldumu");
    }

    @Test
    void notEquals(){

        String s1="N11";
        String s2="N12";

        Assert.assertEquals(s1,s2,"Oluşan ve beklenen eşit oldu mu");
    }

    @Test
    void TrueOrnek(){

        int s1=10;
        int s2=20;

        Assert.assertTrue(s2>s1,"oluşan ve beklenen eşit olmadı");
    }

    @Test
    void nullOrnek(){

        String s1=null;

        Assert.assertNull(s1,"Oluşan null olmadı");
    }

    @Test
    void direkfail(){

        int a=15;

        if (a==55)
            Assert.fail(); // Assert.fail("hata oluştu")
    }
}
