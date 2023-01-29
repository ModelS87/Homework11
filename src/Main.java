public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void checkYear(int year) {

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        checkYear(year);
        System.out.println();

    }

    public static void printTheNameOfVersion(int deviceOS, int deviceYear) {
        if (deviceOS == 0) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (deviceOS == 1) {
            if (deviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Выберете операционную систему вашего устройства");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceOs = 1;
        int clientDeviceYear = 2015;
        printTheNameOfVersion(clientDeviceOs,clientDeviceYear);
        System.out.println();
    }

    }

