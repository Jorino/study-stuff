package visitor;


public class Pokemon {
	
		private PokemonState state;
		private int exp;
		private VisitorIF evl;
		
		public Pokemon(EvolveVisitor visitor) {
			state = Squirtle.getInstance();
			evl = visitor;
			exp = 0;
		}
		
		public void waterAttack() {
			state.waterAttack();
			exp += 15;
			evl.visit(this);
		}
		
		public void normalAttack() {
			state.normalAttack();
			exp += 10;
			evl.visit(this);
		}
		
		public void speak() {
			state.speak();
		}
		
		public void changeState(PokemonState newState) {
			this.state = newState;
		}
		
		public void evolve() {
			state.evolve(this);
			exp = 0;
		}

		public int getExp() {
			return exp;
		}
		
		public void tellExp() {
			System.out.println("\nYour pokemon: " + state.getState() + ", has "+ exp + " experience points.");
		}

		public void setExp(int exp) {
			this.exp = exp;
		}

		public String getState() {
			return state.getState();
		}
		
		public void fight() {
			waterAttack();
			normalAttack();
			speak();
			tellExp();
		}
}
