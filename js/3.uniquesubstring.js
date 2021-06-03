
const getSubstring = function(string){
    if(string.length === 0){
        return 0;
    }

    let counter = 0,
        max = 1,
        i = 0, p = 0,
        hash = [];

        //"abcbda"
        while(p<string.length){
            //counter = 1;
            let letter = string[p];
            //console.log(letter," p:", p, " max: ", max, counter);
            if(hash[letter]!==true || p+1==string.length ){
                hash[letter] = true;
                counter++;
                p++;
                max = max > counter ? max : counter;

            }else{
                max = max > counter ? max : counter;
                hash=[];
                i++;
                p = i;
                counter = 0;
            }

        }
    return max;
}

//console.log( getSubstring("abcdba") );

//console.log("hola")


const optimalSubstring = (string)=>{
    if(string.length<=1){
        return string.length;
    }


//Declarar el Objeto
//Declarar el valor máximo el inicial (left)
    let max = 0, left = 0, seenChar = {};

//Loop the array
    for(right = 0; right<string.length; right++ ){
        let char = string[right];
        console.log(char, `rigth: ${right} left: ${left} max: ${max}`);

        if(seenChar[char]>=left){
            left = seenChar[char]+1;
        }
        seenChar[char] = right;

        max = Math.max(max, right-left+1);
    }
    //asign current char
    //check If(value of current char is <= right)
        //Left = right;
    //max value define 

//Regresar el máximo
    return max;
}

console.log( optimalSubstring("abcdcrteo") )