// Control structures

// JavaScript has a similar set of control structures to other languages 
// in the C family. Conditional statements are supported by if and else; 
// you can chain them together if you like:

var name = "kittens";
if (name == "puppies") {
  name += "!";
} else if (name == "kittens") {
  name += "!!";
} else {
  name = "!" + name;
}
name == "kittens!!"

// JavaScript has while loops and do-while loops. The first is good for 
// basic looping; the second for loops where you wish to ensure that the 
// body of the loop is executed at least once:

while (true) {
  // an infinite loop!
}

var input;
do {
  input = get_input();
} while (inputIsNotValid(input))

// JavaScript's for loop is the same as that in C and Java: it lets you 
// provide the control information for your loop on a single line.

for (var i = 0; i < 5; i++) {
  // Will execute 5 times
}

// The && and || operators use short-circuit logic, which means whether 
// they will execute their second operand is dependent on the first. 
// This is useful for checking for null objects before accessing their attributes:

var name = o && o.getName();
if(o && o.getName()){
  var name = o.getName()
}

// Or for setting default values:

var name = otherName || "default";

// JavaScript has a ternary operator for conditional expressions:

var allowed = (age > 18) ? "yes" : "no";

// The switch statement can be used for multiple branches based on a number or string:

switch(action) {
  case 'draw':
    drawIt();
    break;
  case 'eat':
    eatIt();
    break;
  default:
    doNothing();
}

// If you don't add a break statement, execution will "fall through" 
// to the next level. This is very rarely what you want — in fact it's 
// worth specifically labeling deliberate fallthrough with a comment 
// if you really meant it to aid debugging:

switch(a) {
  case 1: // fallthrough
    code here;
  case 2:
    eatIt();
    break;
  default:
    doNothing();
}


// The default clause is optional. You can have expressions in both 
// the switch part and the cases if you like; comparisons take place 
// between the two using the === operator:

switch(1 + 3) {
  case 2 + 2:
    yay();
    break;
  default:
    neverhappens();
}