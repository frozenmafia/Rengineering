package androidx.work.multiprocess;

import androidx.work.OneTimeWorkRequest;
import java.util.Collections;
import java.util.List;
import o.animateAddImpl;
/* loaded from: classes6.dex */
public abstract class RemoteWorkContinuation {
    protected abstract RemoteWorkContinuation combineInternal(List<RemoteWorkContinuation> list);

    public abstract animateAddImpl<Void> enqueue();

    public abstract RemoteWorkContinuation then(List<OneTimeWorkRequest> list);

    protected RemoteWorkContinuation() {
    }

    public final RemoteWorkContinuation then(OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    public static RemoteWorkContinuation combine(List<RemoteWorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }
}
