// Numbers

//The standard arithmetic operators are supported, including addition, 
//subtraction, modulus (or remainder) arithmetic and so forth. There's 
//also a built-in object that we forgot to mention earlier called Math 
//that provides advanced mathematical functions and constants:

Math.sin(3.5);
var circumference = Math.PI * (r + r);

// You can convert a string to an integer using the built-in 
// parseInt() function. This takes the base for the conversion 
// as an optional second
parseInt("010", 10); // 10d argument, which you should always provide:

parseInt("123", 10); // 123

// If you don't provide the base, you can get surprising results 
// in older browsers (pre-2013):

parseInt("010"); // 8

//That happened because the parseInt() function decided to treat 
//the string as octal due to the leading 0.

//If you want to convert a binary number to an integer, just change the base:

parseInt("11", 2); // 3

// Similarly, you can parse floating point numbers using the built-in parseFloat()
// function, which unlike its parseInt() cousin always uses base 10.

// You can also use the unary + operator to convert values to numbers:

+ "42"; // 42

//A special value called NaN (short for "Not a Number") 
//is returned if the string is non-numeric:

parseInt("hello", 10); // NaN

//NaN is toxic: if you provide it as an input to any mathematical 
//operation the result will also be NaN:

NaN + 5; // NaN

// You can test for NaN using the built-in isNaN() function:

isNaN(NaN); // true

//JavaScript also has the special values Infinity and -Infinity:

1 / 0; //  Infinity
-1 / 0; // -Infinity

//You can test for Infinity, -Infinity and NaN values using the
//built-in isFinite() function:

isFinite(1/0); // false
isFinite(-Infinity); // false
isFinite(NaN); // false