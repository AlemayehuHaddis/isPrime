public class MyClass {
  public static void main(String args[]) {
    int[] sampleData = {1, 2, 3};
    
    int result = oddMinusEven(sampleData); 
    //oddMinusEven function called in the Java main String class
     
    System.out.println("\t\t" + String.valueOf(result)); 
//String.valeOf() : used to access of a givenArray method 
  }
  static int oddMinusEven(int[] givenArray){
    int sumOfOdd = 0;
    int sumOfEven = 0;
    
    for(int x=0; x<givenArray.length; x++){
      if(givenArray[x]%2 == 0){
        sumOfEven = sumOfEven + givenArray[x];			
        //when a number devided 2 and the reminder is 0, it is an Even number.
        }
        else{
          sumOfOdd = sumOfOdd + givenArray[x];
          /* if a element isnot Even, it is odd number.
          *After selecting Even and Odd numbers
          * The method sums them separatly
          * returns to the question to calculate 
          * 		X(sumOfOdd) - Y(sumOfEven)
          */
          }
      }
      return (sumOfOdd - sumOfEven);
    }
}