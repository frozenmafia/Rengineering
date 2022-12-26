package o;

import o.onWindowFocusChanged;
/* loaded from: classes2.dex */
public final class getActionView {
    @androidx.databinding.BindingAdapter({"layoutManager"})
    public static final void values(androidx.recyclerview.widget.RecyclerView recyclerView, onWindowFocusChanged.valueOf valueof) {
        runAnimators.ag$a(recyclerView, "recyclerView");
        runAnimators.ag$a(valueof, "layoutManagerFactory");
        recyclerView.setLayoutManager(valueof.ag$a(recyclerView));
    }
}
