class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double avg = sum / 10.0;
        System.out.println("Average of first 10 numbers: " + avg);
    }
}
class SquareThread extends Thread {
    int[] arr = {1, 20, 50, 15, 30};
    public void run() {
        System.out.println("Squares of numbers in the array:");
        for (int num : arr) {
            System.out.println("Square of " + num + " : " + (num * num));
        }
    }
}
public class Assexample4 {
    public static void main(String[] args) {
        SquareThread t1 = new SquareThread();
        AverageThread t2 = new AverageThread();

        try {
            t1.start();
            t1.join(); 

            t2.start();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}