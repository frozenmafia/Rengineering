package o;

import android.graphics.Typeface;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.github.mikephil.charting.charts.Chart;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.FragmentTransitionImpl;
import o.MultiDex;
/* loaded from: classes7.dex */
public class MultiDexApplication {
    public static Typeface ag$a(Chart chart, ReadableMap readableMap) {
        String string = readableMap.getString("fontFamily");
        int i = 0;
        boolean equals = MultiDex.V4.values(readableMap, ReadableType.String, "fontStyle") ? TtmlNode.ITALIC.equals(readableMap.getString("fontStyle")) : false;
        boolean equals2 = MultiDex.V4.values(readableMap, ReadableType.String, "fontWeight") ? TtmlNode.BOLD.equals(readableMap.getString("fontWeight")) : false;
        if (equals && equals2) {
            i = 3;
        } else if (equals) {
            i = 2;
        } else if (equals2) {
            i = 1;
        }
        return values(chart, string, i);
    }

    public static Typeface values(Chart chart, String str) {
        return values(chart, str, 0);
    }

    private static Typeface values(Chart chart, String str, int i) {
        return FragmentTransitionImpl.AnonymousClass3.values().values(str, i, chart.getContext().getAssets());
    }
}
