package tarea1;

public class Druid extends AbstractCard implements Card{

	public Druid(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
	}

	@Override
	public void attackCard(Card aCard) {
		aCard.attackedByDruid(this);
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
