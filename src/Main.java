import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.");
        printInfoAboutYear(2020);
        System.out.println("Задание 2.");
        printInfoAboutVersion(1,2016);
        System.out.println("Задание 3.");
        int deliveryDays = calculateDeliveryDays(95);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней:" + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }

    private static void printInfoAboutYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " - високосный");
        } else {
            System.out.println("Год " + year + " - НЕ високосный");
        }
    }

    private static void printInfoAboutVersion(int os, int deviceYear) {
        if (OC != 0 && OC != 1) {
            System.out.println("Неккоректная ОС!");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        StringBuilder stringBuilder = new StringBuilder("Установите");
        if (deviceYear < currentYear) {
            stringBuilder.append(" облегченную");
        }
        stringBuilder.append(" версию приложения для");
        if (OC == 0) {
            stringBuilder.append(" iOS");
        }else {
            stringBuilder.append(" Android");
        }
        stringBuilder.append(" по ссылке ");
        System.out.println(stringBuilder);
    }

    private static int calculateDeliveryDays(int distance) {
        if (distance < 0 || distance > 100) {
            return 0;
        }

        int days = 1;

        if (distance >= 20) {
            days++;
        }
        if (distance >= 60) {
            days++;
        }
        return days;
    }

}