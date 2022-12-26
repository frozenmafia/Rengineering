package com.fancode.payment;

import com.apollographql.apollo.api.ResponseField;
import com.sendbird.android.constant.StringSet;
import o.addCallback;
import o.addCallback$ah$a;
import o.hasEnabledCallbacks;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class GetOrdersQuery$HaptikSDK$a {
    public static final GetOrdersQuery$HaptikSDK$a$ah$a ag$a = new GetOrdersQuery$HaptikSDK$a$ah$a(null);
    private static final ResponseField[] values = {ResponseField.values.HaptikSDK$b("__typename", "__typename", null, false, null), ResponseField.values.valueOf("previous", "previous", null, true, null), ResponseField.values.valueOf(StringSet.next, StringSet.next, null, true, null)};
    private final String ah$a;
    private final Integer toString;
    private final Integer valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOrdersQuery$HaptikSDK$a) {
            GetOrdersQuery$HaptikSDK$a getOrdersQuery$HaptikSDK$a = (GetOrdersQuery$HaptikSDK$a) obj;
            return runAnimators.values((Object) this.ah$a, (Object) getOrdersQuery$HaptikSDK$a.ah$a) && runAnimators.values(this.toString, getOrdersQuery$HaptikSDK$a.toString) && runAnimators.values(this.valueOf, getOrdersQuery$HaptikSDK$a.valueOf);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        Integer num = this.toString;
        int hashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.valueOf;
        return (((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.ah$a;
        Integer num = this.toString;
        Integer num2 = this.valueOf;
        return "PageInfo(__typename=" + str + ", previous=" + num + ", next=" + num2 + ")";
    }

    /* loaded from: classes4.dex */
    public static final class valueOf implements addCallback {
        public valueOf() {
            GetOrdersQuery$HaptikSDK$a.this = r1;
        }

        @Override // o.addCallback
        public void marshal(hasEnabledCallbacks hasenabledcallbacks) {
            runAnimators.valueOf(hasenabledcallbacks, "writer");
            hasenabledcallbacks.values(GetOrdersQuery$HaptikSDK$a.values[0], GetOrdersQuery$HaptikSDK$a.this.valueOf());
            hasenabledcallbacks.ah$a(GetOrdersQuery$HaptikSDK$a.values[1], GetOrdersQuery$HaptikSDK$a.this.ah$a());
            hasenabledcallbacks.ah$a(GetOrdersQuery$HaptikSDK$a.values[2], GetOrdersQuery$HaptikSDK$a.this.values());
        }
    }

    public GetOrdersQuery$HaptikSDK$a(String str, Integer num, Integer num2) {
        runAnimators.ag$a(str, "__typename");
        this.ah$a = str;
        this.toString = num;
        this.valueOf = num2;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final Integer ah$a() {
        return this.toString;
    }

    public final Integer values() {
        return this.valueOf;
    }

    public final addCallback HaptikSDK$b() {
        addCallback$ah$a addcallback_ah_a = addCallback.ag$a;
        return new valueOf();
    }
}
