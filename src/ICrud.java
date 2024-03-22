public interface ICrud {
    void getAll();

    void add();

    void edit();

    void delete();

    default void search() {
        System.out.println("Tim kiếm");
    };

    static void displayName() {
    };
}