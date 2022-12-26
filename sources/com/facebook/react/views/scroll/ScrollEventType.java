package com.facebook.react.views.scroll;
/* loaded from: classes4.dex */
public enum ScrollEventType {
    BEGIN_DRAG,
    END_DRAG,
    SCROLL,
    MOMENTUM_BEGIN,
    MOMENTUM_END;

    /* renamed from: com.facebook.react.views.scroll.ScrollEventType$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[ScrollEventType.values().length];
            valueOf = iArr;
            try {
                iArr[ScrollEventType.BEGIN_DRAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[ScrollEventType.END_DRAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                valueOf[ScrollEventType.SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                valueOf[ScrollEventType.MOMENTUM_BEGIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                valueOf[ScrollEventType.MOMENTUM_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String getJSEventName(ScrollEventType scrollEventType) {
        int i = AnonymousClass2.valueOf[scrollEventType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "topMomentumScrollEnd";
                        }
                        throw new IllegalArgumentException("Unsupported ScrollEventType: " + scrollEventType);
                    }
                    return "topMomentumScrollBegin";
                }
                return "topScroll";
            }
            return "topScrollEndDrag";
        }
        return "topScrollBeginDrag";
    }
}
