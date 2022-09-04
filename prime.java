import java. util.*;
class prime_number
{
    public static void main()
    {
        Scanner Sc= new Scanner(System.in);
        int n= Sc.nextInt();
        int i,flag=0;
         if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=n/2;i++){      
    if(n%i==0){      
     System.out.println(n+" is not a prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is a prime number"); }  
  }//end of else  
}    
}   
       
