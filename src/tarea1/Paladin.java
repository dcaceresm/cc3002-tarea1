package tarea1;

public class Paladin extends AbstractCard implements Card {

	public Paladin(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	}

	@Override
	public void attackCard(Card aCard) {
		aCard.attackedByPaladin(this);
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
