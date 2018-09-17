Then rework it to employ Java 8 lambdas and streams. 
The functional solution shall ideally feature no if's, while's and for's.

After you have a nice functional solution, try to add a subtle yet powerful optimization - reduce divisor checking range to
1..Math.sqrt ( n )
