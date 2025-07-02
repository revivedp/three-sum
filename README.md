# three-sum
A Java solution to the _Three-Sum Problem_.

Time Complexity: O(n²)

_THREE-SUM PROBLEM_

Given an array of integers, find all unique triplets (a, b, c) in the array such that results in: 

__a + b + c = 0__ 

Each triplet must be unique and the worst-case scenario must run in O(n²) time complexity.

SOLUTION:

Create a main loop (starting at index 0) that iterates up to the _third-to-last element_. For each iteration, define two pointers: left (the element right after the current one) and right (the last element in the array). Use these pointers to find pairs that, together with the current element, sum up to zero.
  


