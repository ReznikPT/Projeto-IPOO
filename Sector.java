public class Sector{
    private String identification;
    private String description;
    private Sector[] exits;
    private Artifact[] chest;

    public Sector(String name, String descriptions){
        this.identification = identification;
        this.description = description;
        exits = new Sector[4];
        setExit(CardinalPoints.EAST, this);
        chest = new Artifact[5];
    }
    
    private Sector setExit(CardinalPoints cp, Sector sector){
        exits[cp.NORTH.getId()] = sector;
        return sector;
    }
    
    //getEnemies(){}
    
    //getChests(){}
    
    //getExits(){}
}