package o;

import com.google.firebase.database.snapshot.Node;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o.RecyclerView;
/* loaded from: classes5.dex */
public interface dispatchAnimationsFinished {
    List<RecyclerView.Adapter.StateRestorationPolicy> ag$a();

    void ag$a(addViewInt addviewint);

    void ag$a(addViewInt addviewint, Set<detachViewAt> set, Set<detachViewAt> set2);

    void ag$a(bindViewHolder bindviewholder, Node node, long j);

    void ag$a(bindViewHolder bindviewholder, RecyclerView.AnonymousClass3 anonymousClass3);

    void ah$a(long j);

    void ah$a(addViewInt addviewint);

    <T> T toString(Callable<T> callable);

    void valueOf(addViewInt addviewint);

    void valueOf(addViewInt addviewint, Node node);

    void valueOf(addViewInt addviewint, Set<detachViewAt> set);

    void valueOf(bindViewHolder bindviewholder, Node node);

    void valueOf(bindViewHolder bindviewholder, RecyclerView.AnonymousClass3 anonymousClass3, long j);

    RecyclerView.ItemDecoration values(addViewInt addviewint);

    void values(bindViewHolder bindviewholder, RecyclerView.AnonymousClass3 anonymousClass3);
}
