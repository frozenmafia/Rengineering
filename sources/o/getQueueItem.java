package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import o.MediaSessionCompat;
/* loaded from: classes.dex */
public class getQueueItem {
    private boolean ag$a;
    private final List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> toString;
    private PointF values;

    public getQueueItem(PointF pointF, boolean z, List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> list) {
        this.values = pointF;
        this.ag$a = z;
        this.toString = new ArrayList(list);
    }

    public getQueueItem() {
        this.toString = new ArrayList();
    }

    public void ah$a(float f, float f2) {
        if (this.values == null) {
            this.values = new PointF();
        }
        this.values.set(f, f2);
    }

    public PointF ag$a() {
        return this.values;
    }

    public void valueOf(boolean z) {
        this.ag$a = z;
    }

    public boolean valueOf() {
        return this.ag$a;
    }

    public List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> ah$a() {
        return this.toString;
    }

    public void ag$a(getQueueItem getqueueitem, getQueueItem getqueueitem2, float f) {
        if (this.values == null) {
            this.values = new PointF();
        }
        this.ag$a = getqueueitem.valueOf() || getqueueitem2.valueOf();
        if (getqueueitem.ah$a().size() != getqueueitem2.ah$a().size()) {
            ResultReceiver.ah$a("Curves must have the same number of control points. Shape 1: " + getqueueitem.ah$a().size() + "\tShape 2: " + getqueueitem2.ah$a().size());
        }
        int min = Math.min(getqueueitem.ah$a().size(), getqueueitem2.ah$a().size());
        if (this.toString.size() < min) {
            for (int size = this.toString.size(); size < min; size++) {
                this.toString.add(new MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1());
            }
        } else if (this.toString.size() > min) {
            for (int size2 = this.toString.size() - 1; size2 >= min; size2--) {
                List<MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1> list = this.toString;
                list.remove(list.size() - 1);
            }
        }
        PointF ag$a = getqueueitem.ag$a();
        PointF ag$a2 = getqueueitem2.ag$a();
        ah$a(viewModels.ag$a(ag$a.x, ag$a2.x, f), viewModels.ag$a(ag$a.y, ag$a2.y, f));
        for (int size3 = this.toString.size() - 1; size3 >= 0; size3--) {
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass1 = getqueueitem.ah$a().get(size3);
            MediaSessionCompat.MediaSessionImplApi19.AnonymousClass1 anonymousClass12 = getqueueitem2.ah$a().get(size3);
            PointF valueOf = anonymousClass1.valueOf();
            PointF ag$a3 = anonymousClass1.ag$a();
            PointF ah$a = anonymousClass1.ah$a();
            PointF valueOf2 = anonymousClass12.valueOf();
            PointF ag$a4 = anonymousClass12.ag$a();
            PointF ah$a2 = anonymousClass12.ah$a();
            this.toString.get(size3).ah$a(viewModels.ag$a(valueOf.x, valueOf2.x, f), viewModels.ag$a(valueOf.y, valueOf2.y, f));
            this.toString.get(size3).ag$a(viewModels.ag$a(ag$a3.x, ag$a4.x, f), viewModels.ag$a(ag$a3.y, ag$a4.y, f));
            this.toString.get(size3).toString(viewModels.ag$a(ah$a.x, ah$a2.x, f), viewModels.ag$a(ah$a.y, ah$a2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.toString.size() + "closed=" + this.ag$a + '}';
    }
}
