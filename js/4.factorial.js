const factorialError = function(num){
    if(num===1){
        return 1;
    }
    return factorialError(--num);
}


function getOddNumbers(arr){
    const odd = [];

    function getOdd(list){
        if(list.length === 1){
            return;
        }

        if( list[0]%2!=0 ){
            odd.push( list[0] );
        }
        getOdd( list.slice(1) );
    }

    getOdd(arr);
 
    return odd;
}


console.log(getOddNumbers([10,4,5,7,8,9]));