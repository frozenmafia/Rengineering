package com.google.ads.interactivemedia.v3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;
/* loaded from: classes4.dex */
final class acv {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(zd zdVar) throws IOException {
        return c(zdVar, true);
    }

    public static boolean b(zd zdVar) throws IOException {
        return c(zdVar, false);
    }

    private static boolean c(zd zdVar, boolean z) throws IOException {
        boolean z2;
        long b2 = zdVar.b();
        long j = -1;
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        int i = (b2 > (-1L) ? 1 : (b2 == (-1L) ? 0 : -1));
        if (i != 0 && b2 <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = b2;
        }
        int i2 = (int) j2;
        ci ciVar = new ci(64);
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            ciVar.B(8);
            if (!zdVar.k(ciVar.H(), z3 ? 1 : 0, 8, true)) {
                break;
            }
            long p = ciVar.p();
            int e = ciVar.e();
            int i4 = 16;
            if (p == 1) {
                zdVar.f(ciVar.H(), 8, 8);
                ciVar.E(16);
                p = ciVar.o();
            } else {
                if (p == 0) {
                    long b3 = zdVar.b();
                    if (b3 != j) {
                        p = (b3 - zdVar.c()) + 8;
                    }
                }
                i4 = 8;
            }
            long j3 = i4;
            if (p < j3) {
                return z3;
            }
            i3 += i4;
            if (e == 1836019574) {
                i2 += (int) p;
                if (i != 0 && i2 > b2) {
                    i2 = (int) b2;
                }
                j = -1;
            } else if (e == 1836019558 || e == 1836475768) {
                z2 = true;
                break;
            } else {
                long j4 = b2;
                if ((i3 + p) - j3 >= i2) {
                    break;
                }
                int i5 = (int) (p - j3);
                i3 += i5;
                if (e == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    ciVar.B(i5);
                    zdVar.f(ciVar.H(), 0, i5);
                    for (int i6 = 0; i6 < (i5 >> 2); i6++) {
                        if (i6 == 1) {
                            ciVar.G(4);
                        } else {
                            int e2 = ciVar.e();
                            if ((e2 >>> 8) != 3368816) {
                                if (e2 == 1751476579) {
                                    e2 = Sniffer.BRAND_HEIC;
                                }
                                int[] iArr = a;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != e2) {
                                    }
                                }
                                continue;
                            }
                            z4 = true;
                            break;
                        }
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i5 != 0) {
                    zdVar.e(i5);
                }
                b2 = j4;
                j = -1;
                z3 = false;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }
}
