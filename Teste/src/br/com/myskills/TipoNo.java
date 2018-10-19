package br.com.myskills;

public class TipoNo {

	TipoNo sim;
	TipoNo nao;
	Integer num;
	String valor;

	TipoNo(Integer num){
			this.num = num;
			this.sim=null;    
	        this.nao=null;
	        this.valor=null;
		}

	public TipoNo(String valor, Integer num){
			this.valor = valor;
			this.num = num;
	}
}