/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] spiralMatrix = new int[m][n];
        for (int[] row : spiralMatrix) {
            Arrays.fill(row, -1);
        }
        int startRow = 0;
        int startCol = 0;
        int endRow = m - 1;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol && head != null; j++) {
                spiralMatrix[startRow][j] = head.val;
                head = head.next;
            }
            // right
            for (int i = startRow + 1; i <= endRow && head != null; i++) {
                spiralMatrix[i][endCol] = head.val;
                head = head.next;
            }
            // bottom
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol && head != null; j--) {
                    spiralMatrix[endRow][j] = head.val;
                    head = head.next;
                }
            }
            // left
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow && head != null; i--) {
                    spiralMatrix[i][startCol] = head.val;
                    head = head.next;
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return spiralMatrix;
    }
}