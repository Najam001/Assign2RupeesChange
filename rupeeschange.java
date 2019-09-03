import java.util.*;



public class rupeeschange
{
public static void main(String[] args){




    int rs, a, b, c, d, e, f, g, h, i ;
 
    System.out.print("Enter the amount in Rupees : ") ;
    
	
	
	Scanner sc=new Scanner(System.in);
         System.out.println("Enter Your Value in rupees");
             rs=sc.nextInt();

   
while(rs >= 1000)
    {
        i = rs / 1000;
        System.out.println("\nThe no. of five hundreds are :  "+i) ;
        break ;

	}

   while(rs >= 500)
    {
        a = rs / 500 ;
        System.out.println("\nThe no. of five hundreds are :  "+a) ;
        break ;
    }
	
	 while(rs >= 100)
    {
        b = rs / 100 ;
        System.out.println("\n\nThe no. of hundreds are : "+b) ;
        break ;
    }
    while(rs >= 50)
    {
        c = rs / 50 ;
        System.out.println("\n\nThe no. of fifties are : "+c) ;
        break ;
    }
    while(rs >= 20)
    {
        d = rs / 20 ;
        System.out.println("\n\nThe no. of twenties are : "+d) ;
        break ;
    }
    while(rs >= 10)
    {
        e = rs / 10 ;
        System.out.println("\n\nThe no. of tens are : "+e) ;
        break ;
    }
    while(rs >= 5)
    {
        f = rs / 5 ;
        System.out.println("\n\nThe no. of fives are : "+f) ;
        break ;
    }
    while(rs >= 2)
    {
        g = rs / 2 ;
        System.out.println("\n\nThe no. of Twos are : "+g) ;
        break ;
    }
    while(rs >= 1)
    {
        h = rs / 1 ;
        System.out.println("\n\nThe no. of ones are : "+h) ;
        break ;
    }
	
	
       		
}	
		}