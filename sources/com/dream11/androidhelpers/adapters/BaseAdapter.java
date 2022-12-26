package com.dream11.androidhelpers.adapters;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import o.gravityToString;
/* loaded from: classes4.dex */
public abstract class BaseAdapter extends RecyclerView.Adapter<BaseAdapter$ag$a> {
    private gravityToString toString;
    private boolean ah$a = false;
    private RecyclerView valueOf = null;
    public values values = new values(null, 0, -1);

    /* loaded from: classes6.dex */
    public enum StickyLevel {
        NO_STICKY,
        LEVEL_1
    }

    protected void toString(RecyclerView recyclerView) {
    }

    public abstract int valueOf(int i);

    public void valueOf(RecyclerView recyclerView) {
    }

    public abstract int values();

    public abstract void values(BaseAdapter$ag$a baseAdapter$ag$a, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: values */
    public final BaseAdapter$ag$a onCreateViewHolder(ViewGroup viewGroup, int i) {
        gravityToString gravitytostring = this.toString;
        gravitytostring.getClass();
        return gravitytostring.invoke(viewGroup, i);
    }

    public void ah$a(gravityToString gravitytostring) {
        this.toString = gravitytostring;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: valueOf */
    public final void onBindViewHolder(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        values(baseAdapter$ag$a, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return values();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return valueOf(i);
    }

    public values toString(int i) {
        return this.values.ag$a(i, this, i);
    }

    public values ah$a(int i) {
        return valueOf(i, null, i);
    }

    public final values valueOf(int i, BaseAdapter baseAdapter, int i2) {
        return this.values.ag$a(i, baseAdapter, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RecyclerView ah$b() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean HaptikSDK$b() {
        return this.ah$a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.ah$a = true;
        this.valueOf = recyclerView;
        toString(recyclerView);
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.ah$a = false;
        this.valueOf = null;
        valueOf(recyclerView);
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag$a(int i, int i2) {
        if (i2 == 0) {
            notifyItemRangeRemoved(0, i);
        } else if (i2 == i) {
            notifyItemRangeChanged(0, i2);
        } else if (i > i2) {
            notifyItemRangeRemoved(i2, i - i2);
            notifyItemRangeChanged(0, i2);
        } else {
            notifyItemRangeInserted(i, i2 - i);
            notifyItemRangeChanged(0, i);
        }
    }

    /* loaded from: classes4.dex */
    public class values {
        public int toString;
        public int valueOf;
        public BaseAdapter values;

        private values(BaseAdapter baseAdapter, int i, int i2) {
            this.values = baseAdapter;
            this.toString = i;
            this.valueOf = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public values ag$a(int i, BaseAdapter baseAdapter, int i2) {
            this.values = baseAdapter;
            this.toString = i;
            this.valueOf = i2;
            return this;
        }
    }
}
