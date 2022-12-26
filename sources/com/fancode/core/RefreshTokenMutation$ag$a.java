package com.fancode.core;

import com.apollographql.apollo.api.ResponseField;
import o.addCallback;
import o.addCallback$ah$a;
import o.getTargetTypes;
import o.hasEnabledCallbacks;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class RefreshTokenMutation$ag$a {
    public static final values ag$a = new values(null);
    private static final ResponseField[] valueOf = {ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, null), ResponseField.values.HaptikSDK$b("accessToken", "accessToken", null, false, null)};
    private final String ah$a;
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RefreshTokenMutation$ag$a) {
            RefreshTokenMutation$ag$a refreshTokenMutation$ag$a = (RefreshTokenMutation$ag$a) obj;
            return runAnimators.values((Object) this.ah$a, (Object) refreshTokenMutation$ag$a.ah$a) && runAnimators.values((Object) this.toString, (Object) refreshTokenMutation$ag$a.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        String str = this.ah$a;
        String str2 = this.toString;
        return "RefreshToken(__typename=" + str + ", accessToken=" + str2 + ")";
    }

    public RefreshTokenMutation$ag$a(String str, String str2) {
        runAnimators.ag$a(str, "__typename");
        runAnimators.ag$a(str2, "accessToken");
        this.ah$a = str;
        this.toString = str2;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final String values() {
        return this.toString;
    }

    public final addCallback ah$a() {
        addCallback$ah$a addcallback_ah_a = addCallback.ag$a;
        return new addCallback() { // from class: com.fancode.core.RefreshTokenMutation$ag$a$ah$a
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                runAnimators.valueOf(hasenabledcallbacks, "writer");
                hasenabledcallbacks.values(RefreshTokenMutation$ag$a.valueOf[0], RefreshTokenMutation$ag$a.this.valueOf());
                hasenabledcallbacks.values(RefreshTokenMutation$ag$a.valueOf[1], RefreshTokenMutation$ag$a.this.values());
            }
        };
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final RefreshTokenMutation$ag$a values(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            String ag$a = removecancellable.ag$a(RefreshTokenMutation$ag$a.valueOf[0]);
            runAnimators.toString((Object) ag$a);
            String ag$a2 = removecancellable.ag$a(RefreshTokenMutation$ag$a.valueOf[1]);
            runAnimators.toString((Object) ag$a2);
            return new RefreshTokenMutation$ag$a(ag$a, ag$a2);
        }
    }
}
