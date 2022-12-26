package com.apollographql.apollo.internal;
/* loaded from: classes.dex */
public class CallState$ah$a {
    private final CallState ag$a;

    private CallState$ah$a(CallState callState) {
        this.ag$a = callState;
    }

    public static CallState$ah$a values(CallState callState) {
        return new CallState$ah$a(callState);
    }

    public String toString(CallState... callStateArr) {
        StringBuilder sb = new StringBuilder("Found: " + this.ag$a.name() + ", but expected [");
        int length = callStateArr.length;
        String str = "";
        int i = 0;
        while (i < length) {
            CallState callState = callStateArr[i];
            sb.append(str);
            sb.append(callState.name());
            i++;
            str = ", ";
        }
        sb.append("]");
        return sb.toString();
    }
}
