import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javamvn.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldFindSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.getSumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.getAverageSumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    //    Тест с несколькими одинаковыми значениями
    @Test
    public void shouldReturnIndexOfMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.getIndexOfMaxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    //    Тест с разными значениями
//    @Test
//    public void shouldReturnIndexOfMaxSalesDifferentMonths() {
//        StatsService service = new StatsService();
//        long[] sales = {8, 15, 13, 16, 17, 20, 19, 21, 7, 13, 14, 30};
//
//        long expected = 11;
//        long actual = service.getIndexOfMaxSalesMonth(sales);
//        Assertions.assertEquals(expected, actual);
//    }
//    Тест с несколькими одинаковыми значениями
    @Test
    public void shouldReturnIndexOfMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {7, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.getIndexOfMinSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    //    Тест с разными значениями
//    @Test
//    public void shouldReturnIndexOfMinSalesDifferentMonths() {
//        StatsService service = new StatsService();
//        long[] sales = {8, 15, 13, 16, 17, 20, 19, 21, 7, 13, 4, 30};
//
//        long expected = 10;
//        long actual = service.getIndexOfMinSalesMonth(sales);
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void shouldFindQuantityOfMonthsLowerThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.getQuantityOfMonthsLowerThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindQuantityOfMonthsHigherThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.getQuantityOfMonthsHigherThanAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
