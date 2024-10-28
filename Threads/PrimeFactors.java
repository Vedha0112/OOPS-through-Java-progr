class Prime extends Thread
  {
    public void run(){
    int num;
      for(num=1;num<=10;num++)
        {  boolean isPrime=true;
          if(num<2){
         isPrime=false;
        }
         else{
           for(int i=2;i<=Math.sqrt(num);i++){
             if(num%2==0){
               isPrime=false;
               break;
              }
        }
         }
         if(isPrime)
         {
           System.out.println("Prime: "+num);
           try{
              Thread.sleep(100);
               }
           catch(InterruptException e)
             {
               System.out.println("Error");
              }
        }
        }
    }

class Factor extends Thread{
  public void run()
  {
    for(int num=1;num<=20;num++)
      {
        System.out.println("Factors of "+num+":");
        for(int i=0;i<=num;i++)
          {
            if(num%i==0)
            {
              System.out.println(i+" ");
            }
      }

        try{
          Thread.sleep(100);}
        catch(InterruptException e)
          { System.out.println("Error");}
      }
  }
}
  }

class PrimeFactor{
  public static void main(String []args)
  {
    Prime p=new Prime();
    Factor f=new Factor();
    p.start();f.start();
  }
}
