package solution;

/**
 * Solves problem of array max difference
 * @author jake
 *
 */
public class MaxDifference {
	
	/**
	 * Find the range between the largest and smallest numbers in an array
   *
   * @param numArray is an array that will be used to find max diff
   * @return integer that is the max difference of the array
	 */
	public int maxDiff(int[] numArray){
		//take array and look for largest and smallest number
    int max = 0;
    int min = 0;
    for(int i = 0; i < numArray.length; ++i){
      //smaller than min
      if(numArray[i] < min){
        min = numArray[i];
      }
      //larger than max
      if(numArray[i] > max){
        max = numArray[i];
      }

    }

    return max - min;

	}


}
