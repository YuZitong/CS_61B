/*
 * @Author: Yu Zitong
 * @Date: 2018-08-28 21:33:45
 * @Last Modified by:   Yu Zitong
*/
public class While{
    public static void main(String[] args) {
        int bottles = 99;
        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall.");
            bottles = bottles - 1;
        }
    }
}