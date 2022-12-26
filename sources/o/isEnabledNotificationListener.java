package o;

import com.github.mikephil.charting.data.Entry;
import o.MediaBrowserServiceCompat;
import o.MediaButtonReceiver;
/* loaded from: classes4.dex */
public abstract class isEnabledNotificationListener extends getVolumeProvider {
    protected isEnabledNotificationListener$ah$a HaptikSDK$a;

    public isEnabledNotificationListener(onSubscribe onsubscribe, MediaButtonReceiver.MediaButtonConnectionCallback mediaButtonConnectionCallback) {
        super(onsubscribe, mediaButtonConnectionCallback);
        this.HaptikSDK$a = new isEnabledNotificationListener$ah$a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean values(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8 anonymousClass8) {
        return anonymousClass8.onNavigationEvent() && (anonymousClass8.extraCallback() || anonymousClass8.ak$b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean toString(Entry entry, MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass7 anonymousClass7) {
        if (entry == null) {
            return false;
        }
        return entry != null && ((float) anonymousClass7.valueOf((MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass7) entry)) < ((float) anonymousClass7.setDefaultImpl()) * this.HaptikSDK$b.valueOf();
    }
}
