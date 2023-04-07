class RedBlackTree<K: Comparable<K>>() : BinarySearchTree<K>(), balancer {
    override var key: K? = null
    override var value: Any? = null
    override var left: RedBlackTree<K>? = null
    override var right: RedBlackTree<K>? = null
    override var parent: RedBlackTree<K>? = null

    enum class Color {
        RED, BLACK
    }
    var color : Color = Color.BLACK

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