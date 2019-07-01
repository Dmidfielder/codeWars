package problems;

/**
 * Created by Bauyrzhan Aigelov on 01.07.2019.
 */
public class howGoodAreYou {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for(int i=0; i < classPoints.length; i++){
            sum = sum + classPoints[i];
        }
        sum = sum + yourPoints;
        float average = sum/(classPoints.length + 1);
        if(yourPoints > average){
            return true;
        } else {
            return false;
        }
    }
}
