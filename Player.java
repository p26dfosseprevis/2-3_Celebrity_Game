class Player {
    public int myPoints = 0;
    public String myName;
    
    public Player(String name)
    {
        myName = name;
    }
    public String getName(){return myName;}
    public int getPoints(){
        return myPoints;
    }
    public void win(){
        myPoints++;
    }
    public void reset(){
        myPoints = 0;
    }

    public boolean equals(Player p2){
        return myName.equals(p2.getName());
    }
}

