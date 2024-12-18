public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("\n Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("\n Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("\n Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("\n Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }
        System.out.println("\n Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("\n Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        System.out.println("\n Задача 8, 9");
        int salary = 29000;
        int total = 0;
        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            total = total + total / 100 * 12;
            total = total + salary;
            System.out.println("Месяц " + monthNumber + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\n Задача 10");
        int multiplyable = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplyable + "*" + i + "=" + i * multiplyable);
        }

    }
}