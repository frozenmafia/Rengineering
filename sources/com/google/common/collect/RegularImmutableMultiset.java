package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import o.extendRangeInto;
import o.refreshData;
import o.refreshData$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(extendRangeInto.ah$a());
    final transient extendRangeInto<E> contents;
    private transient ImmutableSet<E> elementSet;
    private final transient int size;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegularImmutableMultiset(extendRangeInto<E> extendrangeinto) {
        this.contents = extendrangeinto;
        long j = 0;
        for (int i = 0; i < extendrangeinto.valueOf(); i++) {
            j += extendrangeinto.ah$a(i);
        }
        this.size = Ints.toString(j);
    }

    @Override // o.refreshData
    public int count(Object obj) {
        return this.contents.ah$a(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, o.refreshData
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMultiset, o.refreshData
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.elementSet;
        if (immutableSet == null) {
            ElementSet elementSet = new ElementSet();
            this.elementSet = elementSet;
            return elementSet;
        }
        return immutableSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public final class ElementSet extends IndexedImmutableSet<E> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        private ElementSet() {
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        E get(int i) {
            return RegularImmutableMultiset.this.contents.valueOf(i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.contents.valueOf();
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset
    refreshData$ag$a<E> getEntry(int i) {
        return this.contents.ag$a(i);
    }

    /* loaded from: classes7.dex */
    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        SerializedForm(refreshData<? extends Object> refreshdata) {
            int size = refreshdata.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (refreshData$ag$a<? extends Object> refreshdata_ag_a : refreshdata.entrySet()) {
                this.elements[i] = refreshdata_ag_a.getElement();
                this.counts[i] = refreshdata_ag_a.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            ImmutableMultiset.values valuesVar = new ImmutableMultiset.values(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i < objArr.length) {
                    valuesVar.ah$a(objArr[i], this.counts[i]);
                    i++;
                } else {
                    return valuesVar.values();
                }
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(this);
    }
}
