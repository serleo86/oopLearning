package ru.sbrf.collectionProfi;

/**
 * Created by sbt-panichev-sl on 04.07.2018.
 */
public interface Collection {
    int size();
    
    boolean isEmpty();

    boolean contains (Object item);

    boolean add(Object item);

    boolean remove(Object item);

    void clear();
}
