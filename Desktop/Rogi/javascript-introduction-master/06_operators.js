// Operators

// JavaScript's numeric operators are +, -, *, / and % — which is the 
// remainder operator (which is the same as modulo.) Values are 
// assigned using =, and there are also compound assignment statements 
// such as += and -=. These extend out to x = x operator y.

x += 5
x = x + 5

// You can use ++ and -- to increment and decrement respectively. 
// These can be used as prefix or postfix operators.

// The + operator also does string concatenation:

"hello" + " world"; // "hello world"

// If you add a string to a number (or other value) everything is 
// converted in to a string first. This might catch you up:

"3" + 4 + 5;  // "345"
 3 + 4 + "5"; // "75"

// Adding an empty string to something is a useful way of 
// converting it to a string itself.

//Comparisons in JavaScript can be made using <, >, <= and >=. 
//These work for both strings and numbers. Equality is a little 
//less straightforward. The double-equals operator performs type 
//coercion if you give it different types, with sometimes 
//interesting results:

123 == "123"; // true
1 == true; // true

//To avoid type coercion and make sure your comparisons are always 
//accurate, you should always use the triple-equals operator:

123 === "123"; // false
1 === true;    // false

//There are also != and !== operators.

//JavaScript also has bitwise operations. If you want to use them, 
//they're there