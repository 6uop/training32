package training.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    private String text ;
    protected List<Component> components = new ArrayList<Component>();

    protected Component(String text){
        this.text = text ;
    }

    public void print(){
        this.printSelf();
        for(Component component: components){
            component.print();
        }
    }

    protected void printSelf(){
        System.out.println("Print "+ this.getClass().getSimpleName() +"("+this.text+")");
    }

    public Component addComponent(Component component){
        this.components.add(component);
        return this ;
    }


}
