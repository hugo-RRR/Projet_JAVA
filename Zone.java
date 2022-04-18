public class Zone extends Jeu {
	
    public String typeSalle;
    public int posX;
    public int posY;
    
	public String toString() {
		return "Zone [typeSalle=" + typeSalle + ", posX=" + posX + ", posY=" + posY + "]";
	}


	public Zone(String typeSalle, int posX, int posY) {
		super();
		this.typeSalle = typeSalle;
		this.posX = posX;
		this.posY = posY;
		
	}

}
