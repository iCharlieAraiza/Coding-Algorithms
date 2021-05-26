//Question: How to typeout using backslash and compare if bouth are the sema

// [Ho#la] = [Hla]
// [Ab##o] = [o]
// [##WQR] = [WQR]


const typeout = function(string){
    //Declarar el string que se regresará;
    let resultChar = [];
    
    //Declarar puntero
    let p = 0;

    //Recorrer todos los caracteres
    for(i = 0; i<string.length; i++){
        if(string[i]=='#'){
            resultChar.pop();
        }else{
            resultChar.push(string[i])
        }
    }
    let stringElement ='';
    resultChar.forEach(el=>stringElement+=el);
    return stringElement;    
}

const compareStrings = function(str1, str2){
    const resultStr1 = typeout(str1);
    const resultStr2 = typeout(str2);

    return resultStr1 === resultStr2;
}



console.log( compareStrings("Ab##o", "o"));