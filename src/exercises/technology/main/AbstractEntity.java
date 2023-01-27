package exercises.technology.main;

abstract class AbstractEntity {
    private static int nextId = 1;
    private int id;

    public AbstractEntity() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }
}
