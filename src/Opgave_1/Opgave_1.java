package Opgave_1;

public class Opgave_1 {

    //input: int x, y og z
    //forventet output: true
    //faktisk output: halvdelen er ikke det forventede resultat
    //resultat: success

    public static void main(String[] args) {

        int x = 5;
        int y = 8;
        int z = 3;


        A:if (x <= 5 && z != y)
        System.out.println("success");
        else
            System.out.println("fail");
        //resultat forventes at være at x er <= 5 og at z er ikke lige med y

        B:if (x == 5 || x == y && z == 3)
            System.out.println("success");
        else
            System.out.println("fail");
        //resultat forventes at være rigtigt på x == 5 og z == 3, men at x == y er forkert

        C:if (x / y > z / x)
            System.out.println("x / y er større end z / x");
        else
            System.out.println("x / t er ikke større end z /x");
        //det forventede resultat er at x divideret med y er større en z divideret med x

        D:if(!( x != y - z ) == false)
            System.out.println("x er ikke lig med y - z");
        else
            System.out.println("x er lig med y - z");
        //udregningen er rigtigt hvis x ikke er lig med y - z

        E:if(2 * x != x || x == 0)
            System.out.println("udregning er rigtigt");
        else
            System.out.println("udreging er falsk");
        //test resultat er forventet som 2 * x er ikke lig med x, eller x er lig 0

        F:if(! true || ! false)
            if(true)
                System.out.println("true");
            else
                System.out.println("false");

    }
}