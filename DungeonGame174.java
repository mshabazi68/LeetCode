public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] hp = new int[m][n];

        hp[m-1][n-1] = Math.max(1, 1 - dungeon[m-1][n-1]);
        for(int k=n-2; k>=0; k--){
            hp[m-1][k] = Math.max(1, hp[m-1][k+1] - dungeon[m-1][k]);
        }
        for(int k = m-2; k>=0; k--){
            hp[k][n-1] = Math.max(1, hp[k+1][n-1] - dungeon[k][n-1]);
        }
        for(int i= m-2; i>=0; i--){
            for(int j = n-2; j>=0; j--){
                hp[i][j] = Math.max(1, Math.min(hp[i+1][j], hp[i][j+1]) - dungeon[i][j]);
            }
        }

        return hp[0][0];
    }
}
