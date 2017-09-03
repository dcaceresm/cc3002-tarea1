package tarea1.cardgame;


/**
 * Represents an abstract Card
 * @author dcaceresm
 * 
 */
public abstract class AbstractCard implements Card{
	private String Name;
	private int HitPoints, DamageTaken, AttackPoints;
	
	/**
	 * Constructor for AbstractCard
	 * @param n Name of the Card
	 * @param hp Hitpoints
	 * @param dt Damage Taken
	 * @param ap Attack Points 
	 */
	public AbstractCard(String n, int hp, int dt, int ap) {
		this.Name = n;
		this.HitPoints = hp;
		this.DamageTaken = dt;
		this.AttackPoints = ap;
	}
	
	
	/**
	 * Return the name of the card
	 * @return card's name
	 */
	public String getName() {
		return this.Name;
	}
	
	
	/**
	 * Return the HitPoints of the card
	 * @return card's hitpoints
	 */
	public int getHitPoints() {
		return this.HitPoints;
	}
	
	
	/**
	 * Return the current damage taken by the card.
	 * This value cannot be less than 0 nor greater than card's HitPoints.
	 * @return card's current damage.
	 */
	public int getDamageTaken() {
		return this.DamageTaken;
	}
	
	/**
	 * Return the current attackPoints of the card.
	 * This value cannot be less than 0.
	 * @return card's current attack points.
	 */
	
	public int getAttackPoints() {
		return this.AttackPoints;
	}
	
	
	/**
	 * Add (or subtract) damage to the card's damage counter.
	 * @param damage Damage taken by the card
	 */
	public void doDamage(int damage) {
		this.DamageTaken = Math.max(0, Math.min(this.DamageTaken+damage, this.HitPoints));
	}
	
	
	/**
	 * Add (or subtract) attack points to the card's AP.
	 * @param attackPoints AP added to the card.
	 */
	public void boostAttack(int attackPoints) {
		this.AttackPoints = Math.max(0, this.AttackPoints+attackPoints);
	}
	
	/**
	 * Verify if the card is capable of performing actions (that is
	 * to attack another card.
	 * @return current state of the card.
	 */
	public boolean isAlive() {
		return (this.HitPoints > this.DamageTaken);
	}
	
	/**
	 * Do the card receive the effects of an Assassin card attacking.
	 * @param anAssassin attacker card.
	 */
	public void attackedByAssassin(Assassin anAssassin) {
		this.doDamage(anAssassin.getAttackPoints());
	}
	
	/**
	 * Do the card receive the effects of a Hunter card attacking.
	 * @param aHunter attacker card.
	 */
	public void attackedByHunter(Hunter aHunter) {
		this.doDamage(aHunter.getAttackPoints());
	}
	
	/**
	 * Do the card receive the effects of a Mage card attacking.
	 * @param aMage attacker card.
	 */
	public void attackedByMage(Mage aMage) {
		this.doDamage(aMage.getAttackPoints());
	}
	
	
	/**
	 * Do the card receive the effects of a Knight card attacking.
	 * @param aKnight attacker card.
	 */
	public void attackedByKnight(Knight aKnight) {
		this.doDamage(aKnight.getAttackPoints());
	}
	
	
	/**
	 * Do the card receive the effects of a Warlock card attacking.
	 * @param aWarlock attacker card.
	 */
	public void attackedByWarlock(Warlock aWarlock) {
		this.doDamage(aWarlock.getAttackPoints());
	}
	
	
	/**
	 * Do the card receive the effects of a Healer card healing.
	 * @param aHealer healer card.
	 */
	public void attackedByHealer(Healer aHealer) {
		this.doDamage(-aHealer.getAttackPoints());
	}
	
	/**
	 * Do the card receive the boost and damage from a Druid card.
	 * @param aDruid card causing the effects.
	 */
	public void attackedByDruid(Druid aDruid) {
		this.doDamage(aDruid.getAttackPoints()/2);
		this.boostAttack(aDruid.getAttackPoints());
	}
	
	/**
	 * Do the card receive the boost and damage from a Shaman card.
	 * @param aShaman card causing the effects.
	 */
	public void attackedByShaman(Shaman aShaman) {
		this.doDamage(aShaman.getAttackPoints()/3);
		this.boostAttack(-aShaman.getAttackPoints()/3);
	}
	
	
	/**
	 * Do the card receive the boost and healing from a Paladin card.
	 * @param aPaladin card causing the effects.
	 */
	public void attackedByPaladin(Paladin aPaladin) {
		this.doDamage(-aPaladin.getAttackPoints()/3);
		this.boostAttack(aPaladin.getAttackPoints()/3);
	}
}

