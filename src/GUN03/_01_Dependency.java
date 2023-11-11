package GUN03;

import org.testng.annotations.Test;

public class _01_Dependency {

    // vites hareketleri : Start , 1 , 2 , 3 , 4 , 5

    // dependsonmethods ile testleri birbirine bağlıyorum

    // Örneğin 2. vitesin çalışması 1. vitesin çalışmasına bağlıdır

    @Test

    void startCar(){

        System.out.println("startCar");
    }

    @Test(dependsOnMethods = {"startCar"})  // bu testin çalışması , startcar ın hatasız bir şekilde

                                            // çalışmasına bağımlı

    void Vites1(){

        System.out.println("vites1");
    }

    @Test(dependsOnMethods = {"Vites1"})

    void Vites2(){

        System.out.println("Vites2");
    }

    @Test(dependsOnMethods = {"Vites2"})

    void Vites3(){

        System.out.println("Vites3");
    }

    @Test(dependsOnMethods = {"Vites3"})

    void Vites4(){

        System.out.println("Vites4");
    }

    @Test(dependsOnMethods = {"Vites4"})

    void Vites5(){

        System.out.println("Vites5");
    }

    @Test(dependsOnMethods = {"Vites5"})

    void Vites6(){

        System.out.println("Vites6");


        System.out.println("arabanın şanzımanında herhangi bir sorun yoktur");
    }


}


