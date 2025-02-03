
/**
 *
 * @Valentin582971
 * @3/2/25
 * 
 * Using BlueJ, with Java 1.4
 */

public class Tree
{
    private int size;
    public Tree(int n)
    {
        size = n;
    }

    public int getSize(){
        return size;
    }
    
    public void printTree(int n)
    {
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= n-i; ++j) {
                // Here, we print the spaces befores the '*'
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i - 1; ++k) {
                //Here, we print the "*"(s) (then, we jump a line)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
