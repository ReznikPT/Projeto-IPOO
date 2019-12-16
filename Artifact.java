public class Artifact{
    private String name;
    private ArtifactType type;
    private int attPoints;
    private int defPoints;
    private int weight;
    private int coins;
    private int exp;
    private Generator generator;
    
    public Artifact(String name, ArtifactType type){ 
        this.name = type.getName();
        this.type = type;
        attPoints = generator.randomAttPoints();
        defPoints = generator.randomDefPoints();
        weight = type.getWeight();
        coins = type.getCoins();
        exp = generator.randomExp();
    }
}