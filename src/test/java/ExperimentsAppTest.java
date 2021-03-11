import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExperimentsAppTest {

    @RepeatedTest(100)
    void shouldReturnListOfIdenticalSizeWithForEach() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> results = ExperimentsApp.getSquaresViaForEach(numbers);

        assertEquals(numbers.size(), results.size());
    }

    @RepeatedTest(100)
    void shouldReturnListOfIdenticalSizeWithStreamCollect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> results = ExperimentsApp.getSquaresViaStreamCollect(numbers);

        assertEquals(numbers.size(), results.size());
    }

}