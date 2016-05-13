package me.chyc.mine.test;

/**
 * Created by yicun.chen on 3/10/16.
 */
public class TestAll {


    public static long concatToLong(int key1, int key2) {
        return ((long) key1 << 32) | key2;
    }

    public static long concatToLong1(int key1, int key2, int key3) {
        return ((long) key1 << 32) | (key2 << 8) | key3;
    }


    public static void main(String args[]) {
//        int shopId = 1234567890;
//        int catId = 33762;
//        int distLevel = 10;
//        long key = concatToLong(shopId, catId);
//        long key1 = concatToLong1(shopId, catId, distLevel);
//        System.out.println(Integer.toBinaryString(shopId));
//        System.out.println(Integer.toBinaryString(catId));
//        System.out.println(Integer.toBinaryString(distLevel));
//        System.out.println(Long.toBinaryString(key) + "\t" + key);
//        System.out.println(Long.toBinaryString(key1) + "\t" + key1);
//
//        String str = "1234567890_10";
//        String[] ts = str.split("_", 2);
//        System.out.println(ts[0] + "\t" + ts[1]);
//
//        str = "1234567890_";
//        ts = str.split("_", 2);
//        System.out.println(ts[0] + "\t" + ts[1]);
////
////        str = "1234567890";
////        ts = str.split("_", 2);
////        System.out.println(ts[0] + "\t" + ts[1]);
//
//        str = "1234567890_10_";
//        ts = str.split("_", 2);
//        System.out.println(ts[0] + "\t" + ts[1]);
//
//        str = "_10";
//        ts = str.split("_", 2);
//        System.out.println(ts[0] + "\t" + ts[1]);


        String featureName = "CONCAT@@_A_B";
        String[] terms = featureName.split("_")[0].split("@",-1);
        for (String term: terms)
            System.out.println("#"+term);

//        terms = StringUtils.splitPreserveAllTokens(":ab:cd:ef::",":");
//
//        for (String term: terms)
//            System.out.println("@"+term);


    }
}
