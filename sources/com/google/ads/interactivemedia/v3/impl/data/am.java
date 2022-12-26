package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
/* loaded from: classes4.dex */
final class am extends bv {
    private final boolean attached;
    private final ay bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;
    private final String type;

    private am(boolean z, ay ayVar, String str, boolean z2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z;
        this.bounds = ayVar;
        this.detailedReason = str;
        this.hidden = z2;
        this.purpose = friendlyObstructionPurpose;
        this.type = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ am(boolean z, ay ayVar, String str, boolean z2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2, al alVar) {
        this(z, ayVar, str, z2, friendlyObstructionPurpose, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.bv
    public boolean attached() {
        return this.attached;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.bv
    public ay bounds() {
        return this.bounds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.bv
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bv) {
            bv bvVar = (bv) obj;
            if (this.attached == bvVar.attached() && this.bounds.equals(bvVar.bounds())) {
                String str = this.detailedReason;
                if (str == null) {
                    if (bvVar.detailedReason() != null) {
                        return false;
                    }
                } else if (!str.equals(bvVar.detailedReason())) {
                    return false;
                }
                return this.hidden == bvVar.hidden() && this.purpose.equals(bvVar.purpose()) && this.type.equals(bvVar.type());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = true != this.attached ? 1237 : 1231;
        int hashCode = this.bounds.hashCode();
        String str = this.detailedReason;
        int hashCode2 = str == null ? 0 : str.hashCode();
        return ((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ (true != this.hidden ? 1237 : 1231)) * 1000003) ^ this.purpose.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.bv
    public boolean hidden() {
        return this.hidden;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.bv
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        boolean z = this.attached;
        String valueOf = String.valueOf(this.bounds);
        String str = this.detailedReason;
        boolean z2 = this.hidden;
        String valueOf2 = String.valueOf(this.purpose);
        String str2 = this.type;
        return "ObstructionData{attached=" + z + ", bounds=" + valueOf + ", detailedReason=" + str + ", hidden=" + z2 + ", purpose=" + valueOf2 + ", type=" + str2 + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.bv
    public String type() {
        return this.type;
    }
}
