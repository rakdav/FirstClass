package model;

public class Rectanlge
{
    private double width;//поле
    private double height;//поле

    public Rectanlge() {
        this.width = 0;
        this.height=0;
    }

    public Rectanlge(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public Rectanlge(double w)
    {
        this.width=w;
        this.height=1;
    }

    public Rectanlge(int h)
    {
        this.height=h;
        this.width=1;
    }

    private double Area()//метод
    {
        return width*height;
    }
    private double Perimetr()//метод
    {
        return 2*(width+height);
    }
    private double LengthOfDiagonal()//метод
    {
        return Math.sqrt(width*width+height*height);
    }
    public void Print()
    {
        System.out.println("Площадь:"+Area()+" Периметр:"+Perimetr()+" Диагональ:"+LengthOfDiagonal());
    }
}
