import model.Rectanlge;
import model.Triangle;

import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        //Без ООП
        Scanner in =new Scanner(System.in);
        double width=in.nextDouble();
        double height=in.nextDouble();
        System.out.println(width*height);
        System.out.println(2*(width+height));
        System.out.println(Math.sqrt(width*width+height*height));
        //с ООП
        Rectanlge rectanlge=new Rectanlge(width,height);
//        rectanlge.height=height;
//        rectanlge.width=width;
//        System.out.println(rectanlge.Area());
//        System.out.println(rectanlge.Perimetr());
//        System.out.println(rectanlge.LengthOfDiagonal());
        rectanlge.Print();
        Rectanlge rect1=new Rectanlge();
        rect1.Print();
        Rectanlge rect2=new Rectanlge(width);
        rect2.Print();
        Rectanlge rect3=new Rectanlge(56);
        rect3.Print();

        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        Triangle triangle1=new Triangle(a,b,c);
        triangle1.Print();
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        double x3=in.nextDouble();
        double y3=in.nextDouble();
        Triangle triangle2=new Triangle(x1,y1,x2,y2,x3,y3);
        triangle2.Print();
    }
}
