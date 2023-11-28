package cz.educanet;

public class Main {
    private static final int root = 7;
    public static void main(String[] args) {

        Bst<Integer> bst = new Bst<>(root);

        for (int i = 0; i < root; i++)
            bst.insert(i);

        System.out.println(bst.contains(2));
        System.out.println(bst.contains(3));
        System.out.println(bst.contains(69));
        System.out.println(bst.contains(420));
    }
}