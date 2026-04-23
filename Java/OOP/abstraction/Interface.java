interface A{
    String S="Hello";          //by default it is public static final
    void show();                //by default it is public abstract
    void display();                //by default it is public abstract
}
interface X{
    void run();
}
interface Y extends X{                       //interface can inherit another interface by using extends keyword and this is called multiple inheritance in interface
                               

}
class B implements A,Y{         
    public void show(){
        System.out.println("In show method of class B");
    }
    public void display(){
        System.out.println("In display method of class B");
    }
    public void run(){
        System.out.println("In run method of class B");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj=new B();              //we can not create object of interface A, but can create object of concrete class
        obj.show();
        obj.display();
        Y obj1=new B();             //for inherited interface we can create object of concrete class and call the method of inherited interface
        obj1.run();
        System.out.println(A.S);   //by this we can access the variable of interface because
    }
}
