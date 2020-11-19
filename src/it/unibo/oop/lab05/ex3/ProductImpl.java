package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product{
	
	private String nome;
	private double quantità;

	public ProductImpl(String name, double quantity) {
		nome = name;
		quantità = quantity;
	}
	
	public String getName() {
		return nome;
	}

	public double getQuantity() {
		return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductImpl other = (ProductImpl) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
