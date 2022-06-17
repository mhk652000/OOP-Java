import java.util.Scanner;
import java.util.InputMismatchException;




public class Cylinder{
    
    static double pi=3.142;
    static double Ab;
    static double V;
    static double As;
    static int r;
    static int h;


    static void inputR()
    {   
        try{

            Scanner Obj=new Scanner(System.in);
            System.out.println("Enter the radius of Cylinder:");
            r=Obj.nextInt();
            
            
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter an INTEGER!\n");
            inputR();
        }
    }

    static void inputH(){
        try{
            Scanner Obj=new Scanner(System.in);
            System.out.println("Enter the height of Cylinder:");
            h=Obj.nextInt();
        }

        catch(InputMismatchException e)
        {
            System.out.println("Enter an INTEGER!\n");
            inputH();
        }

    }
    

    static void baseArea(){
        Ab=pi*r*r;

        System.out.println("Base Area is: " + Ab + "cm^2");
    }

    static void volume(){
        V=Ab*h;
        
        System.out.println("Volume is: " + V + "cm^3");
    }
    
    static void surfaceArea(){
        As=2*(pi*r*h) + 2*(Ab);
        System.out.println("Surface Area is: " + As + "cm^2");
    }



    public static void main(String[] args) {
        inputR();
        inputH();
        baseArea();
        volume();
        surfaceArea();

    }
    
}

