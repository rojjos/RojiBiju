// Arrays

// Arrays in JavaScript are actually a special type of object. 
// They work very much like regular objects (numerical properties 
// can naturally be accessed only using [] syntax) but they have 
// one magic property called 'length'. This is always one more 
// than the highest index in the array.

// One way of creating arrays is as follows:

var a = new Array();
a[0] = "dog";
a[1] = "cat";
a[2] = "hen";
a.length; // 3

// A more convenient notation is to use an array literal:

var a = ["dog", "cat", "hen"];
a.length; // 3

// Note that array.length isn't necessarily the number of items in the array.
// Consider the following:

var a = ["dog", "cat", "hen"];
a[100] = "fox";
a.length; // 101

// Remember — the length of the array is one more than the highest index.

//If you query a non-existent array index, you'll get a value of undefined
// returned:

typeof a[90]; // undefined

//If you take the above into account, you can iterate over an array using
// the following:

for (var i = 0; i < a.length; i++) {
  // Do something with a[i]
}

// This is slightly inefficient as you are looking up the length property once
//  every loop. 
// An improvement is this:

for (var i = 0, len = a.length; i < len; i++) {
  // Do something with a[i]
}

// A nicer-looking but limited idiom is:

for (var i = 0, item; item = a[i++];) {
  // Do something with item
}

//Here we are setting up two variables. The assignment in the middle 
//part of the for loop is also tested for truthfulness — if it succeeds, 
//the loop continues. Since i is incremented each time, items from 
//the array will be assigned to item in sequential order. The loop stops 
//when a "falsy" item is found (such as undefined).

//This trick should only be used for arrays which you know do not contain 
//"falsy" values (arrays of objects or DOM nodes for example). If you are 
//iterating over numeric data that might include a 0 or string data that 
//might include the empty string you should use the i, len idiom instead.

//You can iterate over an array using a for...in loop. Note that if someone 
//added new properties to Array.prototype, they will also be iterated over 
//by this loop.  Therefore this method is "not" recommended.

//Another way of iterating over an array that was added with ECMAScript 5
// is forEach():

["dog", "cat", "hen"].forEach(function(currentValue, index, array) {
  // Do something with currentValue or array[index]
});

//If you want to append an item to an array simply do it like this:

a.push(item);



//Arrays come with a number of methods. See also the full documentation for array methods

a.toString()
//Returns a string with the toString() of each element separated by commas.

a.toLocaleString() 	
//Returns a string with the toLocaleString() of each element separated by commas.

a.concat(item1[, item2[, ...[, itemN]]]) 	
//Returns a new array with the items added on to it.

a.join(sep) 	
//Converts the array to a string — with values delimited by the sep param

a.pop() 	
//Removes and returns the last item.

a.push(item1, ..., itemN) 	
//Adds one or more items to the end.

a.reverse() 	
//Reverses the array.

a.shift() 	
//Removes and returns the first item.

a.slice(start[, end]) 	
//Returns a sub-array.

a.sort([cmpfn]) 	
//Takes an optional comparison function.

a.splice(start, delcount[, item1[, ...[, itemN]]]) 	
//Lets you modify an array by deleting a section and replacing it with more items.

a.unshift(item1[, item2[, ...[, itemN]]]) 	
//Prepends items to the start of the array.