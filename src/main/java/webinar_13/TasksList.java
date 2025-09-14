package webinar_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TasksList {
    public static void main(String[] args){

        List<Integer> list1  = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(3);
        list1.add(1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(33);
        list2.add(null);
        list2.add(21);
        list2.add(21);
        list2.add(88);
        list2.add(9);
        list2.add(33);

        System.out.println(removeElementsInList(list1,1));
        System.out.println(removeElementsInList(list2,33));
        System.out.println(quantityElementInList(list1,3));
        System.out.println(quantityElementInList(list2,21));

        Dog dog1 = new Dog("Bysa",4,6.3,false);
        Dog dog2 = new Dog("Mila",5,1.1,false);
        Dog dog3 = new Dog("Iris",6,8.7,false);
        Dog dog4 = new Dog("Tyzik",7,2.4,true);
        Dog dog5 = new Dog("Felix",8,0.6,true);
        List<Dog> dogs = new LinkedList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        System.out.println(dogs.isEmpty());
        System.out.println(dogs.get(3));
        System.out.println(dogs.contains(dog1));
        System.out.println(dogs.size());
        System.out.println(dogs.indexOf(dog4));
        System.out.println(takeDogsNames(dogs));

    }

    static List<Integer> removeElementsInList(List<Integer> list, int element){
        if (list ==null||list.isEmpty())
            return null;

        List<Integer>resultList = new ArrayList<>();
        for (Integer el : list){
            if (el !=null){
                if (el!= element)
                    resultList.add(el);
            }
        }
        return resultList;
    }

    static Integer quantityElementInList(List<Integer> list, int element) {
        if (list == null || list.isEmpty())
            return null;
        int result = 0;
        for (Integer el : list) {
            if (el != null) {
                if (el == element) {
                    result++;
                }
            }
        }
        return result;
    }

    static List<String> takeDogsNames(List<Dog> dogs){
        if (dogs == null|| dogs.isEmpty())
            return null;
        List<String> dogNames = new LinkedList<>();
        for (Dog dog : dogs){
            if (dog!= null){
                dogNames.add(dog.getName());
            }
        }
        return dogNames;
    }
//    add()	    Add an item to the list	                                                   boolean|void
//    addAll()	Add a collection of items to the list	                                   boolean
//    addFirst()	Adds an item to the beginning of the list	                                void
//    addLast()	Adds an item to the end of the list	                                        void
//    clear()	    Remove all items from the list	                                             void
//    clone()	    Create a copy of the LinkedList	                                            Object
//    contains()	Checks whether an item exist in the list	                                boolean
//    descendingIterator()	Returns an iterator to loop through the items of the list in reverse order
//    element()	Retrieves the first item in the list Similar to getFirst()
//    forEach()	Perform an action on every item in the list	                                void
//    get()	    Return the item at a specific position in the list	                            T
//    getFirst()	Returns the first item in the list	                                            T
//    getLast()	Returns the last item in the list	                                             T
//    indexOf()	Return the position of the first occurrence of an item in the list	            int
//    isEmpty()	Checks whether the list is empty	                                          boolean
//    iterator()	Return an Iterator object for the LinkedList	Iterator
//    lastIndexOf()	Return the position of the last occurrence of an item in the list	int
//    listIterator()	Return a ListIterator object for the LinkedList	ListIterator
//    offer()	        Adds an item at the end of the list
//    offerFirst()	Adds an item at the beginning of the list
//    offerLast()	    Adds an item at the end of the list
//    peek()	        Retrieves the first item in the list Similar to getFirst()
//    peekFirst()	    Retrieves the first item in the list. Similar to peek()
//    peekLast()	    Retrieves the last item in the list
//    poll()	        Retrieves and removes the first item in the list.
//    pollFirst()	    Retrieves and removes the first item in the list. Similar to poll()
//    pollLast()	    Retrieves and removes the last item in the list.
//    pop()	        Returns the first element in the list. Similar to removeFirst()
//    push()	        Adds an item to the beginning of the list. Similar to addFirst()
//    remove()	    Remove an item from the list	boolean|T
//    removeAll()	    Remove a collection of items from the list	boolean
//    removeFirst()	Removes the first item in the list	T
//    removeFirstOccurrence()	Removes the first occurrence of a specified item in the list
//    removeIf()	    Remove all items from the list which meet a specified condition	boolean
//    removeLast()	Removes the last item in the list	T
//    removeLastOccurrence()	Removes the last occurrence of a specified item in the list
//    replaceAll()	Replace each item in the list with the result of an operation on that item	void
//    retainAll()	    Remove all elements from the list which do not belong to a specified collection	boolean
//    set()	        Replace an item at a specified position in the list	T
//    size()	        Return the number of items in the list	int
//    sort()	        Sort the list	void
//    spliterator()	Return a Spliterator object for the LinkedList	Spliterator
//    subList()	    Return a sublist which provides access to a range of this list's items	List
//    toArray()	    Return an array containing the list's items	Object[]
}
