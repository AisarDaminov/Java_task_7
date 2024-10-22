package ru.netology.javamvn;

public class StatsService {

    public long getSumOfAllSales (long[] sales){
        long sumOfAllSales = 0;
        for (int i=0; i<sales.length; i++){
            sumOfAllSales += sales[i];
        }
        return sumOfAllSales;
    }

    public long getAverageSumOfAllSales (long[] sales){
        long averageSumOfAllSales = 0;
        long sumOfAllSales = getSumOfAllSales(sales);
        averageSumOfAllSales = sumOfAllSales/sales.length;
        return averageSumOfAllSales;
    }

    public int getIndexOfMaxSalesMonth (long[] sales){
        int indexOfMaxSalesMonth = 0;
        for (int i=0; i<sales.length; i++){
            if (sales[i] >= sales[indexOfMaxSalesMonth]){
                indexOfMaxSalesMonth = i;
            }
        }
        return indexOfMaxSalesMonth;
    }
    public int getIndexOfMinSalesMonth (long[] sales){
        int IndexOfMinSalesMonth = 0;
        for (int i=0; i<sales.length; i++){
            if (sales[i] <= sales[IndexOfMinSalesMonth]){
                IndexOfMinSalesMonth = i;
            }
        }
        return IndexOfMinSalesMonth;
    }
    public int getQuantityOfMonthsLowerThanAverage (long[] sales){
        int quantityOfMonthsLowerThanAverage = 0;
        for (long sale : sales) {
            if (sale < getAverageSumOfAllSales(sales)) {
                quantityOfMonthsLowerThanAverage++;
            }
        }
        return quantityOfMonthsLowerThanAverage;
    }
    public int getQuantityOfMonthsHigherThanAverage (long[] sales){
        int quantityOfMonthsHigherThanAverage = 0;
        for (long sale : sales) {
            if (sale > getAverageSumOfAllSales(sales)) {
                quantityOfMonthsHigherThanAverage++;
            }
        }
        return quantityOfMonthsHigherThanAverage;
    }
}

