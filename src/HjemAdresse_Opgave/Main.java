package HjemAdresse_Opgave;

import HjemAdresse_Opgave.HjemAdresse;

public class Main {
    //testcase til SkrivAdresse
    //input = adresse
    //forventet output = rigtige adresse
    //faktisk output = success
    //test resultat = rigtigt

    public static void main(String[] args) {

        HjemAdresse kelvinAdresse = new HjemAdresse();
        kelvinAdresse.start();
        kelvinAdresse.HjemadresseNummer = 4;
        kelvinAdresse.Hjemadressevej = "Pilevej";
        kelvinAdresse.postnummer = 4700;
        System.out.println("Kelvin bor på " +kelvinAdresse.Hjemadressevej + " " +kelvinAdresse.HjemadresseNummer);
        System.out.println("Hans postnummer er " +kelvinAdresse.postnummer);
        kelvinAdresse.stop();

        if (kelvinAdresse.erStartet == true)
        System.out.println("Success");
        else
        System.out.println("fail");

    }
}
