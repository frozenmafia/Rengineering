package o;

import androidx.databinding.ObservableList;
import androidx.recyclerview.widget.DiffUtil;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public class ActivityStack<T> extends AbstractList<T> implements androidx.databinding.ObservableList<T> {
    private final Object ag$a;
    private List<T> ah$a;
    private final androidx.databinding.ListChangeRegistry invoke;
    private final DiffUtil.ItemCallback<T> toString;
    private final boolean valueOf;
    /* JADX WARN: Incorrect inner types in field signature: Lo/ActivityStack<TT;>.a; */
    private final ActivityStack$ah$a values;

    public ActivityStack(DiffUtil.ItemCallback<T> itemCallback) {
        this(itemCallback, true);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [o.ActivityStack$ah$a] */
    public ActivityStack(DiffUtil.ItemCallback<T> itemCallback, boolean z) {
        this.ag$a = new Object();
        this.ah$a = Collections.emptyList();
        this.invoke = new androidx.databinding.ListChangeRegistry();
        this.values = new androidx.recyclerview.widget.ListUpdateCallback() { // from class: o.ActivityStack$ah$a
            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onChanged(int i, int i2, Object obj) {
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                listChangeRegistry = ActivityStack.this.invoke;
                listChangeRegistry.notifyChanged(ActivityStack.this, i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onInserted(int i, int i2) {
                int i3;
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                ActivityStack activityStack = ActivityStack.this;
                i3 = activityStack.modCount;
                activityStack.modCount = i3 + 1;
                listChangeRegistry = ActivityStack.this.invoke;
                listChangeRegistry.notifyInserted(ActivityStack.this, i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onRemoved(int i, int i2) {
                int i3;
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                ActivityStack activityStack = ActivityStack.this;
                i3 = activityStack.modCount;
                activityStack.modCount = i3 + 1;
                listChangeRegistry = ActivityStack.this.invoke;
                listChangeRegistry.notifyRemoved(ActivityStack.this, i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onMoved(int i, int i2) {
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                listChangeRegistry = ActivityStack.this.invoke;
                listChangeRegistry.notifyMoved(ActivityStack.this, i, i2, 1);
            }
        };
        this.toString = itemCallback;
        this.valueOf = z;
    }

    private DiffUtil.DiffResult valueOf(final List<T> list, final List<T> list2) {
        return androidx.recyclerview.widget.DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: o.ActivityStack.4
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getOldListSize() {
                return list.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public int getNewListSize() {
                List list3 = list2;
                if (list3 != null) {
                    return list3.size();
                }
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areItemsTheSame(int i, int i2) {
                Object obj = list.get(i);
                Object obj2 = list2.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return ActivityStack.this.toString.areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public boolean areContentsTheSame(int i, int i2) {
                Object obj = list.get(i);
                Object obj2 = list2.get(i2);
                if (obj == null || obj2 == null) {
                    return true;
                }
                return ActivityStack.this.toString.areContentsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public Object getChangePayload(int i, int i2) {
                return ActivityStack.this.toString.getChangePayload(list.get(i), list2.get(i2));
            }
        }, this.valueOf);
    }

    public void ag$a(List<T> list) {
        DiffUtil.DiffResult valueOf = valueOf(this.ah$a, list);
        this.ah$a = list;
        valueOf.dispatchUpdatesTo(this.values);
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(ObservableList.OnListChangedCallback<? extends androidx.databinding.ObservableList<T>> onListChangedCallback) {
        this.invoke.add(onListChangedCallback);
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback<? extends androidx.databinding.ObservableList<T>> onListChangedCallback) {
        this.invoke.remove(onListChangedCallback);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.ah$a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.ah$a.size();
    }
}
