package codes.davidmelzer.java.demos.seli;

import java.util.List;

public class WeedStrain {
    /**
     * Attributes
     */
    private String name;
    private WEED_TYPE type;
    private List<String> effects;
    private List<String> flavors;


    /**
     * Constructor
     */
    public WeedStrain(String name, WEED_TYPE type, List<String> effects, List<String> flavors) {
        this.name = name;
        this.type = type;
        this.effects = effects;
        this.flavors = flavors;
    }

    /**
     * Getter and Setter
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WEED_TYPE getType() {
        return type;
    }

    public void setType(WEED_TYPE type) {
        this.type = type;
    }

    public List<String> getEffects() {
        return effects;
    }

    public void setEffects(List<String> effects) {
        this.effects = effects;
    }

    public List<String> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<String> flavors) {
        this.flavors = flavors;
    }
}
