import java.util.ArrayList;
import java.util.List;

public class Extreme {

    public static void main(String[] args) {
        System.out.println("Hello every body test!");
        List<String> listsNames = new ArrayList<>();
        listsNames.add("Miguel");
        listsNames.add("Pedro");
        listsNames.add("Juanito");

        listsNames.stream().forEach(n -> System.out.println(n));
    }
}
