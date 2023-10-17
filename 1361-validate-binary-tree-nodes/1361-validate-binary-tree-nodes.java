class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] in = new int[n];
        IntStream.range(0, n).forEach(i -> {
            if (leftChild[i] != -1) in[leftChild[i]]++;
            if (rightChild[i] != -1) in[rightChild[i]]++;
        });

        int[] roots = IntStream.range(0, n)
                .filter(i -> in[i] == 0)
                .toArray();

        if (roots.length != 1) return false;
        int root = roots[0];
        
        int count = 0;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int poll = q.poll();
            if (visited[poll]) return false;
            visited[poll] = true;
            count++;
            
            int left = leftChild[poll];
            int right = rightChild[poll];
            
            if (left != -1) q.offer(left);
            if (right != -1) q.offer(right);
        }

        return count == n;
    }
}