package com.bugsnag.android;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public enum ErrorType {
    ANDROID("android"),
    REACTNATIVEJS("reactnativejs"),
    C("c"),
    DART("dart");
    
    public static final valueOf Companion = new valueOf(null);
    private final String desc;

    public static final ErrorType fromDescriptor(String str) {
        return Companion.toString(str);
    }

    ErrorType(String str) {
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

        public final ErrorType toString(String str) {
            ErrorType[] values;
            runAnimators.valueOf(str, "desc");
            for (ErrorType errorType : ErrorType.values()) {
                if (runAnimators.values((Object) errorType.getDesc$bugsnag_android_core_release(), (Object) str)) {
                    return errorType;
                }
            }
            return null;
        }
    }
}
