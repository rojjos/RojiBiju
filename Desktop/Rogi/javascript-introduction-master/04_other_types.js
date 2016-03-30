// Other types

// JavaScript distinguishes between null, which is a value 
// that indicates a deliberate non-value (and is only accessible 
// through the null keyword), and undefined, which is a value of 
// type undefined that indicates an uninitialized value — that is, 
// a value hasn't even been assigned yet. We'll talk about variables 
// later, but in JavaScript it is possible to declare a variable 
// without assigning a value to it. If you do this, the variable's 
// type is undefined. undefined is actually a constant.

// JavaScript has a boolean type, with possible values true and false 
// (both of which are keywords.) Any value can be converted to a boolean 
// according to the following rules:

//    false, 0, empty strings (""), NaN, null, and undefined all become false.
//    All other values become true.

// You can perform this conversion explicitly using the Boolean() function:

Boolean("");  // false
Boolean(234); // true

// However, this is rarely necessary, as JavaScript will silently perform 
// this conversion when it expects a boolean, such as in an if statement 
// (see below.) For this reason, we sometimes speak simply of "true values" 
// and "false values," meaning values that become true and false, respectively, 
// when converted to booleans. Alternatively, such values can be called "truthy" 
// and "falsy", respectively.

// Boolean operations such as && (logical and), || (logical or), 
// and ! (logical not) are supported;