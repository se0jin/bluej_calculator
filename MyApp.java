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
        Student jenna = new Student("JENNA", "R005");
        Student john  = new Student("JOHN",  "R010");
        Student maria = new Student("MARIA", "R029");
        Student james = new Student("JAMES", "R009");

        Scanner scan = new Scanner(System.in);
        String name = "";
        while(true) {
            System.out.print("누구에게 물어볼까요? (" + jenna.getName() + "/" + john.getName() + "/" + maria.getName() + "/" + james.getName() + "): ");
            name = scan.nextLine();
            if (name.equals("JENNA") || name.equals("JOHN") || name.equals("MARIA") || name.equals("JAMES")) {
                break;
            } else {
                System.out.println("없는 학생입니다. 이름을 다시 입력해주세요.\n");
            }
        }
        System.out.print("몇단을 물어볼까요?");
        int dan = scan.nextInt();
        switch (name) {
            case "JENNA":
                jenna.CalculateGugudan(dan);
                break;
            case "JOHN":
                john.CalculateGugudan(dan);
                break;
            case "MARIA":
                maria.CalculateGugudan(dan);
                break;
            case "JAMES":
                james.CalculateGugudan(dan);
                break;
            default:
                System.out.println("오류가 발생했습니다.");
                break;
        }
        scan.close();
    }
}