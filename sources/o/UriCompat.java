package o;

import com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink$ah$a;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.common.primitives.Ints;
/* loaded from: classes3.dex */
public class UriCompat implements DefaultAudioSink$ah$a {
    protected final int HaptikSDK$b;
    protected final int HaptikSDK$c;
    protected final int ag$a;
    public final int toString;
    protected final int valueOf;
    protected final int values;

    /* JADX INFO: Access modifiers changed from: protected */
    public UriCompat(UriCompat$ag$a uriCompat$ag$a) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i = uriCompat$ag$a.values;
        this.valueOf = i;
        i2 = uriCompat$ag$a.valueOf;
        this.ag$a = i2;
        i3 = uriCompat$ag$a.invoke;
        this.HaptikSDK$b = i3;
        i4 = uriCompat$ag$a.toString;
        this.HaptikSDK$c = i4;
        i5 = uriCompat$ag$a.ag$a;
        this.values = i5;
        i6 = uriCompat$ag$a.ah$a;
        this.toString = i6;
    }

    @Override // com.appsamurai.storyly.exoplayer2.core.audio.DefaultAudioSink$ah$a
    public int toString(int i, int i2, int i3, int i4, int i5, double d) {
        return (((Math.max(i, (int) (toString(i, i2, i3, i4, i5) * d)) + i4) - 1) / i4) * i4;
    }

    protected int toString(int i, int i2, int i3, int i4, int i5) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return values(i2);
                }
                throw new IllegalArgumentException();
            }
            return ah$a(i2);
        }
        return valueOf(i, i5, i4);
    }

    protected int valueOf(int i, int i2, int i3) {
        return getElevationDegrees.ah$a(i * this.HaptikSDK$b, ah$a(this.valueOf, i2, i3), ah$a(this.ag$a, i2, i3));
    }

    protected int values(int i) {
        int i2 = this.HaptikSDK$c;
        if (i == 5) {
            i2 *= this.toString;
        }
        return Ints.ah$a((i2 * toString(i)) / 1000000);
    }

    protected int ah$a(int i) {
        return Ints.ah$a((this.values * toString(i)) / 1000000);
    }

    protected static int ah$a(int i, int i2, int i3) {
        return Ints.ah$a(((i * i2) * i3) / 1000000);
    }

    protected static int toString(int i) {
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
            case 18:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            case 15:
                return 8000;
            case 16:
                return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            case 17:
                return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
        }
    }
}
