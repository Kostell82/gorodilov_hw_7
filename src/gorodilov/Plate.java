package gorodilov;

public class Plate {

    public int food ;
    public Plate ( int food )
    {
        this . food = food ;
    }

    public void decreaseFood ( int n ) {
        food -= n ;
    }

    public void addfood (int n){
        food +=n;
    }

    public void info () {
        System . out . println ( "В тарелке: " + food + " еды ");
    }
}
