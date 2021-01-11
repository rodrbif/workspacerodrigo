package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta{

	private float limite;
	private float taxa;

	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}



	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "Conta" + super.toString() + "]";
	}
	public Corrente() {
		super();
	}
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	
	@Override
	public boolean sacar(float valor) {
		if((getSaldo() - valor) >= limite) {
			super.setSaldo((float) super.getSaldo() - valor);
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean depositar(float valor) {
		
		if(valor > 0) {
			setSaldo((float) getSaldo() + valor);
			return true;
		}else {
			return false;
		}
	}
	
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - taxa);
	}
	
	public void aumentarLimite(float porc) {
		if(porc > 0) {
			limite = limite + limite *(porc/100);
		}
		
	}
	
	public float verificaSaldo() {
		return super.getSaldo() + limite;
		
	}
	
	

}
