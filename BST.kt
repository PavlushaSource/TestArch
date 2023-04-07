open class BinarySearchTree<K: Comparable<K>>() {
    protected open var left: BinarySearchTree<K>? = null
    protected open var right: BinarySearchTree<K>? = null
    protected open var parent: BinarySearchTree<K>? = null
    protected open var key: K? = null
    protected open var value: Any? = null
}
