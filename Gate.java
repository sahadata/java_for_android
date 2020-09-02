package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here

    public static final int IN  = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate(){
        mSwing = CLOSED;
    }

    public boolean setSwing(int direction){
        if(direction==1||direction==0||direction==-1){
            mSwing = direction;
           return true;
        }
        else
            return false;
         }

    public boolean open(int direction){
        if(direction==1||direction== -1){
            return setSwing(direction);
        }
        else return false;

    }
    public void  close(){ mSwing = CLOSED; }

    public int getSwingDirection(){ return mSwing;}

    public int thru(int count){
        int temp =0;
        if(mSwing==1) return temp+=count;
        else if (mSwing==-1) return temp-=count;
        else return 0;
    }

    public String toString(){
        if(mSwing==CLOSED)  return "This gate is closed";
        else if(mSwing==IN) return
                "This gate is open and swings to enter the pen only";
        else if (mSwing==OUT) return
        "This gate is open and swings to exit the pen only";
        else return "This gate has an invalid swing direction";
    }



}
