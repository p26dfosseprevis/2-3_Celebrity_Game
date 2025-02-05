class Player {
    public int myPoints = 0;
    public String myName;
    
    public Player(String name)
    {
        myName = name;
    }
    
    public void win(){
        myPoints++;
    }
    public void reset(){
        myPoints = 0;
    }
}

