import java.util.ArrayList;
import java.util.Random;

public class Board {

	public static Position board [][];
	
	public static ArrayList <Disc> disklist = new ArrayList <Disc>();
	
	
	public Board(){
		
		this.board = new Position [100][100];
		
		for (int i = 0; i < 100; i++){
			
			for (int j = 0; j < 100; j++){
				
				board [i][j] = new Position(false);
			}
		}
	}
		
	public void putSquare(){
		
		Random rand = new Random();
	
		int sqrcenterx = rand.nextInt(65) + 34;
		int sqrcentery = rand.nextInt(65);
		int sqrlength = rand.nextInt(3) + 1;
		
		Center cent = new Center(sqrcenterx, sqrcentery);
		
		Square sqr = new Square(cent, sqrlength);
		
		System.out.println("Adding Square at position" + sqr.getPosition());
		
		if (board [cent.x][cent.y].occupied == false && board [cent.x + 1][cent.y].occupied == false && board [cent.x - 1][cent.y].occupied == false){
		
			board [cent.x][cent.y].object = sqr;
			board [cent.x][cent.y].occupied = true;
			
			/*
			if (sqr.length > 1){
				
				board [cent.x + 1][cent.y].object = sqr;
				board [cent.x + 1][cent.y].occupied = true;
				
				if (sqr.length == 3){
					
					board [cent.x - 1][cent.y].object = sqr;
					board [cent.x - 1][cent.y].occupied = true;
				}
			}
			*/
		}		
	}
	
	public void putJewel(){
	
		Random rand = new Random();
		
		int jwlcenterx = rand.nextInt(65) + 34;
		int jwlcentery = rand.nextInt(65);
		int jwllength = rand.nextInt(3) + 1;
		
		Center cent = new Center(jwlcenterx, jwlcentery);
		
		Jewel jwl = new Jewel(cent, jwllength);
		
		System.out.println("Adding Jewel at position" + jwl.getPosition());
		
		if (board [cent.x][cent.y].occupied == false && board [cent.x + 1][cent.y].occupied == false && board [cent.x - 1][cent.y].occupied == false){
		
			board [cent.x][cent.y].object = jwl;
			board [cent.x][cent.y].occupied = true;
			
			/*
			if (jwl.length > 1){
				
				board [cent.x + 1][cent.y].object = jwl;
				board [cent.x + 1][cent.y].occupied = true;
				
				if (jwl.length == 3){
					
					board [cent.x - 1][cent.y].object = jwl;
					board [cent.x - 1][cent.y].occupied = true;
				}
			}
			*/	
		}
	}
	
	public void putDisk(){
		
		Random rand = new Random();
		
		int diskcenterx = rand.nextInt(35);
		int diskcentery = 0;
		int disklength = rand.nextInt(2) + 1;
		
		/*
		int sidechoice = rand.nextInt(2);
		
		if (sidechoice == 1){
			
			diskcenterx += 80;
		}
		*/
		
		Center cent = new Center(diskcenterx, diskcentery);
		
		Disc dsk = new Disc(cent, disklength);
		
		System.out.println("Adding Disk at position" + dsk.getPosition());
		
		if (board [cent.x][cent.y].occupied == false && board [cent.x + 1][cent.y].occupied == false /*&& board [cent.x - 1][cent.y].occupied == false*/){
		
			board [cent.x][cent.y].object = dsk;
			board [cent.x][cent.y].occupied = true;
			
			/*
			if (dsk.diameter > 1){
				
				board [cent.x + 1][cent.y].object = dsk;
				board [cent.x + 1][cent.y].occupied = true;
				
				board [cent.x][cent.y + 1].object = dsk;
				board [cent.x][cent.y + 1].occupied = true;
				
				board [cent.x + 1][cent.y + 1].object = dsk;
				board [cent.x + 1][cent.y + 1].occupied = true;
			}
			*/
			
			disklist.add(dsk);
		}
	}
}

