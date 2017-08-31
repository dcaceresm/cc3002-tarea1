package tarea1;

public class Shaman extends AbstractCard implements Card {

	public Shaman(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	}

	@Override
	public void attackCard(Card aCard) {
		aCard.attackedByShaman(this);
	}
	
	@Override
	public void attackedByHunter(Hunter aHunter) {
		this.doDamage(2*aHunter.getAttackPoints());
	}
	
	
}
