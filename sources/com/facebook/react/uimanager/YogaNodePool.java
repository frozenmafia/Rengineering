package com.facebook.react.uimanager;

import com.facebook.yoga.YogaNode;
import o.finishUpdate;
/* loaded from: classes4.dex */
public class YogaNodePool {
    private static final Object sInitLock = new Object();
    private static finishUpdate<YogaNode> sPool;

    public static finishUpdate<YogaNode> get() {
        finishUpdate<YogaNode> finishupdate;
        finishUpdate<YogaNode> finishupdate2 = sPool;
        if (finishupdate2 != null) {
            return finishupdate2;
        }
        synchronized (sInitLock) {
            if (sPool == null) {
                sPool = new finishUpdate<>(1024);
            }
            finishupdate = sPool;
        }
        return finishupdate;
    }
}
