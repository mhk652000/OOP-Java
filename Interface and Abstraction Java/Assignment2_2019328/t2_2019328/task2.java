import java.util.Scanner;


class employees
{
    protected
    double salary;
    double baseSal;
    double hourly;
    double comission;

    public

    Scanner userInput=new Scanner(System.in);
    employees()
    {
        baseSal=40000;
        hourly=1500;
        comission=0.1;
    }
}
class salaried extends employees
{
    

    public
    void returnSal()
    {
        salary=baseSal;
        System.out.print("\nSalary is: "+ salary+ "\n");
    }
    
}

class hourly extends employees
{
    protected
    double hours;
    public
    void returnSal()
    {
        System.out.print("\nEnter hours: ");
        hours=userInput.nextDouble();
        if (hours <= 40)
        {
            salary=hours*hourly;
        }

        else
        {
            salary=hours*hourly;
            salary=salary+((hours-40)*10);
        }
        
        System.out.print("\nSalary is: "+ salary+ "\n");
    }
}

class commission extends employees
{
    protected
    double sales;

    public

    void returnSal()
    {
        System.out.print("\nEnter Sales: ");
        sales=userInput.nextDouble();


        salary=sales*comission;
        System.out.print("\nSalary is: "+ salary + "\n");
    }

}

class baseComm extends employees
{
    protected
    double sales;

    public

    void returnSal()
    {
        System.out.print("\nEnter Sales: ");
        sales=userInput.nextDouble();

        salary=(sales*comission)+baseSal+4000;
        System.out.print("\nSalary is: "+ salary + "\n");
    }
}

public class task2 {

    
    public static void main(String[] args) {

        int inputt=0;

        salaried basicEmp = new salaried();
        hourly hourEmp = new hourly();
        commission commEmp = new commission();
        baseComm bcommEmp = new baseComm();

        Scanner userInput=new Scanner(System.in);

        do
        {
            System.out.print("\nEnter the employee type:\n1) Salaried \n2) Hourly \n3) Commission \n4) Basic+Comission \n5) Exit\n");
            inputt=userInput.nextInt();

            if(inputt==1)
            {
                basicEmp.returnSal();
            }
            if(inputt==2)
            {
                hourEmp.returnSal();
            }
            if(inputt==3)
            {
                commEmp.returnSal();
            }
            if(inputt==4)
            {
                bcommEmp.returnSal();
            }

        }while(inputt !=5);
        





    }
    
}
