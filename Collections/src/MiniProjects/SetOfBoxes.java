package MiniProjects;


import java.util.*;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Box)) return false;
        Box other = (Box) obj;
        // Use rounded volume to avoid precision issues
        return Math.round(this.getVolume() * 100.0) / 100.0 ==
               Math.round(other.getVolume() * 100.0) / 100.0;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(Math.round(getVolume() * 100.0) / 100.0).hashCode();
    }

    @Override
    public String toString() {
        return String.format("Length = %.1f Width = %.1f Height = %.1f Volume = %.2f",
                length, width, height, getVolume());
    }
}

public class SetOfBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> boxSet = new LinkedHashSet<>(); // Maintain insertion order

        System.out.print("Enter the number of Boxes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details:");
            System.out.print("Enter Length: ");
            double length = sc.nextDouble();
            System.out.print("Enter Width: ");
            double width = sc.nextDouble();
            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);
            boxSet.add(box);
        }

        System.out.println("\nUnique Boxes in the Set are:");
        for (Box box : boxSet) {
            System.out.println(box);
        }

        sc.close();
    }
}

