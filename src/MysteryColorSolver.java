import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface MysteryColorAnalyzer{
    public int numberOfDistinctColors(List<Color> mysteryColors);
    public int colorOccurence(List<Color> mysteryColors, Color color);
}

enum Color {
    RED, GREEN, BlUE
}

class MysteryColorFinder implements MysteryColorAnalyzer{
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        boolean R=false, G=false, B=false;
        for (Color c: mysteryColors){
            if (c.equals(Color.RED))
                R=true;
            else if (c.equals(Color.GREEN))
                G=true;
            else if (c.equals(Color.BlUE))
                B=true;
        }
        int distinctColors=0;
        if (R)
            distinctColors++;
        if (G)
            distinctColors++;
        if (B)
            distinctColors++;
        return distinctColors;
    }

    @Override
    public int colorOccurence(List<Color> mysteryColors, Color color) {
        int countOccurence=0;
        for(Color c:mysteryColors){
            if(c.equals(color))
                countOccurence++;
        }
        return countOccurence;
    }
}

public class MysteryColorSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Color> mysteryColors = new ArrayList<Color>();
        Color c;
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
        System.out.println(newColorFinder.numberOfDistinctColors(mysteryColors));
        System.out.println(newColorFinder.colorOccurence(mysteryColors, Color.RED));
        System.out.println(newColorFinder.colorOccurence(mysteryColors, Color.BlUE));
        System.out.println(newColorFinder.colorOccurence(mysteryColors, Color.GREEN));
    }
}
