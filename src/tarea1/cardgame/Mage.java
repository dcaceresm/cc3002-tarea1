package tarea1.cardgame;

public class Mage extends AbstractCard {

	public Mage(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
		
	}
	
	
	/**
	 * Make the mage card attack another card, only if
	 * it has HP greater than Damage Taken.
	 */
	@Override
	public void attackCard(Card aCard) {
		if(this.isAlive()) {
		aCard.attackedByMage(this);
		}
	}
	
	@Override
	public void attackedByWarlock(Warlock aWarlock) {
		this.doDamage(aWarlock.getAttackPoints()/2);
	}
	
	@Override
	public void attackedByAssassin(Assassin anAssassin) {
		this.doDamage(2*anAssassin.getAttackPoints());
	}
}
