import java.util.*;
class palindrome
{
    public static void main()
    {
        Scanner Sc=new Scanner(System.in);
        int n= Sc.nextInt();
        int r,sum=0,temp;    
        temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
    
