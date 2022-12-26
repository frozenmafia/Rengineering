package o;

import androidx.recyclerview.widget.RecyclerView;
import com.dream11.androidhelpers.adapters.BaseAdapter;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class hasPeekingDrawer extends BaseAdapter {
    private Map<RecyclerView.AdapterDataObserver, BaseAdapter> ag$a = new HashMap();
    private List<BaseAdapter> toString = new ArrayList();

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        BaseAdapter.values ah$a = ah$a(i);
        BaseAdapter baseAdapter = ah$a.values;
        if (baseAdapter != null) {
            return baseAdapter.getItemViewType(ah$a.toString);
        }
        return 0;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        BaseAdapter.values ah$a = ah$a(i);
        BaseAdapter baseAdapter = ah$a.values;
        if (baseAdapter != null) {
            baseAdapter.onBindViewHolder(baseAdapter$ag$a, ah$a.toString);
        }
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        int i = 0;
        for (BaseAdapter baseAdapter : this.toString) {
            i += baseAdapter.getItemCount();
        }
        return i;
    }

    private RecyclerView.AdapterDataObserver ag$a() {
        return new RecyclerView.AdapterDataObserver() { // from class: o.hasPeekingDrawer.2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                hasPeekingDrawer.this.values.values = null;
                this.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                hasPeekingDrawer.this.values.values = null;
                this.notifyItemRangeChanged(i + valueOf(), i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                hasPeekingDrawer.this.values.values = null;
                this.notifyItemRangeInserted(i + valueOf(), i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                hasPeekingDrawer.this.values.values = null;
                this.notifyItemRangeRemoved(i + valueOf(), i2);
            }

            private int valueOf() {
                BaseAdapter baseAdapter;
                BaseAdapter baseAdapter2 = (BaseAdapter) hasPeekingDrawer.this.ag$a.get(this);
                Iterator it = hasPeekingDrawer.this.toString.iterator();
                int i = 0;
                while (it.hasNext() && baseAdapter2 != (baseAdapter = (BaseAdapter) it.next())) {
                    i += baseAdapter.getItemCount();
                }
                return i;
            }
        };
    }

    public boolean values(BaseAdapter baseAdapter) {
        return valueOf(baseAdapter, this.toString.size());
    }

    public boolean valueOf(BaseAdapter baseAdapter, int i) {
        BaseAdapter next;
        int i2 = 0;
        if (valueOf(baseAdapter)) {
            return false;
        }
        if (i < 0) {
            i = 0;
        }
        this.toString.add(i, baseAdapter);
        RecyclerView.AdapterDataObserver ag$a = ag$a();
        this.ag$a.put(ag$a, baseAdapter);
        baseAdapter.registerAdapterDataObserver(ag$a);
        if (HaptikSDK$b()) {
            baseAdapter.onAttachedToRecyclerView(ah$b());
        }
        int itemCount = baseAdapter.getItemCount();
        if (itemCount > 0) {
            if (i == this.toString.size() - 1) {
                notifyItemRangeInserted(getItemCount() - itemCount, itemCount);
            } else {
                Iterator<BaseAdapter> it = this.toString.iterator();
                while (it.hasNext() && (next = it.next()) != baseAdapter) {
                    i2 += next.getItemCount();
                }
                notifyItemRangeInserted(i2, itemCount);
            }
        }
        return true;
    }

    public boolean ag$a(int i) {
        BaseAdapter remove;
        if (i < this.toString.size() && (remove = this.toString.remove(i)) != null) {
            for (Map.Entry<RecyclerView.AdapterDataObserver, BaseAdapter> entry : this.ag$a.entrySet()) {
                if (entry.getValue() == remove) {
                    remove.unregisterAdapterDataObserver(entry.getKey());
                    remove.valueOf(ah$b());
                    this.ag$a.remove(entry.getKey());
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i) {
                            break;
                        }
                        BaseAdapter baseAdapter = this.toString.get(i3);
                        i3++;
                        if (i3 == i) {
                            i2 = i2 > 0 ? i2 : 0;
                        } else {
                            i2 += baseAdapter.getItemCount();
                        }
                    }
                    notifyItemRangeRemoved(i2, remove.getItemCount());
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public boolean toString(BaseAdapter baseAdapter) {
        int indexOf = this.toString.indexOf(baseAdapter);
        if (indexOf != -1) {
            return ag$a(indexOf);
        }
        return false;
    }

    public void ah$a() {
        int size = this.toString.size();
        for (int i = 0; i < size; i++) {
            ag$a(0);
        }
    }

    public boolean valueOf(BaseAdapter baseAdapter) {
        return this.toString.contains(baseAdapter);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public BaseAdapter.values ah$a(int i) {
        int i2 = 0;
        for (BaseAdapter baseAdapter : this.toString) {
            if (i < baseAdapter.getItemCount() + i2) {
                return super.valueOf(i - i2, baseAdapter, i);
            }
            i2 += baseAdapter.getItemCount();
        }
        return super.valueOf(0, null, i);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public BaseAdapter.values toString(int i) {
        int i2 = 0;
        for (BaseAdapter baseAdapter : this.toString) {
            if (i < baseAdapter.getItemCount() + i2) {
                return baseAdapter.toString(i - i2);
            }
            i2 += baseAdapter.getItemCount();
        }
        return super.valueOf(0, null, i);
    }
}
