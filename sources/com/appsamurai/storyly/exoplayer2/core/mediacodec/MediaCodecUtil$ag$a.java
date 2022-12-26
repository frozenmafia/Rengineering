package com.appsamurai.storyly.exoplayer2.core.mediacodec;

import android.text.TextUtils;
/* loaded from: classes3.dex */
final class MediaCodecUtil$ag$a {
    public final String ag$a;
    public final boolean ah$a;
    public final boolean valueOf;

    public MediaCodecUtil$ag$a(String str, boolean z, boolean z2) {
        this.ag$a = str;
        this.valueOf = z;
        this.ah$a = z2;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        return ((((hashCode + 31) * 31) + (this.valueOf ? 1231 : 1237)) * 31) + (this.ah$a ? 1231 : 1237);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != MediaCodecUtil$ag$a.class) {
            return false;
        }
        MediaCodecUtil$ag$a mediaCodecUtil$ag$a = (MediaCodecUtil$ag$a) obj;
        return TextUtils.equals(this.ag$a, mediaCodecUtil$ag$a.ag$a) && this.valueOf == mediaCodecUtil$ag$a.valueOf && this.ah$a == mediaCodecUtil$ag$a.ah$a;
    }
}
