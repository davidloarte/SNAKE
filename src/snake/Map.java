package snake;

public class Map {

	public void map() {
		// esto se deberia preguntar al usuario. habria que hacerlo para el tercer sprint
		int fila = 50;
		int col = 50;
		
		int minf = 0;
		int minc = 0;
		
		int maxf = fila -1;
		int maxc = col - 1;
		
		char matriz[][] = new char[fila][col];
		
		//creamos el marco del mapa
		for(int f = 0; f < fila; f++ ) {
			for(int c = 0; c < col; c++) {
				if (((f) == minf || (f) == maxf)) {
					if ( ((f == minf)&&(f == minc)) ||  ((f == minf)&&(f == maxc)) || ((f == maxf) && (f == minc)) || ((f == maxf)&&(f== maxc)))
						System.out.print(String.format("1", matriz[f][c]));
					else 
						System.out.print("1");
				}
				else
					if(((f) >= (minf)) || ((f) <= (maxf) )) {
						if( (c < (minc+1)) || (c > (maxc - 1)) )
						System.out.print(String.format("1", matriz[f][c]));
						else 
							System.out.print("0");
					}
			}
			System.out.println();
		}

	}

}

