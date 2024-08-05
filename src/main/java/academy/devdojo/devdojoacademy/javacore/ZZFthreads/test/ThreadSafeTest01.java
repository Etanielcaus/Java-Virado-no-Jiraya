package academy.devdojo.devdojoacademy.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
//    private final List<String> names = Collections.synchronizedList(new ArrayList<String>());
    private final List<String> names = new ArrayList<String>();

    public synchronized void add (String name){
        names.add(name);
    }

    public synchronized void removeFirstName(){
        if (!names.isEmpty()){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
//        Method Safe é que os metodos dela são synchronized
//        StringBuffer

        ThreadSafeNames names = new ThreadSafeNames();
        names.add("Joao");
        Runnable r = names::removeFirstName;
        new Thread(r).start();
        new Thread(r).start();
    }
}
