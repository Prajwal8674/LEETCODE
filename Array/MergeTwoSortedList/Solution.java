package Array.MergeTwoSortedList;

import java.util.LinkedList;

public class Solution {

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> li1, LinkedList<Integer> li2) {

        LinkedList<Integer> ans = new LinkedList<>();

        int i = 0, j=0;
        while (i < li1.size() && j < li2.size()) {
            if (li1.get(i) <= li2.get(j)) {
                ans.add(li1.get(i));
                i++;
            } else {
                ans.add(li2.get(j));
                j++;
            }
        }
        while (i < li1.size()) {
            ans.add(li1.get(i++));
        }
        while (j < li2.size()) {
            ans.add(li2.get(j++));
        }
        return ans;
    }
    public static void main(String[] args) {

        LinkedList<Integer> li1 = new LinkedList<>();
        LinkedList<Integer> li2 = new LinkedList<>();
        li1.add(1);
        li1.add(3);
        li1.add(5);

        li2.add(2);
        li2.add(4);
        li2.add(6);
        System.out.println(mergeTwoLists(li1, li2));
    }
}
