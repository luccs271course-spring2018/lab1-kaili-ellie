# Part 5 Answers

### What would be a really simple solution if n were not an argument, i.e., if it were always 17?

If n were always 17, you could just print out the list of numbers, "fizz"es, and "buzz"es using System.out.println.  For example:

```
public static void main(String[] args){
    System.out.println("1")
    System.out.println("2")
    System.out.println("fizz")
    System.out.println("4")
    System.out.println("buzz")
    System.out.println("fizz")
    System.out.println("7")
    System.out.println("8")
    System.out.println("fizz")
    System.out.println("buzz")
    System.out.println("11")
    System.out.println("fizz")
    System.out.println("13")
    System.out.println("14")
    System.out.println("fizz buzz")
    System.out.println("16")
    System.out.println("17")
}
```

### How could you have automatically tested your initial solution from part 2?

A way to test the initial solution from part two would be to run the code that we wrote for the program.

### What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?

The ways in which the set of numbers are run through and printed change between parts, moving from a simple printing program to using an array to using an array list.  User input is also implemented in parts 3 and 4, where n was a set value in part two.  The way that the numbers are checked by the code to see if they should be replaced with "fizz" or "buzz" stays the same throughout.

It doesn't seem as if there is a large difference in appearance between which list implementation chosen.  However, it is more efficient to use ArrayLists, as they do not require a set length to run.