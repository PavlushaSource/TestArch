open class BinarySearchTree<K: Comparable<K>>() {
    private var left: BinarySearchTree<K>? = null
    private var right: BinarySearchTree<K>? = null
    private var parent: BinarySearchTree<K>? = null
    protected open var key: K? = null
    protected open var value: Any? = null
}
