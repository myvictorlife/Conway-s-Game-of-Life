import java.util.Random;

import model.LiveCell;

public class Game {
	
	
	// Start the game
	public void run() {
		
		// Number of cells
		int sizeOfGrid = 10;
		
		// Creates the matrix of cells.
		String [][]grid = new LiveCell(sizeOfGrid).getLiveCell();
		
		// Initializes the cell population.
		grid = populateGridOfCell(grid);		
		
		// Show Populate of Cell
		System.out.println("START -> POPULATION OF CELL\n");
		showResults(grid);
		
		// Apply the rules of the game
		calculate(grid);
		
		// Show Results
		System.out.println("\n\nEND -> POPULATION OF CELL\n");
		showResults(grid);

	}

	// Populate the cells in their respective place
	public String [][] populateGridOfCell(String [][]grid) {
		
		for(int i=0; i < grid.length; i++) {
			for(int j=0; j < grid[i].length; j++) {
				grid[i][j] = chooseCell();
			}
		}
		
		return grid;
	}

	// RANDOM CELL LIVE OR DIE
	private String chooseCell() {
		Random rand = new Random();
		
		int n = rand.nextInt(2) + 0;
		return n == 1 ? "LIVE" : "DIE";
	}
	
	private void showResults(String[][] grid) {
		
		for(int i=0; i < grid.length; i++) {
			System.out.println("");
			for(int j=0; j < grid[i].length; j++) {
				if(grid[i][j] == "DIE") {
					System.out.print(grid[i][j] + "   ");
				}else {
					System.out.print(grid[i][j] + "  ");
				}
			}
		}
		
	}
	
	private void calculate(String[][] grid) {
		Calculate calculate = new Calculate();
		
		for(int i=0; i < grid.length; i++) {
			for(int j=0; j < grid[i].length; j++) {
				//1) Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
				calculate.liveCellWithFewerThanTwoLiveNeighboursDies(grid, i, j);
				
				//2) Any live cell with more than three live neighbours dies, as if by overcrowding.
				calculate.liveCellWithMoreThanThreeLiveNeighboursDies(grid, i, j);
				
				//3) Any live cell with two or three live neighbours lives on to the next generation.
				calculate.liveCellWithTwoOrThreeLiveNeighboursLives(grid, i, j);
				
				//4) Any dead cell with exactly three live neighbours becomes a live cell.
				calculate.deadCellWithExactlyThreeLiveNeighboursBecomesALiveCell(grid, i, j);
			}
		}
		
	}

}
