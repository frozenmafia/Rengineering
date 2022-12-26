package o;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public abstract class notifyChildrenChangedForFramework<T extends Entry> extends MediaBrowserServiceCompat.BrowserRoot<T> implements sendMessageAtTime<T> {
    protected boolean onMessageChannelReady;
    protected DashPathEffect onNavigationEvent;
    protected float onPostMessage;
    protected boolean onRelationshipValidationResult;

    public notifyChildrenChangedForFramework(List<T> list, String str) {
        super(list, str);
        this.onRelationshipValidationResult = true;
        this.onMessageChannelReady = true;
        this.onPostMessage = 0.5f;
        this.onNavigationEvent = null;
        this.onPostMessage = getServiceComponentByAction.valueOf(0.5f);
    }

    public void HaptikSDK$c(boolean z) {
        this.onMessageChannelReady = z;
    }

    public void ah$b(boolean z) {
        this.onRelationshipValidationResult = z;
    }

    public void HaptikSDK$a(boolean z) {
        ah$b(z);
        HaptikSDK$c(z);
    }

    @Override // o.sendMessageAtTime
    public boolean validateRelationship() {
        return this.onRelationshipValidationResult;
    }

    @Override // o.sendMessageAtTime
    public boolean requestPostMessageChannelWithExtras() {
        return this.onMessageChannelReady;
    }

    public void ah$b(float f) {
        this.onPostMessage = getServiceComponentByAction.valueOf(f);
    }

    @Override // o.sendMessageAtTime
    public float warmup() {
        return this.onPostMessage;
    }

    @Override // o.sendMessageAtTime
    public DashPathEffect updateVisuals() {
        return this.onNavigationEvent;
    }
}
