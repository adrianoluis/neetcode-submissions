class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        for (i in arr.indices.reversed()) {
            val curr = arr[i]
            arr[i] = max
            if (curr > max) {
                max = curr
            }
        }
        return arr
    }
}
