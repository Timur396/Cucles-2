public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");


        // Задание 1.1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }

        //Задание 2.1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
        }

        //Задание 3.1
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }


        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        //Заданий 1.2
        for (int j = 1904; j <= 2096; j = j + 4) {
            System.out.println(j);
        }

        //Заданий 2.2
        for (int j = 0; j <= 98; j = j + 7) {
            System.out.println(j);
        }

        //Заданий 3.2
        for (int j = 1; j <= 512; j = j * 2) {
            System.out.println(j);
        }

        //Задача1.3

        int salary = 29000;
        int total = 0;
        int j = 0;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + salary;
            j = j + 1;
            System.out.println("Месяц " + j + " сумма накоплений равна " + total + " рублей");

        }
        int z=0;
       while (z<=10){
           z=z+1;
            System.out.print(" "+ z );
        }
       // System.out.println(" ");Если я убираю эту строчку у меня получается ответ в одну строку 1 2 3 4 5 6 7 8 9 10 11 10 9 8 7 6 5 4 3 2 1 013080000
        //Тоесть все три задания в одной строке ответа
        for(int g=10;g>=0;g-- ){
            System.out.print(" "+g);
        }

        int population = 12_000_000;
        int birthRate = (17 * population) / 1000;
        int mortality = (8 * population) / 1000;
        for (int i=0; i<=10; i++){
            population= population+birthRate;
            population=population-mortality;
            System.out.println("Год "+ i+ " численность " +population);
        }

        //Задание 1.2/2.2/3.2
        int amount = 15000;
        int savings = 15000;
        int i = 0;
        while (savings < 12_000_000) {
            savings = savings + savings / (7 * 100);
            savings = amount + savings;
            i = i + 1;
            if (i % 6 == 0 && i < 108) {
                System.out.println(" Месяц " + i + " Сумма " + savings);
            }
        }
        //Задание2.4
        int friday = 0;
        for (; friday < 31; friday++) {
            if (friday % 7 == 0)
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

