Student apl. number % 2

0) Power Sum


Find the number of ways that a given integer, X, can be expressed as the sum of the Nth powers of unique, natural numbers.

For example, if X=13 and N=2, we have to find all combinations of unique squares adding up to 12.
The only solution is 2^2 + 3^2.

Input X, N

Output a single integer, the number of possible combinations caclulated.

Example:
100, 2

100 = (10^2) = (6^2 + 8^2) = (1^2 + 3^2 + 4^2 + 5^2 + 7^2) // 3

public class Solution {

static int powerSum(int X, int N) {
// TODO

}

}


1) Recursive Digit Sum

We define super digit of an integer using the following rules:
Given an integer, we need to find the super digit of the integer.
- If x has only 1 digit, then its super digit is x.
- Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
For example, the super digit of 9875 will be calculated as:

superDigit(9875) 9+8+7+5 = 29
superDigit(29) 2 + 9 = 11
superDigit(11) 1 + 1 = 2
superDigit(2) = 2

public class Solution {

static long superDigit(long x) {
// TODO
}
}
