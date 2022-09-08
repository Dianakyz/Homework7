public class Main {
    public static void main(String[] args) {

        // Задача №1.1
        System.out.println("Задача №1.1");
        int cash = 29_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total/100;
            total = total + cash;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        // Задача №1.2
        System.out.println("Задача №1.2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println(" ");



        // Задача №1.3
        System.out.println("Задача №1.3");
        int allPeople = 12_000_000;
        int birthOnThousand = 17;
        int deathOnThousand = 8;
        int increaseOnThousand = birthOnThousand - deathOnThousand;
        int increaseForAll = allPeople / 1000 * increaseOnThousand;
        for (int year = 1; year <= 10; year++) {
            allPeople = allPeople + (allPeople / 1000 * increaseOnThousand);
            System.out.println("Год " + year + ", численность населения составляет " + allPeople + " человек.");
        }



        // Задача №2.1
        System.out.println("Задача №2.1");
        int money = 15_000;
        int total3 = 0;
        for (int d = 1; total3 <= 12_000_000; d++) {
            total3 = (int) (total3 + total3 * 0.07);
            total3 = total3 + money;
            System.out.println("Месяц " + d + ", сумма накоплений составляет " + total3 + " рублей");
        }

        // Задача №2.2
        System.out.println("Задача №2.2");
        int total31 = 0;
        for (int e = 1; total31 <= 12_000_000; e++) {
            total31 = (int) (total31 + total31 * 0.07);
            total31 = total31 + money;
            if (e % 6 == 0) {System.out.println("Месяц " + e + ", сумма накоплений составляет " + total31 + " рублей");}
        }

        // Задача №2.3
        System.out.println("Задача №2.3");
        int total4 = 0;
        int time = 9 * 12;
        for (int f = 1; f <= time; f++) {
            total4 = (int) (total4 + total4 * 0.07);
            total4 = total4 + money;
            if (f % 6 == 0) {System.out.println("Месяц " + f + ", сумма накоплений составляет " + total4 + " рублей");}
        }

        // Задача №2.4
        System.out.println("Задача №2.4");
        for (int firstFriday = 2; firstFriday <= 31; firstFriday = firstFriday + 7 ) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        }

        // Задача №3.1
        System.out.println("Задача №3.1");
        int yearNow = 2022;
        int yearsBefore = yearNow - 200;
        int yearfuture = yearNow + 100;
        for (int year = yearsBefore; year <= yearfuture; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

        // Задача №3.2
        System.out.println("Задача №3.2");
        int first = 2;
        int second = 0;
        while (second < 10) {
            second++;
            int sum = first*second;
            System.out.println(first+"*"+second+"="+sum);
        }













    }
}