import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    private static void task1() {
        System.out.println(" Задание 1 ");
        int[] arrayInt = {1, 2, 3};
        double[] arrayD = new double[3];
        arrayD[0] = 1.57;
        arrayD[1] = 7.654;
        arrayD[2] = 9.986;
        System.out.println(arrayInt[0] + " " + arrayInt[1] + " " + arrayInt[2]);
        System.out.println(arrayD[0] + " " + arrayD[1] + " " + arrayD[2]);
    }
    private static void task2() {
        System.out.println(" Задание 2 ");
        int[] arrayInt = {1, 2, 3};
        double[] arrayD = new double[3];
        arrayD[0] = 1.57;
        arrayD[1] = 7.654;
        arrayD[2] = 9.986;
        System.out.println(arrayInt[0] + "," + arrayInt[1] + "," + arrayInt[2]);
        System.out.println(arrayD[0] + "," + arrayD[1] + "," + arrayD[2]);
    }
    private static void task3() {
        System.out.println(" Задание 3 ");
        int[] arrayInt = {1, 2, 3};
        double[] arrayD = new double[3];
        arrayD[0] = 1.57;
        arrayD[1] = 7.654;
        arrayD[2] = 9.986;
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.println("");
        for (int j = arrayD.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(arrayD[j]);
                break;
            }
            System.out.print(arrayD[j] + ", ");
        }
        System.out.println("");
    }
    private static void task4() {
        System.out.println(" Задание 4 ");
        int[] arrya = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrya.length; i++) {
            if (arrya[i] % 2 == 1) {
                arrya[i] += 1;
            }
        }
        System.out.print(Arrays.toString(arrya));
    }
}







