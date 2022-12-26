package com.fancode.payment;

import com.apollographql.apollo.api.ResponseField;
import o.addCallback;
import o.addCallback$ah$a;
import o.getTargetTypes;
import o.hasEnabledCallbacks;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ApplyCouponQuery$HaptikSDK$a {
    private final String ah$a;
    private final String toString;
    private final String values;
    public static final toString valueOf = new toString(null);
    private static final ResponseField[] ag$a = {ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, null), ResponseField.values.HaptikSDK$b("name", "name", null, false, null), ResponseField.values.HaptikSDK$b("symbol", "symbol", null, false, null)};

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApplyCouponQuery$HaptikSDK$a) {
            ApplyCouponQuery$HaptikSDK$a applyCouponQuery$HaptikSDK$a = (ApplyCouponQuery$HaptikSDK$a) obj;
            return runAnimators.values((Object) this.values, (Object) applyCouponQuery$HaptikSDK$a.values) && runAnimators.values((Object) this.ah$a, (Object) applyCouponQuery$HaptikSDK$a.ah$a) && runAnimators.values((Object) this.toString, (Object) applyCouponQuery$HaptikSDK$a.toString);
        }
        return false;
    }

    public int hashCode() {
        return (((this.values.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.toString.hashCode();
    }

    public String toString() {
        String str = this.values;
        String str2 = this.ah$a;
        String str3 = this.toString;
        return "Currency(__typename=" + str + ", name=" + str2 + ", symbol=" + str3 + ")";
    }

    public ApplyCouponQuery$HaptikSDK$a(String str, String str2, String str3) {
        runAnimators.ag$a(str, "__typename");
        runAnimators.ag$a(str2, "name");
        runAnimators.ag$a(str3, "symbol");
        this.values = str;
        this.ah$a = str2;
        this.toString = str3;
    }

    public final String values() {
        return this.values;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final addCallback ah$b() {
        addCallback$ah$a addcallback_ah_a = addCallback.ag$a;
        return new addCallback() { // from class: com.fancode.payment.ApplyCouponQuery$HaptikSDK$a$ah$a
            @Override // o.addCallback
            public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
                runAnimators.valueOf(hasenabledcallbacks, "writer");
                hasenabledcallbacks.values(ApplyCouponQuery$HaptikSDK$a.ag$a[0], ApplyCouponQuery$HaptikSDK$a.this.values());
                hasenabledcallbacks.values(ApplyCouponQuery$HaptikSDK$a.ag$a[1], ApplyCouponQuery$HaptikSDK$a.this.valueOf());
                hasenabledcallbacks.values(ApplyCouponQuery$HaptikSDK$a.ag$a[2], ApplyCouponQuery$HaptikSDK$a.this.ah$a());
            }
        };
    }

    /* loaded from: classes6.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final ApplyCouponQuery$HaptikSDK$a values(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            String ag$a = removecancellable.ag$a(ApplyCouponQuery$HaptikSDK$a.ag$a[0]);
            runAnimators.toString((Object) ag$a);
            String ag$a2 = removecancellable.ag$a(ApplyCouponQuery$HaptikSDK$a.ag$a[1]);
            runAnimators.toString((Object) ag$a2);
            String ag$a3 = removecancellable.ag$a(ApplyCouponQuery$HaptikSDK$a.ag$a[2]);
            runAnimators.toString((Object) ag$a3);
            return new ApplyCouponQuery$HaptikSDK$a(ag$a, ag$a2, ag$a3);
        }
    }
}
