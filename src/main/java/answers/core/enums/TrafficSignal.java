package answers.core.enums;

/**
 * Пример конструктора в Java enum
 * Конструктор принимает один String аргумент
 */
public enum TrafficSignal{
    //сдесь вызовем enum конструктор с одним String аргументом
    RED("wait"), GREEN("go"), ORANGE("slow down");

    private String action;

    public String getAction(){
        return this.action;
    }

    // enum конструктор - не может быть public или protected
    TrafficSignal(String action){
        this.action = action;
    }
}