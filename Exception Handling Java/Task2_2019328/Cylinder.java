public class Cylinder{
    
    static double pi=3.142;
    static double Ab;
    static double V;
    static double As;
    static int r=4;
    static int h=3;

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
        baseArea();
        volume();
        surfaceArea();

    }
    
}




