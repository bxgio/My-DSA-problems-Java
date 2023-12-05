
class Oa{
    public void pri(){
        System.out.println("from Oa");
    }
    public void pro(){
        System.out.println("other");
    }
}
class Ob extends Oa{
    public void pri(){
        System.out.println("from Ob");
    }
}



public class overriding {
    public static void main(String[] args) {
        Ob ob = new Ob();
        ob.pri();
        ob.pro();
    }
}
