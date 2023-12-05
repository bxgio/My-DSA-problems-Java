
abstract class InnerAbstract {
      void pri(){        
      }
    
}

class simple extends InnerAbstract{
     public void pri(){
        System.out.println("from abstract class");
     }
    
}





public class Abstract {
    public static void main(String[] args) {
        simple sim = new simple();
        sim.pri();
    }
}
