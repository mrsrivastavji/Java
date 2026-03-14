class myThrea extends Thread {
    @Override
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i+" Hello ");
            i++;

        }
    }
}

@SuppressWarnings("unused")
class myThread {
    public static void main() {
        myThrea t=new myThrea();
        t.start();

        int i=1;
        while (true) { 
            System.out.println(i+" World ");
            i++;
        }
    }
}