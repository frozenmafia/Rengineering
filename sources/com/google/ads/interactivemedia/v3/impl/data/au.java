package com.google.ads.interactivemedia.v3.impl.data;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class au extends cd {
    private byte set$0;
    private float volume;

    @Override // com.google.ads.interactivemedia.v3.impl.data.cd
    public ce build() {
        if (this.set$0 == 1) {
            return new aw(this.volume, null);
        }
        throw new IllegalStateException("Missing required properties: volume");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.cd
    public cd volume(float f) {
        this.volume = f;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }
}
