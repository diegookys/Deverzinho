public class Main{
    public static void main(String[] args){
        Student estudante = new Student("Joãozinho", 20, "UC23000000");

        // detalhes do aluno
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);

        System.out.println("ID do Estudante: " + estudante.getStudentID());
    }
}
