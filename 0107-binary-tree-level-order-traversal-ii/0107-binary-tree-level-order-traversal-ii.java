/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levlOrder(root , list);
        return list;
    }
    public void levlOrder(TreeNode root , List<List<Integer>> list){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                list.add(0 , lst);
                lst = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            } else{
                lst.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
}