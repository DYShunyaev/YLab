public class FirstExercise {
    public static void main(String[] args) {
        int[] a = {5,6,3,2,5,1,4,9};
        selectionSort(a);

    }

    public static void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;

            for (int j = i+1; j < a.length; j++) {
                if (a[j] < min){
                    min = a[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = a[i];
                a[i] = a[min_i];
                a[min_i] = tmp;
            }
        }

        for (int j : a) {
            System.out.println(j);
        }
    }
}
