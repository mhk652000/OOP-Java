class hi
{   
    

    public void xd()
    {
        System.out.println("Helloooooooo\n");
    }

}

class babyhi extends hi
{

    public void xd()
    {
        super.xd();
        System.out.println("What the fuckkkk\n");
        

    }
}




public class tester {
    public static void main(String[] args) {

        hi testerr = new hi();

        babyhi test = new babyhi();

        test.xd();
        testerr.xd();
        
        
    }
    
}
