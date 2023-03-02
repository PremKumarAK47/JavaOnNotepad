class MyThread implements Runnable
{
//@override
public void run()
{
 for(int i=0;i<5;i++)
{
System.out.println(i);
//we can use here sleep Method
try{Thread.sleep(1000);}catch(Exception e){}
}

}

public static void main(String[] args)
{
MyThread t= new MyThread();
Thread t1= new Thread(t);
AnotherThread t2= new AnotherThread();
t1.start();
 //t.run();
t2.start();
}
}
