import java.util.HashMap;
import java.util.Map;

public class Main {
    static HashMap<Integer, DriverLicense> allLicenses = new HashMap<>();

    public static void main(String[] args) {
        addLicenses();
        printAll();
    }

    public static void addLicense(DriverLicense license) {
        allLicenses.put(license.getId(), license);
    }

    public static void addLicenses() {
        addLicense(new DriverLicense("Василий", 1));
        addLicense(new DriverLicense("Генадий", 2));
        addLicense(new DriverLicense("Кирилл", 3));
        addLicense(new DriverLicense("Володя", 4));
        addLicense(new DriverLicense("Иван", 5));
    }

    public static void printAll() {
        for (Map.Entry<Integer, DriverLicense> set : allLicenses.entrySet()) {
            System.out.println("id:" + " " + set.getKey() + " " + "license:" + " " + set.getValue());
        }
    }
}