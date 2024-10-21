import java.util.*;

public class sample {
    public static void main(String[] args) {
        //两个数的最大公约数和最小公倍数
        //todo 5.合并两个已排序的区间列表，并将其作为一个新的有序区间列表返回。
        // 新的区间列表应该通过拼接两个列表的区间并按升序排序
        List<Range> rs1 = new RandomRangeList().getRangeList(0);
        List<Range> rs2 = new RandomRangeList().getRangeList(5);
        print(rs1);
        print(rs2);
        print(new Test().yourcode2(rs1, rs2));
    }

    private static void print(List<Range> list) {
        for (Range range : list) {
            System.out.print("(" + range.start + "," + range.end + ") ");
        }
        System.out.println();
    }
}

class Range {
    int start;
    int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class RandomRangeList {
    public List<Range> getRangeList(int start) {
        List<Range> list = new ArrayList<>();
        Random rm = new Random();
        Range tempor = new Range(0, 0);
        boolean cache = true;
        for (int i = start; i < 10000; i++) {
            if (list.size() == 50) {
                break;
            }
            if (rm.nextInt(2) == 1) {
                if (cache) {
                    tempor.start = i;
                    cache = false;
                }
            } else {
                if (!cache) {
                    tempor.end = i;
                    cache = true;
                    list.add(tempor);
                    tempor = new Range(0, 0);
                }
            }
        }
        return list;
    }
}

class Test {
    public List<Range> yourcode(List<Range> list1, List<Range> list2) {
        //write your code here
        List<Integer> startlist = new ArrayList<>();
        List<Integer> endlist = new ArrayList<>();

        for (Range item : list1) {
            startlist.add(item.start);
            endlist.add(item.end);
        }
        for (Range item : list2) {
            startlist.add(item.start);
            endlist.add(item.end);
        }

        startlist.sort(Comparator.naturalOrder());
        endlist.sort(Comparator.naturalOrder());

        List<Range> result = new ArrayList<>();
        Range tempor = new Range(0, 0);
        boolean check = false;
        for (int i = 0; true; i++) {
            if (!check) {
                tempor.start = startlist.get(i);
                tempor.end = endlist.get(i);
                check = true;
            } else {
                if (tempor.end == startlist.get(i)) {
                    tempor.end = endlist.get(i);
                }
                else if (tempor.end < startlist.get(i)) {
                    result.add(tempor);
                    tempor = new Range(0, 0);
                    check = false;
                    i--;
                }
                else if (tempor.end > startlist.get(i)) {
                    tempor.end = tempor.end > endlist.get(i) ? tempor.end : endlist.get(i);
                }
            }
            if ((i + 1) == endlist.size()) {
                result.add(tempor);
                break;
            }
        }
        //dont forget return a list to print
        return result;
    }

    public List<Range> yourcode2(List<Range> list1, List<Range> list2){
        int max = list1.get(list1.size() - 1).end > list2.get(list2.size() - 1).end ? list1.get(list1.size() - 1).end : list2.get(list2.size() - 1).end;
        boolean[] temporary = new boolean[max+2];

        for(Range item : list1){
            for(int i = item.start; i < item.end; i++){
                temporary[i] = true;
            }
        }
        for(Range item : list2){
            for(int i = item.start; i < item.end; i++){
                temporary[i] = true;
            }
        }

        List<Range> result = new ArrayList<>();
        Range tempor = new Range(0,0);
        boolean check = false;
        for(int i = 0; i < temporary.length; i++){
            if(temporary[i]){
                if(!check){
                    tempor.start = i;
                    check = true;
                }
            }else{
                if(check){
                    tempor.end = i;
                    result.add(tempor);
                    tempor = new Range(0,0);
                    check = false;
                }
            }
        }
        return result;
    }
}