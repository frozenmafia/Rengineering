package me.tatarka.bindingcollectionadapter2;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes5.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray values = new SparseIntArray(0);

    /* loaded from: classes5.dex */
    static class valueOf {
        static final HashMap<String, Integer> ah$a = new HashMap<>(0);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (values.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || values.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = valueOf.ah$a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return values.toString.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes5.dex */
    static class values {
        static final SparseArray<String> toString;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            toString = sparseArray;
            sparseArray.put(0, "_all");
        }
    }
}
