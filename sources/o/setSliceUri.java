package o;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes3.dex */
public final class setSliceUri {
    private long ah$a;
    private final int values = 24;
    private final int valueOf = 48;

    public setSliceUri(long j) {
        this.ah$a = j;
    }

    public final String ah$a() {
        String str;
        String str2;
        long values = values(this.ah$a);
        if (values <= 0) {
            return null;
        }
        long j = 3600;
        long j2 = values / j;
        int i = (j2 > this.valueOf ? 1 : (j2 == this.valueOf ? 0 : -1));
        if (i >= 0) {
            return (j2 / 24) + " days";
        }
        int i2 = this.values;
        boolean z = false;
        if (i <= 0 && i2 <= j2) {
            z = true;
        }
        if (z) {
            return j2 + "h";
        }
        long j3 = values % j;
        long j4 = 60;
        long j5 = j3 / j4;
        long j6 = j3 % j4;
        if (j5 > 9) {
            str = String.valueOf(j5);
        } else {
            str = SessionDescription.SUPPORTED_SDP_VERSION + j5;
        }
        if (j6 > 9) {
            str2 = String.valueOf(j6);
        } else {
            str2 = SessionDescription.SUPPORTED_SDP_VERSION + j6;
        }
        if (j2 > 0) {
            return j2 + "h " + str + "m";
        } else if (j5 > 0) {
            return str + "m " + str2 + StringSet.s;
        } else {
            return str2 + StringSet.s;
        }
    }

    private final long values(long j) {
        return (j - inflateColorStateList.ah$a()) / 1000;
    }
}
