package tarea1.test;

import org.junit.*;
import static org.junit.Assert.*;
import tarea1.cardgame.*;

public class CardTest {
	private Assassin asesino;
	private Druid druida;
	private Healer healer;
	private Hunter hunter;
	private Knight knight;
	private Mage mago;
	private Paladin paladin;
	private Shaman shaman;
	private Warlock brujo;
	
	@Before public void setUp() {
		asesino = new Assassin("asesino", 20,0,3);
		druida = new Druid("druida",20,0,3);
		healer = new Healer("healer",20,0,3);
		hunter = new Hunter("hunter",20,0,3);
		knight = new Knight("caballero",20,0,3);
		mago = new Mage("mago",20,0,3);
		paladin = new Paladin("paladin",20,0,3);
		shaman = new Shaman("shaman",20,0,3);
		brujo = new Warlock("brujo",20,0,3);
	}
	
	@Test public void testGetName() {
		assertEquals("Wrong name", asesino.getName(),"asesino");
		assertEquals("Wrong name", druida.getName(),"druida");
		assertEquals("Wrong name", healer.getName(),"healer");
		assertEquals("Wrong name", hunter.getName(),"hunter");
		assertEquals("Wrong name", knight.getName(),"caballero");
		assertEquals("Wrong name", mago.getName(), "mago");
		assertEquals("Wrong name", paladin.getName(), "paladin");
		assertEquals("Wrong name", shaman.getName(), "shaman");
		assertEquals("Wrong name", brujo.getName(), "brujo");
	}
	
	@Test public void testGetHP() {
		assertEquals("Wrong HP", asesino.getHitPoints(), 20);
		assertEquals("Wrong HP", druida.getHitPoints(),20);
		assertEquals("Wrong HP", healer.getHitPoints(),20);
		assertEquals("Wrong HP", hunter.getHitPoints(),20);
		assertEquals("Wrong HP", knight.getHitPoints(),20);
		assertEquals("Wrong HP", mago.getHitPoints(),20);
		assertEquals("Wrong HP", paladin.getHitPoints(),20);
		assertEquals("Wrong HP", shaman.getHitPoints(),20);
		assertEquals("Wrong HP", brujo.getHitPoints(),20);
		
	}
	
