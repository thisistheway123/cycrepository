package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int amount)
	{
		int[] perfectSquares = new int[amount];
		int count = 0;
		int i = 1;
		
		while(count < amount){
			int perfectSquare = i * i;
			int x = 0;
			int y = 0;
			while(x < perfectSquare) {
				x = x + y;
				y++;
			}
			if(x == perfectSquare) {
				perfectSquares[count] = perfectSquare;
				count++;
			}
			i++;
		}
		for(int j = 0;j<perfectSquares.length;j++){
			System.out.println(perfectSquares[j]);
		}
	}
	
}
