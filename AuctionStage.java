import java.io.*;
import java.util.*;
	
public class AuctionStage 
{
	 public static void main(String[] args) throws IOException 
	 {
		 
		 ArrayList<Integer> tempsArray;	
		 ArrayList<Integer> biddArray=new ArrayList<Integer>();
		 Scanner sn =new Scanner(System.in);	
		   tempsArray=new ArrayList<Integer>();
	
		String s=sn.next();
		//System.out.println(s);
		Player p = new Player(s);
		s=sn.next();
		//System.out.println(s);
		int N=Integer.parseInt(s);
		
		int j=0;
		//int arr[]=new int[N];
		for(j=0;j<N;j++)
		{  
			s=sn.next();
			int ar[] = new int[2];
		   String[]z=s.split(",");
		   int len=z.length;
		   
		   for(int i=0;i<len;i++)
			{ 
			   ar[i]=Integer.parseInt(z[i]);
			 
				}
		   Bidder bidd = new Bidder(ar[0],ar[1],p);
			
			p.attach(bidd);
		   
		}
		
		  
	
		
		s=sn.next();
		int num_bidders=Integer.parseInt(s);	
		//System.out.println(num_bidders);
		
		
		for(j=0;j<num_bidders-1;j++)
		{ 
			s=sn.next();
			int ar[] = new int[2];
		   String[]z=s.split(",");
		   int len=z.length;
		   
		   for(int i=0;i<len;i++)
			{ ar[i]=Integer.parseInt(z[i]);
			 			
				}
		   p.setBidderAndPrice(ar[0],ar[1]);
		}
		
		 int ar[] = new int[2];
		s=sn.next();
		 String[]z=s.split(",");
		 for(int i=0;i<2;i++)
			{ ar[i]=Integer.parseInt(z[i]);
			}
		        p.completeDeal(ar[0],ar[1]);
		
		
		
		
		
	
	 }
}
