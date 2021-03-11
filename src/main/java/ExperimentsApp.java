import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExperimentsApp {

    public static void main(String[] args) {
    }

    /**
     * Add values from inside the stream to an outside list
     * Careful: You will lose entities as the stream closes before the last
     * for each loop is done!
     */
    public static List<Integer> getSquaresViaForEach(List<Integer> numbers) {
        List<Integer> squares = new ArrayList<>();

        numbers.stream().parallel()
                .forEach(number -> {
                    int square = number * number;
                    squares.add(square);
                });

        return squares;
    }

    /**
     * Instead, rather use a map function to calculate the squares within the stream
     * and then collect the results, which ensures that all map functions return before
     * the stream finishes
     */
    public static List<Integer> getSquaresViaStreamCollect(List<Integer> numbers) {
        return numbers.stream().parallel()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}
