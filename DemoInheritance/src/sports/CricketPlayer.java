package sports;
public class CricketPlayer extends Player {
private int totalRunsScored,totalWicketsTaken;
public CricketPlayer() {
	super();
}

public CricketPlayer(int totalRunsScored,int totalWicketsTaken,int playerId,double contractFees,String name,int day,int month,int year) {
	super(playerId,contractFees,name,day,month,year);
	this.totalRunsScored=totalRunsScored;
	this.totalWicketsTaken=totalWicketsTaken;
}

public String toString() {
	return " Total Run Scored: "+totalRunsScored+"Total Wicket Taken: "+totalWicketsTaken+super.toString();
}
}
