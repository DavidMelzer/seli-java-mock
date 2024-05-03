package codes.davidmelzer.java.demos.seli;

import java.util.ArrayList;

public class WeedDatabase {
    private final ArrayList<WeedStrain> strains;

    public WeedDatabase(ArrayList<WeedStrain> strains) {
        this.strains = strains;
    }

    public ArrayList<WeedStrain> getStrains() {
        return strains;
    }

    public void addStrain(WeedStrain strain) {
        this.strains.add(strain);
    }

    public void removeStrain(WeedStrain strain) {
        this.strains.remove(strain);
    }

    public WeedStrain getStrainByName(String name) {
        // TODO: Implement this method to return a strain by name 😳
        return null;
    }

    public ArrayList<WeedStrain> getStrainsByType(WEED_TYPE type) {
        ArrayList<WeedStrain> strains = new ArrayList<>();
        // TODO: Implement this method to return strains by type 😳
        return strains;
    }
}
