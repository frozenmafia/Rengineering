package o;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public class updateLayoutStateToFillEnd {
    private final quickRecycleScrapView<collectAdjacentPrefetchPositions> ag$a;
    private Integer toString = null;
    private final String valueOf;

    public updateLayoutStateToFillEnd(Context context, quickRecycleScrapView<collectAdjacentPrefetchPositions> quickrecyclescrapview, String str) {
        this.ag$a = quickrecyclescrapview;
        this.valueOf = str;
    }

    public void values(List<Map<String, String>> list) throws AbtException {
        values();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        valueOf(toString(list));
    }

    public void ah$a() throws AbtException {
        values();
        toString(ag$a());
    }

    private void valueOf(List<updateAnchorFromPendingData> list) throws AbtException {
        if (list.isEmpty()) {
            ah$a();
            return;
        }
        HashSet hashSet = new HashSet();
        for (updateAnchorFromPendingData updateanchorfrompendingdata : list) {
            hashSet.add(updateanchorfrompendingdata.values());
        }
        List<collectAdjacentPrefetchPositions$ah$a> ag$a = ag$a();
        HashSet hashSet2 = new HashSet();
        for (collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a : ag$a) {
            hashSet2.add(collectadjacentprefetchpositions_ah_a.ag$a);
        }
        toString((Collection<collectAdjacentPrefetchPositions$ah$a>) ag$a(ag$a, hashSet));
        ag$a(valueOf(list, hashSet2));
    }

    private ArrayList<collectAdjacentPrefetchPositions$ah$a> ag$a(List<collectAdjacentPrefetchPositions$ah$a> list, Set<String> set) {
        ArrayList<collectAdjacentPrefetchPositions$ah$a> arrayList = new ArrayList<>();
        for (collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a : list) {
            if (!set.contains(collectadjacentprefetchpositions_ah_a.ag$a)) {
                arrayList.add(collectadjacentprefetchpositions_ah_a);
            }
        }
        return arrayList;
    }

    private ArrayList<updateAnchorFromPendingData> valueOf(List<updateAnchorFromPendingData> list, Set<String> set) {
        ArrayList<updateAnchorFromPendingData> arrayList = new ArrayList<>();
        for (updateAnchorFromPendingData updateanchorfrompendingdata : list) {
            if (!set.contains(updateanchorfrompendingdata.values())) {
                arrayList.add(updateanchorfrompendingdata);
            }
        }
        return arrayList;
    }

    private void ag$a(List<updateAnchorFromPendingData> list) {
        ArrayDeque arrayDeque = new ArrayDeque(ag$a());
        int valueOf = valueOf();
        for (updateAnchorFromPendingData updateanchorfrompendingdata : list) {
            while (arrayDeque.size() >= valueOf) {
                valueOf(((collectAdjacentPrefetchPositions$ah$a) arrayDeque.pollFirst()).ag$a);
            }
            collectAdjacentPrefetchPositions$ah$a values = updateanchorfrompendingdata.values(this.valueOf);
            toString(values);
            arrayDeque.offer(values);
        }
    }

    private void toString(Collection<collectAdjacentPrefetchPositions$ah$a> collection) {
        for (collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a : collection) {
            valueOf(collectadjacentprefetchpositions_ah_a.ag$a);
        }
    }

    private static List<updateAnchorFromPendingData> toString(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(updateAnchorFromPendingData.values(map));
        }
        return arrayList;
    }

    private void toString(collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a) {
        this.ag$a.ag$a().ag$a(collectadjacentprefetchpositions_ah_a);
    }

    private void values() throws AbtException {
        if (this.ag$a.ag$a() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private void valueOf(String str) {
        this.ag$a.ag$a().toString(str, null, null);
    }

    private int valueOf() {
        if (this.toString == null) {
            this.toString = Integer.valueOf(this.ag$a.ag$a().ah$a(this.valueOf));
        }
        return this.toString.intValue();
    }

    private List<collectAdjacentPrefetchPositions$ah$a> ag$a() {
        return this.ag$a.ag$a().toString(this.valueOf, "");
    }
}
