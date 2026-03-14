class TV {
    public void switchOn() {
        System.out.println("TV is switched ON");
    }

    public void changeChannel() {
        System.out.println("TV channel is changeed ");
    }
}

class smartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("Smart TV is switched ON");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV channel is changeed ");
    }

    public void browser() {
        System.out.println("Smart TV is browsing ");
    }
}

@SuppressWarnings("unused")
class over {
    public static void main(String[] args) {
        TV t1=new TV();
        t1.switchOn();
        t1.changeChannel(); 

        TV t=new smartTV();
        t.switchOn();
        t.changeChannel();   

        smartTV t2=new smartTV();
        t2.switchOn();
        t2.changeChannel();      
        t2.browser();  

    }
}