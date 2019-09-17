package Opgave_2;

public class Opgave_2 {

    //input: x + y > 100
    //forventet output: at x + y er større end hundrede
    //faktisk output: x + y er større end hundrede
    //resultat: success

    public static void main(String[] args) {

        int x1 = 41;
        int y1 = 67;
        int x2 = 57;
        int y2 = 49;

        if(x1 + y1 > 100)
            System.out.println("success on first test");
        else
            System.out.println("fail on first test");

        if(x2 + y2 > 100)
            System.out.println("success on second test");
        else
            System.out.println("fail on second test");

    }
}
