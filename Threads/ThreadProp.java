class ThreadEx extends Thread{
  public void run()
  {
    System.out.println("Welcome ");
    try{
      sleep(500);
    }
    catch(Exception e)
      {
        System.out.println("To my Thread"+this.getName());
      }
  }
}
class ThreadProp{
public static void main(String []args)
  {
   ThreadEX  t1=new ThreadEX();
    ThreadEX  t2=new ThreadEX();
    System.out.println("T1 name: "+t1.getName());
     System.out.println("T2 name: "+t2.getName());
    t1.setPriority(10);  t2.setPriority(1);
    t1.start(); t2.start();
    
  }
  }
