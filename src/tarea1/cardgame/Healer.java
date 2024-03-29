package tarea1.cardgame;

public class Healer extends AbstractCard {

	public Healer(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
		
	}
	
	
	/**
	 * Make the healer card heal another card, only if
	 * it has HP greater than Damage Taken.
	 */
	@Override
	public void attackCard(Card aCard) {
		if(this.isAlive()) {
		aCard.attackedByHealer(this);
		}
	}
	
	@Override
	public void attackedByAssassin(Assassin anAssassin) {
		this.doDamage(2*anAssassin.getAttackPoints());
	}
	
	@Override
	public void attackedByPaladin(Paladin aPaladin) {
		this.doDamage(-2*aPaladin.getAttackPoints()/3);
		this.boostAttack(2*aPaladin.getAttackPoints()/3);
	}
}
