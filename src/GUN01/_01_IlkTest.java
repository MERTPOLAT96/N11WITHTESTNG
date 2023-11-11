package GUN01;

import org.testng.annotations.Test;

public class _01_IlkTest {

    @Test(priority = 1)  // priority testlerime öncelik vermemi sağlar
    public void test1(){

        System.out.println("ilk çalışacak olan benim");
    }

    @Test(priority = 2)
    public void test2(){

        System.out.println("ikinci olarak ben çalışacağım");
    }

    @Test(priority = 3)
    public void test3(){

        System.out.println("üçüncü olarak da ben çalışacağım");
    }
}
