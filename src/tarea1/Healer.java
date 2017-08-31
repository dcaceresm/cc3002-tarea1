package tarea1;

public class Healer extends AbstractCard implements Card{

	public Healer(String n, int hp, int dt, int ap) {
		super(n, hp, dt, ap);
		
	}

	@Override
	public void attackCard(Card aCard) {
		aCard.attackedByHealer(this);
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
