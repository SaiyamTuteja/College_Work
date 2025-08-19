import java.util.Scanner;

class ArrayInsertion {

    public void traversal(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int insertAtPos(int pos, int size, int[] arr, int ele) {
        if (pos <= 0 || pos > size + 1) {
            System.out.println("Invalid position");
            return size;
        }
        for (int i = size - 1; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = ele;
        System.out.println("Array after insertion: ");
        traversal(arr, size + 1);
        return size + 1;
    }

    public int insertAtEnd(int ele, int[] arr, int size) {
        arr[size] = ele;
        System.out.println("Array after insertion: ");
        traversal(arr, size + 1);
        return size + 1;
    }

    public int insertAtStart(int ele, int size, int[] arr) {
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = ele;
        System.out.println("Array after insertion: ");
        traversal(arr, size + 1);
        return size + 1;
    }

    public void arrayInsertion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Choose an operation: 1. Insert at Position 2. Insert at End 3. Insert at Start");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the position: ");
                int pos = sc.nextInt();
                System.out.println("Enter the element to be inserted:");
                int ele1 = sc.nextInt();
                insertAtPos(pos, size, arr, ele1);
                break;
            case 2:
                System.out.println("Enter the element to be inserted at the end:");
                int ele2 = sc.nextInt();
                insertAtEnd(ele2, arr, size);
                break;
            case 3:
                System.out.println("Enter the element to be inserted at the start:");
                int ele3 = sc.nextInt();
                insertAtStart(ele3, size, arr);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

class Main {
    public static void main(String[] args) {
        ArrayInsertion ai = new ArrayInsertion();
        ai.arrayInsertion();
    }
}
