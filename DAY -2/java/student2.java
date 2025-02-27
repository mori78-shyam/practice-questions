
public class student2 {

    int studentId;
    String studentName;
    char grade;

    public student2(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public void printSummery() {
        System.out.println("\nParameterized Student:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
        student2 parameterizedStudent = new student2(101, "John Doe", 'A');
        parameterizedStudent.printSummery();

    }
}
