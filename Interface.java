
interface example{
      void pri();
}

class soln implements example {
        public void pri(){
            System.out.println("from interface");
        }

    
}




public class Interface {
    public static void main(String[] args) {
        soln sn = new soln();
        sn.pri();
    }
}
