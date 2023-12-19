package LinkedList.OneWayLinked;
import java.util.Scanner;

public class Tester {

    public enum Mode {
        def(""),
        begin("b"),
        exit("e"),
        help("h"),
        addTail("at"),
        addHead("ah"),
        search("s"),
        remove("r"),
        display("d"),
        clear("c");
        private final String mode_s;

        Mode(String mode_s) {
            this.mode_s = mode_s;
        }

        public String getMode_s() {
            return mode_s;
        }

        public static Mode refer(String name) {
            for (Mode s : Mode.values()) {
                if (name.equals(s.getMode_s())) {
                    return s;
                }
            }
            return def;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Initializing an empty one way linked list.\n");

        var List = new LinkedList<Student>();
        System.out.print("List successfully initialized.\n To get information about actions type \"h\"\n");

        //Out of scope temporary variables declaration
        int age;
        String name;
        //Garbage is used to collect \n symbol that is left in an input stream
        LinkedList.Node<Student> found = null;

        Mode m = Mode.begin;
        while (!(m.getMode_s().equals("e"))) {

            System.out.print("Select next operation: \n");
            m = Mode.refer(in.nextLine());
            switch (m) {
                case help:
                    System.out.print("There are several operations u can perform on a singly-linked list.\n");
                    System.out.print("Firstly, you can add nodes to tail and head of the list by typing \"at\" and \"ah\" respectively.\n");
                    System.out.print("Secondly, you can find a certain element in list using \"s\". Element found will be stored until next usage of search function.\n");
                    System.out.print("Thirdly, you can display found Node or remove it from list using \"d\" and \"r\".\n");
                    System.out.print("At the end, you can clear the entire list using \"c\".\n");
                    System.out.print("To exit the program type \"e\".\n");
                    break;
                case addHead:
                    System.out.print("Enter name:\n");
                    name = in.nextLine();
                    System.out.print("Enter age:\n");
                    age = in.nextInt();

                    in.nextLine(); // consumes \n left in buffer

                    List.addToHead(new LinkedList.Node<>(new Student(name, age)));
                    System.out.print("Node successfully added.\n");
                    break;
                case addTail:
                    System.out.print("Enter name:\n");
                    name = in.nextLine();
                    System.out.print("Enter age:\n");
                    age = in.nextInt();

                    in.nextLine(); //consumes \n left in buffer

                    List.addToTail(new LinkedList.Node<>(new Student(name, age)));
                    System.out.print("Node successfully added.\n");
                    break;
                case clear:
                    System.out.print("List cleared.\n");
                    List.setBlank();
                    break;
                case search:
                    System.out.print("Enter name:\n");
                    name = in.nextLine();
                    System.out.print("Enter age:\n");
                    age = in.nextInt();

                    in.nextLine(); // consumes \n left in buffer

                    try {
                        found = List.search(new Student(name, age));
                    } catch (LinkedList.EmptyListException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case display:
                    if (found != null) {
                        System.out.print("The found is:\n");
                        System.out.print(found.getData().toString() + "\n");
                    } else {
                        throw new RuntimeException("HUI");
                    }
                    break;
                case remove:
                    System.out.print("Enter name:\n");
                    name = in.nextLine();
                    System.out.print("Enter age:\n");
                    age = in.nextInt();

                    in.nextLine(); // consumes \n left in buffer

                    try {
                        List.remove(new Student(name, age));
                    } catch (LinkedList.EmptyListException e) {
                        throw new RuntimeException(e);
                    }
            }

        }
    }
}
