// Automatically generated by rust_swig
package com.rust.app.swapiclient.swapi;
import androidx.annotation.NonNull;

public final class People {

    private People() {}

    public final @NonNull String getName() {
        String ret = do_getName(mNativeObj);

        return ret;
    }
    private static native @NonNull String do_getName(long self);

    public final @NonNull String getGender() {
        String ret = do_getGender(mNativeObj);

        return ret;
    }
    private static native @NonNull String do_getGender(long self);

    public final @NonNull String getMass() {
        String ret = do_getMass(mNativeObj);

        return ret;
    }
    private static native @NonNull String do_getMass(long self);

    public synchronized void delete() {
        if (mNativeObj != 0) {
            do_delete(mNativeObj);
            mNativeObj = 0;
       }
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            delete();
        }
        finally {
             super.finalize();
        }
    }
    private static native void do_delete(long me);
    /*package*/ People(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}