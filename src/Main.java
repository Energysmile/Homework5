public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        char clientOS = '1';
        switch (clientOS) {
            case '0':
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case '1':
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        //Задание 2
        System.out.println("Задание 2");
        char clientOS2 = '1';
        int yearOfIssue = 2015;
        switch (clientOS2) {
            case '0':
                if (yearOfIssue < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case '1':
                if (yearOfIssue < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
        }
        //Задание 3
        System.out.println("Задание 3");
        int year = 1804;
        if (year > 1584 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 111;
        int delivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + delivery + " срок доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (delivery + 1) + " срок доставки");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (delivery + 2) + " срок доставки");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 0;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}