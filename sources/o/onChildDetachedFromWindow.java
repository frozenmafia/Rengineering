package o;

import com.google.firebase.FirebaseApp;
import java.util.HashMap;
import java.util.Map;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class onChildDetachedFromWindow {
    private final FirebaseApp ag$a;
    private final processAppeared toString;
    private final Map<RecyclerView.Adapter, postAnimationRunner> values = new HashMap();

    public onChildDetachedFromWindow(FirebaseApp firebaseApp, setInitialPrefetchItemCount setinitialprefetchitemcount) {
        this.ag$a = firebaseApp;
        if (setinitialprefetchitemcount != null) {
            this.toString = removeOnItemTouchListener.toString(setinitialprefetchitemcount);
        } else {
            this.toString = removeOnItemTouchListener.ah$a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.RecyclerView$6] */
    public postAnimationRunner ag$a(RecyclerView.Adapter adapter) {
        postAnimationRunner postanimationrunner;
        synchronized (this) {
            postanimationrunner = this.values.get(adapter);
            if (postanimationrunner == null) {
                ?? r0 = new RecyclerView.AnonymousClass2() { // from class: o.RecyclerView.6
                    public void valueOf(processAppeared processappeared) {
                        this.values = processappeared;
                    }

                    public void values(String str) {
                        synchronized (this) {
                            valueOf();
                            if (str == null || str.isEmpty()) {
                                throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
                            }
                            this.HaptikSDK$c = str;
                        }
                    }

                    public void ah$a(FirebaseApp firebaseApp) {
                        synchronized (this) {
                            this.ah$a = firebaseApp;
                        }
                    }
                };
                if (!this.ag$a.invoke()) {
                    r0.values(this.ag$a.ah$a());
                }
                r0.ah$a(this.ag$a);
                r0.valueOf(this.toString);
                postAnimationRunner postanimationrunner2 = new postAnimationRunner(this.ag$a, adapter, r0);
                this.values.put(adapter, postanimationrunner2);
                postanimationrunner = postanimationrunner2;
            }
        }
        return postanimationrunner;
    }
}
