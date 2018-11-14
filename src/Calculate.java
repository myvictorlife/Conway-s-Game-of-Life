
public class Calculate {
	
	/* Calculation is performed only for neighbors in horizontal and vertical. */

	public String [][] liveCellWithFewerThanTwoLiveNeighboursDies(String [][]grid, int i, int j)  {

		if(isCellLife(grid[i][j])) {
			int countCellLife =  totalNeighborsLive(grid, i, j);
			grid[i][j] = countCellLife == 2 ? "DIE" : grid[i][j];
		}
		
		return grid;
	}
	
	public String [][] liveCellWithMoreThanThreeLiveNeighboursDies(String [][]grid, int i, int j)  {
		if(isCellLife(grid[i][j])) {
			int countCellLife =  totalNeighborsLive(grid, i, j);
			grid[i][j] = countCellLife == 3 ? "DIE" : grid[i][j];
		}
		return null;
	}
	
	public String [][] liveCellWithTwoOrThreeLiveNeighboursLives(String [][]grid, int i, int j)  {
		if(isCellLife(grid[i][j])) {
			int countCellLife =  totalNeighborsLive(grid, i, j);
			grid[i][j] = countCellLife == 2 || countCellLife == 3 ? "LIVE" : grid[i][j];
		}
		return null;
	}

	public String [][] deadCellWithExactlyThreeLiveNeighboursBecomesALiveCell(String [][]grid, int i, int j)  {
		if(!isCellLife(grid[i][j])) {
			int countCellLife =  totalNeighborsLive(grid, i, j);
			grid[i][j] = countCellLife == 3 ? "LIVE" : grid[i][j];
		}
		return null;
	}
	
	// CHECK IF THE CELL IS LIVING
	public boolean isCellLife(String cell) {
		return cell == "LIVE" ? true : false;
	}
	
	// CHECK IF LIFE RETURN 1 OR IF DIE RETURN 0
	private int checkCell(String cell) {
		return isCellLife(cell) ? 1 : 0;
	}
	
	private int totalNeighborsLive(String [][]grid, int i, int j) {
		int countCellLife = 0;
		// NEIGHBORS UP
		if(i-1 >= 0) {
			countCellLife = countCellLife + checkCell(grid[i-1][j]);
		}
		
		// NEIGHBORS DOWN
		if(i+1 < grid.length) {
			countCellLife = countCellLife + checkCell(grid[i+1][j]);
		}
		
		// NEIGHBORS RIGHT
		if(j+1 < grid.length) {
			countCellLife = countCellLife + checkCell(grid[i][j+1]);
		}
		
		// NEIGHBORS LEFT
		if(j-1 >= 0) {
			countCellLife = countCellLife + checkCell(grid[i][j-1]);
		}
		return countCellLife;
	}

}
