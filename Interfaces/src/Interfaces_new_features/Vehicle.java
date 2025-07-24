package Interfaces_new_features;
public interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}
