import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Compf r = new Compf();
        Calc c = new Calc();//!!
        String Line;
        while (true) {
            System.out.println("Введите формулу -> ");
            Line=scanner.nextLine();
            //r.compile(Line.toCharArray());
            c.compile(Line.toCharArray());//!!!
        }
    }
}
