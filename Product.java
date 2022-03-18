public class Product {
    private String category;
	private String productname;
	private Integer existencia;
	
	public Product(String categoria, String nombreP){
		this.category = categoria;
		this.productname = nombreP;
	}
	
    //Getters
	public String getNombre(){
		return productname;
	}
	public String getCategoria(){
		return category;
	}
    public int getAvailable(){
		return existencia;
	}

    //Setters
    public void setCategoriaP(String CategoriaProducto) {
        this.category = CategoriaProducto;
    }
    public void setProducto(String Nproducto) {
        this.productname = Nproducto;
    }
    public void setAvailable(Integer i) {
        this.existencia = existencia + i;
    }
	
	@Override
	public String toString() {
		return (category + ", " + productname + ", " + existencia);
	}

    public String PrintpCategoria(){
        return("Categoria: " + category + "Nombre producto: " + productname);
    }
    public String PrintCategoria(){
        return("Categoria del producto " + productname + "es: "+category);
    }

}
