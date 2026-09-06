//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1;
        int clientOS = 0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка скачивания");
        }


        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
            int year = 1782;
            if (year < 1584) {
                System.out.println(year + " год не является високосным");
            } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }


            int deliveryDistance = 95;
            if (deliveryDistance < 20) {
                System.out.println("Потребуется 1 день");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется 2 дня");
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется 3 дня");
            } else {
                System.out.println("Доставки нет");
            }


            int monthNumber = 12;
            switch (monthNumber) {
                case 1 :
                case 2 :
                case 12 :
                    System.out.println("Этот месяц принадлежит к сезону зима");
                    break;
                case 3 :
                case 4 :
                case 5 :
                    System.out.println("Этот месяц принадлежит к сезону весна");
                    break;
                case 6 :
                case 7 :
                case 8 :
                    System.out.println("Этот месяц принадлежит к сезону лето");
                    break;
                case 9 :
                case 10 :
                case 11 :
                    System.out.println("Этот месяц принадлежит к сезону осень");
                    break;
                default:
                    System.out.println("Такого месяца нет");
            }


    }
}