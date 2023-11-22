package Work_2.Dog;
import java.util.Scanner;

public class DogShelter {
    Dog[] list;
    int size;
    int current;

    public DogShelter(int size) {
        this.list = new Dog[size];
        this.size = size;
        this.current = 0;
    }

    public void push(Dog new_obj) {
        this.list[this.current++] = new_obj;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many dogs do you want to place in the shelter?\n");
        int size = sc.nextInt();
        DogShelter object = new DogShelter(0);


        for (int i = 0; i < size; i++) {
            System.out.print("Enter the information about the dog: age then name, separating them with an Enter.");
            Dog temp = new Dog(sc.nextInt(), sc.nextLine());

        }
    }
}
