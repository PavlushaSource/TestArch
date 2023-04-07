class avlTree<K: Comparable<K>>() : BinarySearchTree<K>(), balancer {
    override var key: K? = null
    override var value: Any? = null
    override var left: avlTree<K>? = null
    override var right: avlTree<K>? = null
    override var parent: avlTree<K>? = null
    private var height: Int = 1

    override fun balance() {
        TODO("Not yet implemented")
    }

    override fun rightRotate() {
        TODO("Not yet implemented")
    }

    override fun leftRotate() {
        TODO("Not yet implemented")
    }

}