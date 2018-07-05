package ru.sbrf.collectionProfi;

/**
 * Created by sbt-panichev-sl on 04.07.2018.
 */
public interface List extends Collection {
    void add(int index, Object item);

    void set(int index, Object item);

    Object get(int index);

    int indexOf(Object item);

    int lastIndexOf(Object item);

    void remove(int index);

    List subList(int from, int to);

}
