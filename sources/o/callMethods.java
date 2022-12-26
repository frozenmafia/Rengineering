package o;

import java.util.ArrayList;
import java.util.List;
import o.FullLifecycleObserverAdapter;
/* loaded from: classes6.dex */
public class callMethods {
    private FullLifecycleObserverAdapter$1$ah$a ag$a = new FullLifecycleObserverAdapter$1$ah$a() { // from class: o.callMethods.2
        @Override // o.FullLifecycleObserverAdapter$1$ah$a
        public void values(FullLifecycleObserverAdapter.AnonymousClass1 anonymousClass1, boolean z) {
            if (z) {
                if (callMethods.this.valueOf != null) {
                    callMethods.this.valueOf.ag$a();
                }
                callMethods.this.valueOf = anonymousClass1;
            } else if (callMethods.this.valueOf == null || !callMethods.this.valueOf.equals(anonymousClass1)) {
            } else {
                callMethods.this.valueOf = null;
            }
        }
    };
    private List<FullLifecycleObserverAdapter.AnonymousClass1> ah$a = new ArrayList();
    private FullLifecycleObserverAdapter.AnonymousClass1 valueOf;

    public void valueOf(FullLifecycleObserverAdapter.AnonymousClass1 anonymousClass1) {
        this.ah$a.add(anonymousClass1);
        anonymousClass1.ah$a(this.ag$a);
    }
}
