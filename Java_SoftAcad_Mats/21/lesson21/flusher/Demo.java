package lesson21.flusher;

import java.util.Collection;

public class Demo {
	public static void main(String[] args) {
		Sink<Object> s = null;
		Collection<String> cs = null;

//		String str1 = writeAll1(cs, s);
//		String str2 = writeAll2(cs, s);
		String str3 = writeAll3(cs, s);
	}
	
	
//	public static <T> T writeAll1(Collection<T> coll, Sink<T> snk) {
//	    T last = null;
//	    T t = new T();
//	    T[] arr = new T[3];
//	    for (T t : coll) {
//	        last = t;
//	        snk.flush(last);
//	    }
//	    return last;
//	}
	
	public static <T> T writeAll2(Collection<? extends T> coll, Sink<T> snk) {
	    T last = null;
	    for (T t : coll) {
	        last = t;
	        snk.flush(last);
	    }
	    return last;
	}
	

	public static <T> T writeAll3(Collection<T> coll, Sink<? super T> snk) {
	    T last = null;
	    for (T t : coll) {
	        last = t;
	        snk.flush(last);
	    }
	    return last;
	}
	
}
