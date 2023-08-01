
public class Item {
	private int codigo;
	private String titulo;
	
	public Item()
	{
		
	}
	
	public Item(int codigo, String titulo){
		this.codigo = codigo;
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Codigo: " + getCodigo() + "\nTitulo: " + getTitulo();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Item i = (Item) obj;
	if(this.codigo == i.codigo)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
}
