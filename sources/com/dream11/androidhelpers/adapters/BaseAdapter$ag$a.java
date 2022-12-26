package com.dream11.androidhelpers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BaseAdapter$ag$a extends RecyclerView.ViewHolder {
    private View ah$a;
    private Map<Integer, View> values;

    public BaseAdapter$ag$a(Context context, int i, ViewGroup viewGroup) {
        this(LayoutInflater.from(context).inflate(i, viewGroup, false));
    }

    public BaseAdapter$ag$a(View view) {
        super(view);
        this.values = new HashMap();
        this.ah$a = view;
    }

    public View ag$a() {
        return this.ah$a;
    }

    public View toString(int i) {
        if (this.values.containsKey(Integer.valueOf(i))) {
            return this.values.get(Integer.valueOf(i));
        }
        View findViewById = this.itemView.findViewById(i);
        this.values.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
