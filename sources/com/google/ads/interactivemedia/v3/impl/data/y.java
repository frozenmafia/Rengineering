package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
/* loaded from: classes4.dex */
final class y extends bf {
    private final String detailedReason;
    private final FriendlyObstructionPurpose purpose;
    private final View view;

    private y(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.view = view;
        this.purpose = friendlyObstructionPurpose;
        this.detailedReason = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ y(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str, x xVar) {
        this(view, friendlyObstructionPurpose, str);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bf) {
            bf bfVar = (bf) obj;
            if (this.view.equals(bfVar.view()) && this.purpose.equals(bfVar.purpose())) {
                String str = this.detailedReason;
                if (str == null) {
                    if (bfVar.detailedReason() != null) {
                        return false;
                    }
                } else if (!str.equals(bfVar.detailedReason())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.view.hashCode();
        int hashCode2 = this.purpose.hashCode();
        String str = this.detailedReason;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        String valueOf = String.valueOf(this.view);
        String valueOf2 = String.valueOf(this.purpose);
        String str = this.detailedReason;
        return "FriendlyObstructionImpl{view=" + valueOf + ", purpose=" + valueOf2 + ", detailedReason=" + str + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public View view() {
        return this.view;
    }
}
