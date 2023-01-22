public class advanceLoop {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};

        int sum = 0;
        for (int i :x){
            sum += i;
        }

        System.out.println("Sum Of Array : " + sum);
    }
}