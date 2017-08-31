package tarea1;

public class Assassin extends AbstractCard implements Card{

	public Assassin(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	}

	@Override
	public void attackCard(Card aCard) {
		if(this.isAlive()) {
		aCard.attackedByAssassin(this);
		}
	}
	
	@Override
	public void attackedByWarlock(Warlock aWarlock) {
		this.doDamage(2*aWarlock.getAttackPoints());
	}
	
	@Override
	public void attackedByDruid(Druid aDruid) {
		this.boostAttack(aDruid.getAttackPoints()/2);
	}

	

	
	
	
	


}
