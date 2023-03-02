class Producer extends Thread
{

	Company c;
	Producer(Company c)
	{
		this.c=c;
	}
	public void run()
	{ 
		int i=1;
		while(i<5)
		{     
                                                      try{
			this.c.produce_item(i);
			Thread.sleep(1000); } catch(Exception e){
                                                            e.printStackTrace();}
			i++;
		}
	}
}