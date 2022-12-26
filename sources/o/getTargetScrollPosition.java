package o;

import android.content.Intent;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import o.RecyclerView;
import org.apache.commons.logging.LogFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getTargetScrollPosition {
    private final Intent ag$a;
    private final String toString;

    /* loaded from: classes5.dex */
    static class valueOf implements performAccessibilityActionForItem<getTargetScrollPosition> {
        @Override // o.onAddFocusables
        /* renamed from: ah$a */
        public void ag$a(getTargetScrollPosition gettargetscrollposition, removeAndRecycleView removeandrecycleview) throws EncodingException, IOException {
            Intent ah$a = gettargetscrollposition.ah$a();
            removeandrecycleview.valueOf("ttl", RecyclerView.ViewCacheExtension.HaptikSDK$d(ah$a));
            removeandrecycleview.valueOf(androidx.core.app.NotificationCompat.CATEGORY_EVENT, gettargetscrollposition.values());
            removeandrecycleview.valueOf("instanceId", RecyclerView.ViewCacheExtension.ah$a());
            removeandrecycleview.valueOf(LogFactory.PRIORITY_KEY, RecyclerView.ViewCacheExtension.HaptikSDK$a(ah$a));
            removeandrecycleview.valueOf("packageName", RecyclerView.ViewCacheExtension.ag$a());
            removeandrecycleview.valueOf("sdkPlatform", "ANDROID");
            removeandrecycleview.valueOf("messageType", RecyclerView.ViewCacheExtension.HaptikSDK$c(ah$a));
            String viewCacheExtension = RecyclerView.ViewCacheExtension.toString(ah$a);
            if (viewCacheExtension != null) {
                removeandrecycleview.valueOf("messageId", viewCacheExtension);
            }
            String initSettings = RecyclerView.ViewCacheExtension.getInitSettings(ah$a);
            if (initSettings != null) {
                removeandrecycleview.valueOf("topic", initSettings);
            }
            String ag$a = RecyclerView.ViewCacheExtension.ag$a(ah$a);
            if (ag$a != null) {
                removeandrecycleview.valueOf("collapseKey", ag$a);
            }
            if (RecyclerView.ViewCacheExtension.invoke(ah$a) != null) {
                removeandrecycleview.valueOf("analyticsLabel", RecyclerView.ViewCacheExtension.invoke(ah$a));
            }
            if (RecyclerView.ViewCacheExtension.ah$a(ah$a) != null) {
                removeandrecycleview.valueOf("composerLabel", RecyclerView.ViewCacheExtension.ah$a(ah$a));
            }
            String values = RecyclerView.ViewCacheExtension.values();
            if (values != null) {
                removeandrecycleview.valueOf("projectNumber", values);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getTargetScrollPosition(String str, Intent intent) {
        this.toString = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "evenType must be non-null");
        this.ag$a = (Intent) com.google.android.gms.common.internal.Preconditions.checkNotNull(intent, "intent must be non-null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class values {
        private final getTargetScrollPosition toString;

        /* JADX INFO: Access modifiers changed from: package-private */
        public values(getTargetScrollPosition gettargetscrollposition) {
            this.toString = (getTargetScrollPosition) com.google.android.gms.common.internal.Preconditions.checkNotNull(gettargetscrollposition);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final getTargetScrollPosition valueOf() {
            return this.toString;
        }
    }

    final Intent ah$a() {
        return this.ag$a;
    }

    final String values() {
        return this.toString;
    }
}
