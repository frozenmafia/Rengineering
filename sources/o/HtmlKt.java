package o;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import o.parseAsHtml;
/* loaded from: classes3.dex */
final class HtmlKt implements parseAsHtml.Cdefault {
    public final int HaptikSDK$a;
    public final int ag$a;
    public final int ah$a;
    public final int toString;
    public final int valueOf;
    public final int values;

    @Override // o.parseAsHtml.Cdefault
    public int ah$a() {
        return AviExtractor.FOURCC_strh;
    }

    public static HtmlKt valueOf(C$default$setContentDescription c$default$setContentDescription) {
        int HaptikSDK$d = c$default$setContentDescription.HaptikSDK$d();
        c$default$setContentDescription.HaptikSDK$a(12);
        int HaptikSDK$d2 = c$default$setContentDescription.HaptikSDK$d();
        int HaptikSDK$d3 = c$default$setContentDescription.HaptikSDK$d();
        int HaptikSDK$d4 = c$default$setContentDescription.HaptikSDK$d();
        c$default$setContentDescription.HaptikSDK$a(4);
        int HaptikSDK$d5 = c$default$setContentDescription.HaptikSDK$d();
        int HaptikSDK$d6 = c$default$setContentDescription.HaptikSDK$d();
        c$default$setContentDescription.HaptikSDK$a(8);
        return new HtmlKt(HaptikSDK$d, HaptikSDK$d2, HaptikSDK$d3, HaptikSDK$d4, HaptikSDK$d5, HaptikSDK$d6);
    }

    private HtmlKt(int i, int i2, int i3, int i4, int i5, int i6) {
        this.values = i;
        this.ah$a = i2;
        this.ag$a = i3;
        this.valueOf = i4;
        this.toString = i5;
        this.HaptikSDK$a = i6;
    }

    public int valueOf() {
        int i = this.values;
        if (i != 1935960438) {
            if (i != 1935963489) {
                if (i != 1937012852) {
                    SupportMenuItem.toString("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.values));
                    return -1;
                }
                return 3;
            }
            return 1;
        }
        return 2;
    }

    public long ag$a() {
        return getElevationDegrees.ag$a(this.toString, this.ag$a * 1000000, this.valueOf);
    }
}
