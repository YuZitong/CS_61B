/*
 * @Author: Yu Zitong
 * @Date: 2018-08-28 21:19:37
 * @Last Modified by:   Yu Zitong
*/
public class ConditionalsWithBlocks {
    public static void main(String[] args) {
       int x = 5;
 
       if (x < 10) {
          System.out.println("I shall increment x by 10.");
          x = x + 10;
       }
 
       if (x < 10) {
          System.out.println("I shall increment x by 10.");
          x = x + 10;
       }
 
       System.out.println(x);
    }
 }