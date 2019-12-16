import java.util.Random;

public class Generator{
    private int randomValue;
    private int min;
    private int max;
    private ArtifactType artifactType;
    
    public Generator(){
        min = 0;
        max = 0;
        randomValue = 0;
    }
    
    public int randomAttPoints(){
        min = artifactType.getMinAttPoints();
        max = artifactType.getMaxAttPoints();
        Random randomValue = new Random();
        return randomValue.nextInt(((max - min) + 1) + min);
    }
    
    public int randomDefPoints(){
        min = artifactType.getMinDefPoints();
        max = artifactType.getMaxDefPoints();
        Random randomValue = new Random();
        return randomValue.nextInt(((max - min) + 1) + min);
    }
    
    public int randomExp(){
        min = artifactType.getMinExp();
        max = artifactType.getMaxExp();
        Random randomValue = new Random();
        return randomValue.nextInt(((max - min) + 1) + min);
    }
}