package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewDataBinding;
/* renamed from: o.lambda$new$1$androidx-core-widget-ContentLoadingProgressBar  reason: invalid class name */
/* loaded from: classes4.dex */
public final class lambda$new$1$androidxcorewidgetContentLoadingProgressBar implements getViewHorizontalDragRange {
    private final haveContentsChanged ag$a;
    private final ViewDataBinding.AnonymousClass7 toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lambda$new$1$androidxcorewidgetContentLoadingProgressBar) {
            lambda$new$1$androidxcorewidgetContentLoadingProgressBar lambda_new_1_androidxcorewidgetcontentloadingprogressbar = (lambda$new$1$androidxcorewidgetContentLoadingProgressBar) obj;
            return runAnimators.values(this.toString, lambda_new_1_androidxcorewidgetcontentloadingprogressbar.toString) && runAnimators.values(this.ag$a, lambda_new_1_androidxcorewidgetcontentloadingprogressbar.ag$a);
        }
        return false;
    }

    public int hashCode() {
        ViewDataBinding.AnonymousClass7 anonymousClass7 = this.toString;
        return ((anonymousClass7 == null ? 0 : anonymousClass7.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        return "AadhaarVerificationSuccessClient(_message=" + this.toString + ", _status=" + this.ag$a + ')';
    }

    public lambda$new$1$androidxcorewidgetContentLoadingProgressBar(ViewDataBinding.AnonymousClass7 anonymousClass7, haveContentsChanged havecontentschanged) {
        runAnimators.ag$a(havecontentschanged, "_status");
        this.toString = anonymousClass7;
        this.ag$a = havecontentschanged;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "AadhaarVerificationSuccessClient");
        ViewDataBinding.AnonymousClass7 anonymousClass7 = this.toString;
        if (anonymousClass7 != null) {
            hashMap.put("message", anonymousClass7.ah$a());
        }
        hashMap.put("status", this.ag$a.ag$a());
        return hashMap;
    }
}
