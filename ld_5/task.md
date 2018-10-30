1. Isogram

Determine if a word or phrase is an isogram.

An isogram (also known as a "nonpattern word") is a word or phrase without a repeating letter, however spaces and hyphens are allowed to appear multiple times.

Examples of isograms:

    lumberjacks

    background

    downstream

    six-year-old

The word isograms, however, is not an isogram, because the s repeats.

Wikipedia https://en.wikipedia.org/wiki/Isogram

2. Word count

Given a phrase, count the occurrences of each word in that phrase.

For example for the input "olly olly in come free"

olly: 2

in: 1

come: 1

free: 1

This is a classic toy problem, but we were reminded of it by seeing it in the Go Tour.

3. ISBN verifier

The ISBN-10 verification process is used to validate book identification numbers. These normally contain dashes and look like: 3-598-21508-8

The ISBN-10 format is 9 digits (0 to 9) plus one check character (either a digit or an X only). In the case the check character is an X, this represents the value '10'. These may be communicated with or without hyphens, and can be checked for their validity by the following formula:

(x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9 * 2 + x10 * 1) mod 11 == 0

If the result is 0, then it is a valid ISBN-10, otherwise it is invalid.

Example:

Let's take the ISBN-10 3-598-21508-8. We plug it into the formula, and get:

(3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 * 1) mod 11 == 0

Since the result is 0, this proves that our ISBN is valid.

Task:

Given a string the program should check if the provided string is a valid ISBN-10. Putting this into place requires some thinking about preprocessing/parsing of the string prior to calculating the check digit for the ISBN.

The program should be able to verify ISBN-10 both with and without separating dashes.

https://en.wikipedia.org/wiki/International_Standard_Book_Number#ISBN-10_check_digit_calculation

 

Lab is complete if:

    All tests pass;

    No test should be removed from the suite or ignored;

    All three tasks are implemented in a functional way:

        no local or global variables;

        try to make a function with a single-instruction body, so you can omit curly braces;

        no loops, just higher order functions.

    (Optional) Use regex where appropriate.
