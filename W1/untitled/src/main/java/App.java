public class App
{
    public static void main(String[] args)
    {
        Birds mySparrow = new Sparrow();
        mySparrow.setInfo();
        mySparrow.getInfo();

        Birds myEagle = new Eagle();
        myEagle.setInfo();
        myEagle.setHeight(500, 100);
        myEagle.getHeight();


        Birds myPidgeon = new Pidgeon();
        myPidgeon.setInfo();
        myPidgeon.setHeight(100);
        myPidgeon.getHeight();
        

    }
}
