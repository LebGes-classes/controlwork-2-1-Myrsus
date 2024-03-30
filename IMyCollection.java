public interface IMyCollection<E> {
    boolean add(E e); // добавление элемента в коллекцию
    void clear(); // очистка коллекции
    boolean isEmpty(); // проверка коллекции на пустоту
    boolean remove(E e); // удаление элемента из коллекции

    E get(int index);

    int size(); // получение размера коллекции
}