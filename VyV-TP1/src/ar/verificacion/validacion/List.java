package ar.verificacion.validacion;

public interface List {
    
    public void add(int index, Object item) throws RuntimeException,
            IndexOutOfBoundsException;
    
    public Object get(int index) throws IndexOutOfBoundsException;
    
    public boolean isEmpty();
    
    public void remove(int index) throws IndexOutOfBoundsException;
    
    public void removeAll();
    
    public int size();
    
}
