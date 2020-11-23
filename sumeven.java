public class sumeven { 
    public static void main(String args[]) { 
        int total = 0, sum = 0, a = 2, n = 10; 
  
        while(total != n){ 
            total++; 
            sum += a; 
            a += 2; 
        } 
        System.out.println("Sum Of First 10 Even Number : " + sum); 
    } 
} 