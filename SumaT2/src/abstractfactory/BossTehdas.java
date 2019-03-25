package abstractfactory;

public class BossTehdas implements VaateTehdas{

	@Override
	public Vaate makeVaate(String vaateTyyppi) {
		// TODO Auto-generated method stub
		return new BossVaate(vaateTyyppi);
	}

}
