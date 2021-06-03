const factorialError = function(num){
    if(num===1){
        return 1;
    }
    return factorialError(--num);
}


function getOddNumbers(arr){
    const odd = [];

    function getOdd(list){
        if(list.length === 0){
            return;
        }

        if( list[0]%2!=0 ){
            odd.push( list[0] );
        }
        
        const aux = [];
        let flag = true;
        list.forEach(num=>{
            if(flag){
                flag = false;
            }else{
                aux.push(num);   
            } 
        })

        getOdd( aux );

    }

    getOdd(arr);
 
    return odd;
}


console.log(getOddNumbers([10,4,5,7,8,9]));