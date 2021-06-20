
const toUpperFirst = (string) => {

    const capitalize = (newString, string, index)=>{
        if(index === string.length) 
            return newString;
        
        if(index===0 || string[index-1]==' ') 
            newString+=string[index].toUpperCase();
        else 
            newString+=string[index];
        
        return capitalize(newString, string, index+1);
    }
    return capitalize("", string, 0);
}


console.log( toUpperFirst("Son una serie de reglas que están compuestas por conceptos generales y normas particulares, que regulan la elaboración y presentación de la información contenida en los estados financieros") );
