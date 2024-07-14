import java.util.Map;
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        Object value = new HashMap<String, String>();  // value is a Map

        if (value instanceof Map) {
            System.out.println("value is an instance of Map");
            // You can safely cast value to Map and perform Map operations
            Map<?, ?> map = (Map<?, ?>) value;
            // Perform operations on map
        } else {
            System.out.println("value is NOT an instance of Map");
        }
    }
}
