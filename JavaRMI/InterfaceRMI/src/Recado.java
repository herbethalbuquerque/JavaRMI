import java.io.Serializable;

public class Recado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2281079886752254553L;
	private int Codigo;
	private String texto;
	private String nome;
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
