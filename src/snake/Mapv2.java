/**
 * 
 */
package snake;

import java.util.Random;

/**
 * @author agarcia
 *
 */

public class Mapv2 {

	/**
	 * 
	 */
	public Mapv2() {
		// TODO Auto-generated constructor stub
		
		this(10,10); // If we don't get dimensions passed, use default ones;
	}
	public Mapv2(int cols, int rows)
	{
		MapMaxX = cols;
		MapMaxY = rows;
		mapa = new tiles[MapMaxX][MapMaxY];

		for (int i = 0; i <MapMaxX; i++)
	        for (int j = 0; j <MapMaxY; j++)
	            mapa[i][j] = tiles.unfilled;
	}
	
	public enum tiles {pared, snake, obstaculo, comida, unfilled};
	
	private tiles [][] mapa;
	
	private int MapMaxX, MapMaxY;
	
	
	public int [] generateFood(){
		Random rand = new Random();
		int FoodCoordX;
		int FoodCoordY; 
		do {
			FoodCoordX =  rand.nextInt(MapMaxX);
			FoodCoordY =  rand.nextInt(MapMaxY);
		}while(mapa[FoodCoordX][FoodCoordY] != tiles.unfilled);
		
		mapa[FoodCoordX][FoodCoordY] = tiles.comida;
		
		return new int [] {FoodCoordX,FoodCoordY};
		
	}
	
	public int getMapMaxX() {
		return MapMaxX;
	}
	public int getMapMaxY() {
		return MapMaxY;
	}
	public tiles[][] getMap()
	{
		return mapa;
	}
	

}
