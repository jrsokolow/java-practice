package interview;

import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class InterviewTasksTest {

    private InterviewTasks starter;
    private Set<Integer> numbers;

    @Before
    public void setUp() {
        starter = new InterviewTasks();
        numbers = new HashSet<>();
    }

    @Test
    public void testSum() {
        //given
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        //when

        //then
        assertEquals(6, starter.evenSum(numbers));
    }

    @Test
    public void testEvenSumUsingReduces() {
        //given
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        //when

        //then
        assertEquals(6, starter.evenSumUsingReduces(numbers));
    }

    @Test
    public void testEvenSumUsingCollectors() {
        //given
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        //when

        //then
        assertEquals(6, starter.evenSumUsingSummingInt(numbers));
    }

}