	@Test public void testGetDamageTaken() {
		assertEquals("Wrong Damage Taken", asesino.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", druida.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", healer.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", hunter.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", knight.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", mago.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", paladin.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", shaman.getDamageTaken(),0);
		assertEquals("Wrong Damage Taken", brujo.getDamageTaken(),0);
	}
	
	@Test public void testGetAttackPoints() {
		assertEquals("Wrong AP", asesino.getAttackPoints(),3);
		assertEquals("Wrong AP", druida.getAttackPoints(),3);
		assertEquals("Wrong AP", healer.getAttackPoints(),3);
		assertEquals("Wrong AP", hunter.getAttackPoints(),3);
		assertEquals("Wrong AP", knight.getAttackPoints(),3);
		assertEquals("Wrong AP", mago.getAttackPoints(),3);
		assertEquals("Wrong AP", paladin.getAttackPoints(),3);
		assertEquals("Wrong AP", shaman.getAttackPoints(),3);
		assertEquals("Wrong AP", brujo.getAttackPoints(),3);
	}
	
	@Test public void testDoDamage() {
		int dt = 21;
		asesino.doDamage(dt);
		druida.doDamage(dt);
		healer.doDamage(dt);
		hunter.doDamage(dt);
		knight.doDamage(dt);
		mago.doDamage(dt);
		shaman.doDamage(dt);
		paladin.doDamage(dt);
		brujo.doDamage(dt);
		assertEquals("Wrong Damage Taken", asesino.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", druida.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", healer.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", hunter.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", knight.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", mago.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", paladin.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", shaman.getDamageTaken(),20);
		assertEquals("Wrong Damage Taken", brujo.getDamageTaken(),20);
	}

	
	@Test public void testAttack() {
		int dt = -21;
		asesino.doDamage(dt);
		druida.doDamage(dt);
		healer.doDamage(dt);
		hunter.doDamage(dt);
		knight.doDamage(dt);
		mago.doDamage(dt);
		shaman.doDamage(dt);
		paladin.doDamage(dt);
		brujo.doDamage(dt);
		
		asesino.attackCard(brujo);
		assertEquals("Wrong damage taken", brujo.getDamageTaken(),3);
		asesino.attackCard(healer);
		assertEquals("Wrong damage taken", healer.getDamageTaken(),6);
		asesino.attackCard(mago);
		assertEquals("Wrong damage taken", mago.getDamageTaken(),6);
		brujo.attackCard(asesino);
		assertEquals("Wrong damage taken", asesino.getDamageTaken(),6);
		brujo.attackCard(mago);
		assertEquals("Wrong damage taken", mago.getDamageTaken(),7);
		brujo.attackCard(knight);
		assertEquals("Wrong damage taken", knight.getDamageTaken(),3);
		healer.attackCard(mago);
		assertEquals("Wrong damake taken", mago.getDamageTaken(),4);
		healer.attackCard(brujo);
		assertEquals("Wrong damage taken", brujo.getDamageTaken(),6);
		shaman.attackCard(druida);
		assertEquals("Wrong damage taken", druida.getDamageTaken(),2);
		assertEquals("Wrong attack boost", druida.getAttackPoints(),1);
		paladin.attackCard(druida);
		assertEquals("Wrong damage taken", druida.getDamageTaken(),0);
		assertEquals("Wrong attack boost", druida.getAttackPoints(),3);
		hunter.attackCard(shaman);
		assertEquals("Wrong damage taken",shaman.getDamageTaken(),6);
		hunter.attackCard(knight);
		assertEquals("Wrong damage taken", knight.getDamageTaken(),9);
		hunter.attackCard(mago);
		assertEquals("Wrong damage taken", mago.getDamageTaken(),7);
		asesino.attackCard(knight);
		assertEquals("Wrong damage taken", knight.getDamageTaken(),10);
		mago.attackCard(paladin);
		assertEquals("Wrong damage taken", paladin.getDamageTaken(), 6);
		knight.attackCard(paladin);
		assertEquals("Wrong damage taken", paladin.getDamageTaken(),7);
		knight.attackCard(mago);
		assertEquals("Wrong damage taken", mago.getDamageTaken(), 10);
		druida.attackCard(asesino);
		assertEquals("Wrong attack boost", asesino.getAttackPoints(),4);
		druida.attackCard(hunter);
		assertEquals("Wrong damage taken", hunter.getDamageTaken(),3);
		mago.attackCard(hunter);
		assertEquals("Wrong damage taken", hunter.getDamageTaken(),9);
		shaman.attackCard(brujo);
		assertEquals("Wrong damage taken", brujo.getDamageTaken(), 8);
		assertEquals("Wrong attack boost", brujo.getAttackPoints(), 1);
		paladin.attackCard(healer);
		assertEquals("Wrong attack boost", healer.getAttackPoints(),5);
		assertEquals("Wrong damage taken", healer.getDamageTaken(), 4);
		paladin.attackCard(hunter);
		assertEquals("Wrong attack boost", hunter.getAttackPoints(), 4);
		assertEquals("Wrong damage taken", hunter.getDamageTaken(), 8);
		shaman.attackCard(hunter);
		assertEquals("Wrong attack boost", hunter.getAttackPoints(), 3);
		assertEquals("Wrong damage taken", hunter.getDamageTaken(), 9);
		mago.attackCard(brujo);
		assertEquals("Wrong damage taken", brujo.getDamageTaken(), 11);
		druida.attackCard(brujo);
		assertEquals("Wrong attack boost", brujo.getAttackPoints(), 4);
		assertEquals("Wrong damage taken", brujo.getDamageTaken(), 12);
	}
}