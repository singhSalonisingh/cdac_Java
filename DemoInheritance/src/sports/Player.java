package sports;

import utility.Person;

public class Player extends Person{
private int playerId;
private double contractFees;

public Player() {
	super();
}

public Player(int playerId,double contractFees,String name,int day,int month,int year) {
	super(name,day,month,year);
	this.playerId=playerId;
	this.contractFees=contractFees;
}

public String toString() {
	return " Player Id: "+playerId+" Contract Fees: "+contractFees+super.display();
}
}
