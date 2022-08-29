public class SecondExercise {
    public static void main(String[] args) {
        int n = 100;
        int q = 100;
        double[][] array = new double[n][q];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random()*100);
            }
        }

        double max = array[0][0];
        double min = array[0][0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) max = array[i][j];
                if (min > array[i][j]) min = array[i][j];
                avg += array[i][j] / array.length/100;
            }
        }

        System.out.println("max - " + max);
        System.out.println("min - " + min);
        System.out.println("avg - " + avg);
    }
}
