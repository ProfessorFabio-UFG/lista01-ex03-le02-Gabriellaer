
public class Moradores {
	private String sexo;
	private String bloco;
	private String nome;
	private String data;
	private int cpf;
	private int celular;
	private int apartamento;
	private int code;
	public static int cod_sq = 0;
	Moradores(String sexo, String bloco, String nome, String data, int cpf, int celular, int apartamento, int code){
		this.sexo = sexo;
		this.bloco = bloco;
		this.nome = nome;
		this.data = data;
		this.cpf = cpf;
		this.celular = celular;
		this.apartamento = apartamento;
		this.code = code;
	}
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String toString() {
		return "Nome: " + nome + " CPF: " + cpf + " Data de nascimente: " + data + " Sexo: " + sexo + " Celular: "
				+ celular + "\nApartamento: " + apartamento + "\nBloco: " + bloco + "\nCodigo de acesso: " + code;
	}
}