public class IsSorted {

    // Public function: called by the user
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }

    // Helper recursive function
    private static boolean isSorted(int[] a, int i) {
        if(a.length == 1 || a.length == 0 || i == a.length) {
            return true;
        }
        if(i > 0) {
            int prev = i - 1;
            if(a[i] < a[prev]) {
                return false;
            }
        }
        return isSorted(a, i+1); 
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5};
        System.out.println(isSorted(a)); // true

        int[] b = {1, 3, 2};
        System.out.println(isSorted(b)); // false
    }
}
