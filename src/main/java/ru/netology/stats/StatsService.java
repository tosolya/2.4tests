package ru.netology.stats;

public class StatsService {

    public int calculateAllSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverageAmount(int[] sales) {
        int sum = calculateAllSum(sales);
        return sum / sales.length;
    }


    public int calculateNumberMonthMaxSum(int[] sales) {
            int currentMax = sales[0];
            for (int sale : sales) {
                if (currentMax <= sale) {
                    currentMax = sale;
                }
            }
            int monthNumber = 0;
            int month = 0;

            for (int sale : sales) { monthNumber++;
                if (sale == currentMax) {
                    month = monthNumber;
                }
            }
            return month;
        }


        public int calculateNumberMonthMinSum(int[] sales) {
            int currentMax = sales[0];
            for (int sale : sales) {
                if (currentMax > sale) {
                    currentMax = sale;
                }
            }
            int monthNumber = 0;
            int month = 0;

            for (int sale : sales) { monthNumber++;
                if (sale == currentMax) {
                    month = monthNumber;
                }
            }
            return month;
        }

    public int calculateMonthMaxAverageAmount(int[] sales) {
        int averageAmount = calculateAverageAmount(sales);
        int monthMax = 0;
        for (int sale : sales) {
            if (sale < averageAmount) {
                monthMax++;
            }
        }
        return monthMax;
    }


    public int calculateMonthMinAverageAmount(int[] sales) {
        int averageAmount = calculateAverageAmount(sales);
        int monthMin = 0;
        for (int sale : sales) {
            if (sale > averageAmount) {
                monthMin++;
            }
        }
        return monthMin;
    }

}












