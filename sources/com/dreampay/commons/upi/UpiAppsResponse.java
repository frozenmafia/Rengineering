package com.dreampay.commons.upi;

import java.util.ArrayList;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class UpiAppsResponse {
    private final ArrayList<UpiApp> upiApps;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpiAppsResponse copy$default(UpiAppsResponse upiAppsResponse, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = upiAppsResponse.upiApps;
        }
        return upiAppsResponse.copy(arrayList);
    }

    public final ArrayList<UpiApp> component1() {
        return this.upiApps;
    }

    public final UpiAppsResponse copy(ArrayList<UpiApp> arrayList) {
        runAnimators.ag$a(arrayList, "upiApps");
        return new UpiAppsResponse(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpiAppsResponse) && runAnimators.values(this.upiApps, ((UpiAppsResponse) obj).upiApps);
    }

    public int hashCode() {
        return this.upiApps.hashCode();
    }

    public String toString() {
        return "UpiAppsResponse(upiApps=" + this.upiApps + ')';
    }

    public UpiAppsResponse(ArrayList<UpiApp> arrayList) {
        runAnimators.ag$a(arrayList, "upiApps");
        this.upiApps = arrayList;
    }

    public final ArrayList<UpiApp> getUpiApps() {
        return this.upiApps;
    }
}
