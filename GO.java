interface Member {
    public void callback();
}

class Store {
    Member members[]=new Member[10];
    int count=0;

    // Store() {
        
    // }

    void resister(Member m) {
        members[count++]=m;
    }

    void inviteSale() {
        for(int i=0; i<count; i++)
            members[i].callback();
    }
}

class Customer implements Member {
    String name;

    Customer(String name) {
            this.name=name;
    }

    @Override
    public void callback() {
        System.out.println("OK I will visit "+ this.name);
    }
}

public class GO {
    public static void main(String args[]) {
        Store s=new Store();
        Customer c1=new Customer("Ram");
        Customer c2=new Customer("Sham");
        s.resister(c1);
        s.resister(c2);
        s.inviteSale();
    }
}