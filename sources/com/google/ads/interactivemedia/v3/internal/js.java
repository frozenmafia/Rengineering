package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class js {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;
    private final jr a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f1122b;
    private AudioTrack c;
    private int d;
    private int e;
    private jq f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private Method n;

    /* renamed from: o  reason: collision with root package name */
    private long f1123o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public js(jr jrVar) {
        this.a = jrVar;
        if (cp.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f1122b = new long[10];
    }

    private final long l(long j) {
        return (j * 1000000) / this.g;
    }

    private final long m() {
        AudioTrack audioTrack = this.c;
        af.s(audioTrack);
        if (this.x != C.TIME_UNSET) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.u = this.s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.u;
        }
        if (cp.a <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.s > 0 && playState == 3) {
                if (this.y == C.TIME_UNSET) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = C.TIME_UNSET;
            playbackHeadPosition = j;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    private final long n() {
        return l(m());
    }

    private final void o() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
    }

    public final int a(long j) {
        return this.e - ((int) (j - (m() * this.d)));
    }

    public final long b(boolean z) {
        long j;
        long max;
        long j2;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.c;
        af.s(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            long n = n();
            if (n != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.m >= 30000) {
                    long[] jArr = this.f1122b;
                    int i = this.v;
                    jArr[i] = n - nanoTime;
                    this.v = (i + 1) % 10;
                    int i2 = this.w;
                    if (i2 < 10) {
                        this.w = i2 + 1;
                    }
                    this.m = nanoTime;
                    this.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.w;
                        if (i3 >= i4) {
                            break;
                        }
                        this.l += this.f1122b[i3] / i4;
                        i3++;
                    }
                }
                if (!this.h) {
                    jq jqVar = this.f;
                    af.s(jqVar);
                    if (jqVar.g(nanoTime)) {
                        long b2 = jqVar.b();
                        long a = jqVar.a();
                        if (Math.abs(b2 - nanoTime) > 5000000) {
                            j2 = nanoTime;
                            this.a.d(a, b2, nanoTime, n);
                            jqVar.d();
                        } else {
                            j2 = nanoTime;
                            if (Math.abs(l(a) - n) > 5000000) {
                                this.a.c(a, b2, j2, n);
                                jqVar.d();
                            } else {
                                jqVar.c();
                            }
                        }
                    } else {
                        j2 = nanoTime;
                    }
                    if (this.q && (method = this.n) != null) {
                        long j3 = j2;
                        if (j3 - this.r >= 500000) {
                            try {
                                af.s(this.c);
                                int i5 = cp.a;
                                long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - this.i;
                                this.f1123o = intValue;
                                long max2 = Math.max(intValue, 0L);
                                this.f1123o = max2;
                                if (max2 > 5000000) {
                                    this.a.a(max2);
                                    this.f1123o = 0L;
                                }
                            } catch (Exception unused) {
                                this.n = null;
                            }
                            this.r = j3;
                        }
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        jq jqVar2 = this.f;
        af.s(jqVar2);
        boolean f = jqVar2.f();
        if (f) {
            max = l(jqVar2.a()) + cp.q(nanoTime2 - jqVar2.b(), this.j);
        } else {
            if (this.w == 0) {
                j = n();
            } else {
                j = this.l + nanoTime2;
            }
            max = !z ? Math.max(0L, j - this.f1123o) : j;
        }
        if (this.D != f) {
            this.F = this.C;
            this.E = this.B;
        }
        long j4 = nanoTime2 - this.F;
        if (j4 < 1000000) {
            long j5 = (j4 * 1000) / 1000000;
            max = ((max * j5) + ((1000 - j5) * (this.E + cp.q(j4, this.j)))) / 1000;
        }
        if (!this.k) {
            long j6 = this.B;
            if (max > j6) {
                this.k = true;
                this.a.b(System.currentTimeMillis() - cp.x(cp.s(cp.x(max - j6), this.j)));
            }
        }
        this.C = nanoTime2;
        this.B = max;
        this.D = f;
        return max;
    }

    public final void c(long j) {
        this.z = m();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public final void d() {
        o();
        this.c = null;
        this.f = null;
    }

    public final void e(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new jq(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && cp.a < 23 && (i == 5 || i == 6);
        boolean Y = cp.Y(i);
        this.q = Y;
        this.i = Y ? l(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.r = 0L;
        this.f1123o = 0L;
        this.j = 1.0f;
    }

    public final void f() {
        jq jqVar = this.f;
        af.s(jqVar);
        jqVar.e();
    }

    public final boolean g(long j) {
        if (j <= m()) {
            if (this.h) {
                AudioTrack audioTrack = this.c;
                af.s(audioTrack);
                return audioTrack.getPlayState() == 2 && m() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean h() {
        AudioTrack audioTrack = this.c;
        af.s(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j) {
        return this.y != C.TIME_UNSET && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public final boolean j(long j) {
        AudioTrack audioTrack = this.c;
        af.s(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            } else if (playState == 1) {
                if (m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.p;
        boolean g = g(j);
        this.p = g;
        if (z && !g && playState != 1) {
            this.a.e(this.e, cp.x(this.i));
        }
        return true;
    }

    public final boolean k() {
        o();
        if (this.x == C.TIME_UNSET) {
            jq jqVar = this.f;
            af.s(jqVar);
            jqVar.e();
            return true;
        }
        return false;
    }
}
