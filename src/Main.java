//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        int money = 15_000;
        int only = 0;
        int i = 0;
        while (only < 2_459_000) {
            only = only + only / 100;
            only = only + money;
            i++;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + only + " рублей");
        }

        System.out.println("Задача 2");
        int u = 0;
        while (u < 10) {
            u++;
            System.out.print("  " + u);
        }

        System.out.println();
        for (int m = 10; m >= 1; m--) {
            System.out.print("  " + m);
        }

        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int fatality = 8;
        int age = 10;
        for (int y = 1; y <= age; y++) {
            int birth = population * birthRate / 1000;
            int death = population * fatality / 1000;
            population = population + birth - death;
            System.out.println("Год " + y + " ,численность населения составляет " + population);
        }

        System.out.println("Задача 4");
        int initialAmount = 15_000;
        int finalAmount = 12_000_000;
        double monthPercent = 0.07;
        int month = 0;
        while (initialAmount < finalAmount) {
            initialAmount += initialAmount * monthPercent;
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений " + initialAmount);
        }

        System.out.println("Задача 5");
        int initialAmoun = 15_000;
        int finalAmoun = 12_000_000;
        double monthPercen = 0.07;
        int mont = 0;
        while (initialAmoun < finalAmoun) {
            initialAmoun += initialAmoun * monthPercen;
            mont++;
            if (mont % 6 == 0) {
                System.out.println("Месяц " + mont + " , сумма накоплений " + initialAmoun);
            }
        }
        System.out.println("Задача 6");
        int total = 15_000;
        double percent = 0.07;
        for (int year = 1; year <= 9; year++) {
            for (int months = 1; months <= 6; months++)
                total += total * percent;
                if (mont % 6 == 0) {
                }
                    System.out.println("Полгода " + year + " сумма " + total);
                }





            System.out.println("Задача 7");
            int friDay = 1;
            for (int day = friDay; day <= 31; day += 7) {
                System.out.println("Сегодня пятница " + day + " , необходимо подготовить отчет");
            }

            System.out.println("Задача 8");
            int yrTwo = 1825;
            int yrOne = 2125;
            for (int y = yrTwo; y <= yrOne; y += 79) {
                System.out.println(y);
            }


        }
    }

