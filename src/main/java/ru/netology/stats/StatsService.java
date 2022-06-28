package ru.netology.stats;
public class StatsService {
    public int getAllSum(int[] profit) {
        int sum = 0;
        for (int prof : profit)
            sum += prof;
        return sum;
    }

    public double getSales(double[] profit) {
        double sales = 0;
        for (double sale : profit)
            sales += (sale) / 12;
        return sales;
    }

    public int maxMonth(int[] profit) {
        int profitMonth = 0;
        int month = 0;
        for (int sale : profit) {
            if (sale >= profit[profitMonth]) {
                profitMonth = month;
            }
            month = month + 1;
        }
        return profitMonth + 1;
    }

    public int minMonth(int[] profit) {
        int profitMonth = 0;
        int month = 0;
        for (int sale : profit) {
            if (sale <= profit[profitMonth]) {
                profitMonth = month;
            }
            month = month + 1;
        }
        return profitMonth + 1;
    }

    public double avrProfitMin(double[] profit) {
        double avrMonth = 0;
        for (double sale : profit) {
            if (sale < getSales(profit)) {
                avrMonth = avrMonth + 1;

            }
        }

        return avrMonth;
    }

    public double avrProfitMax(double[] profit) {
        double avrMonth = 0;
        for (double sale : profit) {
            if (sale > getSales(profit)) {
                avrMonth = avrMonth + 1;

            }
        }

        return avrMonth;
    }

}