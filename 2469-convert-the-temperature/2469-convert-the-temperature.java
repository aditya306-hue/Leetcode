class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double Farheneit = celsius*1.80 + 32;
        double con[] = new double[2];
        con[0] = kelvin;
        con[1] = Farheneit;
        return con;
    }
}