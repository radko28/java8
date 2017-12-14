package sk.cyklosoft.java8.data;

import java.util.Optional;

public class User {
	
	private Optional<Sport> sport  = Optional.empty();
	private Optional<SportList> sportList  = Optional.empty();
	

	public Optional<Sport> getSport() {
		return sport;
	}

	public void setSport(Optional<Sport> sport) {
		this.sport = sport;
	}

	public Optional<SportList> getSportList() {
		return sportList;
	}

	public void setSportList(Optional<SportList> sportList) {
		this.sportList = sportList;
	}

	
}
