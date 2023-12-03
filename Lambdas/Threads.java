package Lambdas;

public class Threads {
  public static void main(String[] args) {
	  Runnable Trabalho01 = new Trabalho01();
	  Runnable Trabalho02 = new Runnable() {
		public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println("Tarefa #02 ...");
					try {
						Thread.sleep(100) ;
					}	catch(Exception e) {
						
					}
		
			}
	  }
	};
	 Runnable trabalho03 = ()->{
		 for(int i = 0; i < 100; i++) {
				System.out.println("Tarefa #03 ..");
				try {
					Thread.sleep(100) ;
				}	catch(Exception e) {
						}
		 }
	 };
	//  Runnable  trabalho03 = Threads:: trabalho03;
	  
	Thread t1 = new Thread(Trabalho01);
	Thread t2 = new Thread(Trabalho02);
	Thread t3 = new Thread(trabalho03 );
	t1.start();
	t2.start();
	t3.start();

}
  static void trabalho03() {
		for(int i = 0; i < 100; i++) {
			System.out.println("Tarefa #02 ...");
			try {
				Thread.sleep(100) ;
			}	catch(Exception e) {
				
			}

	}
}
}
