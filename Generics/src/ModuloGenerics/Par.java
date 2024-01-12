package ModuloGenerics;

import java.util.Objects;

public class Par<C, V> implements Comparable < Par<C, V> >{
	/// 1ª parte ....
	private C chave;
	private V valor;
	public Par() {
	
	}
	public Par(C chave, V valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}
	@Override 
	public int compareTo( Par<C, V> o) {
		return 0;
	}

	public C getChave() {
		return chave;
	}
	public void setChave(C chave) {
		this.chave = chave;
	}
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<C ,V> other = (Par<C, V>) obj;
		return Objects.equals(chave, other.chave);
	}
	
	

}
