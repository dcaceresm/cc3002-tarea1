package tarea1.cardgame;

public class Warlock extends AbstractCard  {

	public Warlock(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	
	}

	@Override
	public void attackCard(Card aCard) {
		if(this.isAlive()) {
		aCard.attackedByWarlock(this);
		}
	}
	
	@Override
	public void attackedByHealer(Healer aHealer) {
		this.doDamage(aHealer.getAttackPoints());
	}
	
	@Override
	public void attackedByShaman(Shaman aShaman) {
		this.doDamage(2*aShaman.getAttackPoints()/3);
		this.boostAttack(-2*aShaman.getAttackPoints()/3);
	}

}
