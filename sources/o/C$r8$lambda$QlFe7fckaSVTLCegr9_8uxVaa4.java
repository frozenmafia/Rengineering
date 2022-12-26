package o;

import androidx.databinding.ObservableList;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
/* renamed from: o.$r8$lambda$-QlFe7fckaSVTLCegr9_8uxVaa4  reason: invalid class name */
/* loaded from: classes5.dex */
public class C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4<T> extends AbstractList<T> implements androidx.databinding.ObservableList<T> {
    private final androidx.recyclerview.widget.AsyncListDiffer<T> ag$a;
    private final androidx.databinding.ListChangeRegistry values = new androidx.databinding.ListChangeRegistry();

    public C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4(androidx.recyclerview.widget.AsyncDifferConfig<T> asyncDifferConfig) {
        this.ag$a = new androidx.recyclerview.widget.AsyncListDiffer<>(new androidx.recyclerview.widget.ListUpdateCallback() { // from class: o.$r8$lambda$-QlFe7fckaSVTLCegr9_8uxVaa4$ah$a
            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onChanged(int i, int i2, Object obj) {
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                listChangeRegistry = C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this.values;
                listChangeRegistry.notifyChanged(C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this, i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onInserted(int i, int i2) {
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                listChangeRegistry = C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this.values;
                listChangeRegistry.notifyInserted(C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this, i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onRemoved(int i, int i2) {
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                listChangeRegistry = C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this.values;
                listChangeRegistry.notifyRemoved(C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this, i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public void onMoved(int i, int i2) {
                androidx.databinding.ListChangeRegistry listChangeRegistry;
                listChangeRegistry = C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this.values;
                listChangeRegistry.notifyMoved(C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4.this, i, i2, 1);
            }
        }, asyncDifferConfig);
    }

    public void ah$a(List<T> list) {
        this.ag$a.submitList(list);
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(ObservableList.OnListChangedCallback<? extends androidx.databinding.ObservableList<T>> onListChangedCallback) {
        this.values.add(onListChangedCallback);
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback<? extends androidx.databinding.ObservableList<T>> onListChangedCallback) {
        this.values.remove(onListChangedCallback);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.ag$a.getCurrentList().get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.ag$a.getCurrentList().size();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.ag$a.getCurrentList().indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.ag$a.getCurrentList().lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public List<T> subList(int i, int i2) {
        return this.ag$a.getCurrentList().subList(i, i2);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.ag$a.getCurrentList().hashCode();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj instanceof C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4) {
            return this.ag$a.getCurrentList().equals(((C$r8$lambda$QlFe7fckaSVTLCegr9_8uxVaa4) obj).ag$a.getCurrentList());
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i) {
        return this.ag$a.getCurrentList().listIterator(i);
    }
}
