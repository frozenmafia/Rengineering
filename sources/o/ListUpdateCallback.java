package o;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth$ah$a;
import java.util.List;
/* loaded from: classes5.dex */
public final class ListUpdateCallback implements Runnable {
    final /* synthetic */ FirebaseAuth toString;
    final /* synthetic */ C0373getDy valueOf;

    public ListUpdateCallback(FirebaseAuth firebaseAuth, C0373getDy c0373getDy) {
        this.toString = firebaseAuth;
        this.valueOf = c0373getDy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<setRecycleChildrenOnDetach> list;
        List<FirebaseAuth$ah$a> list2;
        list = this.toString.values;
        for (setRecycleChildrenOnDetach setrecyclechildrenondetach : list) {
            setrecyclechildrenondetach.ag$a(this.valueOf);
        }
        list2 = this.toString.valueOf;
        for (FirebaseAuth$ah$a firebaseAuth$ah$a : list2) {
            firebaseAuth$ah$a.values(this.toString);
        }
    }
}
