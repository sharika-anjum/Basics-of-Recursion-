import myPackage.*;

public class odd_even {
    public static void main(String args[]) {
        Check ob = new Check(8);
        int n = ob.show(); // you may also call show()
        if(n%2==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}


