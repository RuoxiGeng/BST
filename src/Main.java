import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static double testSet(Set<String> set, String filename){
        long startTime = System.nanoTime();

        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile(filename, words)){
            System.out.println("Total words " + words.size());

            for(String word: words)
                set.add(word);
            System.out.println("Total different words: " + set.getSize());
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

//        BST<Integer> bst = new BST<>();
//        int[] nums = {5, 3, 6, 8, 4, 2};
//        for(int num: nums)
//            bst.add(num);
//        bst.levelOrder();

//        bst.preOrder();
//        System.out.println();

//        bst.preOrderNR();

//        bst.inOrder();
//        System.out.println();
//
//        bst.postOrder();
//        System.out.println();
        //System.out.println(bst);
//        Random random = new Random();
//
//        int n = 1000;
//
//        for(int i = 0; i < n; i++)
//            bst.add(random.nextInt(10000));
//
//        ArrayList<Integer> nums = new ArrayList<>();
//        while(!bst.isEmpty())
//            nums.add(bst.removeMin());
//
//        System.out.println(nums);
//        for(int i = 1; i < nums.size(); i++)
//            if(nums.get(i-1) > nums.get(i))
//                throw new IllegalArgumentException("Error");
//        System.out.println("removeMin completed");
        String filename = "pride-and-prejudice.txt";

        BSTSet<String> bstSet = new BSTSet<>();
        double time1 = testSet(bstSet, filename);
        System.out.println("BST Set: " + time1 + " s");

        System.out.println();

        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        double time2 = testSet(linkedListSet, filename);
        System.out.println("Linked List Set: " + time2 + " s");
    }
}
