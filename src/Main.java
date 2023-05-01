public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task10() {
        int r = 0;
        for(int t = 0; t < 11; t = t + 1) {
            r = t*2;
            System.out.println("2*"+ t + "=" + r);
        }
    }

    private static void task9() {
        int amount2 = 29000;
        int percent = 290;
        int total = 0;
        for (int m = 1; m <= 12; m++){
            total = total + percent;
            total = total + amount2;
            System.out.println("за месяц " + m + " сумма начисленного процента составила " + total);
        }

    }

    private static void task8() {
        int amount = 29000;
        int total = 0;
        for (int mt = 1; mt <=12; mt++){
            total = total + amount;
            System.out.println("сумма накоплений за месяц " + mt + " равна " + total);
        }

    }

    private static void task7() {
        for (int o = 1; o < 550; o = o * 2) {
            System.out.println("удвоенное число будет равно " + o);
        }
    }

    private static void task6() {
        for(int s = 0; s<100; s = s + 7) {
            System.out.println("последовательности чисел " + s);
        }
    }

    private static void task5() {
        for (int year = 1904; year < 2096; year = year +4) {
            System.out.println( year + " год считается високосным");
        }
    }

    private static void task4() {
        for (int w = 11; w > -11; w = w - 1) {
            System.out.println("порядок чисел " + w);
        }
    }

    private static void task3() {
        for (int ch = 0; ch < 18; ch = ch +2) {
            System.out.println("четное число " + ch);
        }
    }

    public static void task1 () {
       for (int i = 0; i < 10; i = i + 1) {
           System.out.println("цикл " + i);
       }
    }

    public static void task2 () {
        for (int r = 10; r > 0; r = r - 1) {
            System.out.println("новый цикл " + r);
        }
    }
}