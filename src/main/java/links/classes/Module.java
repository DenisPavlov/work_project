package links.classes;

public interface Module {
    public static final int EXIT_SUCCES = 0;
    public static final int EXIT_FAILURE = 1;

    void load();
    int run();
    void unload();
}
