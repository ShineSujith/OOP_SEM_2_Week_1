package ie.atu.productv4;

public class Tv extends Product{
    private String screenSize;
    private String manufacture;

    public Tv() {
        super();
        screenSize = "";
        manufacture = "";
        count++;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture +"\nScreen size is " + screenSize;
    }
}
