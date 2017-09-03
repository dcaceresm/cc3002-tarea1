package tarea1.cardgame;

public class Shaman extends AbstractCard {

	public Shaman(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	}
	
	
	/**
	 * Make the shaman card attack and boost another card, only if
	 * it has HP greater than Damage Taken.
	 */
	@Override
	public void attackCard(Card aCard) {
		if(this.isAlive()) {
		aCard.attackedByShaman(this);
		}
	}
	
	@Override
	public void attackedByHunter(Hunter aHunter) {
		this.doDamage(2*aHunter.getAttackPoints());
	}
	
	
}
