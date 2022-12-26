package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class w implements be {
    private String detailedReason;
    private FriendlyObstructionPurpose purpose;
    private View view;

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public bf build() {
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        View view = this.view;
        if (view == null || (friendlyObstructionPurpose = this.purpose) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.view == null) {
                sb.append(" view");
            }
            if (this.purpose == null) {
                sb.append(" purpose");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new y(view, friendlyObstructionPurpose, this.detailedReason, null);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        Objects.requireNonNull(friendlyObstructionPurpose, "Null purpose");
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be view(View view) {
        Objects.requireNonNull(view, "Null view");
        this.view = view;
        return this;
    }
}
