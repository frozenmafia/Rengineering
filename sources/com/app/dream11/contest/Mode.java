package com.app.dream11.contest;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public enum Mode {
    MODE_BUY_FC_PASS,
    MODE_PAY_IF_YOU_WIN,
    MODE_STREAMING_COMPLETED,
    MODE_CLAIM_REWARDS;
    
    public static final toString Companion = new toString(null);

    /* loaded from: classes.dex */
    public static final class toString {

        /* renamed from: com.app.dream11.contest.Mode$toString$toString  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final /* synthetic */ class C0234toString {
            public static final /* synthetic */ int[] toString;

            static {
                int[] iArr = new int[Mode.values().length];
                iArr[Mode.MODE_BUY_FC_PASS.ordinal()] = 1;
                iArr[Mode.MODE_PAY_IF_YOU_WIN.ordinal()] = 2;
                iArr[Mode.MODE_STREAMING_COMPLETED.ordinal()] = 3;
                toString = iArr;
            }
        }

        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final String ag$a(Mode mode) {
            runAnimators.ag$a(mode, "mode");
            int i = C0234toString.toString[mode.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? "" : "Go to Matches" : "Watch Live" : "Get the Pass";
        }
    }
}
