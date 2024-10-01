package 이주현;

public class Account {

	private String ano;
	private String owner;
	private int balence;
	
	
	Account(String ano, String owner, int balence){
		this.ano = ano;
		this.owner = owner;
		this.balence = balence;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalence() {
		return balence;
	}
	public void setBalence(int balence) {
		this.balence = balence;
	}
	
}
