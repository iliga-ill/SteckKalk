import java.util.Scanner;

public class CompfTest {

    public static void notmain(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Compf c = new Compf();
        while (true) {
            System.out.println("Введите формулу -> ");
            c.compile(scanner.nextLine().toCharArray());
        }
    }

}
