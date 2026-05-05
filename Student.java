/**
 * Student 학생 객체 클래스
 *
 * @author (2팀)
 * @version (2026.05.05)
 */
public class Student {
    private String name;
    private String studentId;
    private String gugudan;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.gugudan ="";
    }
    public String getName()
    {
        return this.name;
    }
    public String getStudentId()
    {
        return this.studentId;
    }
    public void answerGugudan(int dan) {
        this.gugudan = "";
        for(int i =1; i<=9; i++){
            int result = dan * i;
            this.gugudan = this.gugudan + dan + "x" + i + "=" + result + "   ";
        }
        System.out.println(this.name + "(" + this.studentId + "): " + this.gugudan);
    }
}