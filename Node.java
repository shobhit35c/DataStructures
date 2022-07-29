
class Node<E> {

    public E e;
    public Node<E> n;

    Node(E it, Node<E> in) {
        e = it;
        in = n;
    }

    Node(Node<E> next) {
        n = next;
        e = null;
    }

    /*
     * Returns element value of Node
     */
    E element() {
        return e;
    }

    /*
     * Sets an object value for specific Node
     */
    E setElement(E set) {
        return e = set;
    }

    /*
     * Pointer to the next node object
     */
    Node<E> next() {
        return n;
    }

    /*
     * Sets the next value of node
     */
    Node<E> setNext(Node<E> next) {
        return n = next;
    }

}
