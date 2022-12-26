package o;

import androidx.recyclerview.widget.RecyclerView;
import com.dream11.androidhelpers.adapters.BaseAdapter;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes4.dex */
public class hasVisibleDrawer extends BaseAdapter {
    private BaseAdapter toString;
    private hasPeekingDrawer ag$a = new hasPeekingDrawer();
    private hasPeekingDrawer valueOf = new hasPeekingDrawer();
    private hasPeekingDrawer ah$a = new hasPeekingDrawer();

    public hasVisibleDrawer(BaseAdapter baseAdapter) {
        this.toString = baseAdapter;
        this.ag$a.values(this.valueOf);
        this.ag$a.values(baseAdapter);
        this.ag$a.values(this.ah$a);
        this.ag$a.registerAdapterDataObserver(ag$a());
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return this.ag$a.valueOf(i);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        this.ag$a.values(baseAdapter$ag$a, i);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        return this.ag$a.values();
    }

    public BaseAdapter ah$a() {
        return this.toString;
    }

    public void ag$a(BaseAdapter baseAdapter) {
        this.valueOf.values(baseAdapter);
    }

    public void ah$a(BaseAdapter baseAdapter) {
        this.ah$a.values(baseAdapter);
    }

    public void valueOf(BaseAdapter baseAdapter) {
        this.ah$a.toString(baseAdapter);
    }

    public int valueOf() {
        return this.ah$a.getItemCount();
    }

    private RecyclerView.AdapterDataObserver ag$a() {
        return new RecyclerView.AdapterDataObserver() { // from class: o.hasVisibleDrawer.3
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                this.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                super.onItemRangeChanged(i, i2);
                this.notifyItemRangeChanged(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2, Object obj) {
                super.onItemRangeChanged(i, i2, obj);
                this.notifyItemRangeChanged(i, i2, obj);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                super.onItemRangeInserted(i, i2);
                this.notifyItemRangeInserted(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                super.onItemRangeRemoved(i, i2);
                this.notifyItemRangeRemoved(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeMoved(int i, int i2, int i3) {
                super.onItemRangeMoved(i, i2, i3);
                this.notifyItemMoved(i, i2);
            }
        };
    }
}
