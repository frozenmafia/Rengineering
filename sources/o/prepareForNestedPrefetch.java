package o;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class prepareForNestedPrefetch implements Continuation {
    static final Continuation values = new prepareForNestedPrefetch();

    private prepareForNestedPrefetch() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        String ah$a;
        ah$a = ((getRecycledViewCount) task.getResult()).ah$a();
        return ah$a;
    }
}
