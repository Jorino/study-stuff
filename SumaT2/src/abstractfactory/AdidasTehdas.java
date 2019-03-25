package abstractfactory;

public class AdidasTehdas implements VaateTehdas {

	@Override
	public Vaate makeVaate(String vaateTyyppi) {
		// TODO Auto-generated method stub
		return new AdidasVaate(vaateTyyppi);
	}

	

}
