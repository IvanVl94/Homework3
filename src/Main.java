public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age1 = 18;
        int age2 = 16;
        if (age1 >= 18) {
            System.out.println(" Если возраст человека равен " + age1 + ", то он совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");


        }
        if (age2 >= 18) {
            System.out.println(" Если возраст человека равен " + age2 + ", то он совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature1 = 3;
        int temperature2 = 7;
        if (temperature1 < 5) {
            System.out.println(" На улице " + temperature1 + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temperature1 + " градусов, можно идти без шапки");


        }
        if (temperature2 < 5) {
            System.out.println(" На улице " + temperature2 + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temperature2 + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed1 = 80;
        int speed2 = 50;
        if (speed1 > 60) {
            System.out.println(" Если скорость " + speed1 + " , то придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость  " + speed1 + " , то можно ездить спокойно ");
        }
        if (speed2 > 60) {
            System.out.println(" Если скорость  " + speed2 + " , то придется заплатить штраф ");
        } else {
            System.out.println(" Если скорость  " + speed2 + " , то  можно ездить спокойно ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age1 = 4;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println(" Если возраст человека равен " + age1 + ", то ему нухно ходить в детский сад");
        }
        int age2 = 17;
        if (age2 >= 7 && age2 <= 18) {
            System.out.println(" Если возраст человека равен " + age2 + ", то ему нухно ходить в школу ");
        }
        int age3 = 20;
        if (age3 > 18 && age1 < 24) {
            System.out.println(" Если возраст человека равен " + age3 + ", то ему нухно ходить в университет ");
        }
        int age4 = 30;
        if (age4 > 24) {
            System.out.println(" Если возраст человека равен " + age4 + ", то ему нухно ходить на работу");

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age1 = 3;
        if (age1 < 5) {
            System.out.println(" Если возраст ребенка равен " + age1 + ", то ему  нельзя кататься на аттракционе ");
        }

        int age2 = 12;
        if (age2 > 5 && age2 < 14) {
            System.out.println(" Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении");
        }

        int age3 = 15;
        if (age3 > 14) {
            System.out.println(" Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }
    public static void task6() {
        System.out.println("Задача 6");
        int people = 99;
        if (people >= 1 && people <= 60) {
            System.out.println(" Если место в вагоне будет " + people + ", то место будет сидячее");
        } else {
            if (people > 60 && people <= 102) {
                System.out.println(" Если место в вагоне будет " + people + ", то место будет стоячее ");
            } else {
                System.out.println(" Если место в вагоне будет " + people + ", то мест нет ");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 99;
        int two = 190;
        int three = 1000;
        if (one > two && one > three) {
            System.out.println(" Первое число больше всех ");
        } else {
            if (two > one && two > three) {
                System.out.println(" Второе число больше всех ");
            } else {
                System.out.println(" Третье число больше всех ");
            }
        }
    }

}

