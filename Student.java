/**
 * Student 클래스
 * 속성: 이름(name), 학번(studentId)
 * 기능: 구구단 출력 (GugudanCalculator)
 */
public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void GugudanCalculator(int dan) {
        System.out.println(name + "이(가) " + dan + "단을 답합니다:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        System.out.println(); 
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }
}