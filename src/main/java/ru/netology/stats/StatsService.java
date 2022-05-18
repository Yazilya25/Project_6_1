package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        long averageSale = 0;
        for (long sale : sales) {
            averageSale = sum(sales) / sales.length;
        }
        return averageSale;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int qtyMonthLessAverage(long[] sales) {
        long averageSale = averageSale(sales);
        int qtyLessAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale)
                qtyLessAverage++;
        }
        return qtyLessAverage;
    }

    public int qtyMonthAboveAverage(long[] sales) {
        long averageSale = averageSale(sales);
        int qtyAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                qtyAboveAverage++;
            }
        }
        return qtyAboveAverage;
    }
}
