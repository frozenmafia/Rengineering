package o;

import com.google.android.gms.tasks.TaskCompletionSource;
import o.RecyclerView;
/* loaded from: classes7.dex */
class setViewCacheSize implements RecyclerView.SavedState.AnonymousClass1 {
    final TaskCompletionSource<String> ah$a;

    @Override // o.RecyclerView.SavedState.AnonymousClass1
    public boolean values(Exception exc) {
        return false;
    }

    public setViewCacheSize(TaskCompletionSource<String> taskCompletionSource) {
        this.ah$a = taskCompletionSource;
    }

    @Override // o.RecyclerView.SavedState.AnonymousClass1
    public boolean toString(isPendingInitialRun ispendinginitialrun) {
        if (ispendinginitialrun.HaptikWebView() || ispendinginitialrun.getInitSettings() || ispendinginitialrun.HaptikSDK$d()) {
            this.ah$a.trySetResult(ispendinginitialrun.ah$a());
            return true;
        }
        return false;
    }
}
