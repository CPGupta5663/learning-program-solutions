public class Main {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    // Optimized recursive method using memoization
    public static double futureValueMemoized(double principal, double rate, int years, Double[] memo) {
        if (years == 0) {
            return principal;
        }
        if (memo[years] != null) {
            return memo[years];
        }
        memo[years] = futureValueMemoized(principal, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double principal = 10000; // Initial investment
        double rate = 0.05;       // 5% annual growth rate
        int years = 10;           // Forecast for 10 years

        System.out.println("🔁 Recursive Future Value Calculation:");
        double result1 = futureValueRecursive(principal, rate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, result1);

        System.out.println("\n⚡ Memoized Recursive Future Value Calculation:");
        Double[] memo = new Double[years + 1];
        double result2 = futureValueMemoized(principal, rate, years, memo);
        System.out.printf("Future Value after %d years (memoized): ₹%.2f\n", years, result2);
    }
}
