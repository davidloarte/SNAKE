package snake;

public class Main {

	public static void main(String[] args) {
		//Map miMapa = new Map();
		//miMapa.map();
		
		Mapv2 mapa = new Mapv2(10,5);
		System.out.println( "max X: "+ mapa.getMapMaxX());
		System.out.println( "max Y: "+ mapa.getMapMaxY());
		//System.out.println( "max X: "+ mapa.generateFood() );
		
		System.out.println();
		
		mapa.generateFood();
		
		Mapv2.tiles[][] mapo = mapa.getMap();
		
		/*
		for(int i=0; i< mapa.getMapMaxX(); i++) {
			for(int j=0; j< mapa.getMapMaxY(); j++) {
				System.out.println(
						" pos ("+i+","+j+") = "+ mapo[i][j]);
			}
		}*/
		
		for (int i=0; i< mapa.getMapMaxX(); i++) {
			for(int j=0; j< mapa.getMapMaxY(); j++) {
				System.out.print(mapo[i][j].ordinal()+" ");
			}
			System.out.print("\n");
		}
	}

}
