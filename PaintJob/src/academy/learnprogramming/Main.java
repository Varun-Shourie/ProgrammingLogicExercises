package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        else {
            double area = width * height;
            double totalBucketsNeeded = Math.ceil(area / areaPerBucket);
            return (int) (totalBucketsNeeded - extraBuckets);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else {
            double area = width * height;
            double totalBucketsNeeded = Math.ceil(area / areaPerBucket);
            return (int) (totalBucketsNeeded);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else {
            double totalBucketsNeeded = Math.ceil(area / areaPerBucket);
            return (int) (totalBucketsNeeded);
        }
    }
}
