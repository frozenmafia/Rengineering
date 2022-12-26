package o;

import com.bugsnag.android.Breadcrumb;
import com.bugsnag.android.BreadcrumbType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes6.dex */
class getPaddingStart {
    private final setImportantForAccessibility ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPaddingStart(setImportantForAccessibility setimportantforaccessibility) {
        this.ag$a = setimportantforaccessibility;
    }

    public Breadcrumb valueOf(Map<String, Object> map) {
        return new Breadcrumb((String) setNextClusterForwardId.valueOf(map, "message"), BreadcrumbType.valueOf(((String) setNextClusterForwardId.valueOf(map, "type")).toUpperCase(Locale.US)), (Map) setNextClusterForwardId.toString(map, TtmlNode.TAG_METADATA), requestFitSystemWindows.values((String) setNextClusterForwardId.valueOf(map, "timestamp")), this.ag$a);
    }
}
