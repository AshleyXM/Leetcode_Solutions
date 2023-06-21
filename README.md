# LeetCode_Solutions
Record my solutions to LeetCode problems

***Note:** The solutions are not necessarily optimal.*

***Note:*** The cost information in each problem is for reference only, since I found that even if it was submitted with exactly the same code at different times, the time efficiency and memory efficiency will vary a lot.

# Statistics

| Problem ID  | Problem Description | My Solution | Difficulty | Problem Type | Accepted Date | Note |
| ------------------------------------------- | ---- | ---------- | ---- | ---- | ---- | ---- |
| [0001](https://leetcode.com/problems/two-sum/) | [Two Sum](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0001/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0001/Solution.java) | Easy | Array, Hash Table | 5/23/2023 |  |
| [0002](https://leetcode.com/problems/add-two-numbers/) | [Add Two Numbers](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0002/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0002/Solution.java) | Medium | Linked List, Math, Recursion | 6/15/2023 | I made a mistake in this problem which cost me a long time to fix it: Changing the pointer of the next node DOES NOT mean having changed the next pointer of the current node. In detail, we have to use "node.next = newNode"; however, "node = node.next; node = newNode" will not work.<br />The solution 2 is really ingenious and its logic is really easy to understand. |
| [0003](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | [Longest Substring Without Repeating Characters](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0003/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0003/Solution.java) | Medium | String, Hash Table, Sliding Window | 5/23/2023 |  |
| [0007](https://leetcode.com/problems/reverse-integer/) | [Reverse Integer](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0007/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0007/Solution.java) | Medium | Math | 6/15/2023 | The idea of reversing a problem is really important. E.g. "rvs <= (Integer.MAX_VALUE - remainder) / 10" is equivalent to "rvs * 10 + remainder <= Integer.MAX_VALUE" (but the latter one will not work). |
| [0008](https://leetcode.com/problems/string-to-integer-atoi/) | [String to Integer (atoi)](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0008/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0008/Solution.java) | Medium | String | 6/15/2023 |  |
| [0009](https://leetcode.com/problems/palindrome-number/) | [Palindrome Number](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0009/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0009/Solution.java) | Easy | Math | 5/27/2023 |  |
| [0011](https://leetcode.com/problems/container-with-most-water/) | [Container With Most Water](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0011/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0011/Solution.java) | Medium | Array, Two Pointers, Greedy | 6/16/2023 | The reason why to move the pointer which points to smaller height is important. |
| [0013](https://leetcode.com/problems/roman-to-integer/) | [Roman to Integer](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0013/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0013/Solution.java) | Easy | String, Math, Hash Table | 5/25/2023 |  |
| [0015](https://leetcode.com/problems/3sum/) | [3Sum](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0015/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0015/Solution.java) | Medium | Array, Two Pointers, Sorting | 6/15/2023 | DO NOT use triple-nested loops (the brute-force attack), otherwise you will encounter runtime error. |
| [0020](https://leetcode.com/problems/valid-parentheses/) | [Valid Parentheses](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0020/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0020/Solution.java) | Easy | String, Stack | 5/26/2023 |  |
| [0021](https://leetcode.com/problems/merge-two-sorted-lists/) | [Merge Two Sorted Lists](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0021/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0021/Solution.java) | Easy | Linked List, Recursion | 6/13/2023 | It challenged me for a while on my flight to Seattle. But I had so much fun solving this problem and I learnt a lot. Worth a try! |
| [0026](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [Remove Duplicates from Sorted Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0026/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0026/Solution.java) | Easy | Array, Two Pointers | 6/12/2023 | |
| [0027](https://leetcode.com/problems/remove-element/) | [Remove Element](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0027/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0027/Solution.java) | Easy | Array, Two Pointers | 6/12/2023 | |
| [0028](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | [Find the Index of the First Occurrence in a String](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0028/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0028/Solution.java) | Easy | String, String Matching, Two Pointers | 5/27/2023 |  |
| [0033](https://leetcode.com/problems/search-in-rotated-sorted-array/) | [Search in Rotated Sorted Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0033/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0033/Solution.java) | Medium | Array, Binary Search | 6/18/2023 | |
| [0034](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | [Find First and Last Position of Element in Sorted Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0034/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0034/Solution.java) | Medium | Array, Binary Search | 6/21/2023 | |
| [0035](https://leetcode.com/problems/search-insert-position/) | [Search Insert Position](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0035/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0035/Solution.java) | Easy | Array, Binary Search | 5/27/2023 |  |
| [0036](https://leetcode.com/problems/valid-sudoku/) | [Valid Sudoku](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0036/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0036/Solution.java) | Medium | Array, Hash Table, Matrix | 6/21/2023 | The solution 2 which utilizes HashSet structure is really subtle. |
| [0053](https://leetcode.com/problems/maximum-subarray/) | [Maximum Subarray](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0053/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0053/Solution.java) | Medium | Array, Divide and Conquer, Dynamic Programming | 6/18/2023 | |
| [0057](https://leetcode.com/problems/insert-interval/) | [Insert Interval](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0057/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0057/Solution.java) | Medium | Array | 6/19/2023 | A little bit tricky! The key idea of my solution is to discuss the start point and end point of the new interval separately. |
| [0058](https://leetcode.com/problems/length-of-last-word/) | [Length of Last Word](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0058/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0058/Solution.java) | Easy | String | 5/27/2023 |  |
| [0066](https://leetcode.com/problems/plus-one/) | [Plus One](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0066/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0066/Solution.java) | Easy | Array, Math | 6/8/2023 | |
| [0067](https://leetcode.com/problems/add-binary/) | [Add Binary](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0067/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0067/Solution.java) | Easy | String, Math, Bit Manipulation | 5/27/2023 |  |
| [0069](https://leetcode.com/problems/sqrtx/) | [Sqrt(x)](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0069/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0069/Solution.java) | Easy | Math, Binary Search | 5/28/2023 | Similar to [0035](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0035/Problem.md). |
| [0070](https://leetcode.com/problems/climbing-stairs/) | [Climbing Stairs](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0070/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0070/Solution.java) | Easy | Math, Dynamic Programming, Memoization | 5/28/2023 |  |
| [0074](https://leetcode.com/problems/search-a-2d-matrix/) | [Search a 2D Matrix](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0074/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0074/Solution.java) | Medium | Array, Binary Search, Matrix | 6/18/2023 | The solution 2 is really easy to understand and ingenious. |
| [0083](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [Remove Duplicates from Sorted List](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0083/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0083/Solution.java) | Easy | Linked List | 6/14/2023 | |
| [0088](https://leetcode.com/problems/merge-sorted-array/) | [Merge Sorted Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0088/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0088/Solution.java) | Easy | Array, Two Pointers, Sorting | 5/29/2023 | |
| [0090](https://leetcode.com/problems/subsets-ii/) | [Subsets II](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0090/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0090/Solution.java) | Medium | Array, Backtracking, Bit Manipulation | 6/21/2023 | The statement of this problem is unclear since the number of the examples is too small to clarify it. |
| [0094](https://leetcode.com/problems/binary-tree-inorder-traversal/) | [Binary Tree Inorder Traversal](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0094/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0094/Solution.java) | Easy | Stack, Tree, Depth-First Search, Binary Tree | 6/5/2023 | Typical knowledge point and frequently be tested in interviews. (DFS in Tree) |
| [0100](https://leetcode.com/problems/same-tree/) | [Same Tree](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0100/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0100/Solution.java) | Easy | Tree, Depth-First Search, Breadth-First Search, Binary Tree | 6/14/2023 | An easy but interesting recursive tree-related problem. |
| [0101](https://leetcode.com/problems/symmetric-tree/) | [Symmetric Tree](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0101/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0101/Solution.java) | Easy | Tree, Depth-First Search, Breadth-First Search, Binary Tree | 6/6/2023 | Tree-related. Quite interesting. |
| [0104](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | [Maximum Depth of Binary Tree](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0104/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0104/Solution.java) | Easy | Tree, Depth-First Search, Breadth-First Search, Binary Tree | 6/9/2023 |  |
| [0110](https://leetcode.com/problems/balanced-binary-tree/) | [Balanced Binary Tree](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0110/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0110/Solution.java) | Easy | Tree, Depth-First Search, Binary Tree | 6/6/2023 | Tree-related. The solution 2 is really ingenious. The method to get the depth of a tree node is fantastic! |
| [0112](https://leetcode.com/problems/path-sum/) | [Path Sum](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0112/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0112/Solution.java) | Easy | Tree, Depth-First Search, Breadth-First Search, Binary Tree | 6/20/2023 |  |
| [0113](https://leetcode.com/problems/path-sum-ii/) | [Path Sum II](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0113/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0113/Solution.java) | Medium | Backtracking, Tree, Depth-First Search, Binary Tree | 6/20/2023 | The variant of [0112](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0112/Problem.md). One tricky point of this problem is that, once we update the value of a list, the original reference will update at the same time. To be more specific, "result.add(current);", where both result and current are of type List, if we update the value of current, then the value of result will update. |
| [0118](https://leetcode.com/problems/pascals-triangle/) | [Pascal's Triangle](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0118/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0118/Solution.java) | Easy | Array, Dynamic Programming | 5/28/2023 | |
| [0119](https://leetcode.com/problems/pascals-triangle-ii/) | [Pascal's Triangle II](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0119/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0119/Solution.java) | Easy | Array, Dynamic Programming | 5/28/2023 | The variant of [0118](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0118/Problem.md). |
| [0121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Best Time to Buy and Sell Stock](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0121/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0121/Solution.java) | Easy | Array, Dynamic Programming | 5/28/2023 | A little bit tricky! |
| [0125](https://leetcode.com/problems/valid-palindrome/) | [Valid Palindrome](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0125/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0125/Solution.java) | Easy | Two Pointers, String | 5/27/2023 |  |
| [0128](https://leetcode.com/problems/longest-consecutive-sequence/) | [Longest Consecutive Sequence](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0128/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0128/Solution.java) | Medium | Array, Hash Table, Union Find | 6/16/2023 | |
| [0136](https://leetcode.com/problems/single-number/) | [Single Number](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0136/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0136/Solution.java) | Easy | Array, Bit Manipulation | 6/9/2023 | |
| [0141](https://leetcode.com/problems/linked-list-cycle/) | [Linked List Cycle](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0141/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0141/Solution.java) | Easy | Hash Table, Linked List, Two Pointers | 5/28/2023 | |
| [0160](https://leetcode.com/problems/intersection-of-two-linked-lists/) | [Intersection of Two Linked Lists](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0160/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0160/Solution.java) | Easy | Hash Table, Linked List, Two Pointers | 5/28/2023 | |
| [0168](https://leetcode.com/problems/excel-sheet-column-title/) | [Excel Sheet Column Title](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0168/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0168/Solution.java) | Easy | Math, String | 5/29/2023 | A little bit tricky! |
| [0169](https://leetcode.com/problems/majority-element/) | [Majority Element](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0169/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0169/Solution.java) | Easy | Array, Hash Table, Divide and Conquer, Sorting | 5/29/2023 | |
| [0171](https://leetcode.com/problems/excel-sheet-column-number/) | [Excel Sheet Column Number](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0171/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0171/Solution.java) | Easy | Math, String | 5/29/2023 | The inverse process of [0168](https://leetcode.com/problems/excel-sheet-column-title/). |
| [0175](https://leetcode.com/problems/combine-two-tables/) | [Combine Two Tables](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0175/Problem.md) | [MySQL](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0175/Solution.sql) | Easy | Database | 5/31/2023 |  |
| [0181](https://leetcode.com/problems/employees-earning-more-than-their-managers/) | [Employees Earning More Than Their Managers](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0181/Problem.md) | [MySQL](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0181/Solution.sql) | Easy | Database | 5/31/2023 | The efficiency of my solution is so low. |
| [0182](https://leetcode.com/problems/duplicate-emails/) | [Duplicate Emails](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0182/Problem.md) | [MySQL](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0182/Solution.sql) | Easy | Database | 6/1/2023 |  |
| [0189](https://leetcode.com/problems/rotate-array/) | [Rotate Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0189/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0189/Solution.java) | Medium | Array, Math, Two Pointers | 6/18/2023 | |
| [0202](https://leetcode.com/problems/happy-number/) | [Happy Number](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0202/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0202/Solution.java) | Easy | Math, Hash Table, Two Pointers | 6/5/2023 | A little bit tricky about how to record the loop. |
| [0205](https://leetcode.com/problems/isomorphic-strings/) | [Isomorphic Strings](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0205/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0205/Solution.java) | Easy | String, Hash Table | 5/31/2023 |  |
| [0206](https://leetcode.com/problems/reverse-linked-list/) | [Reverse Linked List](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0206/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0206/Solution.java) | Easy | Linked List, Recursion | 6/14/2023 | A typical link list problem (reverse the link list), worth a try! |
| [0217](https://leetcode.com/problems/contains-duplicate/) | [Contains Duplicate](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0217/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0217/Solution.java) | Easy | Array, Hash Table, Sorting | 6/1/2023 | Really interesting when you are trying to find a better solution. |
| [0226](https://leetcode.com/problems/invert-binary-tree/) | [Invert Binary Tree](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0226/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0226/Solution.java) | Easy | Tree, Depth-First Search, Breadth-First Search, Binary Tree | 6/5/2023 | I am weak at solving problems related to Tree. It took me a relatively long time to solve this problem. |
| [0228](https://leetcode.com/problems/summary-ranges/) | [Summary Ranges](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0228/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0228/Solution.java) | Easy | Array | 6/13/2023 | It takes me a while to figure out the problem. |
| [0231](https://leetcode.com/problems/power-of-two/) | [Power of Two](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0231/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0231/Solution.java) | Easy | Math, Bit Manipulation, Recursion              | 6/4/2023 | It is easy to misunderstand the problem, so more attention is needed. |
| [0234](https://leetcode.com/problems/palindrome-linked-list/) | [Palindrome Linked List](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0234/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0234/Solution.java) | Easy | Linked List, Two Pointers, Stack, Recursion | 6/14/2023 |  |
| [0238](https://leetcode.com/problems/product-of-array-except-self/) | [Product of Array Except Self](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0238/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0238/Solution.java) | Medium | Array, Prefix Sum | 6/19/2023 | More like a easy problem than a medium one. |
| [0242](https://leetcode.com/problems/valid-anagram/) | [Valid Anagram](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0242/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0242/Solution.java) | Easy | String, Hash Table, Sorting | 5/31/2023 | |
| [0257](https://leetcode.com/problems/binary-tree-paths/) | [Binary Tree Paths](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0257/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0257/Solution.java) | Easy | String, Backtracking, Tree | 5/31/2023 | Not that easy, worth a try. |
| [0258](https://leetcode.com/problems/add-digits/) | [Add Digits](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0258/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0258/Solution.java) | Easy | Math, Simulation, Number Theory | 5/31/2023 | Very interesting! Once you find the pattern, it can be solved with three lines of code. |
| [0268](https://leetcode.com/problems/missing-number/) | [Missing Number](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0268/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0268/Solution.java) | Easy | Array, Hash Table, Math, Binary Search, Bit Manipulation, Sorting | 6/9/2023 |  |
| [0278](https://leetcode.com/problems/first-bad-version/) | [First Bad Version](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0278/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0278/Solution.java) | Easy | Binary Search, Interactive | 6/10/2023 | A little bit tricky to use proper data structure. |
| [0283](https://leetcode.com/problems/move-zeroes/) | [Move Zeroes](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0283/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0283/Solution.java) | Easy | Array, Two Pointers | 6/9/2023 |  |
| [0338](https://leetcode.com/problems/counting-bits/) | [Counting Bits](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0338/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0338/Solution.java) | Easy | Dynamic Programming, Bit Manipulation | 5/30/2023 | Not that easy, worth a try. |
| [0344](https://leetcode.com/problems/reverse-string/) | [Reverse String](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0344/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0344/Solution.java) | Easy | String, Two Pointers | 6/6/2023 |  |
| [0345](https://leetcode.com/problems/reverse-vowels-of-a-string/) | [Reverse Vowels of a String](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0345/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0345/Solution.java) | Easy | String, Two Pointers | 6/11/2023 | |
| [0347](https://leetcode.com/problems/top-k-frequent-elements/) | [Top K Frequent Elements](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0347/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0347/Solution.java) | Medium | Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect | 6/15/2023 | |
| [0383](https://leetcode.com/problems/ransom-note/) | [Ransom Note](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0383/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0383/Solution.java) | Easy | Hash Table, String, Counting | 6/14/2023 | |
| [0392](https://leetcode.com/problems/is-subsequence/) | [Is Subsequence](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0392/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0392/Solution.java) | Easy | Dynamic Programming, Two Pointers, String | 5/30/2023 |  |
| [0412](https://leetcode.com/problems/fizz-buzz/) | [Fizz Buzz](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0412/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0412/Solution.java) | Easy | Math, String, Simulation | 6/1/2023 | |
| [0414](https://leetcode.com/problems/third-maximum-number/) | [Third Maximum Number](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0414/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0414/Solution.java) | Easy | Array, Sorting | 6/1/2023 | |
| [0415](https://leetcode.com/problems/add-strings/) | [Add Strings](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0415/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0415/Solution.java) | Easy | Math, String, Simulation | 6/1/2023 | |
| [0509](https://leetcode.com/problems/fibonacci-number/) | [Fibonacci Number](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0509/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0509/Solution.java) | Easy | Math, Dynamic Programming, Recursion, Memoization | 6/14/2023 | |
| [0530](https://leetcode.com/problems/minimum-absolute-difference-in-bst/) | [Minimum Absolute Difference in BST](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0530/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0530/Solution.java) | Easy | Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree | 6/14/2023 | This problem is almost the same as [0783](https://leetcode.com/problems/minimum-distance-between-bst-nodes/). Try to make full use of the features of BST (Binary Search Tree)! |
| [0543](https://leetcode.com/problems/diameter-of-binary-tree/) | [Diameter of Binary Tree](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0543/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0543/Solution.java) | Easy | Tree, Depth-First Search, Binary Tree | 6/11/2023 | A little bit tricky, not that easy! Worth a try. |
| [0547](https://leetcode.com/problems/number-of-provinces/) | [Number of Provinces](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0547/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0547/Solution.java) | Medium | Depth-First Search, Breadth-First Search, Union Find, Graph | 6/19/2023 |  |
| [0584](https://leetcode.com/problems/find-customer-referee/) | [Find Customer Referee](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0584/Problem.md) | [MySQL](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0584/Solution.sql) | Easy | Database | 6/14/2023 |  |
| [0595](https://leetcode.com/problems/big-countries/) | [Big Countries](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0595/Problem.md) | [MySQL](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0595/Solution.sql) | Easy | Database | 6/14/2023 |  |
| [0605](https://leetcode.com/problems/can-place-flowers/) | [Can Place Flowers](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0605/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0605/Solution.java) | Easy | Array, Greedy | 6/9/2023 | |
| [0703](https://leetcode.com/problems/kth-largest-element-in-a-stream/) | [Kth Largest Element in a Stream](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0703/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0703/Solution.java) | Easy | Tree, Design, Binary Search Tree, Heap (Priority Queue), Binary Tree, Data Stream | 6/13/2023 | |
| [0704](https://leetcode.com/problems/binary-search/) | [Binary Search](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0704/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0704/Solution.java) | Easy | Array, Binary Search | 6/8/2023 | |
| [0705](https://leetcode.com/problems/design-hashset/) | [Design HashSet](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0705/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0705/Solution.java) | Easy | Array, Hash Table, Linked List, Design, Hash Function | 6/9/2023 | |
| [0744](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) | [Find Smallest Letter Greater Than Target](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0744/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0744/Solution.java) | Easy | Array, Binary Search | 6/9/2023 | |
| [0783](https://leetcode.com/problems/minimum-distance-between-bst-nodes/) | [Minimum Distance Between BST Nodes](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0783/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0783/Solution.java) | Easy | Tree, Depth-First Search, Breadth-First Search, Binary Search Tree, Binary Tree | 6/14/2023 | This problem is almost the same as [0530](https://leetcode.com/problems/minimum-absolute-difference-in-bst/). Try to make full use of the features of BST (Binary Search Tree)! |
| [0876](https://leetcode.com/problems/middle-of-the-linked-list/) | [Middle of the Linked List](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0876/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0876/Solution.java) | Easy | Linked List, Two Pointers | 6/14/2023 | |
| [0977](https://leetcode.com/problems/squares-of-a-sorted-array/) | [Squares of a Sorted Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0977/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/0977/Solution.java) | Easy | Array, Two Pointers, Sorting | 6/5/2023 | |
| [1071](https://leetcode.com/problems/greatest-common-divisor-of-strings/) | [Greatest Common Divisor of Strings](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1071/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1071/Solution.java) | Easy | Math, String | 6/10/2023 | A little tricky, not that easy! It is easy to misunderstand the problem. |
| [1091](https://leetcode.com/problems/shortest-path-in-binary-matrix/) | [Shortest Path in Binary Matrix](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1091/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1091/Solution.java) | Medium | Array, Breadth-First Search, Matrix | 6/18/2023 | The idea of the solution is similar to Bellman-Ford algorithm. And the double-nested loop is the important part to simplify the solution which has eight "if" branches. |
| [1161](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/) | [Maximum Level Sum of a Binary Tree](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1161/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1161/Solution.java) | Medium | Tree, Depth-First Search, Breadth-First Search, Binary Tree | 6/19/2023 | Make sure you understand what the problem asks for first before starting to solve it. |
| [1232](https://leetcode.com/problems/check-if-it-is-a-straight-line/) | [Check If It Is a Straight Line](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1232/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1232/Solution.java) | Easy | Array, Math, Geometry | 6/8/2023 | |
| [1351](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/) | [Count Negative Numbers in a Sorted Matrix](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1351/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1351/Solution.java) | Easy | Array, Binary Search, Matrix | 6/12/2023 | The solution 2 is so ingenious a solution! |
| [1480](https://leetcode.com/problems/running-sum-of-1d-array/) | [Running Sum of 1d Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1480/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1480/Solution.java) | Easy | Array, Prefix Sum | 6/9/2023 | |
| [1491](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/) | [Average Salary Excluding the Minimum and Maximum Salary](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1491/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1491/Solution.java) | Easy | Array, Sorting | 6/1/2023 | |
| [1502](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/) | [Can Make Arithmetic Progression From Sequence](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1502/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1502/Solution.java) | Easy | Array, Sorting | 6/8/2023 | |
| [1603](https://leetcode.com/problems/design-parking-system/) | [Design Parking System](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1603/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1603/Solution.java) | Easy | Design, Simulation, Counting | 6/14/2023 | |
| [1732](https://leetcode.com/problems/find-the-highest-altitude/) | [Find the Highest Altitude](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1732/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1732/Solution.java) | Easy | Array, Prefix Sum | 6/21/2023 | |
| [1768](https://leetcode.com/problems/merge-strings-alternately/) | [Merge Strings Alternately](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1768/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1768/Solution.java) | Easy | Two Pointers, String | 6/14/2023 | |
| [1822](https://leetcode.com/problems/sign-of-the-product-of-an-array/) | [Sign of the Product of an Array](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1822/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/1822/Solution.java) | Easy | Array, Math | 6/1/2023 | |
| [2215](https://leetcode.com/problems/find-the-difference-of-two-arrays/) | [Find the Difference of Two Arrays](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2215/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2215/Solution.java) | Easy | Array, Hash Table | 6/1/2023 | The method I used is just like the most original one, which has a low efficiency. |
| [2352](https://leetcode.com/problems/equal-row-and-column-pairs/) | [Equal Row and Column Pairs](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2352/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2352/Solution.java) | Medium | Array, Hash Table, Matrix, Simulation | 6/16/2023 |  |
| [2591](https://leetcode.com/problems/distribute-money-to-maximum-children/) | [Distribute Money to Maximum Children](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2591/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2591/Solution.java) | Easy | Array, Greedy | 6/12/2023 | A little tricky, not that easy. It is important to think it thoroughly before you start coding. |
| [2656](https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/) | [Maximum Sum With Exactly K Elements](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2656/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2656/Solution.java) | Easy | Array, Greedy | 6/6/2023 |  |
| [2696](https://leetcode.com/problems/minimum-string-length-after-removing-substrings/) | [Minimum String Length After Removing Substrings](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2696/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2696/Solution.java) | Easy | String, Stack, Simulation | 6/6/2023 | Involved with the use of the stack structure. |
| [2706](https://leetcode.com/problems/buy-two-chocolates/) | [Buy Two Chocolates](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2706/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2706/Solution.java) | Easy | Array, Sorting | 6/10/2023 | Try to find a better solution to have some fun. |
| [2710](https://leetcode.com/problems/remove-trailing-zeros-from-a-string/) | [Remove Trailing Zeros From a String](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2710/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2710/Solution.java) | Easy | String | 6/10/2023 |  |
| [2717](https://leetcode.com/problems/semi-ordered-permutation/) | [Semi-Ordered Permutation](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2717/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2717/Solution.java) | Easy | Array, Simulation | 6/10/2023 | A little interesting to discuss the two cases. |
| [2729](https://leetcode.com/problems/check-if-the-number-is-fascinating/) | [Check if The Number is Fascinating](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2729/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2729/Solution.java) | Easy | \ | 6/11/2023 |  |
| [2733](https://leetcode.com/problems/neither-minimum-nor-maximum/) | [Neither Minimum nor Maximum](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2733/Problem.md) | [Java](https://github.com/AshleyXM/Leetcode_Solutions/blob/main/2733/Solution.java) | Easy | \ | 6/12/2023 | Pay more attention to the problem statement, especially the keyword **any**. Have fun to find better solution than ever before. |