class AnotherThread extends Thread
{
 public void run()
{
for(int i=5;i>=0;i--)
{
System.out.println("From another Thread "+i);
try {Thread.sleep(1000);} catch(Exception e) {}
}

}
}
