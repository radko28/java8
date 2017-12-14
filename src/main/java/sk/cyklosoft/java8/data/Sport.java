package sk.cyklosoft.java8.data;

import java.util.Optional;

public class Sport {
	
	private Optional<Climbing> climbing = Optional.empty();

	public Optional<Climbing> getClimbing() {
		return climbing;
	}

	public void setClimbing(Optional<Climbing> climbing) {
		this.climbing = climbing;
	}

}
