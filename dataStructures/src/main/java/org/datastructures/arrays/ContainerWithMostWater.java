package org.datastructures.arrays;

//https://youtu.be/6PrIRPpTI9Q?feature=shared
public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int area = maxArea(heights);
        System.out.println(area);

    }
    public static int maxArea(int[] height) {
        int maxArea =0;
        int aPointer = 0;
        int bPointer = height.length-1;

        while(aPointer<bPointer){
            if(height[aPointer]<height[bPointer]){
                maxArea = Math.max(maxArea,height[aPointer]*(bPointer-aPointer));
                aPointer +=1;
            }else{
                maxArea = Math.max(maxArea,height[bPointer]*(bPointer-aPointer));
                bPointer -=1;
            }
        }
        return maxArea;
    }
}
