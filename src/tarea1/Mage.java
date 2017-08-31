package tarea1;

public class Mage extends AbstractCard implements Card{

	public Mage(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
		
	}

	@Override
	public void attackCard(Card aCard) {
		aCard.attackedByMage(this);		
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
