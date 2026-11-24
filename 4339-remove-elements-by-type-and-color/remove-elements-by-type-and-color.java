class Solution {

    static class Node {
        int type;
        int color;
        int count;

        Node(int type, int color, int count) {
            this.type = type;
            this.color = color;
            this.count = count;
        }
    }

    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
        Stack<Node> stack = new Stack<>();

        for (int i = 0; i < types.length; i++) {
            int type = types[i];
            int color = colors[i];

            if (!stack.isEmpty()
                    && stack.peek().type == type
                    && stack.peek().color == color) {

                stack.peek().count++;

                if (stack.peek().count == groupSize[type]) {
                    stack.pop();
                }

            } else {

                stack.push(new Node(type, color, 1));

                if (groupSize[type] == 1) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}