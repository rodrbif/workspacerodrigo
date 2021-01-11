package br.com.bankofoz.beans;

import br.com.bankofoz.util.PadraoConta;

public class Poupanca extends Conta implements PadraoConta{
	
	private float rendimento;


	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}


	public Poupanca() {
		super();
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + "Conta" + super.toString() +"]";
	}
		
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	@Override
	public boolean sacar(float valor) {
		if(getSaldo() > 0 && valor <= getSaldo()) {
			super.setSaldo((float) super.getSaldo() - valor);
			return true;
		
		}else {
			return false;
		}
	}

	@Override
	public boolean depositar(float valor) {
		if(valor > 0) {
			super.setSaldo((float) super.getSaldo() + valor);
			return true;
		}else {
			return false;
		}
			
	}

	public void creditarRendimentos() {
		super.setSaldo((float) super.getSaldo() + (super.getSaldo() * (rendimento/100)));
	}
	
	public float verificarSaldo() {
		return super.getSaldo();
	}


	

}
