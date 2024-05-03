package codes.davidmelzer.java.demos.seli;

public class Pashanim {
    public static String createLyricWithWeedStrain(WeedStrain strain) {
        return "Ich rauch' " + strain.getName() + " und bin high";
    }

    public static String createLyricWithWeedStrainAndFlavor(WeedStrain strain, String flavor) {
        return "Ich rauch' " + strain.getName() + " mit Geschmack " + flavor + " und bin high";
    }
}
