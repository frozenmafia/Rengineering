package o;

import androidx.recyclerview.widget.RecyclerView;
import com.fancode.core.ui.androidhelpers.adapters.BaseAdapter;
import com.fancode.core.ui.androidhelpers.adapters.BaseAdapter$ah$a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public class downFrom extends BaseAdapter {
    private Map<RecyclerView.AdapterDataObserver, BaseAdapter> ah$a = new HashMap();
    private List<BaseAdapter> values = new ArrayList();

    @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public int values(int i) {
        BaseAdapter$ah$a ag$a = ag$a(i);
        BaseAdapter baseAdapter = ag$a.toString;
        if (baseAdapter != null) {
            return baseAdapter.getItemViewType(ag$a.ag$a);
        }
        return 0;
    }

    @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public void valueOf(BaseAdapter.values valuesVar, int i) {
        BaseAdapter$ah$a ag$a = ag$a(i);
        BaseAdapter baseAdapter = ag$a.toString;
        if (baseAdapter != null) {
            baseAdapter.onBindViewHolder(valuesVar, ag$a.ag$a);
        }
    }

    @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public int values() {
        int i = 0;
        for (BaseAdapter baseAdapter : this.values) {
            i += baseAdapter.getItemCount();
        }
        return i;
    }

    private RecyclerView.AdapterDataObserver ag$a() {
        return new RecyclerView.AdapterDataObserver() { // from class: o.downFrom.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                downFrom.this.ag$a.toString = null;
                this.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                downFrom.this.ag$a.toString = null;
                this.notifyItemRangeChanged(i + values(), i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                downFrom.this.ag$a.toString = null;
                this.notifyItemRangeInserted(i + values(), i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                downFrom.this.ag$a.toString = null;
                this.notifyItemRangeRemoved(i + values(), i2);
            }

            private int values() {
                BaseAdapter baseAdapter;
                BaseAdapter baseAdapter2 = (BaseAdapter) downFrom.this.ah$a.get(this);
                Iterator it = downFrom.this.values.iterator();
                int i = 0;
                while (it.hasNext() && baseAdapter2 != (baseAdapter = (BaseAdapter) it.next())) {
                    i += baseAdapter.getItemCount();
                }
                return i;
            }
        };
    }

    public boolean values(BaseAdapter baseAdapter) {
        return values(baseAdapter, this.values.size());
    }

    public boolean values(BaseAdapter baseAdapter, int i) {
        BaseAdapter next;
        int i2 = 0;
        if (toString(baseAdapter)) {
            return false;
        }
        if (i < 0) {
            i = 0;
        }
        this.values.add(i, baseAdapter);
        RecyclerView.AdapterDataObserver ag$a = ag$a();
        this.ah$a.put(ag$a, baseAdapter);
        baseAdapter.registerAdapterDataObserver(ag$a);
        if (valueOf()) {
            baseAdapter.onAttachedToRecyclerView(ah$a());
        }
        int itemCount = baseAdapter.getItemCount();
        if (itemCount > 0) {
            if (i == this.values.size() - 1) {
                notifyItemRangeInserted(getItemCount() - itemCount, itemCount);
            } else {
                Iterator<BaseAdapter> it = this.values.iterator();
                while (it.hasNext() && (next = it.next()) != baseAdapter) {
                    i2 += next.getItemCount();
                }
                notifyItemRangeInserted(i2, itemCount);
            }
        }
        return true;
    }

    public boolean toString(BaseAdapter baseAdapter) {
        return this.values.contains(baseAdapter);
    }

    @Override // com.fancode.core.ui.androidhelpers.adapters.BaseAdapter
    public BaseAdapter$ah$a ag$a(int i) {
        int i2 = 0;
        for (BaseAdapter baseAdapter : this.values) {
            if (i < baseAdapter.getItemCount() + i2) {
                return super.values(i - i2, baseAdapter, i);
            }
            i2 += baseAdapter.getItemCount();
        }
        return super.values(0, null, i);
    }
}
