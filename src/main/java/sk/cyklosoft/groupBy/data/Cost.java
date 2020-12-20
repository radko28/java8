package sk.cyklosoft.groupBy.data;

import java.time.LocalDate;

public class Cost {
	
	int amount;
	SignumType signum;
	LocalDate date;
	
	public Cost(int amount, LocalDate date, SignumType signum){
		this.amount = amount;
		this.date = date;
		this.signum = signum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean getSignum() {
		return signum == SignumType.INVOICE;
	}

	public void setSignum(SignumType signum) {
		this.signum = signum;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}


