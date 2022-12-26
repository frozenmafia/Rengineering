package o;

import com.facebook.imagepipeline.listener.BaseRequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.systrace.Systrace;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class saveAddedFragments extends BaseRequestListener {
    int toString = 0;
    Map<String, android.util.Pair<Integer, String>> valueOf = new HashMap();
    Map<String, android.util.Pair<Integer, String>> values = new HashMap();

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public boolean requiresExtraMap(String str) {
        return false;
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerStart(String str, String str2) {
        if (Systrace.toString(0L)) {
            android.util.Pair<Integer, String> create = android.util.Pair.create(Integer.valueOf(this.toString), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
            Systrace.ah$a(0L, (String) create.second, this.toString);
            this.valueOf.put(str, create);
            this.toString = this.toString + 1;
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        if (Systrace.toString(0L) && this.valueOf.containsKey(str)) {
            android.util.Pair<Integer, String> pair = this.valueOf.get(str);
            Systrace.toString(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.valueOf.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        if (Systrace.toString(0L) && this.valueOf.containsKey(str)) {
            android.util.Pair<Integer, String> pair = this.valueOf.get(str);
            Systrace.toString(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.valueOf.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        if (Systrace.toString(0L) && this.valueOf.containsKey(str)) {
            android.util.Pair<Integer, String> pair = this.valueOf.get(str);
            Systrace.toString(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.valueOf.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerEvent(String str, String str2, String str3) {
        if (Systrace.toString(0L)) {
            Systrace.ag$a(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + "_" + str2.replace(':', '_') + "_" + str3.replace(':', '_'), Systrace.EventScope.THREAD);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        if (Systrace.toString(0L)) {
            android.util.Pair<Integer, String> create = android.util.Pair.create(Integer.valueOf(this.toString), "FRESCO_REQUEST_" + imageRequest.getSourceUri().toString().replace(':', '_'));
            Systrace.ah$a(0L, (String) create.second, this.toString);
            this.values.put(str, create);
            this.toString = this.toString + 1;
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        if (Systrace.toString(0L) && this.values.containsKey(str)) {
            android.util.Pair<Integer, String> pair = this.values.get(str);
            Systrace.toString(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.values.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        if (Systrace.toString(0L) && this.values.containsKey(str)) {
            android.util.Pair<Integer, String> pair = this.values.get(str);
            Systrace.toString(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.values.remove(str);
        }
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String str) {
        if (Systrace.toString(0L) && this.values.containsKey(str)) {
            android.util.Pair<Integer, String> pair = this.values.get(str);
            Systrace.toString(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.values.remove(str);
        }
    }
}
