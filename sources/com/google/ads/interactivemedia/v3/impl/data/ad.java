package com.google.ads.interactivemedia.v3.impl.data;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ad extends bm {
    private final bk component;
    private final bp loggableException;
    private final bl method;
    private final long timestamp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(long j, bk bkVar, bl blVar, bp bpVar) {
        this.timestamp = j;
        Objects.requireNonNull(bkVar, "Null component");
        this.component = bkVar;
        Objects.requireNonNull(blVar, "Null method");
        this.method = blVar;
        this.loggableException = bpVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bm
    public bk component() {
        return this.component;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bm) {
            bm bmVar = (bm) obj;
            if (this.timestamp == bmVar.timestamp() && this.component.equals(bmVar.component()) && this.method.equals(bmVar.method())) {
                bp bpVar = this.loggableException;
                if (bpVar == null) {
                    if (bmVar.loggableException() != null) {
                        return false;
                    }
                } else if (!bpVar.equals(bmVar.loggableException())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.timestamp;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.component.hashCode();
        int hashCode2 = this.method.hashCode();
        bp bpVar = this.loggableException;
        return ((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ (bpVar == null ? 0 : bpVar.hashCode());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bm
    public bp loggableException() {
        return this.loggableException;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bm
    public bl method() {
        return this.method;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bm
    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        long j = this.timestamp;
        String valueOf = String.valueOf(this.component);
        String valueOf2 = String.valueOf(this.method);
        String valueOf3 = String.valueOf(this.loggableException);
        return "InstrumentationData{timestamp=" + j + ", component=" + valueOf + ", method=" + valueOf2 + ", loggableException=" + valueOf3 + "}";
    }
}
