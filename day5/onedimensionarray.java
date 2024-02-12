public class onedimensionarray  {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};

        int[] C = mergeArrays(A, B);

        System.out.println("Merged Sorted Array C:");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }

    private static int[] mergeArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge arrays A and B into C
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // Copy the remaining elements of A, if any
        while (i < m) {
            C[k++] = A[i++];
        }

        // Copy the remaining elements of B, if any
        while (j < n) {
            C[k++] = B[j++];
        }

        return C;
    }
}