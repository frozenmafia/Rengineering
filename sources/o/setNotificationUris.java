package o;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.horcrux.svg.TextProperties;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setNotificationUris {
    static final setNotificationUris valueOf = new setNotificationUris();
    final double HaptikSDK$a;
    final TextProperties.FontStyle HaptikSDK$b;
    final TextProperties.FontVariantLigatures HaptikSDK$c;
    final boolean HaptikSDK$d;
    final double HaptikSDK$e;
    final double HaptikWebView;
    final String ag$a;
    final String ah$a;
    TextProperties.FontWeight ah$b;
    final double getInitSettings;
    final TextProperties.TextAnchor getSignupData;
    final String invoke;
    private final TextProperties.TextDecoration isLogoutPending;
    int toString;
    final ReadableMap values;

    private setNotificationUris() {
        this.values = null;
        this.ag$a = "";
        this.HaptikSDK$b = TextProperties.FontStyle.normal;
        this.ah$b = TextProperties.FontWeight.Normal;
        this.toString = 400;
        this.ah$a = "";
        this.invoke = "";
        this.HaptikSDK$c = TextProperties.FontVariantLigatures.normal;
        this.getSignupData = TextProperties.TextAnchor.start;
        this.isLogoutPending = TextProperties.TextDecoration.None;
        this.HaptikSDK$d = false;
        this.HaptikSDK$e = 0.0d;
        this.HaptikSDK$a = 12.0d;
        this.HaptikWebView = 0.0d;
        this.getInitSettings = 0.0d;
    }

    private double toString(ReadableMap readableMap, String str, double d, double d2, double d3) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return C0396version.values(readableMap.getString(str), d3, d, d2);
    }

    private void ah$a(setNotificationUris setnotificationuris) {
        this.toString = setnotificationuris.toString;
        this.ah$b = setnotificationuris.ah$b;
    }

    private void values(setNotificationUris setnotificationuris, double d) {
        long round = Math.round(d);
        if (round >= 1 && round <= 1000) {
            int i = (int) round;
            this.toString = i;
            this.ah$b = setNotificationUris$ah$a.ag$a(i);
            return;
        }
        ah$a(setnotificationuris);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNotificationUris(ReadableMap readableMap, setNotificationUris setnotificationuris, double d) {
        double d2 = setnotificationuris.HaptikSDK$a;
        if (readableMap.hasKey("fontSize")) {
            this.HaptikSDK$a = toString(readableMap, "fontSize", 1.0d, d2, d2);
        } else {
            this.HaptikSDK$a = d2;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                values(setnotificationuris, readableMap.getDouble("fontWeight"));
            } else {
                String string = readableMap.getString("fontWeight");
                if (TextProperties.FontWeight.hasEnum(string)) {
                    int values = setNotificationUris$ah$a.values(TextProperties.FontWeight.get(string), setnotificationuris);
                    this.toString = values;
                    this.ah$b = setNotificationUris$ah$a.ag$a(values);
                } else if (string != null) {
                    values(setnotificationuris, Double.parseDouble(string));
                } else {
                    ah$a(setnotificationuris);
                }
            }
        } else {
            ah$a(setnotificationuris);
        }
        this.values = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : setnotificationuris.values;
        this.ag$a = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : setnotificationuris.ag$a;
        this.HaptikSDK$b = readableMap.hasKey("fontStyle") ? TextProperties.FontStyle.valueOf(readableMap.getString("fontStyle")) : setnotificationuris.HaptikSDK$b;
        this.ah$a = readableMap.hasKey("fontFeatureSettings") ? readableMap.getString("fontFeatureSettings") : setnotificationuris.ah$a;
        this.invoke = readableMap.hasKey("fontVariationSettings") ? readableMap.getString("fontVariationSettings") : setnotificationuris.invoke;
        this.HaptikSDK$c = readableMap.hasKey("fontVariantLigatures") ? TextProperties.FontVariantLigatures.valueOf(readableMap.getString("fontVariantLigatures")) : setnotificationuris.HaptikSDK$c;
        this.getSignupData = readableMap.hasKey("textAnchor") ? TextProperties.TextAnchor.valueOf(readableMap.getString("textAnchor")) : setnotificationuris.getSignupData;
        this.isLogoutPending = readableMap.hasKey(TtmlNode.ATTR_TTS_TEXT_DECORATION) ? TextProperties.TextDecoration.getEnum(readableMap.getString(TtmlNode.ATTR_TTS_TEXT_DECORATION)) : setnotificationuris.isLogoutPending;
        boolean hasKey = readableMap.hasKey("kerning");
        this.HaptikSDK$d = hasKey || setnotificationuris.HaptikSDK$d;
        this.HaptikSDK$e = hasKey ? toString(readableMap, "kerning", d, this.HaptikSDK$a, 0.0d) : setnotificationuris.HaptikSDK$e;
        this.HaptikWebView = readableMap.hasKey("wordSpacing") ? toString(readableMap, "wordSpacing", d, this.HaptikSDK$a, 0.0d) : setnotificationuris.HaptikWebView;
        this.getInitSettings = readableMap.hasKey(ViewProps.LETTER_SPACING) ? toString(readableMap, ViewProps.LETTER_SPACING, d, this.HaptikSDK$a, 0.0d) : setnotificationuris.getInitSettings;
    }
}
