/**
 * proof
 */
import java.util.Scanner;
public class proof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree aleja = new BinaryTree();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            aleja.insert(sc.nextInt());
        }
        System.out.println("PostOrder");
        aleja.printPostOrder(aleja.root);
        System.out.println();
        System.out.println("PreOrder");
        aleja.printPreOrder(aleja.root);
        System.out.println();
        System.out.println("InOrder");
        aleja.printInOrder(aleja.root);
    }
    
}