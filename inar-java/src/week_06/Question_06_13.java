package week_06;


public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i                  m(i)");
        System.out.println("-----------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%.4f\n", i, sumSeries(i));
        }
    }

    public static double sumSeries(int number) {
        double sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += (i * 1.0) / (i + 1.0);
        }
        return sum;
    }
}