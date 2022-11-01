// TODO: add any imports here

/**
 * Write a description of class PriorityQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class PriorityQueue<T>
{
    // TODO: declare your instance variables here
    
    public PriorityQueue(){     
        // TODO: initialize your instance variables here
        
    }
    
    
    public void add(T item, int priority){
       // TODO
    }
    
    public T remove(){
        // TODO
        return null;  // delete this line of code
    }

    public String toString(){
        // TODO
        return null; // delete this line of code
    }
    
    /*
     * Some test code.
     */
    public static void main(String[] args){
        /*
        your output should look like this:
        
        [ [X,4], [Z,7], [Y,10], [Y,10], [Z,7] ]
        [ [X,4], [Z,7], [Y,10], [Z,7] ]
        [ [X,4], [Z,7], [Z,7] ]
        [ [X,4], [Z,7] ]
        [ [X,4], [Z,7], [A,5], [B,8] ]
        [ [X,4], [Z,7], [A,5] ]
        [ [X,4], [A,5] ]
        
        */
    
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("X", 4);
        queue.add("Z", 7);
        queue.add("Y", 10);
        queue.add("Y", 10);
        queue.add("Z", 7);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add("A", 5);
        queue.add("B", 8);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    
    }


}
