public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        
        if (array.length >= 5) {
            int[] resultArray = new int[array.length];

            // Copy the last three elements to the first three indices
            for (int i = 0; i < 3; i++) {
                resultArray[i] = array[array.length - 3 + i];
            }

            // Copy the first two elements to the end
            for ( int i = 3; i < array.length; i++) {
                resultArray[i] = array[i - 3];
            }

            // Print the modified array using for each loop
            // for (int num : resultArray) {
            //     System.out.print(num+" ");
            // }
            for(int i=0;i<resultArray.length;i++)
            {
                System.out.print(resultArray[i]+" ");
            }
           
        }
        
        
        else {
            System.out.println("The array does not have enough elements.");
        }
    }
}
