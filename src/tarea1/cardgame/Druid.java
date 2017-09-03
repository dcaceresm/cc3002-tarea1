package tarea1.cardgame;

public class Druid extends AbstractCard {

	public Druid(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	}
	
	
	/**
	 * Make the druid card attack another card, only if
	 * it has HP greater than Damage Taken.
	 */
	@Override
	public void attackCard(Card aCard) {
		if(this.isAlive()) {
		aCard.attackedByDruid(this);
		}
	}
	
	@Override
	public void attackedByShaman(Shaman aShaman) {
		this.doDamage(2*aShaman.getAttackPoints()/3);
		this.boostAttack(-2*aShaman.getAttackPoints()/3);
	}
	
	@Override
	public void attackedByPaladin(Paladin aPaladin) {
		this.doDamage(-2*aPaladin.getAttackPoints()/3);
		this.boostAttack(2*aPaladin.getAttackPoints()/3);
	}

}
