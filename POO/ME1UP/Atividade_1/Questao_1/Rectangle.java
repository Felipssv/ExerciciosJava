package UNIMA.POO.ME1UP.Atividade_1.Questao_1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return (width * 2) + (height * 2);
    }
    
    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
