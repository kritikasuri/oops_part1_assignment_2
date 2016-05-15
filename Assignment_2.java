import java.util.Scanner;

public class prime {
		
	public void prime(int nbr){
		
		int flag=0;
		
		for(int i=2;i<=nbr/2;i++)
		  {
		      if(nbr%i == 0)
		      {
		          flag=1;
		          break;
		      }
		  }
		
		  if (flag == 0)
		     System.out.println("The number "+nbr+" is a prime number."); 
		  else
			  System.out.println("The number "+nbr+" is not a prime number.");   
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner scan = new Scanner (System.in);
		int nbr = scan.nextInt();
		
		prime obj = new prime();
		obj.prime(nbr);
	}
}
