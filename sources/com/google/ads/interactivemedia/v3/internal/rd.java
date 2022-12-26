package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes4.dex */
public final class rd {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1243b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    rd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        af.s(str);
        this.a = str;
        this.f1243b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = ar.q(str2);
    }

    public static rd g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = codecCapabilities != null && cp.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback") && (cp.a > 22 || !(("ODROID-XU3".equals(cp.d) || "Nexus 10".equals(cp.d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))));
        if (codecCapabilities != null && cp.a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new rd(str, str2, str3, codecCapabilities, z, z5, z4 || (codecCapabilities != null && cp.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private static Point h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(cp.c(i, widthAlignment) * widthAlignment, cp.c(i2, heightAlignment) * heightAlignment);
    }

    private final void i(String str) {
        String str2 = this.a;
        String str3 = this.f1243b;
        String str4 = cp.e;
        cc.a(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    private static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point h = h(videoCapabilities, i, i2);
        int i3 = h.x;
        int i4 = h.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return h(videoCapabilities, i, i2);
    }

    public final ep b(s sVar, s sVar2) {
        int i = true != cp.V(sVar.l, sVar2.l) ? 8 : 0;
        if (this.h) {
            if (sVar.t != sVar2.t) {
                i |= 1024;
            }
            if (!this.e && (sVar.q != sVar2.q || sVar.r != sVar2.r)) {
                i |= 512;
            }
            if (!cp.V(sVar.x, sVar2.x)) {
                i |= 2048;
            }
            String str = this.a;
            if (cp.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !sVar.e(sVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new ep(this.a, sVar, sVar2, true != sVar.e(sVar2) ? 2 : 3, 0);
            }
        } else {
            if (sVar.y != sVar2.y) {
                i |= 4096;
            }
            if (sVar.z != sVar2.z) {
                i |= 8192;
            }
            if (sVar.A != sVar2.A) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.f1243b)) {
                Pair b2 = rs.b(sVar);
                Pair b3 = rs.b(sVar2);
                if (b2 != null && b3 != null) {
                    int intValue = ((Integer) b2.first).intValue();
                    int intValue2 = ((Integer) b3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new ep(this.a, sVar, sVar2, 3, 0);
                    }
                }
            }
            if (!sVar.e(sVar2)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.f1243b)) {
                i |= 2;
            }
            if (i == 0) {
                return new ep(this.a, sVar, sVar2, 1, 0);
            }
        }
        return new ep(this.a, sVar, sVar2, 0, i);
    }

    public final boolean c(s sVar) throws rn {
        Pair b2;
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.f1243b.equals(sVar.l) || this.f1243b.equals(rs.d(sVar))) {
            int i2 = 16;
            if (sVar.i != null && (b2 = rs.b(sVar)) != null) {
                int intValue = ((Integer) b2.first).intValue();
                int intValue2 = ((Integer) b2.second).intValue();
                int i3 = 8;
                if (MimeTypes.VIDEO_DOLBY_VISION.equals(sVar.l)) {
                    if (MimeTypes.VIDEO_H264.equals(this.f1243b)) {
                        intValue2 = 0;
                        intValue = 8;
                    } else if (MimeTypes.VIDEO_H265.equals(this.f1243b)) {
                        intValue2 = 0;
                        intValue = 2;
                    }
                }
                if (!this.h) {
                    if (intValue == 42) {
                        intValue = 42;
                    }
                }
                MediaCodecInfo.CodecProfileLevel[] f = f();
                if (cp.a <= 23 && MimeTypes.VIDEO_VP9.equals(this.f1243b) && f.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i3 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i3 = 512;
                    } else if (intValue3 >= 60000000) {
                        i3 = 256;
                    } else if (intValue3 >= 30000000) {
                        i3 = 128;
                    } else if (intValue3 >= 18000000) {
                        i3 = 64;
                    } else if (intValue3 >= 12000000) {
                        i3 = 32;
                    } else if (intValue3 >= 7200000) {
                        i3 = 16;
                    } else if (intValue3 < 3600000) {
                        i3 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i3;
                    f = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                int length = f.length;
                while (i < length) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = f[i];
                    i = (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2 || (MimeTypes.VIDEO_H265.equals(this.f1243b) && intValue == 2 && ("sailfish".equals(cp.f1002b) || "marlin".equals(cp.f1002b)))) ? i + 1 : 0;
                }
                String str = sVar.i;
                String str2 = this.c;
                i("codec.profileLevel, " + str + ", " + str2);
                return false;
            }
            if (this.h) {
                if (sVar.q <= 0 || sVar.r <= 0) {
                    return true;
                }
                if (cp.a >= 21) {
                    return e(sVar.q, sVar.r, sVar.s);
                }
                boolean z = sVar.q * sVar.r <= rs.a();
                if (!z) {
                    int i4 = sVar.q;
                    int i5 = sVar.r;
                    i("legacyFrameSize, " + i4 + "x" + i5);
                }
                return z;
            }
            if (cp.a >= 21) {
                int i6 = sVar.z;
                if (i6 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                    if (codecCapabilities2 == null) {
                        i("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        i("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i6)) {
                        i("sampleRate.support, " + i6);
                        return false;
                    }
                }
                int i7 = sVar.y;
                if (i7 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.d;
                    if (codecCapabilities3 == null) {
                        i("channelCount.caps");
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            i("channelCount.aCaps");
                        } else {
                            String str3 = this.a;
                            String str4 = this.f1243b;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((cp.a < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str4) && !MimeTypes.AUDIO_AMR_NB.equals(str4) && !MimeTypes.AUDIO_AMR_WB.equals(str4) && !MimeTypes.AUDIO_AAC.equals(str4) && !MimeTypes.AUDIO_VORBIS.equals(str4) && !MimeTypes.AUDIO_OPUS.equals(str4) && !MimeTypes.AUDIO_RAW.equals(str4) && !MimeTypes.AUDIO_FLAC.equals(str4) && !MimeTypes.AUDIO_ALAW.equals(str4) && !MimeTypes.AUDIO_MLAW.equals(str4) && !MimeTypes.AUDIO_MSGSM.equals(str4))) {
                                if (MimeTypes.AUDIO_AC3.equals(str4)) {
                                    i2 = 6;
                                } else if (!MimeTypes.AUDIO_E_AC3.equals(str4)) {
                                    i2 = 30;
                                }
                                cc.e(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i2 + "]");
                                maxInputChannelCount = i2;
                            }
                            if (maxInputChannelCount < i7) {
                                i("channelCount.support, " + i7);
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(s sVar) {
        if (this.h) {
            return this.e;
        }
        Pair b2 = rs.b(sVar);
        return b2 != null && ((Integer) b2.first).intValue() == 42;
    }

    public final boolean e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            i("sizeAndRate.vCaps");
            return false;
        } else if (j(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) || !"mcv5a".equals(cp.f1002b)) && j(videoCapabilities, i2, i, d))) {
                String str = this.a;
                String str2 = this.f1243b;
                String str3 = cp.e;
                StringBuilder sb = new StringBuilder();
                sb.append("AssumedSupport [");
                sb.append("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                sb.append("] [");
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                sb.append("] [");
                sb.append(str3);
                sb.append("]");
                cc.a(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb.toString());
                return true;
            }
            i("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.d.profileLevels;
    }

    public final String toString() {
        return this.a;
    }
}
