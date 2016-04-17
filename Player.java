import java.util.*;

class Player
{
	
	ArrayList<Bidder> obs = new ArrayList<Bidder>();
	
	
	String player_name;
	int BiddingPrice;
	int bidderID;
	int bidder_count = 0;
	
	public Player(String player_name)
	{
		this.player_name=player_name;
	System.out.println("Bidding starts for player "+player_name);
	}
	public void attach( Bidder o )
	{
	
	obs.add(o);

	}
	public int [] getBidderAndPrice()
	{
		int b[]= new int[2];
		b[0]=this.bidderID;
		b[1]=this.BiddingPrice;
		return b;
		
		
	}
	public void setBidderAndPrice(int bidderID,int BiddingPrice)
	{
		Bidder b;
		
		for(int i=0;i<obs.size();i++)
		{
			if(obs.get(i).bidderId==this.bidderID)
			{b=obs.get(i);
			b.Budget=b.Budget-10;}
			
		}
		this.bidderID=bidderID;
		this.BiddingPrice=BiddingPrice;
		
		
		notifyBidding();
		
		
		//System.out.println(bidderID+" : "+BiddingPrice);
	}
	public void completeDeal(int bidderID,int BiddingPrice)
	{
      Bidder b;
		
		for(int i=0;i<obs.size();i++)
		{
			if(obs.get(i).bidderId==this.bidderID)
			{b=obs.get(i);
			b.Budget=b.Budget-10;}
			
			if(obs.get(i).bidderId==bidderID)
			{b=obs.get(i);
			b.Budget=b.Budget-BiddingPrice;}
			
		}
		this.bidderID=bidderID;
		this.BiddingPrice=BiddingPrice;
		notifyDeal();
	}
	public void notifyBidding()
	{
		
		for(int i=0;i<obs.size();i++)
		{ //System.out.println(obs.size());
		obs.get(i).updateBidding();
		}
		System.out.println("");	
	}
   public void notifyDeal()
	{
	System.out.println("Bid Winner");
	   for(int i=0;i<obs.size();i++)
		{ //System.out.println(obs.size());
		obs.get(i).updateFinalDeal();}
		
	
	   
	
	   
	}
	
}