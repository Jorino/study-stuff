package factorymethod;

public class Rehtori extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new KotiKalja();
	}

}
