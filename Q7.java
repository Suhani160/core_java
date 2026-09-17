public class EvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1; 

        while (num <= 50) {
            if (num % 2 == 0) {
                sum += num; 
            }
            num++; 
        }

        System.out.println("The sum of all even numbers between 1 and 50 is: " + sum);
    }
}