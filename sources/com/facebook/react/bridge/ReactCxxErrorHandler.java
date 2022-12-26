package com.facebook.react.bridge;

import java.lang.reflect.Method;
import o.FragmentActivity;
/* loaded from: classes.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }

    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e) {
                FragmentActivity.valueOf("ReactCxxErrorHandler", "Failed to invole error hanlder function", (Throwable) e);
            }
        }
    }
}
