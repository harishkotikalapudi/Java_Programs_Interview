
public class TwoThreads {
	
	int counter = 1;
	static int N;
	
	public static void main(String[] args) {
		N=10;
		
		TwoThreads tt = new TwoThreads();
	
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				tt.printEven();
			}
			
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			tt.printOdd();
				
			}
		});
		t2.start();
		
	}
	
	public void printOdd() {
		
		synchronized(this) {
			
			while(counter<N) {
				
				while(counter%2==0) {
					
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(counter+" Odd");
				counter++;
				notify();
			}
			
		}
		
	}
	
	public void printEven() {
		
		synchronized(this) {
			
			while(counter<N) {
				
				while(counter%2==1) {
					
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(counter+"Even ");
				counter++;
				notify();
			}
			
		}
		
		
	}

}

