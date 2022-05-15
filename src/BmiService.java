public class BmiService {
    public double calculate(double weight, double height) {
        double height1 = height / 100;
        double bmi = weight / (height1 * height1);
        return bmi;
    }
}
