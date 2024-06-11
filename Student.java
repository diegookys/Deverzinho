// Classe filha

public class Student extends Person{
    private String studentID;

    // Construtor para inicializar o nome, a idade e o ID do aluno
    public Student(String nome, int idade, String studentID){
        super(nome, idade);     // Chama o construtor da classe mãe Person
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}
