import java.util.*;

public class ExOh{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(find(str));
    }
    public static boolean find(String str){//int i =0;i<ch.length;i++
        boolean con =false;
        boolean out =false;
        int count =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch =='x'||ch=='o'){
                con =true;
                count ++;
            }
        }if((con==true)&(count%2 ==0)){
            out =true;
        }return out;
    }
}