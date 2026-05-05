import java.util.Scanner;
/**
 * MyApp 클래스
 * 학생 객체 4개를 생성하고 사용자 입력으로 구구단을 출력하는 클래스
 *
 * @author (2팀)
 * @version (2026.05.05)
 */

public class MyApp {
    public static void main(String[] args) {
        Student jenna = new Student("Jenna", "2401");
        Student john  = new Student("John",  "2402");
        Student maria = new Student("Maria", "2403");
        Student james = new Student("James", "2404");

        Scanner scan = new Scanner(System.in);
        System.out.print("누구에게 물어볼까요? (" + jenna.getName() + "/" + john.getName() + "/" + maria.getName() + "/" + james.getName() + "): ");
        String name = scan.nextLine();
        System.out.print("몇단을 물어볼까요?");
        int dan = scan.nextInt();

        switch (name) {
            case "Jenna":
                jenna.answerGugudan(dan);
                break;
            case "John":
                john.answerGugudan(dan);
                break;
            case "Maria":
                maria.answerGugudan(dan);
                break;
            case "James":
                james.answerGugudan(dan);
                break;
            default:
                System.out.println("없는 학생이에요!");
                break;
        }
        scan.close();
    }
}