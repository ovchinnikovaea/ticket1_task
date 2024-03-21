import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Ivan", "Petr", "Nikita"));

        System.out.println(names);

        List<String> sortedNames = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}