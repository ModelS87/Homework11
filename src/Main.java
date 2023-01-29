public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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
        printTheNameOfVersion(clientDeviceOs, clientDeviceYear);
        System.out.println();
    }


    public static int printTheDeliveryDays (int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays++;
            }
        return deliveryDays;
            }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = printTheDeliveryDays(deliveryDistance);
        if (deliveryDays > 3) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Для доставки потребуется количество дней: " + deliveryDays);
        }
    }
        }

