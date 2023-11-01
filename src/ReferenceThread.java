package src;

public class ReferenceThread extends Thread {

    public int id;

    public ReferenceThread(int id) {
        super();
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + this.id);
    }
}
