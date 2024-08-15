package leetcode.doublesort;

import java.util.Arrays;
import java.util.Comparator;

public class DoubleSort {
    public static void main(String[] args) {
        Object[] arr = {2,1,"a",3,"abc",0,"v"};
        Object[]res = dbSort(arr);
        System.out.println(Arrays.toString(res));
    }

    public static Object[] dbSort(Object[] a) {
        Comparator<Object> comparator = (o1, o2) -> {
            if (o1 instanceof Integer && o2 instanceof String) {
                return -1;
            }
            if(o1 instanceof String && o2 instanceof Integer){
                return 1;
            }
            if(o1 instanceof String && o2 instanceof String){
                return ((String) o1).compareTo((String)o2);
            }
            if(o1 instanceof Integer && o2 instanceof Integer){
                return ((Integer)o1).compareTo((Integer) o2);
            }
            return 0;
        };
        Arrays.sort(a,comparator);
        return a;
    }
}
