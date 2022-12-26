package o;

import com.google.firebase.database.core.view.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class getChildMeasureSpec {
    private final detachAndScrapView ag$a;
    private final getStateRestorationPolicy valueOf;

    public getChildMeasureSpec(RecyclerView.AnonymousClass2 anonymousClass2) {
        this.valueOf = anonymousClass2.HaptikSDK$a();
        this.ag$a = anonymousClass2.toString("EventRaiser");
    }

    public void valueOf(List<? extends Event> list) {
        if (this.ag$a.ah$a()) {
            detachAndScrapView detachandscrapview = this.ag$a;
            detachandscrapview.toString("Raising " + list.size() + " event(s)", new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.valueOf.toString(new Runnable() { // from class: o.getChildMeasureSpec.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Event event = (Event) it.next();
                    if (getChildMeasureSpec.this.ag$a.ah$a()) {
                        detachAndScrapView detachandscrapview2 = getChildMeasureSpec.this.ag$a;
                        detachandscrapview2.toString("Raising " + event.toString(), new Object[0]);
                    }
                    event.ag$a();
                }
            }
        });
    }
}
