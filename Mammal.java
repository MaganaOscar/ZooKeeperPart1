package com.codingdojo.ZooKeeperPart1;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println("" + energyLevel);
		return energyLevel;
	}
}
