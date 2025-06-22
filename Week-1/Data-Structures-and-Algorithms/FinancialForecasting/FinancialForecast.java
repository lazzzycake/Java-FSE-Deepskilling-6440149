public class FinancialForecast {
    // Recursive function to forecast value
    public static double forecastValueRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastValueRecursive(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using loop (to compare)
    public static double forecastValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }

    public static void main(String[] args) {
        double baseValue = 10000;
        double growthRate = 0.1; // 10%
        int years = 5;

        double recursiveResult = forecastValueRecursive(baseValue, growthRate, years);
        double iterativeResult = forecastValueIterative(baseValue, growthRate, years);

        System.out.printf("Forecast using Recursion: Rs%.2f\n", recursiveResult);
        System.out.printf("Forecast using Iteration: Rs%.2f\n", iterativeResult);
    }
}
