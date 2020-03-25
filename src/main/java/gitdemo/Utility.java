package gitdemo;

public class Utility
{
    public static void printMessage(String messageToPrint)
    {
        System.out.println(messageToPrint);
    }

    public static void multiplePrintMessage(String messageToPrint)
    {
        for(int i=0; i < 10; ++i)
        {
            System.out.println(messageToPrint);
        }
    }
}
