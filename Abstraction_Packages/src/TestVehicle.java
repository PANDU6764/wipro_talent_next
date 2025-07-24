import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {
    public static void main(String[] args) {
        Hero heroBike = new Hero("Hero Splendor", "AP16AB1234", "Ravi Kumar");
        Honda hondaCar = new Honda("Honda City", "TS09GH5678", "Sita Devi");

        System.out.println("=== Hero Bike Details ===");
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed());
        heroBike.radio();

        System.out.println("\n=== Honda Car Details ===");
        System.out.println("Model: " + hondaCar.getModelName());
        System.out.println("Reg No: " + hondaCar.getRegistrationNumber());
        System.out.println("Owner: " + hondaCar.getOwnerName());
        System.out.println("Speed: " + hondaCar.getSpeed());
        hondaCar.cdplayer();
    }
}
