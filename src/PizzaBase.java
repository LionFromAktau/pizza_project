public class PizzaBase {
    private String discription;
    private String baseType;
    private String baseName;

    public PizzaBase(String discription, String baseType, String baseName) {
        this.discription = discription;
        this.baseType = baseType;
        this.baseName = baseName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Override
    public String toString(){
        return "Base type: " + getBaseType() + " Base name: " + getBaseName() +
                "\nDiscription:\n" + getDiscription() + "\n";
    }
}
