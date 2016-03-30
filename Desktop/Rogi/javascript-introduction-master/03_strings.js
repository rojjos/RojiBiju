//Strings

//Strings in JavaScript are sequences of characters. More accurately, 
//they are sequences of Unicode characters, with each character 
//represented by a 16-bit number. This should be welcome news to 
//anyone who has had to deal with internationalization.

//If you want to represent a single character, you just use a string of length 1.

//To find the length of a string, access its length property:

"hello".length; // 5

//There's our first brush with JavaScript objects! Did we mention 
//that you can use strings like objects too? They have methods as 
//will that allow you to manipulate the string and access information 
//about the string:

"hello".charAt(0); // "h"
"hello, world".replace("hello", "goodbye"); // "goodbye, world"
"hello".toUpperCase(); // "HELLO"