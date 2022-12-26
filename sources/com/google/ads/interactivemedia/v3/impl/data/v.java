package com.google.ads.interactivemedia.v3.impl.data;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class v extends bd {
    private final int major;
    private final int micro;
    private final int minor;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.micro = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bd) {
            bd bdVar = (bd) obj;
            return this.major == bdVar.major() && this.minor == bdVar.minor() && this.micro == bdVar.micro();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003) ^ this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bd
    public int minor() {
        return this.minor;
    }

    public String toString() {
        int i = this.major;
        int i2 = this.minor;
        int i3 = this.micro;
        return "EspVersionData{major=" + i + ", minor=" + i2 + ", micro=" + i3 + "}";
    }
}
