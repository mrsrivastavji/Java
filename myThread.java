class myThrea extends Thread {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i+" Hello ");
            i++;

        }
    }
}

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