package tarea1;

public class Hunter extends AbstractCard implements Card{

	public Hunter(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
		
	}

	@Override
	public void attackCard(Card aCard) {
		aCard.attackedByHunter(this);
	}
	
	@Override
	public void attackedByDruid(Druid aDruid) {
		this.doDamage(aDruid.getAttackPoints());
	}
	
	@Override
	public void attackedByMage(Mage aMage) {
		this.doDamage(2*aMage.getAttackPoints());
	}
}
