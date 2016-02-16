public class MatrixTraversal {
    public int[] print(int[][] input) {

        int h = input.length;
        int w = input[0].length;
        int top = 0, right = input[0].length, left = 0, bottom = input.length;
        int[] array = new int[h * w];

        int k = 0;

        for (; k < h * w; ) {
            for (int i = left; i < right; i++) {
                if (k == h * w) break;
                array[k] = input[top][i];
                k++;
            }
            top++;
            for (int i = top; i <= bottom - 1; i++) {
                if (k == h * w) break;
                array[k] = input[i][right - 1];
                k++;
            }
            right--;
            for (int i = right - 1; i >= left; i--) {
                if (k == h * w) break;
                array[k] = input[h - top][i];
                k++;
            }
            bottom--;
            for (int i = bottom - 1; i >= top; i--) {
                if (k == h * w) break;
                array[k] = input[i][left];
                k++;
            }
            left++;
        }
        return array;
    }
}
