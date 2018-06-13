package gorodilov;

public class Cat {

    private String name ;
    public int appetite ;
    public boolean richness;

    public Cat ( String name , int appetite, boolean richness ) {
        this . name = name ;
        this . appetite = appetite ;
        this . richness = richness;
    }




    public void eat (Plate p )
    {
        p . decreaseFood (appetite);
    }



}
