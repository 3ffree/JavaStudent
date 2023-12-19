package Tree.Binary;

public class Tree<T> {

    public static class Node<T> {
        private T data;
        private int key;
        private Node<T> left;
        private Node <T> right;

        public Node(T data, int key) {
            this.data = data;
            this.key = key;
            this.left = null;
            this.right = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public T search(int key) {
            if (this.key == key) {
                return this.data;
            }
            else {
                if (key > this.key) {
                    return this.right.search(key);
                }
                else {
                    return this.left.search(key);
                }
            }
        }

        public void add(Node<T> new_node) {
            //Adds new node to tree in O(n*log(n)) operations

            if (new_node.key > this.key) {
                if (this.right == null) {
                    this.right = new_node;
                }
                else {
                    this.right.add(new_node);
                }
            }

            else {
                if (this.left == null) {
                    this.left = new_node;
                }
                else {
                    this.left.add(new_node);
                }
            }
        }
    }

    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public Tree() {
        this.head = null;
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public void add(Node<T> new_node) {
        if (this.isEmpty()) {
            head = new_node;
        }
        else {
            head.add(new_node);
        }
    }

    public T search(int key) throws EmptyListException {
        if (this.isEmpty()) {
            throw new EmptyListException();
        }
        else {
            return this.head.search(key);
        }
    }
}
