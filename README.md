# Groovy eachWithIndex Loop - Unexpected Return Behavior

This example demonstrates a common misunderstanding in Groovy regarding the `return` statement within an `eachWithIndex` loop.  The `return` statement only exits the loop, not the enclosing method.

The `bug.groovy` file shows the erroneous code.  The `bugSolution.groovy` file shows the corrected behavior using `break` or a more controlled approach.

This is a subtle but important distinction for Groovy developers to understand, as it can lead to unexpected program flow and logic errors.
