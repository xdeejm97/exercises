package Loop;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {12, 9, 4, 99, 120, 1, 3, 10};

        System.out.println("Tablica przed posortowaniem:");
        printArray(array);


        quickSort(array, 0, array.length - 1);

        System.out.println("\nTablica po posortowaniu:");
        printArray(array);
    }

    // Implementacja algorytmu sortowania szybkiego
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Funkcja wybierająca element rozdzielający (pivot) i sortująca elementy w tablicy
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Funkcja pomocnicza do wyświetlania zawartości tablicy
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
