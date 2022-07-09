import java.util.Arrays;

public class Floodfill733 {

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if (image[sr][sc] == newColor) {
			return image;
		}
		fill(image, sr, sc, image[sr][sc], newColor);
		return image;
	}

	public void fill(int[][] image, int sr, int sc, int color, int newColor) {
		if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) {
			return;
		}

		image[sr][sc] = newColor;
		fill(image, sr - 1, sc, color, newColor);
		fill(image, sr + 1, sc, color, newColor);
		fill(image, sr, sc - 1, color, newColor);
		fill(image, sr, sc + 1, color, newColor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floodfill733 obj = new Floodfill733 ();
		int [][] image = {{1,1,1},{1,1,0},{1,0,1}}; 
		System.out.println(Arrays.deepToString(image));
		int sr = 1;
		int sc = 1;
		int newColor = 2;
		System.out.println(Arrays.deepToString(
		obj.floodFill(image, sr, sc, newColor)));
	}

}
