public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Задание 1.1
        for (int i = 1; i <= 10; i++) {
            //System.out.println(i);
        }

        //Задание 2.1
        for (int i = 10; i >= 1; i--) {
            //System.out.println(i);
        }

        //Задание 3.1
        for (int i = 0; i <= 17; i = i + 2) {
            //System.out.println(i);
        }


        for (int i = 10; i >= -10; i = i - 1) {
            // System.out.println(i);
        }

        //Заданий 1.2
        for (int j = 1904; j <= 2096; j = j + 4) {
            // System.out.println(j);
        }

        //Заданий 2.2
        for (int j = 0; j <= 98; j = j + 7) {
            //System.out.println(j);
        }

        //Заданий 3.2
        for (int j = 1; j <= 512; j = j * 2) {
            // System.out.println(j);
        }
        //Задача1.3

        int salary = 29000;
        int total = 0;
        int j = 1;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + salary;
            j = j + 1;
            //System.out.println("Месяц " + j + " сумма накоплений равна " + total + " рублей");

        }
        int ten = 0;
        while (ten < 10) {
            ten = ten + 1;
            //System.out.println(ten);
        }
        for (ten = 10; ten > 0; ten--) {
            //System.out.println(ten);
        }
        int Y = 12_000_000;
        int birthRute = (17 * Y) / 1000;
        int mortality = (8 * Y) / 1000;
        int q = 0;
        while (q < 10) {
            q = q + 1;
            Y = Y + (birthRute - mortality);
        }
        //System.out.println(Y);

        //Задание 1.2/2.2/3.2
        int amount = 15000;
        int savings = 15000;
        int i = 1;
        while (savings < 12_000_000) {
            savings = savings + savings / (7 * 100);
            savings = amount + savings;
            i = i + 1;
            if (i % 6 == 0 && i < 108) {
                // System.out.println(" Месяц " + i + " Сумма " + savings);
            }
        }
        //Задание4.2
        int friday = 1;
        for (; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + ". Необходимо подготовить отчет");

        }
        //Задание1.3
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (i = beginning; i < ending; i++) {
            if (i % 79 == 0)
                System.out.println(i);
        }

        //Задание 2.3
        int p = 0;
        for (; p <= 10; p++) {
            System.out.println("2 * " + p + " = " + (p * 2));
        }


    }
}

