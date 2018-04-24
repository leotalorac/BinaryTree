/**
 * proof
 * by lotaorafox
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class proof {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.print("Generating a random tree .........");
        Scanner sc = new Scanner(System.in);
        BinaryTree aleja = new BinaryTree();
        int n = rand.nextInt(20) + 10;
        System.out.print("size: " + n );
        System.out.println();
        System.out.println("Tree: ");
        for(int i=0;i<n;i++){
            int num = rand.nextInt(150) + 1;
            if(nums.contains(num)){
                i--;
            }else{
                nums.add(num);
                System.out.print(num + " ");
                aleja.insert(num);
            }
            
        }
        System.out.println();
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