package UNIMA.POO.ME1UP.Atividade_1.Questao_3;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public Student(){
    }
    public Student(String name, double grade1, double grade2, double grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    public double missingPoints() {
        if (finalGrade() < 60.0) {
        return 60.0 - finalGrade();
    }else {
        return 0.0;
        }
    }
}
        
