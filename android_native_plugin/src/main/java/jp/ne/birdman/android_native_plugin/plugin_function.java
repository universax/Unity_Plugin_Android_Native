package jp.ne.birdman.android_native_plugin;

public class plugin_function {
    // Private Class members
    private static int mInt = 0;

    public static int getInt_JAVA() {
        return mInt;
    }

    public static void setInt_JAVA(int value) {
        mInt = value;
    }
}
