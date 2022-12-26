package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ak extends bu {
    private boolean attached;
    private ay bounds;
    private String detailedReason;
    private boolean hidden;
    private FriendlyObstructionPurpose purpose;
    private byte set$0;
    private String type;

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public bu attached(boolean z) {
        this.attached = z;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public bu bounds(ay ayVar) {
        Objects.requireNonNull(ayVar, "Null bounds");
        this.bounds = ayVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public bv build() {
        ay ayVar;
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        String str;
        if (this.set$0 != 3 || (ayVar = this.bounds) == null || (friendlyObstructionPurpose = this.purpose) == null || (str = this.type) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" attached");
            }
            if (this.bounds == null) {
                sb.append(" bounds");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" hidden");
            }
            if (this.purpose == null) {
                sb.append(" purpose");
            }
            if (this.type == null) {
                sb.append(" type");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new am(this.attached, ayVar, this.detailedReason, this.hidden, friendlyObstructionPurpose, str, null);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public bu detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public bu hidden(boolean z) {
        this.hidden = z;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public bu purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        Objects.requireNonNull(friendlyObstructionPurpose, "Null purpose");
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bu
    public bu type(String str) {
        Objects.requireNonNull(str, "Null type");
        this.type = str;
        return this;
    }
}
