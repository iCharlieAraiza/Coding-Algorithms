const getLongestSubstring = function(string){
    if(string.length <= 1){
        return string.length;
    }
    let longestLenth = 0;
    
    for(i = 0; i<string.length; i++){
        let r = i;
        let count = 0;
        let charsList = {};
        while(r<string.length){
            let char = string[r];
            if(charsList[char]===undefined){
                charsList[char] = r;
                count++;
                longestLenth = Math.max(longestLenth, count)
                r++;
            }else{
                i = charsList[char];
                count = 0;
                break;
            }
        }
    }
    return longestLenth;
}


console.log( getLongestSubstring("abcabcbb") )