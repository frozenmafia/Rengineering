package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import o.getParams;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class removeSpan {
    private static final String[] ag$a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] toString = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] valueOf = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static getParams ah$a(String str) throws IOException {
        try {
            return ag$a(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            SupportMenuItem.toString("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static getParams ag$a(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!hasCarrierFrequencyHz.ah$a(newPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        long j = C.TIME_UNSET;
        ImmutableList<getParams.values> of = ImmutableList.of();
        do {
            newPullParser.next();
            if (hasCarrierFrequencyHz.ah$a(newPullParser, "rdf:Description")) {
                if (!ag$a(newPullParser)) {
                    return null;
                }
                j = toString(newPullParser);
                of = valueOf(newPullParser);
            } else if (hasCarrierFrequencyHz.ah$a(newPullParser, "Container:Directory")) {
                of = ag$a(newPullParser, "Container", "Item");
            } else if (hasCarrierFrequencyHz.ah$a(newPullParser, "GContainer:Directory")) {
                of = ag$a(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!hasCarrierFrequencyHz.valueOf(newPullParser, "x:xmpmeta"));
        if (of.isEmpty()) {
            return null;
        }
        return new getParams(j, of);
    }

    private static boolean ag$a(XmlPullParser xmlPullParser) {
        for (String str : ag$a) {
            String values = hasCarrierFrequencyHz.values(xmlPullParser, str);
            if (values != null) {
                return Integer.parseInt(values) == 1;
            }
        }
        return false;
    }

    private static long toString(XmlPullParser xmlPullParser) {
        for (String str : toString) {
            String values = hasCarrierFrequencyHz.values(xmlPullParser, str);
            if (values != null) {
                long parseLong = Long.parseLong(values);
                return parseLong == -1 ? C.TIME_UNSET : parseLong;
            }
        }
        return C.TIME_UNSET;
    }

    private static ImmutableList<getParams.values> valueOf(XmlPullParser xmlPullParser) {
        for (String str : valueOf) {
            String values = hasCarrierFrequencyHz.values(xmlPullParser, str);
            if (values != null) {
                return ImmutableList.of(new getParams.values(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new getParams.values(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(values), 0L));
            }
        }
        return ImmutableList.of();
    }

    private static ImmutableList<getParams.values> ag$a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.valueOf builder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (hasCarrierFrequencyHz.ah$a(xmlPullParser, str3)) {
                String values = hasCarrierFrequencyHz.values(xmlPullParser, str2 + ":Mime");
                String values2 = hasCarrierFrequencyHz.values(xmlPullParser, str2 + ":Semantic");
                String values3 = hasCarrierFrequencyHz.values(xmlPullParser, str2 + ":Length");
                String values4 = hasCarrierFrequencyHz.values(xmlPullParser, str2 + ":Padding");
                if (values == null || values2 == null) {
                    return ImmutableList.of();
                }
                builder.toString((ImmutableList.valueOf) new getParams.values(values, values2, values3 != null ? Long.parseLong(values3) : 0L, values4 != null ? Long.parseLong(values4) : 0L));
            }
        } while (!hasCarrierFrequencyHz.valueOf(xmlPullParser, str4));
        return builder.ah$a();
    }
}
