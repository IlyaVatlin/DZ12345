package ru.netology.stats;

public class StatsService {public int calculateSumSales(int[] sales) {
    int sum = 0;
    for (int sale : sales) {
        sum += sale;
    }
    return sum;
}

    public int findAverage(int[] sales) {

        return calculateSumSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int findBelowAverage(int[] sales) {
        int belowAverage = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int findAboveAverage(int[] sales) {
        int aboveAverage = 0;
        int average = findAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}