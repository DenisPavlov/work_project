package answers.core.abstract_class;

public interface TableModel {

    void draw();

    default void drawString(){
        System.out.println("draw, draw");
    }
}
