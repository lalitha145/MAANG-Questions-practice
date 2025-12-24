
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
       int a[]=new int[1];
       helper(a,root);
       return a[0];
    }
    int helper(int a[],TreeNode root){
        if(root==null){
            return 0;
        }
        int left=helper(a,root.left);
        int right=helper(a,root.right);
        a[0]=Math.max(a[0],left+right);
        return 1+Math.max(left,right);


    }
    
}

/*
helper(1)
├── helper(2)
│   ├── helper(4)
│   │   ├── helper(null) → 0
│   │   ├── helper(null) → 0
│   │   └── return 1   (height of node 4)
│   │       a[0] = max(0, 0+0) = 0
│   │
│   ├── helper(5)
│   │   ├── helper(null) → 0
│   │   ├── helper(null) → 0
│   │   └── return 1   (height of node 5)
│   │       a[0] = max(0, 0+0) = 0
│   │
│   └── return 2       (1 + max(1,1))
│       a[0] = max(0, 1+1) = 2
│
├── helper(3)
│   ├── helper(null) → 0
│   ├── helper(null) → 0
│   └── return 1
│       a[0] = max(2, 0+0) = 2
│
└── return 3           (1 + max(2,1))
    a[0] = max(2, 2+1) = 3
*/