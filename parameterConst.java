class Parent {
    Parent() {
        System.out.println("Non-Param of Parent");
    }
    Parent(int x) {
        System.out.println("Param of Parent");
    }
}

class child extends Parent {
    child() {
        System.out.println("Non-Param of child");
    }
    child(int x,int y) {
        super(x);
        System.out.println("Param of child");
    }
}

public class parameterConst {
    public static void main(String args[]) {
        child c1=new child();
        child c2=new child(5,10);
    }
}
