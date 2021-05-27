

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
            console.log(letter," p:", p, " max: ", max, counter);
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

console.log( getSubstring("abcdba") );

//console.log("hola")