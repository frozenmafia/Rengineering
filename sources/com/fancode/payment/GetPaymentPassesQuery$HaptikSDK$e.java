package com.fancode.payment;

import com.apollographql.apollo.api.ResponseField;
import o.addCallback;
import o.addCallback$ah$a;
import o.getTargetTypes;
import o.hasEnabledCallbacks;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class GetPaymentPassesQuery$HaptikSDK$e {
    private final String ag$a;
    private final String toString;
    public static final toString valueOf = new toString(null);
    private static final ResponseField[] ah$a = {ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, null), ResponseField.values.HaptikSDK$b("name", "name", null, false, null)};

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPaymentPassesQuery$HaptikSDK$e) {
            GetPaymentPassesQuery$HaptikSDK$e getPaymentPassesQuery$HaptikSDK$e = (GetPaymentPassesQuery$HaptikSDK$e) obj;
            return runAnimators.values((Object) this.toString, (Object) getPaymentPassesQuery$HaptikSDK$e.toString) && runAnimators.values((Object) this.ag$a, (Object) getPaymentPassesQuery$HaptikSDK$e.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.toString.hashCode() * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        String str = this.toString;
        String str2 = this.ag$a;
        return "Sport(__typename=" + str + ", name=" + str2 + ")";
    }

    /* loaded from: classes6.dex */
    public static final class valueOf implements addCallback {
        public valueOf() {
        }

        @Override // o.addCallback
        public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
            runAnimators.valueOf(hasenabledcallbacks, "writer");
            hasenabledcallbacks.values(GetPaymentPassesQuery$HaptikSDK$e.ah$a[0], GetPaymentPassesQuery$HaptikSDK$e.this.values());
            hasenabledcallbacks.values(GetPaymentPassesQuery$HaptikSDK$e.ah$a[1], GetPaymentPassesQuery$HaptikSDK$e.this.valueOf());
        }
    }

    public GetPaymentPassesQuery$HaptikSDK$e(String str, String str2) {
        runAnimators.ag$a(str, "__typename");
        runAnimators.ag$a(str2, "name");
        this.toString = str;
        this.ag$a = str2;
    }

    public final String values() {
        return this.toString;
    }

    public final String valueOf() {
        return this.ag$a;
    }

    public final addCallback ag$a() {
        addCallback$ah$a addcallback_ah_a = addCallback.ag$a;
        return new valueOf();
    }

    /* loaded from: classes6.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        public final GetPaymentPassesQuery$HaptikSDK$e ag$a(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            String ag$a = removecancellable.ag$a(GetPaymentPassesQuery$HaptikSDK$e.ah$a[0]);
            runAnimators.toString((Object) ag$a);
            String ag$a2 = removecancellable.ag$a(GetPaymentPassesQuery$HaptikSDK$e.ah$a[1]);
            runAnimators.toString((Object) ag$a2);
            return new GetPaymentPassesQuery$HaptikSDK$e(ag$a, ag$a2);
        }
    }
}
