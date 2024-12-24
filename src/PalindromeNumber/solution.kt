package PalindromeNumber

/*
### Source : https://leetcode.com/problems/palindrome-number
### Author : Aider Mevlut
### Date   : 2024-12-24

# Difficulty : Easy
# Topics : [Math]

#   Given an integer x, return true if x is a palindrome, and false otherwise.

#   For example:
#   Input: x = 121
#   Output: true
#   Explanation: 121 reads as 121 from left to right and from right to left.
*/

fun isPalindrome(x: Int): Boolean {
    val xString = x.toString()
    val xRevers = xString.reversed()

    return xString == xRevers
}

fun main(){
    println(isPalindrome(121))
}