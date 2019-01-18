public class Tijdbom
{

    public static void main(String[] args)  throws InterruptedException {

        {
            int counter = 15;
            do
            {
                System.out.println( "De bom ontploft in " + counter + " seconden.");
                counter--;
                Thread.sleep(1000);
            } while (counter !=0);
            System.out.println("ONTPLOFING!!!!!!!!!");
        }
    }
}