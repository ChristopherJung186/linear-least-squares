public class LinearRegressionRunner {

    public static void main(String[] args) {
        // Example data: ice cream sales (x = temperature, y = ice cream sales)
        double[][] data = {
            {30, 250},  // (x = 30, y = 250)
            {32, 280},  // (x = 32, y = 280)
            {35, 320},  // (x = 35, y = 320)
            {40, 400},  // (x = 40, y = 400)
            {45, 450}   // (x = 45, y = 450)
        };

        // Calculate the slope (m) and y-intercept (b)
        double m = LinearRegression.calcM(data);
        double b = LinearRegression.calcB(data);

        // Output the results
        System.out.println("The slope (m) is: " + m);
        System.out.println("The y-intercept (b) is: " + b);
    }
}
