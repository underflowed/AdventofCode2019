import java.util.ArrayList;
import java.util.List;

public class GridPoints {
    public int x;
    public int y;
    public List<Integer> xStored = new ArrayList<>();
    public List<Integer> yStored = new ArrayList<>();
    GridPoints(int xcoord, int ycoord) {
        x = xcoord;
        y = ycoord;    
    }
    public void StoreCoords(int newX, int newY) {
        xStored.add(newX);
        yStored.add(newY);
    }

}