package task2;

public class main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
            System.out.println(intArray[i]);
        }
        try {
            int d = (int) (Math.random() * 3);
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
