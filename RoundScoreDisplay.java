// Author: Sydney Oklota
public class RoundScoreDisplay implements Observer{

private Subject golfer;
private int strokesTotal;
private int parTotal;

/**
 * calls for golfer in array list to show their score
 * @param golfer new observer
 */
public RoundScoreDisplay(Subject golfer){

    this.golfer = golfer;
    golfer.registerObserver(this);

}

/**
 * updates score for the round in order to be displayed
 * @param strokes number of strokes
 * @param par number of pars
 */
public void update(int strokes, int par){
    strokesTotal += strokes;
    parTotal += par;
    displayRoundScore();

}


/**
 * displays updated score for each round
 */
private void displayRoundScore(){
    
    System.out.println("Current Round Stats");
    System.out.println("Par: "+parTotal);
    System.out.println("Strokes: "+strokesTotal);
    
    if(strokesTotal > parTotal){
        int diff = strokesTotal - parTotal;
        System.out.println(diff+" over par");
    }
    else if(strokesTotal == parTotal){
        System.out.println("made par");
    }
    else{
        int diff = parTotal - strokesTotal;
        System.out.println(diff+" under par");
    }
}









}