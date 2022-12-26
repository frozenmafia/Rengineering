package o;

import androidx.recyclerview.widget.RecyclerView;
import com.dream11.androidhelpers.adapters.BaseAdapter;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes4.dex */
public class hasOpaqueBackground extends BaseAdapter {
    private int HaptikSDK$c;
    private hasVisibleDrawer ag$a;
    private boolean ah$a;
    private BaseAdapter ah$b;
    private BaseAdapter toString;
    private toString valueOf;

    /* loaded from: classes4.dex */
    public interface toString {
        void requestNextPage();
    }

    public hasOpaqueBackground(BaseAdapter baseAdapter) {
        this(baseAdapter, null);
    }

    public hasOpaqueBackground(BaseAdapter baseAdapter, BaseAdapter baseAdapter2) {
        this.HaptikSDK$c = 1;
        this.ah$a = false;
        this.toString = baseAdapter;
        this.ah$b = baseAdapter2;
        hasVisibleDrawer hasvisibledrawer = new hasVisibleDrawer(baseAdapter);
        this.ag$a = hasvisibledrawer;
        hasvisibledrawer.registerAdapterDataObserver(valueOf());
    }

    public void valueOf(boolean z) {
        this.ah$a = z;
        BaseAdapter baseAdapter = this.ah$b;
        if (baseAdapter == null) {
            return;
        }
        if (z) {
            if (this.ag$a.valueOf() == 0) {
                this.ag$a.ah$a(this.ah$b);
                return;
            }
            return;
        }
        this.ag$a.valueOf(baseAdapter);
    }

    public void ag$a(toString tostring) {
        this.valueOf = tostring;
    }

    public void ah$a() {
        valueOf(false);
        this.valueOf = null;
    }

    public void ag$a(int i) {
        this.HaptikSDK$c = i;
    }

    public BaseAdapter ag$a() {
        return this.toString;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return this.ag$a.valueOf(i);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        toString tostring;
        if (i == values() - this.HaptikSDK$c && (tostring = this.valueOf) != null) {
            tostring.requestNextPage();
        }
        this.ag$a.values(baseAdapter$ag$a, i);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        return this.ag$a.values();
    }

    private RecyclerView.AdapterDataObserver valueOf() {
        return new RecyclerView.AdapterDataObserver() { // from class: o.hasOpaqueBackground.1
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
