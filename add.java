import java.util.Scanner;


public class add {

    public static void main(final String[] args) {
        
        int num1, num2, sum;
        try{
        final Scanner in1 = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = in1.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = in1.nextInt();
        
        in1.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
catch(final Exception e){
    System.out.println("Error is:"+e);
}
    }    
}