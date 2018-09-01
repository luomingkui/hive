package com.luomk;

public class ETLUtil {

    public static String oriString2ETLString(String ori) {

        StringBuilder etlString = new StringBuilder();
        String[] splits = ori.split("\t");
        if (splits.length < 9) return null;
        splits[3] = splits[3].replace(" ", "");
        for (int i = 0; i < splits.length; i++) {
            if (i < 9) {
                if (i == splits.length - 1) {
                    etlString.append(splits[i]);
                } else {
                    etlString.append(splits[i] + "\t");
                }
            } else {
                if (i == splits.length - 1) {
                    etlString.append(splits[i]);
                } else {
                    etlString.append(splits[i] + "&");
                }
            }
        }

        return etlString.toString();
    }


    public static void main(String[] args) {
        String ab="LzHjIj3fpR8\tXelanderthomas\t686\tComedy\t168\t4545\t4.58\t273\t167\tudr9sLkoZ0s\t3IU1GyX_zio\t0E7Egr8Y1YI\tqr8qZcvTLng\t4WwVOWIqE80\tQeeq5OoLGJ0\tYYDL1SqX-SY\tvWGA5iYgAOU\t8FeIj2HLN8k\tbKlBTr88VTw\tY_59kWK5W3s\tQlJSXVglZ3g\tK3h_9O6OwW0\t4ALe2z---e0\tkdZk1Wk7kSw\thUa7f5XEzGE\taOihMldu_pE\tPlPynB10vP0\tW9DPlAZUH6Q\tvta4RfQ2Z-I\n";

        System.out.println(oriString2ETLString(ab));

    }

}