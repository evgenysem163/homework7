import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task1();
        task2();
        task3();
        task4();
//    }
//    private static void task1() {
//        System.out.println(" Задание 1 ");
//        int[] arrayInt = {1, 2, 3};
//        double[] arrayD = new double[3];
//        arrayD[0] = 1.57;
//        arrayD[1] = 7.654;
//        arrayD[2] = 9.986;
//        System.out.println(arrayInt[0] + " " + arrayInt[1] + " " + arrayInt[2]);
//        System.out.println(arrayD[0] + " " + arrayD[1] + " " + arrayD[2]);
//    }
//    private static void task2() {
//        System.out.println(" Задание 2 ");
//        int[] arrayInt = {1, 2, 3};
//        double[] arrayD = new double[3];
//        arrayD[0] = 1.57;
//        arrayD[1] = 7.654;
//        arrayD[2] = 9.986;
//        System.out.println(arrayInt[0] + "," + arrayInt[1] + "," + arrayInt[2]);
//        System.out.println(arrayD[0] + "," + arrayD[1] + "," + arrayD[2]);
//    }
//
//    private static void task3() {
//        System.out.println(" Задание 3 ");
//        int[] arrayInt = {1, 2, 3};
//        double[] arrayD = new double[3];
//        arrayD[0] = 1.57;
//        arrayD[1] = 7.654;
//        arrayD[2] = 9.986;
//        for (int i = arrayInt.length - 1; i >= 0; i--) {
//            if (i == 0) {
//                System.out.print(arrayInt[i]);
//                break;
//            }
//            System.out.print(arrayInt[i] + ", ");
//        }
//        System.out.println("");
//        for (int j = arrayD.length - 1; j >= 0; j--) {
//            if (j == 0) {
//                System.out.print(arrayD[j]);
//                break;
//            }
//            System.out.print(arrayD[j] + ", ");
//        }
//        System.out.println("");
//    }
//    private static void task4() {
//        System.out.println(" Задание 4 ");
//        int[] arrya = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < arrya.length; i++) {
//            if (arrya[i] % 2 == 1) {
//                arrya[i] += 1;
//            }
//        }
//        System.out.print(Arrays.toString(arrya));
//    }
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();// generateRandomArray() — вызов метода «сгенерироватьМассив»
        int[] arr = new int[30]; // int[] arr — объявление массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        System.out.println("Задание 1 часть второя");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %.2f рублей ", sum);
        System.out.println("");
    }

    private static void task2() {
        System.out.println("Задание 2 часть второя ");
        int[] arr = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        }
    }
    private static void task3() {
        System.out.println(" Задание 3 ");
        int[] arr = generateRandomArray();
        double sum = 0;
        int day = 30;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] / day;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей ", sum);
        System.out.println("");
    }
    private static void task4() {
            System.out.println(" Задание 4 ");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = 0; i < reverseFullName.length / 2; i++) {
                char sort = reverseFullName[i];
                reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
                reverseFullName[reverseFullName.length - i - 1] = sort;
            }
            System.out.print(Arrays.toString(reverseFullName));
        }
    }










