package search;

public class BinaryTreeSearch <T extends Comparable<T>> {
    private Node<T> root;

    static class Node<T> {
        private T data;
        private Node<T> leftNode;
        private Node<T> rightNode;

        public Node(T data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    private void add(T data) {
        root = add(root, data);
    }

    public Node<T> add(Node<T> r, T data) {
        if (r == null) {
            return new Node<T>(data);
        }
        if (r.data.compareTo(data) > 0) {
            r.leftNode = add(r.leftNode, data);
        } else {
            r.rightNode = add(r.rightNode, data);
        }
        return r;
    }

    private boolean search(T x) {
        return search(root, x);
    }

    private boolean search(Node<T> r, T x) {
        if (r == null) return false;

        if (r.data.compareTo(x) == 0) {
            return true;
        }
        else if (r.data.compareTo(x) > 0) {
            return search(r.leftNode, x);
        } else {
            return search(r.rightNode, x);
        }
    }

    public static void main(String[] args) {
        BinaryTreeSearch<Integer> bts = new BinaryTreeSearch<Integer>();
        bts.add(120);
        bts.add(100);
        bts.add(80);
        bts.add(70);
        bts.add(180);
        bts.add(200);

        boolean check = bts.search(70);
        System.out.println(check);
    }
}
