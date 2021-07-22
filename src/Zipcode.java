import com.company.ServiceCommunicator;

public class Zipcode extends ServiceCommunicator {
   // Create a constructor that accepts only the target zipcode
    public Zipcode(int zip){
        super("http://api.zippopotam.us/us/" + zip);            // super keyword calls the superclass' methods and constructor
    }
    // Create a main() in your Zipcode class that tests your constructor similar to the main() in ServiceCommunicator.
    public static void main(String[] argv) {
        System.out.println(new Zipcode(11223).get());
        System.out.println(new Zipcode(10452).get());
        System.out.println(new Zipcode(28223).get());


    }
}

