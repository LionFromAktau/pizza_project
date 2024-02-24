public class Topping {
    private String discription;
    private String spiceLevel;
    private String toppingName;

    public Topping(String toppingName, String spiceLevel, String discription){
        this.discription = discription;
        this.spiceLevel = spiceLevel;
        this.toppingName = toppingName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    @Override
    public String toString(){
        return "\nToping name: " + getToppingName() + " Spice level: " + getSpiceLevel() + "Discription: " + getDiscription();
    }
}
