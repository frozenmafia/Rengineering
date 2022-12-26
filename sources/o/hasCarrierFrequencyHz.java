package o;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes3.dex */
public final class hasCarrierFrequencyHz {
    public static boolean valueOf(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return values(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean values(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean ah$a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return valueOf(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean valueOf(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static String values(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
