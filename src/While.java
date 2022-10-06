import java.util.Random;

public class While {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int sum = 0;

        while (!isFinished) {
            int randomnr1 = random.nextInt(10, 30);
            System.out.println(randomnr1);

            if ((randomnr1 == 15 || randomnr1 == 25)) {
                isFinished = true;
            }
            else {
                sum = sum + randomnr1;
            }
        }
        System.out.println(sum);
        System.out.println("Finished");
    }
}
