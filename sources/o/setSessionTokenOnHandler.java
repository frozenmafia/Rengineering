package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class setSessionTokenOnHandler<T extends Entry> extends notifyChildrenChangedForFramework<T> implements onConnectFailed<T> {
    private int a;
    private int aj$a;
    private float ak;
    protected Drawable getSignupData;
    private boolean onXdkEvent;

    public setSessionTokenOnHandler(List<T> list, String str) {
        super(list, str);
        this.a = Color.rgb(140, 234, 255);
        this.aj$a = 85;
        this.ak = 2.5f;
        this.onXdkEvent = false;
    }

    @Override // o.onConnectFailed
    public int receiveFile() {
        return this.a;
    }

    public void HaptikWebView(int i) {
        this.a = i;
        this.getSignupData = null;
    }

    @Override // o.onConnectFailed
    public Drawable mayLaunchUrl() {
        return this.getSignupData;
    }

    public void toString(Drawable drawable) {
        this.getSignupData = drawable;
    }

    @Override // o.onConnectFailed
    public int postMessage() {
        return this.aj$a;
    }

    public void invoke(int i) {
        this.aj$a = i;
    }

    public void toString(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.ak = getServiceComponentByAction.valueOf(f);
    }

    @Override // o.onConnectFailed
    public float newSessionWithExtras() {
        return this.ak;
    }

    public void invoke(boolean z) {
        this.onXdkEvent = z;
    }

    @Override // o.onConnectFailed
    public boolean requestPostMessageChannel() {
        return this.onXdkEvent;
    }
}
