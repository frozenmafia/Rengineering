package o;

import com.github.mikephil.charting.data.Entry;
import java.util.Map;
import o.MediaBrowserServiceCompat;
/* loaded from: classes7.dex */
public class getDexDir extends MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1 {
    private Map<Float, String> ah$a;

    public getDexDir(Map<Float, String> map) {
        this.ah$a = map;
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String valueOf(float f) {
        String str = this.ah$a.get(Float.valueOf(f));
        return str != null ? str : "";
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass1
    public String ag$a(Entry entry) {
        return valueOf(entry.HaptikWebView());
    }
}
