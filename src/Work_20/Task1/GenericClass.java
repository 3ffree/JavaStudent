package Work_20.Task1;

import java.io.Serializable;

public class GenericClass <T extends Comparable<String> , V extends Animal & Serializable, K > {
    T data;
    V value;
    K key;

    public GenericClass(T data, V value, K key) {
        this.data = data;
        this.value = value;
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
