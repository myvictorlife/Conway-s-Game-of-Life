package model;

public class LiveCell {
	
	private String [][] liveCell;
	
	public LiveCell (int size) {
		
		liveCell = new String [size][size];
	}

	public String[][] getLiveCell() {
		return liveCell;
	}

	public void setLiveCell(String[][] liveCell) {
		this.liveCell = liveCell;
	}

}
