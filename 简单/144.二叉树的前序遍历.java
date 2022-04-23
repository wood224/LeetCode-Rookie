class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode t = root;
        while(t != null || !stack.isEmpty()){
            if(t != null){
                list.add(t.val);
                stack.push(t);
                t = t.left;
            }else{
                t = stack.pop();
                t = t.right;
            }
        }
        return list;
    }
}
