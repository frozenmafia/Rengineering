package o;

import com.wheelpicker.LoopView;
import o.EncryptedSharedPreferences;
/* loaded from: classes5.dex */
public final class registerOnSharedPreferenceChangeListener implements Runnable {
    final LoopView toString;

    public registerOnSharedPreferenceChangeListener(LoopView loopView) {
        this.toString = loopView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncryptedSharedPreferences.AnonymousClass1 anonymousClass1 = this.toString.HaptikWebView;
        int loopView = LoopView.toString(this.toString);
        this.toString.valueOf.get(loopView);
        anonymousClass1.onItemSelect(this.toString, loopView);
    }
}
