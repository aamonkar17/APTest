//2YY9Z6Z4
//A.A.

//a)
public static boolean wordChecker(String firstLetter, int maxLength, int n){
    int counter = 0;
    for(int i=0; i<n; i++){
        if(getWord().substring(0,1).equals(firstletter) && getWord().length()<=maxLength){
            counter++;
        }
    }
    double finalper = counter/n;
    if(finalper < 10){
        return true;
    }
    return false;
}

//b)
Add another parameter to the wordChecker method of type int and possibly call it int percentage
In the wordChecker method, replace the "10" written with the parameter "percentage"
