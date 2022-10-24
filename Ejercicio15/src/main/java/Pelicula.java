
public class Pelicula {
	
	private int Ranking;
	private String titulo;
	private String WorldwideLifetimeGross;
	private String DomesticLifetimeGross;
	private String ForeignLifetimeGross;
	private int anio;
	
	public Pelicula() {
		super();
	}
	
	
	public Pelicula(int ranking, String titulo, String worldwideLifetimeGross, String domesticLifetimeGross,
			String foreignLifetimeGross, int anio) {
		super();
		Ranking = ranking;
		this.titulo = titulo;
		WorldwideLifetimeGross = worldwideLifetimeGross;
		DomesticLifetimeGross = domesticLifetimeGross;
		ForeignLifetimeGross = foreignLifetimeGross;
		this.anio = anio;
	}

	public int getRanking() {
		return Ranking;
	}
	public void setRanking(int ranking) {
		Ranking = ranking;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getWorldwideLifetimeGross() {
		return WorldwideLifetimeGross;
	}
	public void setWorldwideLifetimeGross(String worldwideLifetimeGross) {
		WorldwideLifetimeGross = worldwideLifetimeGross;
	}
	public String getDomesticLifetimeGross() {
		return DomesticLifetimeGross;
	}
	public void setDomesticLifetimeGross(String domesticLifetimeGross) {
		DomesticLifetimeGross = domesticLifetimeGross;
	}
	public String getForeignLifetimeGross() {
		return ForeignLifetimeGross;
	}
	public void setForeignLifetimeGross(String foreignLifetimeGross) {
		ForeignLifetimeGross = foreignLifetimeGross;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}


	@Override
	public String toString() {
		return "Ranking=" + Ranking + ", titulo=" + titulo + ", WorldwideLifetimeGross="
				+ WorldwideLifetimeGross + ", DomesticLifetimeGross=" + DomesticLifetimeGross
				+ ", ForeignLifetimeGross=" + ForeignLifetimeGross + ", anio=" + anio + "\n";
	}
	
	

}
