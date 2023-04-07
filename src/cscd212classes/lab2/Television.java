package cscd212classes.lab2;

public class Television extends Object implements Comparable<Television> {

    private final boolean fourK;

    private final String make;

    private final String model;

    private final int resolution;

    private final int screenSize;

    private final boolean smart;

    public Television(String make, String model, int resolution, int screenSize, boolean smart) {
        this.fourK = fourK;
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }

    public Television(String make, String model, int resolution, int screenSize, boolean smart) {
        this.fourK = fourK;
        this.make = make;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.smart = smart;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getResolution() {
        return resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }


    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Television o) {
        return 0;
    }
}
