// Objects

//JavaScript objects can be thought of as simple collections of 
//name-value pairs. As such, they are similar to:

//    Dictionaries in Python.
//    Hashes in Perl and Ruby.
//    Hash tables in C and C++.
//    HashMaps in Java.
//    Associative arrays in PHP.

//The fact that this data structure is so widely used is a testament 
//to its versatility. Since everything (bar core types) in JavaScript 
//is an object, any JavaScript program naturally involves a great deal 
//of hash table lookups. It's a good thing they're so fast!

// The "name" part is a JavaScript string, while the value can be any 
// JavaScript value — including more objects. This allows you to build 
// data structures of arbitrary complexity.

// There are two basic ways to create an empty object:

var obj = new Object();

//And:

var obj = {};

//These are semantically equivalent; the second is called object literal 
//syntax, and is more convenient. This syntax is also the core of JSON 
//format and should be preferred at all times.

//Object literal syntax can be used to initialize an object in its entirety:

var obj = {
  name: "Carrot",
  "for": "Max",
  details: {
    color: "orange",
    size: 12
  }
}

// Attribute access can be chained together:

obj.details.color; // orange
obj["details"]["size"]; // 12

// The following example creates an object prototype, Person, and 
// instance of that prototype, You.

function Person(name, age) {
  this.name = name;
  this.age = age;
}

// Define an object
var you = new Person("You", 24); 
// We are creating a new person named "you" 
// (that was the first parameter, and the age..)

// Once created, an object's properties can again be accessed in one of two ways:

obj.name = "Simon";
var name = obj.name;

// And...

obj["name"] = "Simon";
var name = obj["name"];

// These are also semantically equivalent. 
// The second method has the advantage that the name of the property 
// is provided as a string, which means it can be calculated at run-time 
// though using this method prevents some JavaScript engine and minifier 
// optimizations being applied. It can also be used to set and get 
// properties with names that are reserved words:

obj.for = "Simon"; // Syntax error, because 'for' is a reserved word
obj["for"] = "Simon"; // works fine