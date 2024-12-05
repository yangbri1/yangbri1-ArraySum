public class ArraySum {
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr.
     */
    public int sum(int[] arr){

        // assign initial value of 0 to variable 'total' 
        int total = 0;
        // using for-each loop to iterate through each int element within array 'arr'
        for(int elem : arr){
            // recursively add each respective 'elem' value to total
            total += elem;
        }
        // return the grand sum
        return total;
    }
}
