package o;

import android.graphics.Color;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;
import o.MediaBrowserServiceCompat;
/* loaded from: classes7.dex */
public class setSessionToken extends MediaBrowserServiceCompat.BrowserRoot<BarEntry> implements MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5 {
    private int ICustomTabsCallback$Default;
    private String[] a;
    private int aj$a;
    private int ak;
    private int getSignupData;
    private int isLogoutPending;
    private float onXdkEvent;

    public setSessionToken(List<BarEntry> list, String str) {
        super(list, str);
        this.ICustomTabsCallback$Default = 1;
        this.aj$a = Color.rgb(215, 215, 215);
        this.onXdkEvent = 0.0f;
        this.getSignupData = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.isLogoutPending = 120;
        this.ak = 0;
        this.a = new String[]{"Stack"};
        this.ah$a = Color.rgb(0, 0, 0);
        values(list);
        ah$a(list);
    }

    private void ah$a(List<BarEntry> list) {
        this.ak = 0;
        for (int i = 0; i < list.size(); i++) {
            float[] HaptikSDK$b = list.get(i).HaptikSDK$b();
            if (HaptikSDK$b == null) {
                this.ak++;
            } else {
                this.ak += HaptikSDK$b.length;
            }
        }
    }

    private void values(List<BarEntry> list) {
        for (int i = 0; i < list.size(); i++) {
            float[] HaptikSDK$b = list.get(i).HaptikSDK$b();
            if (HaptikSDK$b != null && HaptikSDK$b.length > this.ICustomTabsCallback$Default) {
                this.ICustomTabsCallback$Default = HaptikSDK$b.length;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    /* renamed from: ah$a */
    public void values(BarEntry barEntry) {
        if (barEntry == null || Float.isNaN(barEntry.ah$b())) {
            return;
        }
        if (barEntry.HaptikSDK$b() == null) {
            if (barEntry.ah$b() < this.extraCallbackWithResult) {
                this.extraCallbackWithResult = barEntry.ah$b();
            }
            if (barEntry.ah$b() > this.extraCallback) {
                this.extraCallback = barEntry.ah$b();
            }
        } else {
            if ((-barEntry.valueOf()) < this.extraCallbackWithResult) {
                this.extraCallbackWithResult = -barEntry.valueOf();
            }
            if (barEntry.ah$a() > this.extraCallback) {
                this.extraCallback = barEntry.ah$a();
            }
        }
        ag$a((setSessionToken) barEntry);
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5
    public int HaptikSDK$c() {
        return this.ICustomTabsCallback$Default;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5
    public boolean HaptikSDK$a() {
        return this.ICustomTabsCallback$Default > 1;
    }

    public void toString(int i) {
        this.aj$a = i;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5
    public int valueOf() {
        return this.aj$a;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5
    public float ah$a() {
        return this.onXdkEvent;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5
    public int values() {
        return this.getSignupData;
    }

    public void ag$a(int i) {
        this.isLogoutPending = i;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5
    public int ag$a() {
        return this.isLogoutPending;
    }

    public void toString(String[] strArr) {
        this.a = strArr;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass5
    public String[] invoke() {
        return this.a;
    }
}
