import java.util.ArrayList;

public class TreeFactory {

  static ArrayList <TreeType> treeTypes = new ArrayList<TreeType>();
  
  static TreeType getTreeType(String name, String color, String texture) {
    for (TreeType t: treeTypes){
      if (t.name == name && t.color == color && t.texture == texture){
        return t;
      }
    }
    TreeType newTreeType = new TreeType(name, color, texture);
    treeTypes.add(newTreeType);
    return newTreeType;
  }

}
