public class DriverLicense {
    private String name;
    private int id;

    public DriverLicense(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

}