package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class setTappableElementInsets {
    private boolean valueOf;
    private final Set<ime> toString = Collections.newSetFromMap(new WeakHashMap());
    private final List<ime> values = new ArrayList();

    public void ah$a(ime imeVar) {
        this.toString.add(imeVar);
        if (!this.valueOf) {
            imeVar.values();
            return;
        }
        imeVar.valueOf();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.values.add(imeVar);
    }

    public boolean toString(ime imeVar) {
        boolean z = true;
        if (imeVar == null) {
            return true;
        }
        boolean remove = this.toString.remove(imeVar);
        if (!this.values.remove(imeVar) && !remove) {
            z = false;
        }
        if (z) {
            imeVar.valueOf();
        }
        return z;
    }

    public void ah$a() {
        this.valueOf = true;
        for (ime imeVar : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            if (imeVar.HaptikSDK$a()) {
                imeVar.HaptikSDK$b();
                this.values.add(imeVar);
            }
        }
    }

    public void ag$a() {
        this.valueOf = true;
        for (ime imeVar : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            if (imeVar.HaptikSDK$a() || imeVar.HaptikSDK$c()) {
                imeVar.valueOf();
                this.values.add(imeVar);
            }
        }
    }

    public void HaptikSDK$a() {
        this.valueOf = false;
        for (ime imeVar : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            if (!imeVar.HaptikSDK$c() && !imeVar.HaptikSDK$a()) {
                imeVar.values();
            }
        }
        this.values.clear();
    }

    public void values() {
        for (ime imeVar : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            toString(imeVar);
        }
        this.values.clear();
    }

    public void valueOf() {
        for (ime imeVar : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            if (!imeVar.HaptikSDK$c() && !imeVar.ah$b()) {
                imeVar.valueOf();
                if (!this.valueOf) {
                    imeVar.values();
                } else {
                    this.values.add(imeVar);
                }
            }
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.toString.size() + ", isPaused=" + this.valueOf + "}";
    }
}
