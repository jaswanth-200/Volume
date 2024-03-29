import java.util.Scanner;
class A{
    double side;
    double height;
    double width;
    double bredth;
    double radius;
public double volume(double side)
{   this.side=side;
    return side*side*side;
}
public double volume(double height,double width,double bredth){
    this.height=height;
    this.width=width;
    this.bredth=bredth;
    return height*width*bredth;
}
public double volume(double radius,double height)
{
    this.radius=radius;
    this.height=height;
    return 3.1415*radius*radius*height;
}
}
public class Volume
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A obj=new A();
		System.out.println("Enter side value of cube: ");
		double side=sc.nextDouble();
		System.out.println("Enter height : ");
        double height=sc.nextDouble();
        System.out.println("Enter width : ");
        double width=sc.nextDouble();
        System.out.println("Enter bredth : ");
        double bredth=sc.nextDouble();
        System.out.println("Enter radius : ");
        double radius=sc.nextDouble();
		System.out.println("Volume of cube :"+obj.volume(side));
		System.out.println("Volume of cuboid :"+obj.volume(height,width,bredth));
		System.out.println("Volume of cylinder :"+obj.volume(radius,height));
		
	}
}

