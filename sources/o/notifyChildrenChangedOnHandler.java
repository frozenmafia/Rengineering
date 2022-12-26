package o;

import com.github.mikephil.charting.data.DataSet;
import java.util.List;
import o.MediaBrowserServiceCompat;
/* loaded from: classes4.dex */
public class notifyChildrenChangedOnHandler extends MediaBrowserServiceCompat.MediaBrowserServiceImplBase<MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass4> {
    protected MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass3 values;

    public notifyChildrenChangedOnHandler(MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass4 anonymousClass4, unregisterCallbacks unregistercallbacks) {
        super(anonymousClass4);
        this.values = unregistercallbacks.valueOf() == null ? null : new MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass3(unregistercallbacks);
    }

    @Override // o.MediaBrowserServiceCompat.MediaBrowserServiceImplBase
    protected List<MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2> valueOf(float f, float f2, float f3) {
        this.ah$a.clear();
        List<getRootId> valueOf = ((MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass4) this.valueOf).ITrustedWebActivityCallback$Default().valueOf();
        for (int i = 0; i < valueOf.size(); i++) {
            getRootId getrootid = valueOf.get(i);
            MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass3 anonymousClass3 = this.values;
            if (anonymousClass3 != null && (getrootid instanceof MediaBrowserServiceCompat.AnonymousClass3)) {
                MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 anonymousClass32 = anonymousClass3.toString(f2, f3);
                if (anonymousClass32 != null) {
                    anonymousClass32.valueOf(i);
                    this.ah$a.add(anonymousClass32);
                }
            } else {
                int ah$a = getrootid.ah$a();
                for (int i2 = 0; i2 < ah$a; i2++) {
                    MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass8 getrootid2 = valueOf.get(i).toString(i2);
                    if (getrootid2.onRelationshipValidationResult()) {
                        for (MediaBrowserServiceCompat.MediaBrowserServiceImplBase.AnonymousClass2 anonymousClass2 : toString(getrootid2, i2, f, DataSet.Rounding.CLOSEST)) {
                            anonymousClass2.valueOf(i);
                            this.ah$a.add(anonymousClass2);
                        }
                    }
                }
            }
        }
        return this.ah$a;
    }
}
