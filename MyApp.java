import java.util.Scanner;
/**
 * MyApp 실행 클래스
 *
 * @author (2팀)
 * @version (2026.05.05)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Student jenna = new Student("Jenna", "12345");
        Student john = new Student("John", "12346");
        Student maria = new Student("Maria", "12347");
        Student james = new Student("James", "12348");
        
        System.out.print("Jenna에게 질문할 단을 입력하세요>> ");
        int dan1 = scan.nextInt();
        jenna.answerGugudan(dan1); 

        System.out.print("John에게 질문할 단을 입력하세요>> ");
        int dan2 = scan.nextInt();
        john.answerGugudan(dan2);

        System.out.print("Maria에게 질문할 단을 입력하세요>> ");
        int dan3 = scan.nextInt();
        maria.answerGugudan(dan3);

        System.out.print("James에게 질문할 단을 입력하세요>> ");
        int dan4 = scan.nextInt();
        james.answerGugudan(dan4);
        
        scan.close();
    }
}