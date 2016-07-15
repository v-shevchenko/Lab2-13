import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java day: " + day);
                    break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        MyDayOfWeek day = MyDayOfWeek.valueOf(line.toUpperCase());
        System.out.println(day.nexDay());
    }
}
