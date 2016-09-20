package com.pxx;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
                        //获取输入
            int N = in.nextInt();
            String[] si = new String[N];
            for (int i = 0; i < N; i++) {
                si[i] = in.next();
            }
            int count = work(si, 0, new ArrayList<Character>(si.length));
            System.out.println(count);
        }
    }
 
        /**
         * 进行计算的方法
         * @param si 输入的字符串数组
         * @param i 表示进行到了树的第i层
         * @param list 保存根节点到当前节点的路径，用于判断重复
         * @return 表示当前树（子树）的可行方案数量
         */
    public static int work(String[] si, int i, List<Character> list) {
        if (i != list.size()) return 0;
        if (i >= si.length) return 0;
        int count = 0;
        String layel = si[i];
        for (int j = 0; j < layel.length(); j ++ ) {
            Character sub = layel.charAt(j);
            if (!list.contains(sub)) {
                list.add(sub);
                if (list.size() == si.length) {
                    count ++;
                    list.remove(si.length - 1);
                    continue;
                }
                count += work(si, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
        return count;
    }
}