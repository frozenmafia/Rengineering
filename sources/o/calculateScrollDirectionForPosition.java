package o;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* loaded from: classes5.dex */
public final /* synthetic */ class calculateScrollDirectionForPosition implements SuccessContinuation {
    public static final /* synthetic */ calculateScrollDirectionForPosition values = new calculateScrollDirectionForPosition();

    private /* synthetic */ calculateScrollDirectionForPosition() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task forResult;
        getNextSpan getnextspan = (getNextSpan) obj;
        forResult = Tasks.forResult(null);
        return forResult;
    }
}
