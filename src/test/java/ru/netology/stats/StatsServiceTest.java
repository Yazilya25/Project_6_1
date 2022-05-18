package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void findSumSalesAllMonth() {
        StatsService service = new StatsService();

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMediumSaleMonth() {
        StatsService service = new StatsService();

        long actual = service.averageSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthMaxSales() {
        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthMinSales() {
        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findQtyMonthLessAverage() {
        StatsService service = new StatsService();

        long actual = service.qtyMonthLessAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findQtyMonthAboveAverage() {
        StatsService service = new StatsService();

        long actual = service.qtyMonthAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
