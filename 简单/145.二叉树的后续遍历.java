class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {                
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode t = root;
        TreeNode p = null;
        while(t != null || !stack.isEmpty()){
            if(t != null){                        
                stack.push(t);
                t = t.left;
            }else{
                t = stack.peek();
                if(t.right == null || t.right == p){
                    list.add(t.val);
                    p = t;
                    stack.pop();
                    t = null;
                }else{
                    t = t.right;
                }
            }           
        }
        return list;
    }
}
