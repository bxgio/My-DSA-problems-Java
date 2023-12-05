


class A{
    
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class B extends A{
    public void add(int a , int b, int c){
        System.out.println(a+b+c);
    }
}





public class overloading {
    public static void main(String[] args) {
        B b = new B();
        b.add(2,2,2);
        b.add(2,2);
    }
}
