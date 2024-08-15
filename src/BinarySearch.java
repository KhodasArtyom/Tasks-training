public class BinarySearch {

    public static int[] array = new int[]{1, 2, 3, 4, 5, 7, 8, 9};
    private int low;
    private int high;

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(array,5);
    }

    private int binarySearch(int[] array, int item) {
        low = array[0];
        high = array.length - 1;

        while ((low <= high)) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == item) {
                return item;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return item;
    }

    ;


}
