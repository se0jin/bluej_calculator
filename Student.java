/**
 * Student 학생 객체 클래스
 *
 * @author (2팀)
 * @version (2026.05.05)
 */
public class Student {
    private String name;      
    private String studentId; 

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    public void answerGugudan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.print(dan + "x" + i + "=" + (dan * i));
            if (i < 9) {
                System.out.print("  ");
            }
        }
        System.out.println("\n");
    }
}