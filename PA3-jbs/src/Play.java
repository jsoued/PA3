import java.util.Scanner;

public class Play {

	public static void main (String args[]){
		
		Board mainboard = new Board();
		
		for (int k = 0; k < 10; k++){
			
			mainboard.putSquare();
		}
		
		for (int l = 0; l < 3; l++){
			
			mainboard.putDisk();
		}
		
		mainboard.putJewel();
		
		Scanner input = new Scanner(System.in);
		
		int jewelcounter = 0;
		int diskcounter = 0;
		
		while (jewelcounter < 5 && diskcounter < 10){
			
			System.out.println("Write the angle of inclination for throwing the disk");
			
			int angle = input.nextInt();
			
			System.out.println("Write the strenght in percentage you want to use to throw the disk");
			
			int strenght = input.nextInt();
			
			System.out.println("Choose the disk you want to throw (0 for the first, 1 for the second and 2 for the third): " + Board.disklist.toString());
			
			int disknumb = input.nextInt();
			
			int a = angle;
			int b = 0;
			int c = angle;
			int d = 0;
			boolean e = true;
			
			for (int i = 0; i < strenght; i++){
				
				if (a <= 30){
					
					if (Board.disklist.get(disknumb).center.x + 1 > 99 && e){
						
						System.out.println("Disk out of board!");
						Board.disklist.remove(disknumb);
						mainboard.putDisk();
						diskcounter++;
						e = false;
						break;
						
					} else {
					
						if (Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y].occupied){
							
							if(Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y].object.name.equals("jewel")){
								
								System.out.println("You touched a jewel!");
								Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								jewelcounter++;
								diskcounter++;
								break;
								
							} else {
							
								System.out.println("You touched a square! Disk is static in its position now");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = true;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].object = Board.disklist.get(disknumb);
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								diskcounter++;
								break;
							}
						
						} else {
						
							Board.disklist.get(disknumb).center.x++;
							b = a;
							System.out.println("Disk position" + Board.disklist.get(disknumb).getPosition());
						}	
					}
				
				} else if (a >= 60){
					
					if (Board.disklist.get(disknumb).center.y + 1 > 99 && e){
						
						System.out.println("Disk out of board!");
						Board.disklist.remove(disknumb);
						mainboard.putDisk();
						diskcounter++;
						e = false;
						break;
						
					} else {
						
						if (Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y + 1].occupied){
							
							if(Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y + 1].object.name.equals("jewel")){
								
								System.out.println("You touched a jewel!");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y + 1].occupied = false;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								jewelcounter++;
								diskcounter++;
								break;
								
							} else {
							
								System.out.println("You touched a square! Disk is static in its position now");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = true;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].object = Board.disklist.get(disknumb);
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								diskcounter++;
								break;
							}
						
						} else {
						
							Board.disklist.get(disknumb).center.y++;
							b = a - 60;
							System.out.println("Disk position" + Board.disklist.get(disknumb).getPosition());
						}
					}
		
				} else {
					
					if (Board.disklist.get(disknumb).center.y + 1 > 99 || Board.disklist.get(disknumb).center.x + 1 > 99 && e){
						
						System.out.println("Disk out of board!");
						Board.disklist.remove(disknumb);
						mainboard.putDisk();
						diskcounter++;
						e = false;
						break;
						
					} else {
						
						if (Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y + 1].occupied){
							
							if(Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y + 1].object.name.equals("jewel")){
								
								System.out.println("You touched a jewel!");
								Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y + 1].occupied = false;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								jewelcounter++;
								diskcounter++;
								break;
								
							} else {
							
								System.out.println("You touched a square! Disk is static in its position now");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = true;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].object = Board.disklist.get(disknumb);
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								diskcounter++;
								break;
							}
						
						} else {
						
							Board.disklist.get(disknumb).center.x++;
							Board.disklist.get(disknumb).center.y++;
							b = a - 30;
							System.out.println("Disk position" + Board.disklist.get(disknumb).getPosition());
						}
					}
				}
				
				a = b * 3;
				
				if (jewelcounter >= 5){
					
					System.out.println("You won!");
					break;
				}
				
				if (diskcounter >= 10){
					
					System.out.println("You ran out of disks... Game Over!");
					break;
				}
			}
			
			e = true;
			
			///////////
			
			for (int i = 0; i < strenght; i++){
				
				if (c <= 30){
					
					if (Board.disklist.get(disknumb).center.x + 1 > 99 && e){
						
						System.out.println("Disk out of board!");
						Board.disklist.remove(disknumb);
						mainboard.putDisk();
						diskcounter++;
						e = false;
						break;
						
					} else {
					
						if (Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y].occupied){
							
							if(Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y].object.name.equals("jewel")){
								
								System.out.println("You touched a jewel!");
								Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								jewelcounter++;
								diskcounter++;
								break;
								
							} else {
							
								System.out.println("You touched a square! Disk is static in its position now");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = true;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].object = Board.disklist.get(disknumb);
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								diskcounter++;
								break;
							}
						
						} else {
						
							Board.disklist.get(disknumb).center.x++;
							d = c;
							System.out.println("Disk position" + Board.disklist.get(disknumb).getPosition());
						}	
					}
				
				} else if (c >= 60){
					
					if (Board.disklist.get(disknumb).center.y - 1 < 1 && e){
						
						System.out.println("Disk out of board!");
						Board.disklist.remove(disknumb);
						mainboard.putDisk();
						diskcounter++;
						e = false;
						break;
						
					} else {
						
						if (Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y - 1].occupied){
							
							if(Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y - 1].object.name.equals("jewel")){
								
								System.out.println("You touched a jewel!");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y - 1].occupied = false;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								jewelcounter++;
								diskcounter++;
								break;
								
							} else {
							
								System.out.println("You touched a square! Disk is static in its position now");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = true;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].object = Board.disklist.get(disknumb);
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								diskcounter++;
								break;
							}
						
						} else {
						
							Board.disklist.get(disknumb).center.y--;
							d = c - 60;
							System.out.println("Disk position" + Board.disklist.get(disknumb).getPosition());
						}
					}
		
				} else {
					
					if (Board.disklist.get(disknumb).center.y - 1 < 0 || Board.disklist.get(disknumb).center.x + 1 > 99 && e){
						
						System.out.println("Disk out of board!");
						Board.disklist.remove(disknumb);
						mainboard.putDisk();
						diskcounter++;
						e = false;
						break;
						
					} else {
						
						if (Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y - 1].occupied){
							
							if(Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y - 1].object.name.equals("jewel")){
								
								System.out.println("You touched a jewel!");
								Board.board[Board.disklist.get(disknumb).center.x + 1][Board.disklist.get(disknumb).center.y - 1].occupied = false;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = false;
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								jewelcounter++;
								diskcounter++;
								break;
								
							} else {
							
								System.out.println("You touched a square! Disk is static in its position now");
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].occupied = true;
								Board.board[Board.disklist.get(disknumb).center.x][Board.disklist.get(disknumb).center.y].object = Board.disklist.get(disknumb);
								Board.disklist.remove(disknumb);
								mainboard.putDisk();
								diskcounter++;
								break;
							}
						
						} else {
						
							Board.disklist.get(disknumb).center.x++;
							Board.disklist.get(disknumb).center.y--;
							d = c - 30;
							System.out.println("Disk position" + Board.disklist.get(disknumb).getPosition());
						}
					}
				}
				
				c = d * 3;
				
				if (jewelcounter >= 5){
					
					System.out.println("You won!");
					break;
				}
				
				if (diskcounter >= 10){
					
					System.out.println("You ran out of disks... Game Over!");
					break;
				}
			}	
		}
	}
}
