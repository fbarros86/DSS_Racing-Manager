
public class Equipa {

	private Carro carro;
	private Piloto piloto1;
	private Piloto piloto2;
	private String nome;
	private int pontuacao;
	private String idUser;

	/**
	 *  @param idUser
	 * @param nome
	 * @param c
	 * @param p1
	 * @param p2
	 */
	public Equipa(String idUser, String nome, Carro c, Piloto p1, Piloto p2) {
		this.nome = nome;
		this.idUser = idUser;
		this.carro = c;
		this.piloto2 = p1;
		this.piloto2 = p2;
		this.pontuacao = 0;
	}

	/**
	 * 
	 * @param pontos
	 */
	public void addpontuacao(int pontos) {
		// TODO - implement Equipa.addpontuacao
		throw new UnsupportedOperationException();
	}

	public Carro getCarro1() {
		// TODO - implement Equipa.getCarro1
		throw new UnsupportedOperationException();
	}

	public Carro getCarro2() {
		// TODO - implement Equipa.getCarro2
		throw new UnsupportedOperationException();
	}

}