package com.fancode.core.ui.androidhelpers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
import o.GeneratedAdapter;
/* loaded from: classes4.dex */
public abstract class BaseAdapter extends RecyclerView.Adapter<values> {
    private GeneratedAdapter values;
    private boolean ah$a = false;
    private RecyclerView toString = null;
    public BaseAdapter$ah$a ag$a = new BaseAdapter$ah$a(this, null, 0, -1);

    /* loaded from: classes6.dex */
    public enum StickyLevel {
        NO_STICKY,
        LEVEL_1
    }

    protected void ag$a(RecyclerView recyclerView) {
    }

    protected void toString(RecyclerView recyclerView) {
    }

    public abstract void valueOf(values valuesVar, int i);

    public abstract int values();

    public abstract int values(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: values */
    public final values onCreateViewHolder(ViewGroup viewGroup, int i) {
        GeneratedAdapter generatedAdapter = this.values;
        generatedAdapter.getClass();
        return generatedAdapter.ag$a(viewGroup, i);
    }

    public void toString(GeneratedAdapter generatedAdapter) {
        this.values = generatedAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: ah$a */
    public final void onBindViewHolder(values valuesVar, int i) {
        valueOf(valuesVar, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return values();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return values(i);
    }

    public BaseAdapter$ah$a ag$a(int i) {
        return values(i, null, i);
    }

    public final BaseAdapter$ah$a values(int i, BaseAdapter baseAdapter, int i2) {
        BaseAdapter$ah$a valueOf;
        valueOf = this.ag$a.valueOf(i, baseAdapter, i2);
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RecyclerView ah$a() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean valueOf() {
        return this.ah$a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.ah$a = true;
        this.toString = recyclerView;
        ag$a(recyclerView);
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.ah$a = false;
        this.toString = null;
        toString(recyclerView);
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ah$a(int i, int i2) {
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
    public static class values extends RecyclerView.ViewHolder {
        private Map<Integer, View> ah$a;
        private View valueOf;

        public values(Context context, int i, ViewGroup viewGroup) {
            this(LayoutInflater.from(context).inflate(i, viewGroup, false));
        }

        public values(View view) {
            super(view);
            this.ah$a = new HashMap();
            this.valueOf = view;
        }

        public View ah$a() {
            return this.valueOf;
        }
    }
}
