public class Arithmetic_Mean {
    public static void main(String[] args) {
        int [] numArray = {1, 2, 3, 5, 5, 1, 2, 5, 6};
        int summ = 0;
        for (int n : numArray) {
            summ += n;
        }
        double result = (double)summ / numArray.length;
        System.out.println(result);
    }
}
