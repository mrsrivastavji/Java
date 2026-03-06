class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
}

class child extends Parent {
    public child() {
        System.out.println("Child Constructor");
    }
}

public class first {
    public static void main(String args[]) {
        @SuppressWarnings("unused")
        child c=new child();
    }
}



