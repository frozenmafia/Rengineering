package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class ComplexColorCompat<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private androidx.recyclerview.widget.GridLayoutManager toString;
    private final androidx.collection.ArrayMap<Integer, Integer> values = new androidx.collection.ArrayMap<>();

    public abstract int ag$a(int i);

    public abstract void ag$a(VH vh, int i, int i2, int i3);

    public abstract VH ah$a(ViewGroup viewGroup, boolean z);

    public abstract int values();

    public abstract void values(VH vh, int i);

    public final boolean valueOf(int i) {
        return this.values.get(Integer.valueOf(i)) != null;
    }

    public final void toString(androidx.recyclerview.widget.GridLayoutManager gridLayoutManager) {
        this.toString = gridLayoutManager;
        if (gridLayoutManager == null) {
            return;
        }
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: o.ComplexColorCompat.5
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                if (ComplexColorCompat.this.valueOf(i)) {
                    return ComplexColorCompat.this.toString.getSpanCount();
                }
                return 1;
            }
        });
    }

    private int[] ah$a(int i) {
        int[] iArr;
        synchronized (this.values) {
            Integer num = -1;
            for (Integer num2 : this.values.keySet()) {
                if (i <= num2.intValue()) {
                    break;
                }
                num = num2;
            }
            iArr = new int[]{this.values.get(num).intValue(), (i - num.intValue()) - 1};
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        this.values.clear();
        int i = 0;
        for (int i2 = 0; i2 < values(); i2++) {
            this.values.put(Integer.valueOf(i), Integer.valueOf(i2));
            i += ag$a(i2) + 1;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return ah$a(viewGroup, i == 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final int getItemViewType(int i) {
        return valueOf(i) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final void onBindViewHolder(VH vh, int i) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        if (vh.itemView.getLayoutParams() instanceof GridLayoutManager.LayoutParams) {
            layoutParams = new StaggeredGridLayoutManager.LayoutParams(-2, -2);
        } else {
            layoutParams = vh.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) vh.itemView.getLayoutParams() : null;
        }
        if (valueOf(i)) {
            if (layoutParams != null) {
                layoutParams.setFullSpan(true);
            }
            values(vh, this.values.get(Integer.valueOf(i)).intValue());
        } else {
            if (layoutParams != null) {
                layoutParams.setFullSpan(false);
            }
            int[] ah$a = ah$a(i);
            ag$a(vh, ah$a[0], ah$a[1], i - (ah$a[0] + 1));
        }
        if (layoutParams != null) {
            vh.itemView.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final void onBindViewHolder(VH vh, int i, List<Object> list) {
        super.onBindViewHolder(vh, i, list);
    }
}
