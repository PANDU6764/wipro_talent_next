package OptionalClass;
import java.util.Optional; 
public class Question2 {
	public static void main(String[] args) {
		String name = null;
		Optional<String> opt = Optional.ofNullable(name);
		String value = opt.orElse("India");
		System.out.println(value);
	}
}
