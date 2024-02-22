 public class DimondPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                System.out.print("* ");
            }
             for (int j = 0;j<i;j++){
                System.out.print(". ");
            }
             for(int k = 0;k<i+1;k++){
                 System.out.print(". ");
             }
              for (int j = i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        
        }
        for (int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
             for (int j = i;j<n;j++){
                System.out.print(". ");
            }
            for(int j = i;j<n-1;j++){
                System.out.print(". ");
            }
             for (int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        
        }
        
    }
}
