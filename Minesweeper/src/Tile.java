public class Tile {

    //Attributes

    boolean isMine;
    boolean isFlag;

    boolean isGuessed;

    int mineCounter;

    //Constructor
    public Tile() {
        isMine = false;
        isFlag = false;
        isGuessed = false;

    }

    //Methods

    public boolean getMineStatus(){
        return isMine;
    }

    public boolean getFlagStatus(){
        return isFlag;
    }

    public boolean getGuessStatus(){
        return isFlag;
    }

    public void setMine(){
        this.isMine = true;
    }

    public void setFlag(){
        this.isFlag = !this.isFlag;
    }


    public void setGuessed(){ this.isGuessed = true;}

    public int getMineCounter(){
        return mineCounter;
    }

    public void setMineCounter(int mineCounter) {
        this.mineCounter = mineCounter;
    }
}
