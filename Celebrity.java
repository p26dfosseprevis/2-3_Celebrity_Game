class Celebrity{
    public String myHint;
    public String myName;
    
    public Celebrity(String name,String hint){
        myHint = hint;
        myName = name;
    }
    public String getName() {return myName;}
    public String getHint() {return myHint;}
    
    public boolean guess(String guess){
        return myName.toLowerCase().equals(guess.toLowerCase());
    }
    public String toString(){
        return "Q: " + myHint + "\nA: " + myName; 
    }
}

