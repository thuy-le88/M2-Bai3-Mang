public class FindMin {
    public static int minValue(int[] array){
        int min=array[0];
        for (int i=1;i<array.length;i++) {
            if (min>array[i])
                min=array[i];
        }
        return min;
    }
    public static int indexMin(int[] array) {
        int index=0;
        for (int j=0;j<array.length;j++) {
            if (minValue(array)==array[j])
                index=j+1;
        }
        return index;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int min = minValue(arr);
        int ind = indexMin(arr);
        System.out.println("The smallest element in the array is: " +min+" at position "+ ind);
    }
}
