public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей" );


        System.out.println(" ");
        System.out.println("Задача 2");
        int minsum = 200000;
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minsum) {
                minsum = arr[i];
            }
            if (arr[i]>maxsum) {
                maxsum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minsum+" рублей. Максимальная сумма трат за день составила "+maxsum+" рублей" );


        System.out.println(" ");
        System.out.println("Задача 3");
        int middlesum =0;
        int summ =0;
        for (int i = 0; i < arr.length; i++) {
            summ+= arr[i];
            middlesum = summ / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила "+middlesum+" рублей" );


        System.out.println(" ");
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int m = 10; m>=0; m--) {
            System.out.print(reverseFullName[m]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;


    }
}

