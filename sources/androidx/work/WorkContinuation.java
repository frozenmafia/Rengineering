package androidx.work;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;
import o.animateAddImpl;
/* loaded from: classes.dex */
public abstract class WorkContinuation {
    protected abstract WorkContinuation combineInternal(List<WorkContinuation> list);

    public abstract Operation enqueue();

    public abstract animateAddImpl<List<WorkInfo>> getWorkInfos();

    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData();

    public abstract WorkContinuation then(List<OneTimeWorkRequest> list);

    public final WorkContinuation then(OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    public static WorkContinuation combine(List<WorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }
}
