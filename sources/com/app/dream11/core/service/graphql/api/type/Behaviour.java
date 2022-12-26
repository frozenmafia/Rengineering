package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum Behaviour {
    DYNAMIC("DYNAMIC"),
    STATIC("STATIC"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    Behaviour(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final Behaviour safeValueOf(String str) {
            Behaviour behaviour;
            runAnimators.ag$a(str, "rawValue");
            Behaviour[] values = Behaviour.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    behaviour = null;
                    break;
                }
                behaviour = values[i];
                if (runAnimators.values((Object) behaviour.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return behaviour == null ? Behaviour.UNKNOWN__ : behaviour;
        }
    }
}
