import java.util.Scanner;
/**
 * Main 클래스
 * 학생 객체 4개를 생성하고 사용자 입력으로 구구단을 출력하는 클래스
 *
 * @author (2팀)
 * @version (2026.05.05)
 */

public class MyApp {
    public static void main(String[] args) {
        Student jenna = new Student("Jenna", "2401");
        Student mike  = new Student("Mike",  "2402");
        Student sara  = new Student("Sara",  "2403");
        Student tom   = new Student("Tom",   "2404");

        Scanner scanner = new Scanner(System.in);

        System.out.print("누구에게 물어볼까요? (Jenna/Mike/Sara/Tom): ");
        String name = scanner.nextLine();

        System.out.print("몇단을 물어볼까요?");
        int dan = scanner.nextInt();

        if (name.equals("Jenna")) {
            jenna.answerGugudan(dan);
        } else if (name.equals("Mike")) {
            mike.answerGugudan(dan);
        } else if (name.equals("Sara")) {
            sara.answerGugudan(dan);
        } else if (name.equals("Tom")) {
            tom.answerGugudan(dan);
        } else {
            System.out.println("없는 학생이에요!");
        }
        scanner.close();
    }
}