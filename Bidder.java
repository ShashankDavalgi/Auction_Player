public class Bidder extends Observer{

	protected Player player;
	public int bidderId;
	public int Budget;
	public Player p;
	int[] array =new int[2];
public Bidder(int id,int budget,Player p)
{
	bidderId=id;
	Budget=budget;
	this.p=p;
	
//System.out.println(bidderId+" 	"+Budget+p);
	}

@Override
public void updateBidding() 
{//System.out.println("d");
	array=p.getBidderAndPrice();
	System.out.println( bidderId+" : " +"["+array[0]+", "+array[1]+"]");
}
@Override
public void updateFinalDeal() 
{	array=p.getBidderAndPrice();

	System.out.println( bidderId+" : " +"["+ Budget+", "+array[0]+"]");
	// TODO Auto-generated method stub
	
}
public int getBudget()
{
	return Budget;
}

public int getID()
{
	return bidderId;
}

}
