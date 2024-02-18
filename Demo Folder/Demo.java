
class Count {
	int counter;
	public synchronized void increment() {
		counter++;
	}
}

class Demo {
	public static void main(String[] args) throws InterruptedException {
		Count c = new Count();
		Runnable obj1 = () -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}

		};

		Runnable obj2 = () -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();

		/*If we don't mention this, the main thread will execute the println statement first
		as it is free, we are asking main thread to wait while t1,t2 finish*/
		t1.join();
		t2.join();

		System.out.println(c.counter);

	}
}