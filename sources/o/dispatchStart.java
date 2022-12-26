package o;

import com.facebook.imagepipeline.listener.BaseRequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
/* loaded from: classes4.dex */
public class dispatchStart extends BaseRequestListener {
    private final onSupportInvalidateOptionsMenu ag$a;
    private final doLoaderDestroy toString;

    public dispatchStart(onSupportInvalidateOptionsMenu onsupportinvalidateoptionsmenu, doLoaderDestroy doloaderdestroy) {
        this.ag$a = onsupportinvalidateoptionsmenu;
        this.toString = doloaderdestroy;
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.toString.HaptikSDK$c(this.ag$a.values());
        this.toString.values(imageRequest);
        this.toString.values(obj);
        this.toString.valueOf(str);
        this.toString.toString(z);
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        this.toString.ah$b(this.ag$a.values());
        this.toString.values(imageRequest);
        this.toString.valueOf(str);
        this.toString.toString(z);
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.toString.ah$b(this.ag$a.values());
        this.toString.values(imageRequest);
        this.toString.valueOf(str);
        this.toString.toString(z);
    }

    @Override // com.facebook.imagepipeline.listener.BaseRequestListener, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String str) {
        this.toString.ah$b(this.ag$a.values());
        this.toString.valueOf(str);
    }
}
