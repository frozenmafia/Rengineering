package com.google.ads.interactivemedia.v3.impl.data;
/* loaded from: classes4.dex */
final class aw extends ce {
    private final float volume;

    private aw(float f) {
        this.volume = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ aw(float f, av avVar) {
        this(f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ce) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((ce) obj).volume());
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        float f = this.volume;
        return "VolumeUpdateData{volume=" + f + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ce
    public float volume() {
        return this.volume;
    }
}
