package o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import o.dispatchStop;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class doLoaderStart extends dispatchStop {
    private final Object values = new Object();
    private final Runnable ah$a = new Runnable() { // from class: o.doLoaderStart.5
        @Override // java.lang.Runnable
        public void run() {
            synchronized (doLoaderStart.this.values) {
                ArrayList arrayList = doLoaderStart.this.ag$a;
                doLoaderStart doloaderstart = doLoaderStart.this;
                doloaderstart.ag$a = doloaderstart.toString;
                doLoaderStart.this.toString = arrayList;
            }
            int size = doLoaderStart.this.ag$a.size();
            for (int i = 0; i < size; i++) {
                ((dispatchStop.values) doLoaderStart.this.ag$a.get(i)).HaptikSDK$b();
            }
            doLoaderStart.this.ag$a.clear();
        }
    };
    private ArrayList<dispatchStop.values> toString = new ArrayList<>();
    private ArrayList<dispatchStop.values> ag$a = new ArrayList<>();
    private final Handler valueOf = new Handler(Looper.getMainLooper());

    @Override // o.dispatchStop
    public void values(dispatchStop.values valuesVar) {
        if (!ah$a()) {
            valuesVar.HaptikSDK$b();
            return;
        }
        synchronized (this.values) {
            if (this.toString.contains(valuesVar)) {
                return;
            }
            this.toString.add(valuesVar);
            boolean z = true;
            if (this.toString.size() != 1) {
                z = false;
            }
            if (z) {
                this.valueOf.post(this.ah$a);
            }
        }
    }

    @Override // o.dispatchStop
    public void ag$a(dispatchStop.values valuesVar) {
        synchronized (this.values) {
            this.toString.remove(valuesVar);
        }
    }
}
