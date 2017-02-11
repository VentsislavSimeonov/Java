package lesson21.flusher;

public interface Sink<T> {
	
	void flush(T t);
}
