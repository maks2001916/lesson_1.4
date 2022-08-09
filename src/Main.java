public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!"); {
            //Первое задание
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            for (int s = 10; s > 0; s--) {
                System.out.print(s + " ");

            }
    }
    //Второе задание
        int friday = 5;
        for (; friday <= 31; friday = friday + 5) {
            System.out.println("сегодня птница, " + friday + "-ое число. Необходимо одготовить отчёт.");
        }
    //Третье задание
    int year = 2022;
    int year_200 = year - 200;
    int year100 = year + 100;
    for (int beginning = 0; beginning <= 2100; beginning = beginning + 79) {
        if (beginning > year_200 && beginning < year100) {
            System.out.println(beginning);
        }
    }
    }
}