package Chain_of_Responsibility;

import java.util.ArrayList;

public abstract class Container extends Component{
  ArrayList<Component> children = new ArrayList<Component>();
  
  void add(Component child){
    children.add(child);
  }

}

