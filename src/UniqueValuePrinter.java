import java.util.ArrayList;
import java.util.Scanner;

public class UniqueValuePrinter {

    public static ArrayList<ArrayList<Character>> RemoveDuplicateOverOther(ArrayList<ArrayList<Character>> table){
        for (int MainTableIndex=0;MainTableIndex<table.size();MainTableIndex++){
            for (int MainTableIndexNext=MainTableIndex+1;MainTableIndexNext< table.size();MainTableIndexNext++){
                for (int FirstRowList=0;FirstRowList<table.get(MainTableIndex).size();FirstRowList++){
                    for (int NextRowList=0;NextRowList<table.get(MainTableIndexNext).size();NextRowList++){
                        if(table.get(MainTableIndex).get(FirstRowList)==table.get(MainTableIndexNext).get(NextRowList)){
                            table.get(MainTableIndex).remove(MainTableIndex);
                        }
                    }
                }
            }
        }
        return table;
    }

    public static ArrayList<ArrayList<Character>> RemoveDuplicateOverSelf(ArrayList<ArrayList<Character>> table){
        for (int MainTableIndex=0;MainTableIndex<table.size();MainTableIndex++){
            for (int SubTableIndex=0;SubTableIndex< table.get(MainTableIndex).size();SubTableIndex++){
                for (int SubTableIndexNext=SubTableIndex+1;SubTableIndexNext<table.get(MainTableIndex).size();SubTableIndexNext++){
                    if(table.get(MainTableIndex).get(SubTableIndex)==table.get(MainTableIndex).get(SubTableIndexNext)){
                        table.get(MainTableIndex).remove(SubTableIndexNext);
                    }
                }
            }
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Character>> table=new ArrayList<ArrayList<Character>>();
        int n=sc.nextInt();
        String[] line=new String[n];
        for (int i=0;i<n;){
            line[i] =sc.next();
            ArrayList<Character> temp=new ArrayList<>();
            for (int j=0;j<line[i].length();j++) {
                temp.add(line[i].charAt(j));
            }
            table.add(i,temp);
            i++;
        }
        System.out.println(table);
        table=RemoveDuplicateOverSelf(table);
        table=RemoveDuplicateOverOther(table);
        System.out.println(table);
    }
}
