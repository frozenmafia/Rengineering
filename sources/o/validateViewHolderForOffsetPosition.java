package o;

import com.google.android.gms.tasks.TaskCompletionSource;
import o.RecyclerView;
/* loaded from: classes7.dex */
class validateViewHolderForOffsetPosition implements RecyclerView.SavedState.AnonymousClass1 {
    private final triggerUpdateProcessor ah$a;
    private final TaskCompletionSource<tryGetViewHolderForPositionByDeadline> values;

    public validateViewHolderForOffsetPosition(triggerUpdateProcessor triggerupdateprocessor, TaskCompletionSource<tryGetViewHolderForPositionByDeadline> taskCompletionSource) {
        this.ah$a = triggerupdateprocessor;
        this.values = taskCompletionSource;
    }

    @Override // o.RecyclerView.SavedState.AnonymousClass1
    public boolean toString(isPendingInitialRun ispendinginitialrun) {
        if (!ispendinginitialrun.getInitSettings() || this.ah$a.ah$a(ispendinginitialrun)) {
            return false;
        }
        this.values.setResult(tryGetViewHolderForPositionByDeadline.ag$a().ag$a(ispendinginitialrun.valueOf()).valueOf(ispendinginitialrun.values()).ag$a(ispendinginitialrun.invoke()).values());
        return true;
    }

    @Override // o.RecyclerView.SavedState.AnonymousClass1
    public boolean values(Exception exc) {
        this.values.trySetException(exc);
        return true;
    }
}
