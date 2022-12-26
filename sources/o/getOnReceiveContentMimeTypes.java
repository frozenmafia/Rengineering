package o;

import com.bugsnag.android.Breadcrumb;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class getOnReceiveContentMimeTypes {
    public void values(Map<String, Object> map, Breadcrumb breadcrumb) {
        runAnimators.ag$a(map, "map");
        runAnimators.ag$a(breadcrumb, "crumb");
        Date timestamp = breadcrumb.getTimestamp();
        runAnimators.ah$a(timestamp, "crumb.timestamp");
        map.put("timestamp", requestFitSystemWindows.toString(timestamp));
        map.put("message", breadcrumb.getMessage());
        String breadcrumbType = breadcrumb.getType().toString();
        Locale locale = Locale.US;
        runAnimators.ah$a(locale, "Locale.US");
        Objects.requireNonNull(breadcrumbType, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = breadcrumbType.toLowerCase(locale);
        runAnimators.ah$a(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        map.put("type", lowerCase);
        map.put(TtmlNode.TAG_METADATA, breadcrumb.getMetadata());
    }
}
