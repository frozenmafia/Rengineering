package com.app.dream11.model;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class FpvDetailsResponse implements Serializable {
    private final boolean isReferralBlocked;
    private final PopupInfo popupInfo;

    public static /* synthetic */ FpvDetailsResponse copy$default(FpvDetailsResponse fpvDetailsResponse, boolean z, PopupInfo popupInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fpvDetailsResponse.isReferralBlocked;
        }
        if ((i & 2) != 0) {
            popupInfo = fpvDetailsResponse.popupInfo;
        }
        return fpvDetailsResponse.copy(z, popupInfo);
    }

    public final boolean component1() {
        return this.isReferralBlocked;
    }

    public final PopupInfo component2() {
        return this.popupInfo;
    }

    public final FpvDetailsResponse copy(boolean z, PopupInfo popupInfo) {
        runAnimators.ag$a(popupInfo, "popupInfo");
        return new FpvDetailsResponse(z, popupInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FpvDetailsResponse) {
            FpvDetailsResponse fpvDetailsResponse = (FpvDetailsResponse) obj;
            return this.isReferralBlocked == fpvDetailsResponse.isReferralBlocked && runAnimators.values(this.popupInfo, fpvDetailsResponse.popupInfo);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isReferralBlocked;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.popupInfo.hashCode();
    }

    public String toString() {
        boolean z = this.isReferralBlocked;
        PopupInfo popupInfo = this.popupInfo;
        return "FpvDetailsResponse(isReferralBlocked=" + z + ", popupInfo=" + popupInfo + ")";
    }

    public FpvDetailsResponse(boolean z, PopupInfo popupInfo) {
        runAnimators.ag$a(popupInfo, "popupInfo");
        this.isReferralBlocked = z;
        this.popupInfo = popupInfo;
    }

    public final boolean isReferralBlocked() {
        return this.isReferralBlocked;
    }

    public final PopupInfo getPopupInfo() {
        return this.popupInfo;
    }
}
