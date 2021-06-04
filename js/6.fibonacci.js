//Definir los casos base
//0 y 1
// Suma: 
//  0 + 1 = 1 
//  1 + 1 = 2
//  1 + 2 = 3
//  2 + 3 = 5
//  3 + 5 = 8 
//  5 + 8 = 13

/*
    Difine input and output
    const fibonnaci = function (num1, num2, cont){
        *** 
        return num1
    }

    Example:

    fibonnaci (0, 5)  : 5
    
    fibonnaci (0, 1, 7 ) : 13
*/

/*
const fibonnaci = (num, val)=>{
    if( (val===1 && num == 0) || val === 0 ){
        return 0
    } else if(val===1){
        return 1
    }
    
    if(num==0){
        return fibonnaci(1, val-1)
    }

    return fibonnaci(num, val-1) + fibonnaci(num, val-2); 
}

console.log( fibonnaci(0, 15));
*/

var fib = function(n){
    
    const fibonnaci = (num, val)=>{
        if( (val===1 && num == 0) || val === 0 ){
            return 0
        } else if(val===1){
            return 1
        }
        if(num==0){
            return fibonnaci(1, val-1)
        }
        return fibonnaci(num, val-1) + fibonnaci(num, val-2); 
    }

    return fibonnaci(0, n+1);
}

console.log( fib(3));