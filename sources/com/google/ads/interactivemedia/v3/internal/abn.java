package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
/* loaded from: classes4.dex */
final class abn {
    private final ci a = new ci(8);

    /* renamed from: b  reason: collision with root package name */
    private int f446b;

    private final long b(zd zdVar) throws IOException {
        int i = 0;
        zdVar.f(this.a.H(), 0, 1);
        int i2 = this.a.H()[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (~i3);
            zdVar.f(this.a.H(), 1, i4);
            while (i < i4) {
                i++;
                i5 = (i5 << 8) + (this.a.H()[i] & 255);
            }
            this.f446b += i4 + 1;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean a(zd zdVar) throws IOException {
        long b2;
        int i;
        long b3 = zdVar.b();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        int i2 = (b3 > (-1L) ? 1 : (b3 == (-1L) ? 0 : -1));
        if (i2 != 0 && b3 <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = b3;
        }
        int i3 = (int) j;
        zdVar.f(this.a.H(), 0, 4);
        long p = this.a.p();
        this.f446b = 4;
        while (p != 440786851) {
            int i4 = this.f446b + 1;
            this.f446b = i4;
            if (i4 == i3) {
                return false;
            }
            zdVar.f(this.a.H(), 0, 1);
            p = ((p << 8) & (-256)) | (this.a.H()[0] & 255);
        }
        long b4 = b(zdVar);
        long j2 = this.f446b;
        if (b4 != Long.MIN_VALUE && (i2 == 0 || j2 + b4 < b3)) {
            while (true) {
                int i5 = (this.f446b > (j2 + b4) ? 1 : (this.f446b == (j2 + b4) ? 0 : -1));
                if (i5 < 0) {
                    if (b(zdVar) == Long.MIN_VALUE || (b2 = b(zdVar)) < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int i6 = (int) b2;
                        zdVar.e(i6);
                        this.f446b += i6;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
