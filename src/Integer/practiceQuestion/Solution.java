package Integer.practiceQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int level  = 0;
        int currLevel = 0;
        int max = Integer.MIN_VALUE;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            for(int i = 0;i<size;i++){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }

            }
            level++;
            if(sum>max){
                max = sum;
                currLevel = level;
            }
        }
        return currLevel;



    }




















    }


