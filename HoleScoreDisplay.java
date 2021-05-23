public class HoleScoreDisplay implements Observer {


    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * calls for golfer in array list in order to calculate their score
     * @param golfer golfer
     */

    public HoleScoreDisplay(Subject golfer){
       
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * updates scores in order to be displayed
     * @param strokes number of strokes
     * @param par number of pars
     */
    public void update(int strokes, int par){
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * displays updated score of current hole
     */
    private void displayCurrentScore(){
        
        System.out.println("Current Hole Stats");
        System.out.println("Par: "+par);
        System.out.println("Strokes: "+strokes);
        
        if(strokes > par){
            int diff = strokes - par;
            System.out.println(diff+" over par");
        }
        else if(strokes == par){
            System.out.println("made par");
        }
        else{
            int diff = par - strokes;
            System.out.println(diff+" under par");
        }
    }





}
