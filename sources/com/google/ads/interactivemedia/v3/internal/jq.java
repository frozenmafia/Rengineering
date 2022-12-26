package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.C;
/* loaded from: classes4.dex */
final class jq {
    private final jp a;

    /* renamed from: b  reason: collision with root package name */
    private int f1121b;
    private long c;
    private long d;
    private long e;
    private long f;

    public jq(AudioTrack audioTrack) {
        if (cp.a >= 19) {
            this.a = new jp(audioTrack);
            e();
            return;
        }
        this.a = null;
        h(3);
    }

    private final void h(int i) {
        this.f1121b = i;
        long j = WorkRequest.MIN_BACKOFF_MILLIS;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else if (i == 1) {
            this.d = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        } else {
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }

    public final long a() {
        jp jpVar = this.a;
        if (jpVar != null) {
            return jpVar.a();
        }
        return -1L;
    }

    public final long b() {
        jp jpVar = this.a;
        return jpVar != null ? jpVar.b() : C.TIME_UNSET;
    }

    public final void c() {
        if (this.f1121b == 4) {
            e();
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        if (this.a != null) {
            h(0);
        }
    }

    public final boolean f() {
        return this.f1121b == 2;
    }

    public final boolean g(long j) {
        jp jpVar = this.a;
        if (jpVar != null && j - this.e >= this.d) {
            this.e = j;
            boolean c = jpVar.c();
            int i = this.f1121b;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && c) {
                            e();
                            return true;
                        }
                    } else if (!c) {
                        e();
                        return false;
                    }
                } else if (c) {
                    if (this.a.a() > this.f) {
                        h(2);
                        return true;
                    }
                } else {
                    e();
                }
            } else if (c) {
                if (this.a.b() < this.c) {
                    return false;
                }
                this.f = this.a.a();
                h(1);
                return true;
            } else if (j - this.c > 500000) {
                h(3);
            }
            return c;
        }
        return false;
    }
}
