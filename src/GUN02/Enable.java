package GUN02;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Enable {

    @Test

    void test1(){

        System.out.println("test1");
    }

    @Test(enabled = false) // testimi pasif hale getiriyor
    void test2 (){

        System.out.println("test 2");
    }

    @Test
    void test3(){

        System.out.println("test 3");
    }

    @BeforeClass
    void baslangicislemler(){

        System.out.println("başlangıç işlemleri yapılıyor");
    }

    @AfterClass
    void bitisislemleri(){

        System.out.println("bitis islemleri yapılıyor");
    }
}
