# PriorityQueue
Implement a priority queue capable of holding objects of an arbitrary type, T, by defining a PriorityQueue class that implements the queue with an ArrayList(s). A priority queue is a type of list where every item added to the queue also has an associated priority. Define priority in your application so that those items with the largest numerical value have the highest priority. Your class should support the following methods:

add(item, priority)—Adds a new item to the queue with the associated priority.

remove()—Returns the item with the highest priority and removes it from the queue. If the user attempts to remove from an empty queue, return null.

toString()—Returns a String representation of the priority queue.

For example, if q is a priority queue defined to take Strings:

```
q.add("X", 10);
q.add("Y", 1);
q.add("Z", 3);
System.out.println(q); // prints [ ["X",10], ["Y,1], ["Z",3] ]
System.out.println(q.remove()); // Returns X
System.out.println(q.remove()); // Returns Z
System.out.println(q.remove()); // Returns Y
```

Test your queue on data with priorities in various orders (e.g., ascending, descending, mixed). You can implement the priority queue by performing a linear search through the ArrayList. In future courses, you may study a data structure called a heap that is a more efficient way to implement a priority queue. For a further challenge, try to implement the priority queue using a heap data structure. 



Note: In the case of ties (priorities tied for the highest), remove the element that was the first one in the queue (First In First Out).


