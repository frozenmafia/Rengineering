package o;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import o.parseAsHtml;
/* loaded from: classes3.dex */
final class ICUCompat implements parseAsHtml.Cdefault {
    public final createFromIcon valueOf;

    private static String valueOf(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return MimeTypes.VIDEO_MP4V;
            case 826496577:
            case 828601953:
            case 875967048:
                return MimeTypes.VIDEO_H264;
            case 842289229:
                return MimeTypes.VIDEO_MP42;
            case 859066445:
                return MimeTypes.VIDEO_MP43;
            case 1196444237:
            case 1735420525:
                return MimeTypes.VIDEO_MJPEG;
            default:
                return null;
        }
    }

    private static String values(int i) {
        if (i != 1) {
            if (i != 85) {
                if (i != 255) {
                    if (i != 8192) {
                        if (i != 8193) {
                            return null;
                        }
                        return MimeTypes.AUDIO_DTS;
                    }
                    return MimeTypes.AUDIO_AC3;
                }
                return MimeTypes.AUDIO_AAC;
            }
            return MimeTypes.AUDIO_MPEG;
        }
        return MimeTypes.AUDIO_RAW;
    }

    @Override // o.parseAsHtml.Cdefault
    public int ah$a() {
        return AviExtractor.FOURCC_strf;
    }

    public static parseAsHtml.Cdefault valueOf(int i, C$default$setContentDescription c$default$setContentDescription) {
        if (i == 2) {
            return toString(c$default$setContentDescription);
        }
        if (i == 1) {
            return valueOf(c$default$setContentDescription);
        }
        SupportMenuItem.toString("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + getElevationDegrees.invoke(i));
        return null;
    }

    public ICUCompat(createFromIcon createfromicon) {
        this.valueOf = createfromicon;
    }

    private static parseAsHtml.Cdefault toString(C$default$setContentDescription c$default$setContentDescription) {
        c$default$setContentDescription.HaptikSDK$a(4);
        int HaptikSDK$d = c$default$setContentDescription.HaptikSDK$d();
        int HaptikSDK$d2 = c$default$setContentDescription.HaptikSDK$d();
        c$default$setContentDescription.HaptikSDK$a(4);
        int HaptikSDK$d3 = c$default$setContentDescription.HaptikSDK$d();
        String valueOf = valueOf(HaptikSDK$d3);
        if (valueOf == null) {
            SupportMenuItem.toString("StreamFormatChunk", "Ignoring track with unsupported compression " + HaptikSDK$d3);
            return null;
        }
        createFromIcon$ag$a createfromicon_ag_a = new createFromIcon$ag$a();
        createfromicon_ag_a.ak(HaptikSDK$d).HaptikSDK$a(HaptikSDK$d2).invoke(valueOf);
        return new ICUCompat(createfromicon_ag_a.valueOf());
    }

    private static parseAsHtml.Cdefault valueOf(C$default$setContentDescription c$default$setContentDescription) {
        int aj$a = c$default$setContentDescription.aj$a();
        String values = values(aj$a);
        if (values == null) {
            SupportMenuItem.toString("StreamFormatChunk", "Ignoring track with unsupported format tag " + aj$a);
            return null;
        }
        int aj$a2 = c$default$setContentDescription.aj$a();
        int HaptikSDK$d = c$default$setContentDescription.HaptikSDK$d();
        c$default$setContentDescription.HaptikSDK$a(6);
        int values2 = getElevationDegrees.values(c$default$setContentDescription.ICustomTabsCallback$Default());
        int aj$a3 = c$default$setContentDescription.aj$a();
        byte[] bArr = new byte[aj$a3];
        c$default$setContentDescription.valueOf(bArr, 0, aj$a3);
        createFromIcon$ag$a createfromicon_ag_a = new createFromIcon$ag$a();
        createfromicon_ag_a.invoke(values).values(aj$a2).getInitSettings(HaptikSDK$d);
        if (MimeTypes.AUDIO_RAW.equals(values) && values2 != 0) {
            createfromicon_ag_a.HaptikSDK$c(values2);
        }
        if (MimeTypes.AUDIO_AAC.equals(values) && aj$a3 > 0) {
            createfromicon_ag_a.ah$a(ImmutableList.of(bArr));
        }
        return new ICUCompat(createfromicon_ag_a.valueOf());
    }
}
