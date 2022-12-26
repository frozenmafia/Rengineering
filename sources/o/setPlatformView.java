package o;

import com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public final class setPlatformView {
    private static final int[] valueOf = {1, 2, 3, 6};
    private static final int[] ag$a = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] values = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] ah$a = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] toString = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, androidx.databinding.library.baseAdapters.BR.sortType, 512, 576, 640};
    private static final int[] invoke = {69, 87, 104, 121, 139, 174, 208, 243, 278, androidx.databinding.library.baseAdapters.BR.rowHandler, 417, androidx.databinding.library.baseAdapters.BR.teamPoint, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes3.dex */
    public static final class toString {
        public final int ag$a;
        public final int ah$a;
        public final int ah$b;
        public final int toString;
        public final int valueOf;
        public final String values;

        private toString(String str, int i, int i2, int i3, int i4, int i5) {
            this.values = str;
            this.ah$b = i;
            this.ah$a = i2;
            this.valueOf = i3;
            this.toString = i4;
            this.ag$a = i5;
        }
    }

    public static createFromIcon toString(C$default$setContentDescription c$default$setContentDescription, String str, String str2, DrmInitData drmInitData) {
        int i = ag$a[(c$default$setContentDescription.extraCallbackWithResult() & 192) >> 6];
        int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        int i2 = ah$a[(extraCallbackWithResult & 56) >> 3];
        if ((extraCallbackWithResult & 4) != 0) {
            i2++;
        }
        return new createFromIcon$ag$a().ah$a(str).invoke(MimeTypes.AUDIO_AC3).values(i2).getInitSettings(i).ah$a(drmInitData).ag$a(str2).valueOf();
    }

    public static createFromIcon ah$a(C$default$setContentDescription c$default$setContentDescription, String str, String str2, DrmInitData drmInitData) {
        c$default$setContentDescription.HaptikSDK$a(2);
        int i = ag$a[(c$default$setContentDescription.extraCallbackWithResult() & 192) >> 6];
        int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        int i2 = ah$a[(extraCallbackWithResult & 14) >> 1];
        if ((extraCallbackWithResult & 1) != 0) {
            i2++;
        }
        if (((c$default$setContentDescription.extraCallbackWithResult() & 30) >> 1) > 0 && (2 & c$default$setContentDescription.extraCallbackWithResult()) != 0) {
            i2 += 2;
        }
        return new createFromIcon$ag$a().ah$a(str).invoke((c$default$setContentDescription.ag$a() <= 0 || (c$default$setContentDescription.extraCallbackWithResult() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC).values(i2).getInitSettings(i).ah$a(drmInitData).ag$a(str2).valueOf();
    }

    public static toString toString(getAzimuthDegrees getazimuthdegrees) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int valueOf2;
        int i6;
        int i7;
        int i8;
        String str2;
        int ag$a2 = getazimuthdegrees.ag$a();
        getazimuthdegrees.toString(40);
        boolean z = getazimuthdegrees.valueOf(5) > 10;
        getazimuthdegrees.values(ag$a2);
        int i9 = -1;
        if (z) {
            getazimuthdegrees.toString(16);
            int valueOf3 = getazimuthdegrees.valueOf(2);
            if (valueOf3 == 0) {
                i9 = 0;
            } else if (valueOf3 == 1) {
                i9 = 1;
            } else if (valueOf3 == 2) {
                i9 = 2;
            }
            getazimuthdegrees.toString(3);
            int valueOf4 = getazimuthdegrees.valueOf(11);
            int valueOf5 = getazimuthdegrees.valueOf(2);
            if (valueOf5 == 3) {
                i7 = values[getazimuthdegrees.valueOf(2)];
                valueOf2 = 3;
                i6 = 6;
            } else {
                valueOf2 = getazimuthdegrees.valueOf(2);
                i6 = valueOf[valueOf2];
                i7 = ag$a[valueOf5];
            }
            int valueOf6 = getazimuthdegrees.valueOf(3);
            boolean HaptikSDK$a = getazimuthdegrees.HaptikSDK$a();
            int i10 = ah$a[valueOf6];
            getazimuthdegrees.toString(10);
            if (getazimuthdegrees.HaptikSDK$a()) {
                getazimuthdegrees.toString(8);
            }
            if (valueOf6 == 0) {
                getazimuthdegrees.toString(5);
                if (getazimuthdegrees.HaptikSDK$a()) {
                    getazimuthdegrees.toString(8);
                }
            }
            if (i9 == 1 && getazimuthdegrees.HaptikSDK$a()) {
                getazimuthdegrees.toString(16);
            }
            if (getazimuthdegrees.HaptikSDK$a()) {
                if (valueOf6 > 2) {
                    getazimuthdegrees.toString(2);
                }
                if ((valueOf6 & 1) != 0 && valueOf6 > 2) {
                    getazimuthdegrees.toString(6);
                }
                if ((valueOf6 & 4) != 0) {
                    getazimuthdegrees.toString(6);
                }
                if (HaptikSDK$a && getazimuthdegrees.HaptikSDK$a()) {
                    getazimuthdegrees.toString(5);
                }
                if (i9 == 0) {
                    if (getazimuthdegrees.HaptikSDK$a()) {
                        getazimuthdegrees.toString(6);
                    }
                    if (valueOf6 == 0 && getazimuthdegrees.HaptikSDK$a()) {
                        getazimuthdegrees.toString(6);
                    }
                    if (getazimuthdegrees.HaptikSDK$a()) {
                        getazimuthdegrees.toString(6);
                    }
                    int valueOf7 = getazimuthdegrees.valueOf(2);
                    if (valueOf7 == 1) {
                        getazimuthdegrees.toString(5);
                    } else if (valueOf7 == 2) {
                        getazimuthdegrees.toString(12);
                    } else if (valueOf7 == 3) {
                        int valueOf8 = getazimuthdegrees.valueOf(5);
                        if (getazimuthdegrees.HaptikSDK$a()) {
                            getazimuthdegrees.toString(5);
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(4);
                            }
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(4);
                            }
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(4);
                            }
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(4);
                            }
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(4);
                            }
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(4);
                            }
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(4);
                            }
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                if (getazimuthdegrees.HaptikSDK$a()) {
                                    getazimuthdegrees.toString(4);
                                }
                                if (getazimuthdegrees.HaptikSDK$a()) {
                                    getazimuthdegrees.toString(4);
                                }
                            }
                        }
                        if (getazimuthdegrees.HaptikSDK$a()) {
                            getazimuthdegrees.toString(5);
                            if (getazimuthdegrees.HaptikSDK$a()) {
                                getazimuthdegrees.toString(7);
                                if (getazimuthdegrees.HaptikSDK$a()) {
                                    getazimuthdegrees.toString(8);
                                }
                            }
                        }
                        getazimuthdegrees.toString((valueOf8 + 2) * 8);
                        getazimuthdegrees.valueOf();
                    }
                    if (valueOf6 < 2) {
                        if (getazimuthdegrees.HaptikSDK$a()) {
                            getazimuthdegrees.toString(14);
                        }
                        if (valueOf6 == 0 && getazimuthdegrees.HaptikSDK$a()) {
                            getazimuthdegrees.toString(14);
                        }
                    }
                    if (getazimuthdegrees.HaptikSDK$a()) {
                        if (valueOf2 == 0) {
                            getazimuthdegrees.toString(5);
                        } else {
                            for (int i11 = 0; i11 < i6; i11++) {
                                if (getazimuthdegrees.HaptikSDK$a()) {
                                    getazimuthdegrees.toString(5);
                                }
                            }
                        }
                    }
                }
            }
            if (getazimuthdegrees.HaptikSDK$a()) {
                getazimuthdegrees.toString(5);
                if (valueOf6 == 2) {
                    getazimuthdegrees.toString(4);
                }
                if (valueOf6 >= 6) {
                    getazimuthdegrees.toString(2);
                }
                if (getazimuthdegrees.HaptikSDK$a()) {
                    getazimuthdegrees.toString(8);
                }
                if (valueOf6 == 0 && getazimuthdegrees.HaptikSDK$a()) {
                    getazimuthdegrees.toString(8);
                }
                if (valueOf5 < 3) {
                    getazimuthdegrees.HaptikSDK$b();
                }
            }
            if (i9 == 0 && valueOf2 != 3) {
                getazimuthdegrees.HaptikSDK$b();
            }
            if (i9 == 2 && (valueOf2 == 3 || getazimuthdegrees.HaptikSDK$a())) {
                getazimuthdegrees.toString(6);
            }
            if (getazimuthdegrees.HaptikSDK$a()) {
                i8 = 1;
                if (getazimuthdegrees.valueOf(6) == 1 && getazimuthdegrees.valueOf(8) == 1) {
                    str2 = MimeTypes.AUDIO_E_AC3_JOC;
                    str = str2;
                    i4 = i9;
                    i = (valueOf4 + i8) * 2;
                    i5 = i6 * 256;
                    i2 = i7;
                    i3 = i10 + (HaptikSDK$a ? 1 : 0);
                }
            } else {
                i8 = 1;
            }
            str2 = MimeTypes.AUDIO_E_AC3;
            str = str2;
            i4 = i9;
            i = (valueOf4 + i8) * 2;
            i5 = i6 * 256;
            i2 = i7;
            i3 = i10 + (HaptikSDK$a ? 1 : 0);
        } else {
            getazimuthdegrees.toString(32);
            int valueOf9 = getazimuthdegrees.valueOf(2);
            String str3 = valueOf9 == 3 ? null : MimeTypes.AUDIO_AC3;
            int valueOf10 = valueOf(valueOf9, getazimuthdegrees.valueOf(6));
            getazimuthdegrees.toString(8);
            int valueOf11 = getazimuthdegrees.valueOf(3);
            if ((valueOf11 & 1) != 0 && valueOf11 != 1) {
                getazimuthdegrees.toString(2);
            }
            if ((valueOf11 & 4) != 0) {
                getazimuthdegrees.toString(2);
            }
            if (valueOf11 == 2) {
                getazimuthdegrees.toString(2);
            }
            int[] iArr = ag$a;
            str = str3;
            i = valueOf10;
            i2 = valueOf9 < iArr.length ? iArr[valueOf9] : -1;
            i3 = ah$a[valueOf11] + (getazimuthdegrees.HaptikSDK$a() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new toString(str, i4, i3, i2, i, i5);
    }

    public static int values(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return valueOf((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static int toString(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return valueOf[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int valueOf(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        for (int i = position; i <= limit - 10; i++) {
            if ((getElevationDegrees.values(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    public static int ah$a(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int ah$a(ByteBuffer byteBuffer, int i) {
        boolean z = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (z ? 9 : 8)) >> 4) & 7);
    }

    private static int valueOf(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = ag$a;
            if (i >= iArr.length || i2 < 0) {
                return -1;
            }
            int[] iArr2 = invoke;
            if (i3 >= iArr2.length) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return (iArr2[i3] + (i2 % 2)) * 2;
            }
            int i5 = toString[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }
}
