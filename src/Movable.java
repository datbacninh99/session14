@FunctionalInterface // kiểm tra xem có phải là 1 functional interface không
public interface Movable {
    void move();
//    void run();

    default void display() {
    };
}