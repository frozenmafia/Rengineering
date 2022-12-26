package com.fancode.payment;

import com.apollographql.apollo.api.ResponseField;
import o.addCallback;
import o.addCallback$ah$a;
import o.hasEnabledCallbacks;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ApplyCouponQuery$ah$b {
    public static final ApplyCouponQuery$ah$b$ag$a ag$a = new ApplyCouponQuery$ah$b$ag$a(null);
    private static final ResponseField[] values = {ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, null), ResponseField.values.HaptikSDK$b("name", "name", null, false, null), ResponseField.values.HaptikSDK$b("symbol", "symbol", null, false, null)};
    private final String ah$a;
    private final String toString;
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApplyCouponQuery$ah$b) {
            ApplyCouponQuery$ah$b applyCouponQuery$ah$b = (ApplyCouponQuery$ah$b) obj;
            return runAnimators.values((Object) this.ah$a, (Object) applyCouponQuery$ah$b.ah$a) && runAnimators.values((Object) this.valueOf, (Object) applyCouponQuery$ah$b.valueOf) && runAnimators.values((Object) this.toString, (Object) applyCouponQuery$ah$b.toString);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ah$a.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.toString.hashCode();
    }

    public String toString() {
        String str = this.ah$a;
        String str2 = this.valueOf;
        String str3 = this.toString;
        return "Currency3(__typename=" + str + ", name=" + str2 + ", symbol=" + str3 + ")";
    }

    /* loaded from: classes6.dex */
    public static final class values implements addCallback {
        public values() {
            ApplyCouponQuery$ah$b.this = r1;
        }

        @Override // o.addCallback
        public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
            runAnimators.valueOf(hasenabledcallbacks, "writer");
            hasenabledcallbacks.values(ApplyCouponQuery$ah$b.values[0], ApplyCouponQuery$ah$b.this.ah$a());
            hasenabledcallbacks.values(ApplyCouponQuery$ah$b.values[1], ApplyCouponQuery$ah$b.this.ag$a());
            hasenabledcallbacks.values(ApplyCouponQuery$ah$b.values[2], ApplyCouponQuery$ah$b.this.valueOf());
        }
    }

    public ApplyCouponQuery$ah$b(String str, String str2, String str3) {
        runAnimators.ag$a(str, "__typename");
        runAnimators.ag$a(str2, "name");
        runAnimators.ag$a(str3, "symbol");
        this.ah$a = str;
        this.valueOf = str2;
        this.toString = str3;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final addCallback invoke() {
        addCallback$ah$a addcallback_ah_a = addCallback.ag$a;
        return new values();
    }
}
