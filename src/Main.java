import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedete nomer: ");
        int monthNumber = scanner.nextInt();

        Seasons seasons = new Seasons();
        seasons.getSeasonsByMonth(monthNumber);


    }
}