package com.swmansion.rnscreens;

import com.swmansion.rnscreens.Screen;
/* loaded from: classes5.dex */
public final /* synthetic */ class ScreenStack$ag$a {
    public static final /* synthetic */ int[] ah$a;

    static {
        int[] iArr = new int[Screen.StackAnimation.values().length];
        iArr[Screen.StackAnimation.DEFAULT.ordinal()] = 1;
        iArr[Screen.StackAnimation.NONE.ordinal()] = 2;
        iArr[Screen.StackAnimation.FADE.ordinal()] = 3;
        iArr[Screen.StackAnimation.SLIDE_FROM_RIGHT.ordinal()] = 4;
        iArr[Screen.StackAnimation.SLIDE_FROM_LEFT.ordinal()] = 5;
        iArr[Screen.StackAnimation.SLIDE_FROM_BOTTOM.ordinal()] = 6;
        iArr[Screen.StackAnimation.FADE_FROM_BOTTOM.ordinal()] = 7;
        ah$a = iArr;
    }
}
