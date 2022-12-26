package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.avb;
/* loaded from: classes4.dex */
final class aj extends bw {
    private final avb<bv> obstructions;

    private aj(avb<bv> avbVar) {
        this.obstructions = avbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ aj(avb avbVar, ai aiVar) {
        this(avbVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bw) {
            return this.obstructions.equals(((bw) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.impl.data.bw
    public avb<bv> obstructions() {
        return this.obstructions;
    }

    public String toString() {
        String valueOf = String.valueOf(this.obstructions);
        return "ObstructionListData{obstructions=" + valueOf + "}";
    }
}
