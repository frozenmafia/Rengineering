package o;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.MessageThreadUtil;
/* loaded from: classes5.dex */
public final /* synthetic */ class OpReorderer implements quickRecycleScrapView {
    public static final /* synthetic */ OpReorderer values = new OpReorderer();

    private /* synthetic */ OpReorderer() {
    }

    @Override // o.quickRecycleScrapView
    public final Object ag$a() {
        return Collections.emptySet();
    }

    /* loaded from: classes5.dex */
    class Callback {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static class values {
            private final boolean ah$a;
            private final Class<?> values;

            private values(Class<?> cls, boolean z) {
                this.values = cls;
                this.ah$a = z;
            }

            public boolean equals(Object obj) {
                if (obj instanceof values) {
                    values valuesVar = (values) obj;
                    if (valuesVar.values.equals(this.values) && valuesVar.ah$a == this.ah$a) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return ((this.values.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.ah$a).hashCode();
            }
        }

        Callback() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void ag$a(List<MessageThreadUtil.SyncQueueItem<?>> list) {
            Set<OpReorderer$Callback$ag$a> valueOf = valueOf(list);
            Set<OpReorderer$Callback$ag$a> values2 = values(valueOf);
            int i = 0;
            while (!values2.isEmpty()) {
                OpReorderer$Callback$ag$a next = values2.iterator().next();
                values2.remove(next);
                i++;
                for (OpReorderer$Callback$ag$a opReorderer$Callback$ag$a : next.valueOf()) {
                    opReorderer$Callback$ag$a.valueOf(next);
                    if (opReorderer$Callback$ag$a.ah$a()) {
                        values2.add(opReorderer$Callback$ag$a);
                    }
                }
            }
            if (i == list.size()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (OpReorderer$Callback$ag$a opReorderer$Callback$ag$a2 : valueOf) {
                if (!opReorderer$Callback$ag$a2.ah$a() && !opReorderer$Callback$ag$a2.ag$a()) {
                    arrayList.add(opReorderer$Callback$ag$a2.values());
                }
            }
            throw new DependencyCycleException(arrayList);
        }

        private static Set<OpReorderer$Callback$ag$a> valueOf(List<MessageThreadUtil.SyncQueueItem<?>> list) {
            Set<OpReorderer$Callback$ag$a> set;
            HashMap hashMap = new HashMap(list.size());
            for (MessageThreadUtil.SyncQueueItem<?> syncQueueItem : list) {
                OpReorderer$Callback$ag$a opReorderer$Callback$ag$a = new OpReorderer$Callback$ag$a(syncQueueItem);
                for (Class<? super Object> cls : syncQueueItem.values()) {
                    values valuesVar = new values(cls, !syncQueueItem.HaptikSDK$a());
                    if (!hashMap.containsKey(valuesVar)) {
                        hashMap.put(valuesVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(valuesVar);
                    if (!set2.isEmpty() && !valuesVar.ah$a) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                    set2.add(opReorderer$Callback$ag$a);
                }
            }
            for (Set<OpReorderer$Callback$ag$a> set3 : hashMap.values()) {
                for (OpReorderer$Callback$ag$a opReorderer$Callback$ag$a2 : set3) {
                    for (swapMoveRemove swapmoveremove : opReorderer$Callback$ag$a2.values().ag$a()) {
                        if (swapmoveremove.values() && (set = (Set) hashMap.get(new values(swapmoveremove.valueOf(), swapmoveremove.HaptikSDK$c()))) != null) {
                            for (OpReorderer$Callback$ag$a opReorderer$Callback$ag$a3 : set) {
                                opReorderer$Callback$ag$a2.toString(opReorderer$Callback$ag$a3);
                                opReorderer$Callback$ag$a3.values(opReorderer$Callback$ag$a2);
                            }
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet();
            for (Set set4 : hashMap.values()) {
                hashSet.addAll(set4);
            }
            return hashSet;
        }

        private static Set<OpReorderer$Callback$ag$a> values(Set<OpReorderer$Callback$ag$a> set) {
            HashSet hashSet = new HashSet();
            for (OpReorderer$Callback$ag$a opReorderer$Callback$ag$a : set) {
                if (opReorderer$Callback$ag$a.ah$a()) {
                    hashSet.add(opReorderer$Callback$ag$a);
                }
            }
            return hashSet;
        }
    }
}
