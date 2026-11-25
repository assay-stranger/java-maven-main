package example.coldrun;

import org.apache.commons.text.StringSubstitutor;
import java.util.Map;

public final class App {
    public static void main(String[] args) {
        System.out.println(new StringSubstitutor(Map.of("who", "world")).replace("hello ${who}"));
    }
}
