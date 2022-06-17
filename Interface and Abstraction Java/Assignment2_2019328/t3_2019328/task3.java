    
interface FCSE 
{
    int FCSEcount=15;
    public abstract void info(String x, int y);
}

interface FMSE
{
    int FMSEcount=16;
    public abstract void info(String X, int y);
}

class communicator implements FCSE, FMSE
{
    public void info(String X, int y)
    {
        System.out.print(X + y);
    }
}
public class task3 {

    public static void main(String[] args) {
        communicator obj = new communicator();

        obj.info("Info of FCSE is", obj.FCSEcount);

        System.out.println("\n");
        obj.info("Info of FMSE is", obj.FMSEcount);

    }
    
}
