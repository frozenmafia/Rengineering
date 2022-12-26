package o;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public interface sendMessageAtTime<T extends Entry> extends MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass7<T> {
    boolean requestPostMessageChannelWithExtras();

    DashPathEffect updateVisuals();

    boolean validateRelationship();

    float warmup();
}
