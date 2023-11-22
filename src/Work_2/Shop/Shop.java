package Work_2.Shop;


/* I used binary search tree just to make things a little bit more difficult for myself
   In this case its more reasonable to use simple database, not tree.
 */

/* We will be using price as key there, that means, that search operation with key "Price"
   Will need O(log(n)) operations. However, search by model will require O(n) operations
 */
public class Shop {

    private static class Node{
        private Computer computer;
        private Node left;
        private Node right;

        public Node(Computer computer, Node left, Node right) {
            this.computer = computer;
            this.left = left;
            this.right = right;
        }

        public Computer getComputer() {
            return computer;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "computer=" + computer +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }

        public void insert(double price, String model) {

            if (this.computer == null) {
                this.computer = new Computer(price, model);
                this.left = new Node(null, null, null);
                this.right = new Node(null, null, null);
            }
            else {
                if (price > this.computer.getPrice()) {
                    this.right.insert(price, model);
                }
                else {
                    this.left.insert(price, model);
                }
            }
        }

        public Computer searchByPrice(double price) {
            if (this.computer == null) {
                System.out.print("Node not found\n");
                return null;
            }

            if (this.computer.getPrice() == price) {
                return this.computer;
            }
            else {
                if (price > this.computer.getPrice()) {
                    return this.right.searchByPrice(price);
                }
                else {
                    return this.left.searchByPrice(price);
                }
            }
        }

        /*public void removeByPrice(double price) {
            if (this.computer == null) {
                System.out.print("Node not found\n");
            }
            else {
                if (this.computer.getPrice() == price) {

                }
            }
        }*/
    }

    private final Node root;

    public Shop() {
        this.root = new Node(null, null, null);
    }

    public void add(double price, String model) {
        this.root.insert(price, model);
    }

    public Computer searchByPrice(double price) {
        return this.root.searchByPrice(price);
    }
}
