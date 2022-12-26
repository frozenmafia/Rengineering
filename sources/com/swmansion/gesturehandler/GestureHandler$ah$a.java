package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class GestureHandler$ah$a {
    public /* synthetic */ GestureHandler$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private GestureHandler$ah$a() {
    }

    public static final /* synthetic */ void ah$a(GestureHandler$ah$a gestureHandler$ah$a, int i) {
        gestureHandler$ah$a.valueOf(i);
    }

    public static final /* synthetic */ boolean values(GestureHandler$ah$a gestureHandler$ah$a, float f) {
        return gestureHandler$ah$a.ah$a(f);
    }

    public final void valueOf(int i) {
        if (GestureHandler.HaptikSDK$c() == null) {
            GestureHandler.toString(new MotionEvent.PointerProperties[12]);
            GestureHandler.ag$a(new MotionEvent.PointerCoords[12]);
        }
        while (i > 0) {
            MotionEvent.PointerProperties[] HaptikSDK$c = GestureHandler.HaptikSDK$c();
            MotionEvent.PointerCoords[] pointerCoordsArr = null;
            if (HaptikSDK$c == null) {
                runAnimators.valueOf("pointerProps");
                HaptikSDK$c = null;
            }
            int i2 = i - 1;
            if (HaptikSDK$c[i2] != null) {
                return;
            }
            MotionEvent.PointerProperties[] HaptikSDK$c2 = GestureHandler.HaptikSDK$c();
            if (HaptikSDK$c2 == null) {
                runAnimators.valueOf("pointerProps");
                HaptikSDK$c2 = null;
            }
            HaptikSDK$c2[i2] = new MotionEvent.PointerProperties();
            MotionEvent.PointerCoords[] ag$a = GestureHandler.ag$a();
            if (ag$a == null) {
                runAnimators.valueOf("pointerCoords");
            } else {
                pointerCoordsArr = ag$a;
            }
            pointerCoordsArr[i2] = new MotionEvent.PointerCoords();
            i--;
        }
    }

    public final boolean ah$a(float f) {
        return !Float.isNaN(f);
    }
}
