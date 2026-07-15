class Solution {

    fun sortString(s: String): String {
        val freq = IntArray(26) // int array with all alphabet letters
        s.forEach { freq[it - 'a']++ }
        val ans = StringBuilder()
        for (i in 0..<26) {
            while (freq[i] > 0) {
                ans.append((i + 'a'.code).toChar());
                freq[i]--;
            }
        }
        return ans.toString()
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val dict = hashMapOf<String, Int>()
        val list = mutableListOf<MutableList<String>>()
        for (s in strs) {
            val key = sortString(s)
            if (dict.containsKey(key)) {
                val idx = dict[key] ?: -1
                list[idx]?.add(s)
            } else {
                list.add(list.size, mutableListOf(s))
                dict[key] = list.size - 1
            }
        }
        return list
    }
}
