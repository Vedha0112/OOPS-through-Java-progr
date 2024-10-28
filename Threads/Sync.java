Class Bank
{
int balance;
boolean status=false;
Bank (int bal){ 
  balancec=bal; }
  Synchronized void deposit (int amt){
if (status==true)
{
  try { wait ();
}
catch (Exception e){}
}
balance= balance+amt;
status= true;
 notify();
  }
Synchronized void withdraw (int amt)
{
  if(status == false)
try {
 wait();
}
catch (Exception e){}
}
balance =balance-amt;
status == false;
notify();
} 

void display(){
   System.out.println("Balance: " + balance);
}

Class Deposit Thread extends thread {
  Bank b;
public Depositthread (Bank b1)
{ b=b1;
}
public void run(){
   int i=0;
while (<10)
{  b.deposit (500);
   b.display();
try {
   sleep(500);
}
Catch (Exception e)
{ System.out.println("Error");
}
i++;
}
}
}

Class WithdrawThread extends Thread
{
Bank b;
  public withdrawthread (Bank bl)
  {b=b1;}

public void run()
{ int i=0;
while (i<10)
{
b. withdraw (300);
  b.display();
try {
sleep(500);
}
catch (Exception e) 
{
  System.out.println ("Error");
}i++;
  }
}
}
class Sync {

public static void main(String args[])
{ Bank b = new Bank (2000);
DepositThread d1= new DepositThread ();
 WithdrawThread w1=new WithdrawThread ();
d1.start();
 w1.start();
}
}
