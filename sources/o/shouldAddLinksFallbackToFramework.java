package o;

import android.net.Uri;
import java.util.Map;
import o.LinkifyCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class shouldAddLinksFallbackToFramework implements unicodeWrap {
    public static final /* synthetic */ shouldAddLinksFallbackToFramework toString = new shouldAddLinksFallbackToFramework();

    private /* synthetic */ shouldAddLinksFallbackToFramework() {
    }

    @Override // o.unicodeWrap
    public /* synthetic */ getEntryDir[] ag$a(Uri uri, Map map) {
        getEntryDir[] values;
        values = values();
        return values;
    }

    @Override // o.unicodeWrap
    public final getEntryDir[] values() {
        return LinkifyCompat.LinkSpec.values();
    }
}
