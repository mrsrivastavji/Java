class Rectrangle {
    int length;
    int breadth;

    Rectrangle(int length,int breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    void display() {
        System.out.println("Length: "+this.length);
        System.out.println("Breadth: "+this.breadth);
    }
    
}

public class Rect {
    public static void main(String[] args) {
        Rectrangle r=new Rectrangle(3,4);
        r.display();
    }
    
}
