package com.appsamurai.storyly;

import kotlin.NoWhenBranchMatchedException;
/* loaded from: classes3.dex */
public enum StorylyLayoutDirection {
    LTR,
    RTL;

    /* loaded from: classes3.dex */
    public final /* synthetic */ class toString {
        public static final /* synthetic */ int[] ag$a;

        static {
            int[] iArr = new int[StorylyLayoutDirection.values().length];
            iArr[StorylyLayoutDirection.LTR.ordinal()] = 1;
            iArr[StorylyLayoutDirection.RTL.ordinal()] = 2;
            ag$a = iArr;
        }
    }

    public final int getLayoutDirection$storyly_release() {
        int i = toString.ag$a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0;
    }
}
