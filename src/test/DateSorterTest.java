import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateSorterTest {

    @Test
    public void testSortDates() {

        DateSorter sorter = new DateSorter();

        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2004, 7, 1));
        unsortedDates.add(null);
        unsortedDates.add(LocalDate.of(2005, 1, 2));
        unsortedDates.add(LocalDate.of(2007, 1, 1));
        unsortedDates.add(LocalDate.of(2032, 5, 3));
        unsortedDates.add(null);


        List<LocalDate> sortedDates = sorter.sortDates(unsortedDates);

        List<LocalDate> expectedSortedDates = new ArrayList<>();
        expectedSortedDates.add(LocalDate.of(2005, 1, 2));
        expectedSortedDates.add(LocalDate.of(2007, 1, 1));
        expectedSortedDates.add(LocalDate.of(2032, 5, 3));
        expectedSortedDates.add(LocalDate.of(2004, 7, 1));
        expectedSortedDates.add(null);
        expectedSortedDates.add(null);

        Assertions.assertEquals(expectedSortedDates, sortedDates);
    }
}
