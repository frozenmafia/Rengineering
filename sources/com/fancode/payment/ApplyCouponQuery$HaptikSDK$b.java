package com.fancode.payment;

import com.apollographql.apollo.api.ResponseField;
import o.addCallback;
import o.addCallback$ah$a;
import o.hasEnabledCallbacks;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ApplyCouponQuery$HaptikSDK$b {
    private final String ag$a;
    private final String ah$a;
    private final String toString;
    public static final ApplyCouponQuery$HaptikSDK$b$ag$a values = new ApplyCouponQuery$HaptikSDK$b$ag$a(null);
    private static final ResponseField[] valueOf = {ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, null), ResponseField.values.HaptikSDK$b("name", "name", null, false, null), ResponseField.values.HaptikSDK$b("symbol", "symbol", null, false, null)};

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApplyCouponQuery$HaptikSDK$b) {
            ApplyCouponQuery$HaptikSDK$b applyCouponQuery$HaptikSDK$b = (ApplyCouponQuery$HaptikSDK$b) obj;
            return runAnimators.values((Object) this.toString, (Object) applyCouponQuery$HaptikSDK$b.toString) && runAnimators.values((Object) this.ag$a, (Object) applyCouponQuery$HaptikSDK$b.ag$a) && runAnimators.values((Object) this.ah$a, (Object) applyCouponQuery$HaptikSDK$b.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.toString.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        String str = this.toString;
        String str2 = this.ag$a;
        String str3 = this.ah$a;
        return "Currency2(__typename=" + str + ", name=" + str2 + ", symbol=" + str3 + ")";
    }

    public ApplyCouponQuery$HaptikSDK$b(String str, String str2, String str3) {
        runAnimators.ag$a(str, "__typename");
        runAnimators.ag$a(str2, "name");
        runAnimators.ag$a(str3, "symbol");
        this.toString = str;
        this.ag$a = str2;
        this.ah$a = str3;
    }

    public final String ag$a() {
        return this.toString;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final addCallback invoke() {
        addCallback$ah$a addcallback_ah_a = addCallback.ag$a;
        return new addCallback() { // from class: com.fancode.payment.ApplyCouponQuery$HaptikSDK$b$ah$a
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                ResponseField[] responseFieldArr;
                ResponseField[] responseFieldArr2;
                ResponseField[] responseFieldArr3;
                runAnimators.valueOf(hasenabledcallbacks, "writer");
                responseFieldArr = ApplyCouponQuery$HaptikSDK$b.valueOf;
                hasenabledcallbacks.values(responseFieldArr[0], ApplyCouponQuery$HaptikSDK$b.this.ag$a());
                responseFieldArr2 = ApplyCouponQuery$HaptikSDK$b.valueOf;
                hasenabledcallbacks.values(responseFieldArr2[1], ApplyCouponQuery$HaptikSDK$b.this.valueOf());
                responseFieldArr3 = ApplyCouponQuery$HaptikSDK$b.valueOf;
                hasenabledcallbacks.values(responseFieldArr3[2], ApplyCouponQuery$HaptikSDK$b.this.ah$a());
            }
        };
    }
}
