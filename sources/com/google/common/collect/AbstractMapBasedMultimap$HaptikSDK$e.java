package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
/* loaded from: classes7.dex */
class AbstractMapBasedMultimap$HaptikSDK$e extends AbstractMapBasedMultimap$HaptikSDK$a implements Set {
    final /* synthetic */ AbstractMapBasedMultimap HaptikSDK$c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$HaptikSDK$e(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, Set<V> set) {
        super(abstractMapBasedMultimap, k, set, null);
        this.HaptikSDK$c = abstractMapBasedMultimap;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$HaptikSDK$a, java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean sets = Sets.toString((Set) this.valueOf, collection);
        if (sets) {
            AbstractMapBasedMultimap.access$212(this.HaptikSDK$c, this.valueOf.size() - size);
            HaptikSDK$c();
        }
        return sets;
    }
}
