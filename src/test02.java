import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.Comparator.naturalOrder;

//  2.	利用随机数创建两个大小为100且元素为0<= x <=500的数组，
//  要求输出两个数组的合并从小到大排序后结果，且重复元素作为一个元素输出。
public class test02 {
    public static void main(String[] args) {

        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int b = 0;
        while (b < 100) {
            arr1[b] = (int) (Math.random() * 500);
            arr2[b] = (int) (Math.random() * 500);
            b++;
        }

        int[] newArr = new int[200];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i] = arr2[i];
        }
        Arrays.sort(newArr);
        Set<Integer> set = new TreeSet<>();
        for (int i=0;i<newArr.length;i++){
            set.add(newArr[i]);
        }
        System.out.println(set);


      //  List<int[]> list = Arrays.asList(newArr);
     //   HashSet<int[]> set=new HashSet<>(list);

//        for (int i = 0; i < newArr.length; i++) {
//            if (newArr[i] == newArr[i + 1]) {
//                newArr[i] = Integer.parseInt();
//            }
/*            for(int i =0;i<newArr.length-1;i++){
               for(int j =1;j<newArr.length;j++) {
                   if(newArr[i]<NEW)
                   int temp = newArr[i];

                  }
            }*/
//        HashSet<int[]> set = new HashSet<>();
//        set.add(newArr);
//        Iterator<int[]> ite = set.iterator();
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//        ArrayList<int[]> list1 = new ArrayList();
//        list1.add(arr1);
//      //  list1.add(arr2);
//
//        ArrayList< int[]> list2 = new ArrayList();
//        list2.add(arr2);
//        list2.addAll(list1);
//
//        Arrays.sort(list1.toArray());  //转换成数组 并排序了
//
//        System.out.println(list1);
//
//        //去重
//        for (int i = 0; i < list1.size(); i++) {
//            if (list1.get(i).equals(list1.get(i - 1))) {
//                list1.remove(i);
//            }
//            System.out.println(Arrays.toString(list1.toArray()));

            //System.out.println(Arrays.toString(list1));

            //ArrayList< int[]> list2 = new ArrayList( );
            //  list2.add(arr2);
            // list2.addAll(list1);
            //Arrays.sort(list2);

            // list2.sort(naturalOrder());
            //System.out.println(Arrays.toString(list1));
        }

    }