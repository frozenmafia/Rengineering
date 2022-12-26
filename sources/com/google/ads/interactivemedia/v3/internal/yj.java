package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public final class yj {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1361b = {1, 2, 3, 6};
    private static final int[] c = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] d = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] e = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, BR.sortType, 512, 576, 640};
    private static final int[] g = {69, 87, 104, 121, 139, 174, 208, 243, 278, BR.rowHandler, 417, BR.teamPoint, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f1361b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b2 = bArr[4];
        return f((b2 & 192) >> 6, b2 & 63);
    }

    public static s c(ci ciVar, String str, String str2, o oVar) {
        int i = c[(ciVar.i() & 192) >> 6];
        int i2 = ciVar.i();
        int i3 = e[(i2 & 56) >> 3];
        if ((i2 & 4) != 0) {
            i3++;
        }
        r rVar = new r();
        rVar.S(str);
        rVar.ae(MimeTypes.AUDIO_AC3);
        rVar.H(i3);
        rVar.af(i);
        rVar.M(oVar);
        rVar.V(str2);
        return rVar.v();
    }

    public static s d(ci ciVar, String str, String str2, o oVar) {
        ciVar.G(2);
        int i = c[(ciVar.i() & 192) >> 6];
        int i2 = ciVar.i();
        int i3 = e[(i2 & 14) >> 1];
        if ((i2 & 1) != 0) {
            i3++;
        }
        if (((ciVar.i() & 30) >> 1) > 0 && (2 & ciVar.i()) != 0) {
            i3 += 2;
        }
        String str3 = (ciVar.a() <= 0 || (ciVar.i() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC;
        r rVar = new r();
        rVar.S(str);
        rVar.ae(str3);
        rVar.H(i3);
        rVar.af(i);
        rVar.M(oVar);
        rVar.V(str2);
        return rVar.v();
    }

    public static yi e(ch chVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int c2;
        int i5;
        int i6;
        int i7;
        int b2 = chVar.b();
        chVar.i(40);
        int c3 = chVar.c(5);
        chVar.g(b2);
        if (c3 > 10) {
            chVar.i(16);
            int c4 = chVar.c(2);
            if (c4 == 0) {
                r9 = 0;
            } else if (c4 == 1) {
                r9 = 1;
            } else if (c4 == 2) {
                r9 = 2;
            }
            chVar.i(3);
            int c5 = chVar.c(11) + 1;
            int c6 = chVar.c(2);
            if (c6 == 3) {
                i6 = d[chVar.c(2)];
                c2 = 3;
                i5 = 6;
            } else {
                c2 = chVar.c(2);
                i5 = f1361b[c2];
                i6 = c[c6];
            }
            int c7 = chVar.c(3);
            boolean k = chVar.k();
            int i8 = e[c7];
            chVar.i(10);
            if (chVar.k()) {
                chVar.i(8);
            }
            if (c7 == 0) {
                chVar.i(5);
                if (chVar.k()) {
                    chVar.i(8);
                }
                i7 = 0;
            } else {
                i7 = c7;
            }
            if (r9 == 1) {
                if (chVar.k()) {
                    chVar.i(16);
                }
                r9 = 1;
            }
            if (chVar.k()) {
                if (i7 > 2) {
                    chVar.i(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    chVar.i(6);
                }
                if ((i7 & 4) != 0) {
                    chVar.i(6);
                }
                if (k && chVar.k()) {
                    chVar.i(5);
                }
                if (r9 == 0) {
                    if (chVar.k()) {
                        chVar.i(6);
                    }
                    if (i7 == 0 && chVar.k()) {
                        chVar.i(6);
                    }
                    if (chVar.k()) {
                        chVar.i(6);
                    }
                    int c8 = chVar.c(2);
                    if (c8 == 1) {
                        chVar.i(5);
                    } else if (c8 == 2) {
                        chVar.i(12);
                    } else if (c8 == 3) {
                        int c9 = chVar.c(5);
                        if (chVar.k()) {
                            chVar.i(5);
                            if (chVar.k()) {
                                chVar.i(4);
                            }
                            if (chVar.k()) {
                                chVar.i(4);
                            }
                            if (chVar.k()) {
                                chVar.i(4);
                            }
                            if (chVar.k()) {
                                chVar.i(4);
                            }
                            if (chVar.k()) {
                                chVar.i(4);
                            }
                            if (chVar.k()) {
                                chVar.i(4);
                            }
                            if (chVar.k()) {
                                chVar.i(4);
                            }
                            if (chVar.k()) {
                                if (chVar.k()) {
                                    chVar.i(4);
                                }
                                if (chVar.k()) {
                                    chVar.i(4);
                                }
                            }
                        }
                        if (chVar.k()) {
                            chVar.i(5);
                            if (chVar.k()) {
                                chVar.i(7);
                                if (chVar.k()) {
                                    chVar.i(8);
                                }
                            }
                        }
                        chVar.i((c9 + 2) * 8);
                        chVar.d();
                    }
                    if (i7 < 2) {
                        if (chVar.k()) {
                            chVar.i(14);
                        }
                        if (c7 == 0 && chVar.k()) {
                            chVar.i(14);
                        }
                    }
                    if (chVar.k()) {
                        if (c2 == 0) {
                            chVar.i(5);
                            c2 = 0;
                        } else {
                            for (int i9 = 0; i9 < i5; i9++) {
                                if (chVar.k()) {
                                    chVar.i(5);
                                }
                            }
                        }
                    }
                }
            }
            if (chVar.k()) {
                chVar.i(5);
                if (i7 == 2) {
                    chVar.i(4);
                }
                if (i7 >= 6) {
                    chVar.i(2);
                }
                if (chVar.k()) {
                    chVar.i(8);
                }
                if (i7 == 0 && chVar.k()) {
                    chVar.i(8);
                }
                if (c6 < 3) {
                    chVar.h();
                }
            }
            if (r9 == 0 && c2 != 3) {
                chVar.h();
            }
            if (r9 == 2 && (c2 == 3 || chVar.k())) {
                chVar.i(6);
            }
            str = (chVar.k() && chVar.c(6) == 1 && chVar.c(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i2 = c5 + c5;
            i4 = i5 * 256;
            i = i6;
            i3 = i8 + (k ? 1 : 0);
        } else {
            chVar.i(32);
            int c10 = chVar.c(2);
            String str2 = c10 == 3 ? null : MimeTypes.AUDIO_AC3;
            int f2 = f(c10, chVar.c(6));
            chVar.i(8);
            int c11 = chVar.c(3);
            if ((c11 & 1) != 0 && c11 != 1) {
                chVar.i(2);
            }
            if ((c11 & 4) != 0) {
                chVar.i(2);
            }
            if (c11 == 2) {
                chVar.i(2);
            }
            str = str2;
            i = c10 < 3 ? c[c10] : -1;
            i2 = f2;
            i3 = e[c11] + (chVar.k() ? 1 : 0);
            i4 = 1536;
        }
        return new yi(str, i3, i, i2, i4);
    }

    private static int f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = c[i];
        if (i4 == 44100) {
            int i5 = g[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
