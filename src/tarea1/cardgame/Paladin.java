package tarea1.cardgame;

public class Paladin extends AbstractCard  {

	public Paladin(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	}
	
	
	/**
	 * Make the paladin card heal and boost another card, only if
	 * it has HP greater than Damage Taken.
	 */
	@Override
	public void attackCard(Card aCard) {
		if(this.isAlive()) {
		aCard.attackedByPaladin(this);
		}
	}
	
	@Override
	public void attackedByKnight(Knight aKnight) {
		this.doDamage(aKnight.getAttackPoints()/2);
	}
	
	@Override
	public void attackedByMage(Mage aMage) {
		this.doDamage(2*aMage.getAttackPoints());
	}
	
}
