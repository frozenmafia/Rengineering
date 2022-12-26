package com.fancode.payment;

import com.apollographql.apollo.api.ResponseField;
import com.dreampay.commons.constants.Constants;
import o.addCallback;
import o.addCallback$ah$a;
import o.getTargetTypes;
import o.hasEnabledCallbacks;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ApplyCouponQuery$HaptikSDK$d {
    public static final values ag$a = new values(null);
    private static final ResponseField[] ah$a = {ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, null), ResponseField.values.HaptikSDK$b("code", "code", null, false, null), ResponseField.values.HaptikSDK$b(Constants.MSG_TITLE_KEY, Constants.MSG_TITLE_KEY, null, false, null), ResponseField.values.HaptikSDK$b(Constants.MSG_TEXT_KEY, Constants.MSG_TEXT_KEY, null, false, null)};
    private final String ah$b;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApplyCouponQuery$HaptikSDK$d) {
            ApplyCouponQuery$HaptikSDK$d applyCouponQuery$HaptikSDK$d = (ApplyCouponQuery$HaptikSDK$d) obj;
            return runAnimators.values((Object) this.toString, (Object) applyCouponQuery$HaptikSDK$d.toString) && runAnimators.values((Object) this.values, (Object) applyCouponQuery$HaptikSDK$d.values) && runAnimators.values((Object) this.ah$b, (Object) applyCouponQuery$HaptikSDK$d.ah$b) && runAnimators.values((Object) this.valueOf, (Object) applyCouponQuery$HaptikSDK$d.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.toString.hashCode() * 31) + this.values.hashCode()) * 31) + this.ah$b.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        String str = this.toString;
        String str2 = this.values;
        String str3 = this.ah$b;
        String str4 = this.valueOf;
        return "ErrorDetails(__typename=" + str + ", code=" + str2 + ", msgTitle=" + str3 + ", msgText=" + str4 + ")";
    }

    public ApplyCouponQuery$HaptikSDK$d(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "__typename");
        runAnimators.ag$a(str2, "code");
        runAnimators.ag$a(str3, "msgTitle");
        runAnimators.ag$a(str4, "msgText");
        this.toString = str;
        this.values = str2;
        this.ah$b = str3;
        this.valueOf = str4;
    }

    public final String invoke() {
        return this.toString;
    }

    public final String ah$a() {
        return this.values;
    }

    public final String values() {
        return this.ah$b;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    public final addCallback HaptikSDK$c() {
        addCallback$ah$a addcallback_ah_a = addCallback.ag$a;
        return new addCallback() { // from class: com.fancode.payment.ApplyCouponQuery$HaptikSDK$d$ag$a
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                runAnimators.valueOf(hasenabledcallbacks, "writer");
                hasenabledcallbacks.values(ApplyCouponQuery$HaptikSDK$d.ah$a[0], ApplyCouponQuery$HaptikSDK$d.this.invoke());
                hasenabledcallbacks.values(ApplyCouponQuery$HaptikSDK$d.ah$a[1], ApplyCouponQuery$HaptikSDK$d.this.ah$a());
                hasenabledcallbacks.values(ApplyCouponQuery$HaptikSDK$d.ah$a[2], ApplyCouponQuery$HaptikSDK$d.this.values());
                hasenabledcallbacks.values(ApplyCouponQuery$HaptikSDK$d.ah$a[3], ApplyCouponQuery$HaptikSDK$d.this.ag$a());
            }
        };
    }

    /* loaded from: classes6.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final ApplyCouponQuery$HaptikSDK$d ag$a(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            String ag$a = removecancellable.ag$a(ApplyCouponQuery$HaptikSDK$d.ah$a[0]);
            runAnimators.toString((Object) ag$a);
            String ag$a2 = removecancellable.ag$a(ApplyCouponQuery$HaptikSDK$d.ah$a[1]);
            runAnimators.toString((Object) ag$a2);
            String ag$a3 = removecancellable.ag$a(ApplyCouponQuery$HaptikSDK$d.ah$a[2]);
            runAnimators.toString((Object) ag$a3);
            String ag$a4 = removecancellable.ag$a(ApplyCouponQuery$HaptikSDK$d.ah$a[3]);
            runAnimators.toString((Object) ag$a4);
            return new ApplyCouponQuery$HaptikSDK$d(ag$a, ag$a2, ag$a3, ag$a4);
        }
    }
}
