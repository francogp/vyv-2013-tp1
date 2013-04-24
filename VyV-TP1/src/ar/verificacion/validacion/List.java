package ar.verificacion.validacion;

public interface List {

    public boolean isEmpty();

    public int size();

    public void removeAll();

    public void add(int index, Object item) throws RuntimeException, IndexOutOfBoundsException;

    public void remove(int index) throws IndexOutOfBoundsException;

    public Object get(int index) throws IndexOutOfBoundsException;
    
}
