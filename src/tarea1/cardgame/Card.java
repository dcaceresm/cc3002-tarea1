package tarea1.cardgame;

public interface Card {
		
	public void attackCard(Card aCard);
	public void attackedByAssassin(Assassin anAssassin);
	public void attackedByDruid(Druid aDruid);
	public void attackedByHealer(Healer aHealer);
	public void attackedByHunter(Hunter aHunter);
	public void attackedByMage(Mage aMage);
	public void attackedByKnight(Knight aKnight);
	public void attackedByShaman(Shaman aShaman);
	public void attackedByPaladin(Paladin aPaladin);
	public void attackedByWarlock(Warlock aWarlock);
}
