package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import o.getMinStart;
/* loaded from: classes5.dex */
public final /* synthetic */ class applyPendingSavedState implements SuccessContinuation {
    public static final /* synthetic */ applyPendingSavedState values = new applyPendingSavedState();

    private /* synthetic */ applyPendingSavedState() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task forResult;
        getMinStart.valueOf valueof = (getMinStart.valueOf) obj;
        forResult = Tasks.forResult(null);
        return forResult;
    }
}
