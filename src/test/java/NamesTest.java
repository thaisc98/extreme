import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NamesTest {

    @Test
    public void printNames(){
        List<String> listsNames = new ArrayList<>();
        listsNames.add("Miguel");
        listsNames.add("Pedro");
        listsNames.add("Juanito");

        listsNames.stream().forEach(n -> System.out.println(n));
        Assert.assertEquals(3, listsNames.size());
    }
}
