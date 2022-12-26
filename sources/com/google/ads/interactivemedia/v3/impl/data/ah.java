package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.avb;
import java.util.List;
/* loaded from: classes4.dex */
final class ah extends bt {
    private avb<bv> obstructions;

    @Override // com.google.ads.interactivemedia.v3.impl.data.bt
    public bw build() {
        avb<bv> avbVar = this.obstructions;
        if (avbVar != null) {
            return new aj(avbVar, null);
        }
        throw new IllegalStateException("Missing required properties: obstructions");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bt
    public bt obstructions(List<bv> list) {
        this.obstructions = avb.m(list);
        return this;
    }
}
