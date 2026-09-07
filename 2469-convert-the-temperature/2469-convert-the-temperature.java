class Solution {
    public double[] convertTemperature(double celsius) {
        double kel=celsius+273.15;
        double fah=celsius*1.80+32.00;
        return new double[]{kel,fah};
    }
}