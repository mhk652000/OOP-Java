import java.util.Scanner;



class Teacher 
{
    protected
    String name,address;
    int age;
    public

    Scanner userInput=new Scanner(System.in);
    void Tinput()
    {
        System.out.print("Teacher's Name:");
        name=userInput.nextLine();

        System.out.print("Teacher's Address:");
        address=userInput.nextLine();

        System.out.print("Teacher's age:");
        age=userInput.nextInt();

        


    }
    void Tdisplay()
    {
        System.out.print("Teacher's Name:\t" + name + "\n");
        System.out.print("Age is:\t" + age + "\n");
        System.out.print("Address is:\t" + address + "\n\n\n");

    }
    
}

class Writer extends Teacher
{
    protected
    String name,address;
    int noOFBooks;

    public
    void Winput()
    {
        userInput.nextLine();

        System.out.print("Writer's Name:");
        name=userInput.nextLine();

        

        System.out.print("Writer's Number of Books:");
        noOFBooks=userInput.nextInt();

        userInput.nextLine();

        System.out.print("Writer's Address:");
        address=userInput.nextLine();

        

        


    }

    void Wdisplay()
    {
        System.out.print("Writer's Name:  " + name + "\n");
        System.out.print("Address is:  " + address + "\n");
        System.out.print("Books Written:  " + noOFBooks + "\n");
    }
}


public class Scholar extends Writer
{

    public static void main(String[] args) {
        
        Scholar object=new Scholar();    //calling parent's function from child's obj
        
        
        object.Tinput();
        object.Winput();

        System.out.print("\n\n");

        object.Tdisplay();
        object.Wdisplay();
    }
}
