/*
 * @Author: Yu Zitong
 * @Date: 2018-08-29 17:12:09
 * @Last Modified by:   Yu Zitong
*/

public class ForLoop{
    /** Uses a basic for loop to sum a. */
    public static int sum(int[] a) {
      int sum = 0;
      for (int i = 0; i < a.length; i = i + 1) {
        sum = sum + a[i];
      }
      return sum;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};
        System.out.println(sum(numbers));
    }
}