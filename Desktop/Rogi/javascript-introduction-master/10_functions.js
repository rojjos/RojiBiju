// Functions

// Along with objects, functions are the core component in understanding 
// JavaScript. The most basic function couldn't be much simpler:

function add(x, y) {
  var total = x + y;
  return total;
}

// This demonstrates a basic function. A JavaScript function can 
// take 0 or more named parameters. The function body can contain 
// as many statements as you like, and can declare its own variables 
// which are local to that function. The return statement can be 
// used to return a value at any time, terminating the function. 
// If no return statement is used (or an empty return with no value), 
// JavaScript returns undefined.

// The named parameters turn out to be more like guidelines than 
// anything else. You can call a function without passing the 
// parameters it expects, in which case they will be set to undefined.

add(); // NaN 
// You can't perform addition on undefined

// You can also pass in more arguments than the function is expecting:

add(2, 3, 4); // 5 
// added the first two; 4 was ignored

// That may seem a little silly, but functions have access to an additional 
// variable inside their body called arguments, which is an array-like object 
// holding all of the values passed to the function. Let's re-write the add 
// function to take as many values as we want:

function add() {
  var sum = 0;
  for (var i = 0, j = arguments.length; i < j; i++) {
    sum += arguments[i];
  }
  return sum;
}

add(2, 3, 4, 5); // 14

// That's really not any more useful than writing 2 + 3 + 4 + 5 though. 
// Let's create an averaging function:

function avg() {
  var sum = 0;
  for (var i = 0, j = arguments.length; i < j; i++) {
    sum += arguments[i];
  }
  return sum / arguments.length;
}

avg(2, 3, 4, 5); // 3.5

// This is pretty useful, but introduces a new problem. 
// The avg() function takes a comma separated list of 
// arguments — but what if you want to find the average 
// of an array? You could just rewrite the function as follows:

function avgArray(arr) {
  var sum = 0;
  for (var i = 0, j = arr.length; i < j; i++) {
    sum += arr[i];
  }
  return sum / arr.length;
}

avgArray([2, 3, 4, 5]); // 3.5

// But it would be nice to be able to reuse the function that 
// we've already created. Luckily, JavaScript lets you call a 
// function and call it with an arbitrary array of arguments, 
// using the apply() method of any function object.

avg.apply(null, [2, 3, 4, 5]); // 3.5

// The second argument to apply() is the array to use as arguments; 
// the first will be discussed later on. This emphasizes the fact 
// that functions are objects too.

// JavaScript lets you create anonymous functions.

var avg = function() {
  var sum = 0;
  for (var i = 0, j = arguments.length; i < j; i++) {
    sum += arguments[i];
  }
  return sum / arguments.length;
};

// This is semantically equivalent to the function avg() form. 
// It's extremely powerful, as it lets you put a full function 
// definition anywhere that you would normally put an expression. 
// This enables all sorts of clever tricks. Here's a way of "hiding" 
// some local variables — like block scope in C:

var a = 1;
var b = 2;

(function() {
  var b = 3;
  a += b;
})();

a; // 4
b; // 2

// JavaScript allows you to call functions recursively. 
// This is particularly useful for dealing with tree 
// structures, such as those found in the browser DOM.

function countChars(elm) {
  if (elm.nodeType == 3) { // TEXT_NODE
    return elm.nodeValue.length;
  }
  var count = 0;
  for (var i = 0, child; child = elm.childNodes[i]; i++) {
    count += countChars(child);
  }
  return count;
}

// This highlights a potential problem with anonymous functions: 
// how do you call them recursively if they don't have a name? 
// JavaScript lets you name function expressions for this. 
// You can use named IIFEs (Immediately Invoked Function Expressions) 
// as shown below:

var charsInBody = (function counter(elm) {
  if (elm.nodeType == 3) { // TEXT_NODE
    return elm.nodeValue.length;
  }
  var count = 0;
  for (var i = 0, child; child = elm.childNodes[i]; i++) {
    count += counter(child);
  }
  return count;
})(document.body);

// The name provided to a function expression as above is only 
// available to the function's own scope. This allows more 
// optimizations to be done by the engine and results in more 
// readable code. The name also shows up in the debugger and 
// some stack traces, which can save you time when debugging.

// Note that JavaScript functions are themselves objects — 
// like everything else in JavaScript — and you can add or 
// change properties on them just like we've seen earlier 
// in the Objects section.