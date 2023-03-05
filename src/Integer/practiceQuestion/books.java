package Integer.practiceQuestion;


import java.util.LinkedList;
import java.util.Queue;

public class books{
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            start = q.poll();
            if(arr[start]==0)
                return true;
            if(arr[start]+ start<arr.length)
                q.add(arr[start] + start);
            if
        }
    }



        public static  void main(String[] args){
        int[] nums = {2, 3, 0, 1, 4};

        //System.out.println(jump(nums));
    }

}


