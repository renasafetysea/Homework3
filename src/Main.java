public class Main {
    public static void main(String[] args) {task1();task2();task3();task4(); task5();}

    public static void task1() {
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {

            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static void task2() {
        int clientOS1 = 0;
        int clientDeviceYear = 2020;

        if (clientOS1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Утсановите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");

            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Утсановите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + "не является високосным");

        }
    }

    public static void task4() {
        int deliveryDistanse = 95;

        int deliveryDays = 1;

        if (deliveryDistanse > 20) {
            deliveryDays++;
        }
        if (deliveryDistanse > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);

    }
    public static void task5(){
        int monthNumber = 12;
        switch (monthNumber){
          case 12:
          case 1:
          case 2:
              System.out.println("зима");
              break;
          case 3:
          case 4:
          case 5:
          System.out.println("весна");
          break;
          case 6:
          case 7:
          case 8:
          System.out.println("лето");
          break;
          case 9:
          case 10:
          case 11:
          System.out.println("осень");
          break;
          default:
          System.out.println("Неккоректный месяц" + monthNumber);
    }
    }
}


