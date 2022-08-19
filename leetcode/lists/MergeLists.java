class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Create a dummy list
        //Define a head
        
        //traverse while list1 or list2 has a diferent value of null;
            // if li1 > li2
                    // add  li to dummy.next
                    //  li =  li = next
            //  else 
                    // Add l2 to dummy.next l2
                    // l2 = li2 = next
            // dumm y =. next
        
        // return next head 
        
        
        /*
            [1,2,4]
                 i
            [1,3,4]  
                 i
             
            aux = [1, 2, 4, 4]
        */
        
        ListNode aux = new ListNode(-111);
        ListNode head = aux;
        
        //Check which are larger
        while(list1 != null && list2 != null){
           if(list1.val < list2.val){
               aux.next = list1;
               list1 = list1.next;
           }else{
               aux.next = list2;
               list2 = list2.next;
           }https://leetcode.com/iCharlieAraiza/
            aux = aux.next;
        }
        
        
        // Add if any of these lists still have elements
        if(list1 != null){
            aux.next = list1;
        } else{
            aux.next = list2;
        }
        
        //return the second value
        return head.next;
    }
}
