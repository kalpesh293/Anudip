package Array.org;
import java.util.*;

class ArrayOperations 
{
    private int[] arr;
    private int size;

    public ArrayOperations(int size) 
    {
        this.size = size;
        this.arr = new int[size];
    }

    public void inputArray(Scanner scanner) 
    {
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scanner.nextInt();
        }
    }

    public void displayArray() 
    {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() 
    {
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() 
    {
        for (int i = 0; i < size - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) 
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public int binarySearch(int key)
    {
        int low = 0;
        int high = size - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] == key) 
            {
                return mid;
            } 
            else if (arr[mid] < key)
            {
                low = mid + 1;
            } 
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void mergeArrays(int[] arr2)
    {
        int[] result = new int[size + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < size && j < arr2.length)
        {
            if (arr[i] < arr2[j])
            {
                result[k++] = arr[i++];
            } 
            else 
            {
                result[k++] = arr2[j++];
            }
        }
        while (i < size) 
        {
            result[k++] = arr[i++];
        }
        while (j < arr2.length) 
        {
            result[k++] = arr2[j++];
        }
        arr = result;
        size = size + arr2.length;
    }
}

public class ArrayApplication 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        ArrayOperations arrayOp = new ArrayOperations(size);
        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Input Array");
            System.out.println("2. Display Array");
            System.out.println("3. Sort Array using Bubble Sort");
            System.out.println("4. Sort Array using Selection Sort");
            System.out.println("5. Search in Array using Binary Search");
            System.out.println("6. Merge Arrays");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    arrayOp.inputArray(scanner);
                    break;
                case 2:
                    arrayOp.displayArray();
                    break;
                case 3:
                    arrayOp.bubbleSort();
                    System.out.println("Array sorted using Bubble Sort.");
                    break;
                case 4:
                    arrayOp.selectionSort();
                    System.out.println("Array sorted using Selection Sort.");
                    break;
                case 5:
                    System.out.print("Enter the element to search: ");
                    int key = scanner.nextInt();
                    int index = arrayOp.binarySearch(key);
                    if (index != -1)
                    {
                        System.out.println("Element found at index: " + index);
                    }
                    else 
                    {
                        System.out.println("Element not found in the array.");
                    }
                    break;
                case 6:
                    System.out.print("Enter the size of the second array: ");
                    int size2 = scanner.nextInt();
                    int[] array2 = new int[size2];
                    System.out.println("Enter " + size2 + " elements of the second array:");
                    for (int i = 0; i < size2; i++) 
                    {
                        array2[i] = scanner.nextInt();
                    }
                    arrayOp.mergeArrays(array2);
                    System.out.println("Arrays merged successfully.");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
}
