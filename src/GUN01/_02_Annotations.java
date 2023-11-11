package GUN01;

import org.testng.annotations.*;

public class _02_Annotations {

    @BeforeClass // her metoddan önce çalışır
    public void beforeclass(){

        System.out.println("before class çalıştı");
    }

    @AfterClass // her metoddan sonra çalışır
    public void afterclass(){

        System.out.println("after class çalıştı");
    }

    @BeforeMethod // her metoddan önce çalışır
    public void beforeMethod(){

        System.out.println("before method çalıştı");
    }

    @AfterMethod // her metoddan sonra çalışır
    public void afterMethod(){

        System.out.println("after metod çalıştı");

    }

    @Test // test metodu
    public void test1(){

        System.out.println("test 1");


    }


    @Test
    public void test2(){

        System.out.println("test 2");
    }


}
