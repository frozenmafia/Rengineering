package o;

import com.facebook.imagepipeline.listener.BaseRequestListener;
/* loaded from: classes4.dex */
public class dispatchMultiWindowModeChanged extends BaseRequestListener {
    private final dispatchLowMemory toString;
    private String valueOf;

    public dispatchMultiWindowModeChanged(String str, dispatchLowMemory dispatchlowmemory) {
        this.toString = dispatchlowmemory;
        valueOf(str);
    }

    public void valueOf(String str) {
        this.valueOf = str;
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onUltimateProducerReached(String str, String str2, boolean z) {
        dispatchLowMemory dispatchlowmemory = this.toString;
        if (dispatchlowmemory != null) {
            dispatchlowmemory.ah$a(this.valueOf, dispatchOptionsMenuClosed.values(str2), z, str2);
        }
    }
}
