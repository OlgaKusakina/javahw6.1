package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    // Сумма всех продаж
    public void getAllSum(){
        StatsService service = new StatsService();
        int [] profit = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8 + 15 + 13 + 15+  17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int actual = service.getAllSum(profit);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    //Средняя сумма продаж в месяц

    public void getSales(){
        StatsService service = new StatsService();
        double [] profit = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 180 / 12;
        double actual = service.getSales(profit);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    //Номер месяца, в котором был пик продаж
    public void getMaxProfit(){
        StatsService service = new StatsService();
        int [] profit = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxMonth(profit);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    //Номер месяца, в котором был минимум продаж
    public void minMonth(){
        StatsService service = new StatsService();
        int [] profit = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minMonth(profit);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Кол-во месяцев, в которых продажи были ниже среднего
    public void avrProfitMin(){
        StatsService service = new StatsService();
        double [] profit = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 5;
        double actual = service.avrProfitMin(profit);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    //Кол-во месяцев, в которых продажи были выше среднего
    public void avrProfitMax(){
        StatsService service = new StatsService();
        double [] profit = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expected = 5;
        double actual = service.avrProfitMax(profit);

        Assertions.assertEquals(expected, actual);
    }
}
