package java_regex_Pe2;




class Outer_class {
    
    private class inner_class {
        public void print() {
            System.out.println("You are in inner class!!");
        }
    }
    void display() {
        inner_class obj = new inner_class();
        obj.print();
    }
    
    
}

public class Pe2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
            Outer_class obj1 = new Outer_class();
            obj1.display();
        }
        
    }
