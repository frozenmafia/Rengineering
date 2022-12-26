package com.bugsnag.android;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public enum ThreadType {
    EMPTY(""),
    ANDROID("android"),
    C("c"),
    REACTNATIVEJS("reactnativejs");
    
    public static final valueOf Companion = new valueOf(null);
    private final String desc;

    ThreadType(String str) {
        this.desc = str;
    }

    public final String getDesc$bugsnag_android_core_release() {
        return this.desc;
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        private valueOf() {
        }

        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        public final ThreadType ag$a(String str) {
            ThreadType[] values;
            runAnimators.valueOf(str, "desc");
            for (ThreadType threadType : ThreadType.values()) {
                if (runAnimators.values((Object) threadType.getDesc$bugsnag_android_core_release(), (Object) str)) {
                    return threadType;
                }
            }
            return null;
        }
    }
}
