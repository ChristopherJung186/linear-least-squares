public class LinearRegression {

    // Method to calculate the slope (m)
    public static double calcM(double[][] data) {
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        int n = data.length;

        for (int i = 0; i < n; i++) {
            sumX += data[i][0];  // x values
            sumY += data[i][1];  // y values
            sumXY += data[i][0] * data[i][1];  // x * y
            sumX2 += data[i][0] * data[i][0];  // x^2
        }

        // Formula to calculate slope (m) of the line: m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX^2)
        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        return m;
    }

    // Method to calculate the y-intercept (b)
    public static double calcB(double[][] data) {
        double sumX = 0, sumY = 0;
        int n = data.length;

        for (int i = 0; i < n; i++) {
            sumX += data[i][0];  // x values
            sumY += data[i][1];  // y values
        }

        // Formula to calculate intercept (b): b = (sumY - m * sumX) / n
        double m = calcM(data);  // First, calculate the slope (m)
        double b = (sumY - m * sumX) / n;
        return b;
    }
}
