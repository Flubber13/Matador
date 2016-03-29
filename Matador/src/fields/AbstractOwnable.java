package fields;

public abstract class AbstractOwnable extends AbstractFields {
	
	public AbstractOwnable(int id) {
		super(id);
	}

	public abstract int getRent(int id);

}
