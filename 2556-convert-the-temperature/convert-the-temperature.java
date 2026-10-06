class Solution {
    public double[] convertTemperature(double celsius) {
        double n = celsius;
        double kelvin = n + 273.15;
        double Fahrenheit = n * 1.80 + 32.00;
        return new double[]{ kelvin , Fahrenheit};
        
    }
}