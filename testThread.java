class testThread extends Thread {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i+" Hello ");
            i++;

        }
    }
 
    public static void main() {
        testThread t=new testThread();
        t.start();

        int i=1;
        while (true) { 
            System.out.println(i+" World ");
            i++;
        }
    }
}

