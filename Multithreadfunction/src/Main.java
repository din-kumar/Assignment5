public class Main {

	public static void main(String[] args) {
        Thread object = new Thread(new Thread1());
        object.start();
        Thread object2 = new Thread(new Thread2());
        object2.start();

	}

}
