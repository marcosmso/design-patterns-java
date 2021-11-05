import java.util.ArrayList;

public class Forest {
  ArrayList<Tree> trees = new ArrayList<Tree>();

  void plantTree(int x, int y, String name, String color, String texture) {
    TreeType type = TreeFactory.getTreeType(name, color, texture); 
    Tree tree = new Tree(x, y, type);
    trees.add(tree);
  }

  void draw(){
    for (Tree t: trees)
      t.draw();
  }

  public static void main(String[] args){
  
    Forest forest = new Forest();
    forest.plantTree(0,0,"Cabreuva", "verde", "lisa");
    forest.plantTree(0,1,"Cabreuva", "verde", "lisa");
    forest.plantTree(1,1,"Cabreuva", "verde", "lisa");
    forest.plantTree(2,0,"Cupuacu", "verde", "lisa");
    forest.plantTree(2,1,"Cupuacu", "verde", "lisa");
    forest.plantTree(2,1,"Cupuacu", "verde", "lisa");
    forest.draw();

  } 
  
}
