class product{
	int data;
	boolean status = false;
	product(int data){
		data = data;
	}
	
	synchronized void produce(int value){
		if(status == true){
			try{
				wait();
			}catch(Exception e){
			}
		}
			data = value;
			status = true;
			notify();
	}
	
	synchronized int consume(){
		if(status == false){
			try{
				wait();
			}catch(Exception e){
			}
		}
			status = false;
			notify();
			return data;
	}
}

class ProducerThread extends Thread{
	product p;
	ProducerThread(product p1){
		p = p1;
	}
	public void run(){
		int i = 0;
		while(i <= 10){
			p.produce(i++);
			System.out.println("Produced = "+i);
			try{
				sleep(500);
				}catch(Exception e){
				}
			}
		}
}

class ConsumerThread extends Thread{
	product p;
	ConsumerThread(product p1){
		p = p1;
	}
	public void run(){
		int i = 0;
		while(i <= 10){
			System.out.println("Consumed = "+p.consume());
			try{
				sleep(500);
				}catch(Exception e){
				}
				i++;
			}
		}
}

public class SyncEx{
	public static void main(String s[]){
		product p = new product(10);
		ProducerThread pr = new ProducerThread(p);
		ConsumerThread cr = new ConsumerThread(p);
		pr.start(); 
		cr.start();
	}
}



