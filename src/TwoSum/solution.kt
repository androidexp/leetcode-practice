package TwoSum

/*
### Source : https://leetcode.com/problems/two-sum/
### Author : Aider Mevlut
### Date   : 2024-12-23

# Difficulty : Easy
# Topics : [Array, Hash Table]

#   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
#   You may assume that each input would have exactly one solution, and you may not use the same element twice.
#   You can return the answer in any order.

#   For example:
#   Input: nums = [2,7,11,15], target = 9
#   Output: [0,1]
#   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numMap = mutableMapOf<Int, Int>()

    for ((index, num) in nums.withIndex()) {
        val complement = target - num

        if (numMap.containsKey(complement)) {
            return intArrayOf(numMap[complement]!!, index)
        }

        numMap[num] = index
    }
    return intArrayOf()
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
}

