import java.util.*;
class factorial
{
    public static void main()
    {
        Scanner Sc= new Scanner(System.in);
        int n= Sc.nextInt();
        int i,fact=1; 
        for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
 }  
}  
