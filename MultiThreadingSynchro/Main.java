class Main
{
	public static void main(String[] args) throws Exception {		
		Company comp=new Company();
		Producer p=new Producer(comp);
		Consumer c=new Consumer(comp);
		p.start();
		c.start();

	}
}