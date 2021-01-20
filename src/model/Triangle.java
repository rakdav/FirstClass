package model;

public class Triangle
{
    private double a,b,c;
    public Triangle(double _a,double _b,double _c)
    {
        a=_a;
        b=_b;
        c=_c;
    }
    public Triangle(double x1,double y1,double x2,double y2,double x3,double y3)
    {
        a=Length(x1,y1,x2,y2);
        b=Length(x2,y2,x3,y3);
        c=Length(x1,y1,x3,y3);
    }
    private double Length(double x1,double y1,double x2,double y2)
    {
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    private double Area()
    {
        double pp=(a+b+c)/2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }
    private double Perimetr()
    {
        return a+b+c;
    }
    public void Print()
    {
        System.out.println("Периметр:"+Perimetr()+" Площадь:"+Area());
    }
}
