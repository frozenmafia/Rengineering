package com.google.common.collect;

import com.google.common.collect.AbstractMapBasedMultimap$HaptikSDK$a;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class AbstractMapBasedMultimap$HaptikSDK$c extends AbstractMapBasedMultimap$HaptikSDK$a implements List {
    final /* synthetic */ AbstractMapBasedMultimap HaptikSDK$c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.a;)V */
    public AbstractMapBasedMultimap$HaptikSDK$c(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, AbstractMapBasedMultimap$HaptikSDK$a abstractMapBasedMultimap$HaptikSDK$a) {
        super(abstractMapBasedMultimap, obj, list, abstractMapBasedMultimap$HaptikSDK$a);
        this.HaptikSDK$c = abstractMapBasedMultimap;
    }

    List<V> invoke() {
        return (List) values();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = invoke().addAll(i, collection);
        if (addAll) {
            AbstractMapBasedMultimap.access$212(this.HaptikSDK$c, values().size() - size);
            if (size == 0) {
                ah$a();
            }
        }
        return addAll;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // java.util.List
    public V get(int i) {
        ah$b();
        return invoke().get(i);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // java.util.List
    public V set(int i, V v) {
        ah$b();
        return invoke().set(i, v);
    }

    @Override // java.util.List
    public void add(int i, V v) {
        ah$b();
        boolean isEmpty = values().isEmpty();
        invoke().add(i, v);
        AbstractMapBasedMultimap.access$208(this.HaptikSDK$c);
        if (isEmpty) {
            ah$a();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // java.util.List
    public V remove(int i) {
        ah$b();
        ?? remove = invoke().remove(i);
        AbstractMapBasedMultimap.access$210(this.HaptikSDK$c);
        HaptikSDK$c();
        return remove;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        ah$b();
        return invoke().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ah$b();
        return invoke().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<V> listIterator() {
        ah$b();
        return new toString();
    }

    @Override // java.util.List
    public ListIterator<V> listIterator(int i) {
        ah$b();
        return new toString(i);
    }

    @Override // java.util.List
    public List<V> subList(int i, int i2) {
        ah$b();
        return this.HaptikSDK$c.wrapList(ag$a(), invoke().subList(i, i2), valueOf() == null ? this : valueOf());
    }

    /* loaded from: classes5.dex */
    class toString extends AbstractMapBasedMultimap$HaptikSDK$a.valueOf implements ListIterator {
        toString() {
            super();
        }

        public toString(int i) {
            super(AbstractMapBasedMultimap$HaptikSDK$c.this.invoke().listIterator(i));
        }

        private ListIterator<V> values() {
            return (ListIterator) valueOf();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return values().hasPrevious();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
        @Override // java.util.ListIterator
        public V previous() {
            return values().previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return values().nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return values().previousIndex();
        }

        @Override // java.util.ListIterator
        public void set(V v) {
            values().set(v);
        }

        @Override // java.util.ListIterator
        public void add(V v) {
            boolean isEmpty = AbstractMapBasedMultimap$HaptikSDK$c.this.isEmpty();
            values().add(v);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap$HaptikSDK$c.this.HaptikSDK$c);
            if (isEmpty) {
                AbstractMapBasedMultimap$HaptikSDK$c.this.ah$a();
            }
        }
    }
}
