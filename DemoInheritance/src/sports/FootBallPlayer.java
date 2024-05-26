package sports;

public class FootBallPlayer extends Player {
private int totalGoalsScored;

public FootBallPlayer() {
	super();
}

public FootBallPlayer(int totalGoalsScored, int playerId,double contractFees,String name,int day,int month,int year) {
	super(playerId, contractFees,name,day,month,year);
	this.totalGoalsScored=totalGoalsScored;
}

public String toString() {
	return " Total Goals Scored: "+totalGoalsScored+super.toString();
}
}
