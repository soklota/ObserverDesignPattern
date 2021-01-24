public class RoundScoreDisplay implements Observer{



private Subject golfer;
private int strokesTotal;
private int parTotal;
/**
 * display round scores 
 * adds scores of each hole
 */

public RoundScoreDisplay(Subject golfer){

    this.golfer = golfer;
    golfer.registerObserver(this);

}

public void update(int strokes, int par){
    strokesTotal += strokes;
    parTotal += par;
    displayRoundScore();

}

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