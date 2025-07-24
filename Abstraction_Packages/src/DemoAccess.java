import Test.Foundation;

public class DemoAccess {
    public static void main(String[] args) {
        Foundation f = new Foundation();

        // System.out.println(f.var1); // ❌ Error: var1 has private access
        // System.out.println(f.var2); // ❌ Error: var2 is not public (default access)
        // System.out.println(f.var3); // ❌ Error: var3 is protected, not accessible here
        System.out.println("var4 (public): " + f.var4); // ✅ Accessible

        // If you want to see all values, use the public method from Foundation
        f.display(); // ✅ Allowed because display() is public
    }
}
