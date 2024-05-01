import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        
        int numRows = 8;
        List<List<Integer>> result = generate(numRows);
        System.out.println("Pascal's Triangle for numRows = " + numRows + ":");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }

  public static List<List<Integer>> generate(int numRows) {
    List <List<Integer>> arr = new ArrayList<>();
    arr.add(List.of(1));
    for (int i = 1;i<numRows;i++){
        List <Integer> li = new ArrayList<>();
        int prev = 1;
        for(int j = 0;j<=i;j++){
            li.add(prev);
            prev = prev*(i-j)/(j+1);
        }arr.add(li);
    }return arr;
  }
}
