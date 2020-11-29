public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        double wallArea = width * height;
        double bucketsUsed = wallArea / areaPerBucket;
        int result = (int) Math.round(bucketsUsed - extraBuckets);

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            return result;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double wallArea = width * height;
        double bucketsUsed = wallArea / areaPerBucket;
        int result = (int) Math.round(bucketsUsed);

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return result;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ( area <=0 || areaPerBucket <= 0){
            return -1;
        }else{
            int result = (int) Math.round(area / areaPerBucket);
            return result;
        }
    }
}