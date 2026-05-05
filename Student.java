/**
 * Student 학생 객체 클래스
 *
 * @author (2팀)
 * @version (2026.05.05)
 */
public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    public String getName()
    {
        return this.name;
    }
    public int getStudentId()
    {
        return this.studentId;
    }
    public void answerGugudan(int dan) {
        String gugudan = ""; 
        for(int i = 1; i <= 9; i++){
            int result = dan * i;
            gugudan = gugudan + dan + "x" + i + "=" + result + "   ";
        }
        System.out.println(this.name + "(" + this.studentId + "): " + gugudan);
    }
}