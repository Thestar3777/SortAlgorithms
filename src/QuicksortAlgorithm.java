
public class QuicksortAlgorithm {
    private static int swapCount = 0;

    public static void main(String[] args) {
        int[] numbers = {12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77};

        System.out.println("\nBefore Sort: ");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter Quicksort: ");
        printArray(numbers);

        System.out.println("\nTotal # of swaps: " + swapCount);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer) {

            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
    }

    private static void swap (int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        swapCount++;
    }


    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
