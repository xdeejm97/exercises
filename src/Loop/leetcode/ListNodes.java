package Loop.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ListNodes {
    public static void main(String[] args) {

    }
        public static ListNode mergeTwoLists (ListNode list1, ListNode list2){


            ArrayList<ListNode> ints = new ArrayList<>();

            ints.add(list1);
            ints.add(list2);
            return new ListNode();
        }

    }

