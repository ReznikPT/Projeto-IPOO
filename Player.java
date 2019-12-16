public class Player{
    private String nickName;
    private Sector sector;
    private int attPoints;
    private int defPoints;
    private int exp;
    private Artifact[] bag;
    //private Sector currentSector;

    public Player(){
        nickName = "";
        //sector = new Sector();
        attPoints = 100;
        defPoints = 100;
        exp = 0;
        bag = new Artifact[50];
    }

    /*
    public void saveArtifact(){
    //Tirar da Bag um Artefacto e guardar no Chest
    }
    
    public void takeArtifact(){
    //Tirar um Artefacto do Chest e guardar na Bag
    }
    
    public void useArtifact(String artifact){
    //Utilizar um artefacto
    }
    */
   
    
}