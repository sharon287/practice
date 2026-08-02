package mod1;
public class primenumber {
    public static void main(String[] args) {

        for (int number = 1; number <= 100; number++) {

            boolean isPrime = true;

            if (number < 2) {
                isPrime = false;
            } else {

                for (int i = 2; i < number; i++) {

                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
