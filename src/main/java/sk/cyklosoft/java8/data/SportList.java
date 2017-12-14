package sk.cyklosoft.java8.data;

import java.util.List;
import java.util.Optional;

public class SportList {
	
	private Optional<List<Climbing>> climbing = Optional.empty();

	public Optional<List<Climbing>> getClimbing() {
		return climbing;
	}

	public void setClimbing(Optional<List<Climbing>> climbing) {
		this.climbing = climbing;
	}

}
