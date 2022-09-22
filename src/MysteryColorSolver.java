import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

interface MysteryColorAnalyzer{
    int numberOfDistinctColors(List<Color> mysteryColors);
    int colorOccurrence(List<Color> mysteryColors, Color color);
}

enum Color {
    RED, GREEN, BlUE
}

class MysteryColorFinder implements MysteryColorAnalyzer{
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {

        HashSet<Color> mysterycolorsHash=new HashSet<>(mysteryColors);
        return (mysterycolorsHash.size());
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int countOccurrence=0;
        for(Color c:mysteryColors){
            if(c.equals(color))
                countOccurrence++;
        }
        return countOccurrence;
    }
}

public class MysteryColorSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Color> mysteryColors = new ArrayList<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String givenColor=sc.next();
            if(givenColor.equals("RED"))
                mysteryColors.add(Color.RED);
            else if (givenColor.equals("BLUE"))
                mysteryColors.add(Color.BlUE);
            else
                mysteryColors.add(Color.GREEN);
        }
        MysteryColorFinder newColorFinder = new MysteryColorFinder();
        System.out.println("Distinct colors: "+newColorFinder.numberOfDistinctColors(mysteryColors));
        System.out.println("RED: "+newColorFinder.colorOccurrence(mysteryColors, Color.RED));
        System.out.println("BLUE: "+newColorFinder.colorOccurrence(mysteryColors, Color.BlUE));
        System.out.println("GREEN: "+newColorFinder.colorOccurrence(mysteryColors, Color.GREEN));
    }
}
