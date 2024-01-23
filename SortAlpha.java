
import java.util.*;


public class SortAlpha{
    public static void main(String [] args){
         List<String> sList = new ArrayList<>();
         sList.add("Bagio");
         sList.add("Tasio");
         sList.add("Anuf");
         sList.add("Ajesh");
         sList.add("Murthi");

         sort(sList);
         System.out.println(sList);
         
    }

    public static void sort(List<String> list){
        int n = list.size();
        boolean swapped;

         do{
            swapped = false;
            for(int i = 1;i<n;i++){
                if (list.get(i-1).compareTo(list.get(i))>0){
                     
                    String temp = list.get(i-1);
                    list.set(i-1,list.get(i));
                    list.set(i,temp);
                    swapped = true;
                }
            }
        }while(swapped);
    }
}