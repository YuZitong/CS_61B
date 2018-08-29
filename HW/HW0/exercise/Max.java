/*
 * @Author: Yu Zitong
 * @Date: 2018-08-29 17:01:19
 * @Last Modified by:   Yu Zitong
*/

public class Max{
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int biggest = m[0];
        int length = m.length;
        int i = 0;
        while(i < length){
            if(m[i] > biggest){
                biggest = m[i];
            }
            i++;
        }
        return biggest;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println("The max member is:" + max(numbers));
    }
    
}