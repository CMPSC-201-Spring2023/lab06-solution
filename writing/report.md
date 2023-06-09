# LAB 03 Report

## JJ

### 1\. Scopes in JavaScript

Study the JavaScript program named `Scope.js` inside "src" directory. Run the program to see the value that is printed by the final line- is it "hello" or is it "10"? You can run the program by entering the `localhost` window using the course Docker image (see README for instructions), navigating inside "environment/src" directories in the terminal, and typing `node Scope.js`. Provide answers to the following questions.

_Questions_: 1.1\. Output:

```
greeting = 10
greeting = Privet
```

1.2\. In the `Scope.js` program, write a second function called "hola" that creates another `greeting` variable using `var` keyword in JavaScript, initializes it to the value of "Hola", and prints the value of `greeting`. Then, add a call to this new function called "hola" at the end of function `pryvit`. Include the output below:

```
greeting = 10
greeting = Hola
greeting = Privet
```

1.3\. Based on the `Scope.js` program and your understanding of scoping, explain how JavaScript's "function scope'' rule is interpreted.

Even though the line "greeting = "Privet" appears to modify the global variable `greeting`, the subsequent occurrence of the line var `greeting` inside `privet` declares that `greeting` is a local variable, not identical to the one declared in the first line. JavaScript treats all var declarations within the function as if they were given at the top of the function body; this behavior is called hoisting.

Note: in "use strict"; mode, all variables require a var; however, the "hoisting" behavior is still valid.

1.4\. State whether or not JavaScript requires "declare before use'' for variables.

Answer Answer Answer Answer Answer Answer Answer Answer Answer

### 2\. Frames

Go to the [PythonTutor Website](http://www.pythontutor.com) and click on the link to "Start writing and visualizing code now!''

From the dropdown menu, choose JavaScript. Enter the following code:

```
     function f(x) {
       g(x+1);
     }
     function g(x) {
       console.log("in g, x = " + x);
     }
     f(3);
```

Click the "Visualize Execution'' button and then keep pressing the "Next" button, watching the animation on the right side at each step.

_Question_: 2\. Provide a brief (one paragraph) explanation of the various stack frames that appear and disappear.

### 3\. Stack Structure in Java

Java bytecode is the virtual instruction set of the Java virtual machine. It features one-byte instruction with 256 possible opcodes and uses stack-based computation. Java bytecode instructions operates on 9 main different types: the 8 primitives types: `byte` , `char`, `short`, `int`, `long`, `float`, `double` (`boolean`, `byte`, `short` and `char` are sometimes treated as `int`) and reference (a reference is a pointer to an Object in the heap). `long` and `double` values takes two slots in the operand stack and local variables (all the other types takes one). Each mnemonic (textual form of an operation) is encoded as a byte in the class file, which is called an operation code or opcode. Some examples of mnemonics include:

- `iadd`: add two integers
- `fmul`: multiply two floats
- `lload1`: load a long value from the local variable 1

Instructions dealing with the stack or local variables start with a letter corresponding to the type. For example, `iadd` adds two integers, whereas `dadd` adda two doubles. Arguments follow an instruction, for example, `bipush 5` loads a byte onto the stack and `iconst0` loads 0 onto the stack.

To learn more about Java bytecode specification and instructions consider the following resources:

- [The Java Virtual Machine Specification](http://docs.oracle.com/javase/specs/jvms/se8/html/index.html)
- [Instructions listing](https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings)
- [JVM Instruction Set Documentation](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html).

Generate the JVM bytecode for the Java class `Stack1.java` (in the "src" directory). There is no "main" here, so you can't run this, but you can still compile it using `javac Stack1.java` command in the terminal of the "src" directory (where this program is located) and view the bytecode with `javap -c Stack1.class` command. In bytecode, the instructions "iload", "dload", "istore", and "dstore" take a numeric argument that specifies a location in the activation record (or frame). Sometimes this argument is part of the instruction name, e.g, "iload_1".

_Question_: 3.1\. Specify. the portion of the frame containing the parameters and local variables of function `func`, showing where each parameter `num1`, `num2`, `numd1`, etc., and each local variable sum, etc., appears in the frame. For example, the details you are required to provide are as follows:

```
        1:   name of variable in frame location 1
        2:   name of variable in frame location 2
        3:   name of variable in frame locations 3 and 4 ^
        5:     etc.
```

^ Recall that a `double` takes twice as many spaces as an `int`.

![](../InstructionImages/3.png?raw=true)

_Question_: 3.2\. Now add another expression of your choosing involving `sum` and `prod` variables. Describe the additional details that are included in the frame following the format of the previous question.

Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer

### 4\. A stack machine computation

Generate the byte code for program `Stack2.java`. Assume that function `func` is called with `num1 = 10, num2 = 20`. If the stack contains the value of a variable, name it. For instance, after the first two lines of bytecode are executed, the stack looks like this (I'm assuming the stack grows upward):

```
20 (num2)
10 (num1)
```

and after the third line it looks like:

```
30
```

Remember how a stack machine works: operators like "add" pop their operands from the stack and then push the result (the above example shows how `num1` and `num2` are pushed on the stack, then they are popped and the value of `num1 + num2` is pushed onto the stack.)

_Question_: 4.1\. "Draw" the frame for `func` (as in the previous question 3). Then "draw" the contents of the stack after each line of bytecode in function `func`.

Here is bytecode:

`0: iload_1 1: iload_2 2: iadd`
`3: iload_1 4: iload_2 5: iadd`
`6: imul`
`7: iload_1 8: iload_2 9: iadd`
`10: iload_1 11: iload_2 12: iadd`
`13: imul`
`14: iadd`
`15: istore_3 16: return`

In the following diagram, each picture shows the stack contents after the execution of the instruction number below it (so, after executing `1: iload_1` the stack has a `10`; after executing `2: iload_2` it contains a `20` and a `10`). The stack grows upward. Since the only variables ever pushed onto the stack are `num1` and `num2`, I have tried to save space on the page by not explicitly naming them.

![](../InstructionImages/4.png?raw=true)

_Question_: 4.2\. Now add the `print` statement that displays the value of `num`. Describe the changes to the stack that occur as a result of this addition.

After adding the print statement, the stack will contain other items for the invoking of the print method. Specifically, it will contain `iload_3` to retrieve the result stored in location 3 of the memory before it gets printed out.

### Reflection

Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer Answer
