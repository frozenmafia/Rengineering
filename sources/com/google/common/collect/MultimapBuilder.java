package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import o.getChangePayload;
import o.getItemRangeInto;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingLaidOutOrNewView;
import o.recycleTile;
/* loaded from: classes5.dex */
public abstract class MultimapBuilder<K0, V0> {
    private MultimapBuilder() {
    }

    public static valueOf<Object> values(final int i) {
        getChangePayload.values(i, "expectedKeys");
        return new valueOf<Object>() { // from class: com.google.common.collect.MultimapBuilder.2
            @Override // com.google.common.collect.MultimapBuilder.valueOf
            <K, V> Map<K, Collection<V>> valueOf() {
                return getItemRangeInto.values(i);
            }
        };
    }

    public static <K0> valueOf<K0> ah$a(final Comparator<K0> comparator) {
        markViewHoldersUpdated.toString(comparator);
        return new valueOf<K0>() { // from class: com.google.common.collect.MultimapBuilder.4
            @Override // com.google.common.collect.MultimapBuilder.valueOf
            <K extends K0, V> Map<K, Collection<V>> valueOf() {
                return new TreeMap(comparator);
            }
        };
    }

    /* loaded from: classes5.dex */
    static final class ArrayListSupplier<V> implements offsetPositionsForRemovingLaidOutOrNewView<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        ArrayListSupplier(int i) {
            this.expectedValuesPerKey = getChangePayload.values(i, "expectedValuesPerKey");
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes7.dex */
    enum LinkedListSupplier implements offsetPositionsForRemovingLaidOutOrNewView<List<?>> {
        INSTANCE;

        public static <V> offsetPositionsForRemovingLaidOutOrNewView<List<V>> instance() {
            return INSTANCE;
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* loaded from: classes7.dex */
    static final class HashSetSupplier<V> implements offsetPositionsForRemovingLaidOutOrNewView<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        HashSetSupplier(int i) {
            this.expectedValuesPerKey = getChangePayload.values(i, "expectedValuesPerKey");
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public Set<V> get() {
            return getItemRangeInto.ag$a(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes7.dex */
    static final class LinkedHashSetSupplier<V> implements offsetPositionsForRemovingLaidOutOrNewView<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        LinkedHashSetSupplier(int i) {
            this.expectedValuesPerKey = getChangePayload.values(i, "expectedValuesPerKey");
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public Set<V> get() {
            return getItemRangeInto.ah$a(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes7.dex */
    static final class TreeSetSupplier<V> implements offsetPositionsForRemovingLaidOutOrNewView<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        TreeSetSupplier(Comparator<? super V> comparator) {
            this.comparator = (Comparator) markViewHoldersUpdated.toString(comparator);
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    /* loaded from: classes7.dex */
    static final class EnumSetSupplier<V extends Enum<V>> implements offsetPositionsForRemovingLaidOutOrNewView<Set<V>>, Serializable {
        private final Class<V> clazz;

        EnumSetSupplier(Class<V> cls) {
            this.clazz = (Class) markViewHoldersUpdated.toString(cls);
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class valueOf<K0> {
        abstract <K extends K0, V> Map<K, Collection<V>> valueOf();

        valueOf() {
        }

        public MultimapBuilder$ag$a<K0, Object> values() {
            return valueOf(2);
        }

        public MultimapBuilder$ag$a<K0, Object> valueOf(final int i) {
            getChangePayload.values(i, "expectedValuesPerKey");
            return new MultimapBuilder$ag$a<K0, Object>() { // from class: com.google.common.collect.MultimapBuilder.valueOf.3
                @Override // com.google.common.collect.MultimapBuilder$ag$a
                public <K extends K0, V> recycleTile<K, V> values() {
                    return Multimaps.toString(valueOf.this.valueOf(), new ArrayListSupplier(i));
                }
            };
        }
    }
}
