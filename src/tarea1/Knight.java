package tarea1;

public class Knight extends AbstractCard implements Card {

	public Knight(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
		
	}

	@Override
	public void attackCard(Card aCard) {
		aCard.attackedByKnight(this);
	}
	
	@Override
	public void attackedByAssassin(Assassin anAssassin) {
		this.doDamage(anAssassin.getAttackPoints()/2);
	}
	
	public void attackedByHunter(Hunter aHunter) {
		this.doDamage(2*aHunter.getAttackPoints());
	}
}
