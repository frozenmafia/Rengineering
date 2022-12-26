package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;
import o.RxRoom;
/* loaded from: classes5.dex */
public final class createFlowable extends RecyclerView.Adapter<RxRoom.AnonymousClass1> {
    private final ArrayList<View> toString = new ArrayList<>();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: ag$a */
    public RxRoom.AnonymousClass1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        runAnimators.ag$a(viewGroup, "parent");
        return RxRoom.AnonymousClass1.toString.toString(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: values */
    public void onBindViewHolder(RxRoom.AnonymousClass1 anonymousClass1, int i) {
        runAnimators.ag$a(anonymousClass1, "holder");
        FrameLayout valueOf = anonymousClass1.valueOf();
        View createflowable = toString(i);
        if (valueOf.getChildCount() > 0) {
            valueOf.removeAllViews();
        }
        if (createflowable.getParent() != null) {
            ViewParent parent = createflowable.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(createflowable);
        }
        valueOf.addView(createflowable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.toString.size();
    }

    public final void values(View view, int i) {
        runAnimators.ag$a(view, "child");
        this.toString.add(i, view);
        notifyItemInserted(i);
    }

    public final View toString(int i) {
        View view = this.toString.get(i);
        runAnimators.ah$a(view, "childrenViews[index]");
        return view;
    }

    public final void valueOf(View view) {
        runAnimators.ag$a(view, "child");
        valueOf(this.toString.indexOf(view));
    }

    public final void values() {
        int size = this.toString.size();
        this.toString.clear();
        notifyItemRangeRemoved(0, size);
    }

    public final void valueOf(int i) {
        this.toString.remove(i);
        notifyItemRemoved(i);
    }
}
