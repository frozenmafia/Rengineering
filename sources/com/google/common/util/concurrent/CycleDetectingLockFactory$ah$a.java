package com.google.common.util.concurrent;

import com.google.common.collect.Maps;
import com.google.common.util.concurrent.CycleDetectingLockFactory;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class CycleDetectingLockFactory$ah$a {
    final Map<CycleDetectingLockFactory$ah$a, CycleDetectingLockFactory.ExampleStackTrace> ah$a;
    final Map<CycleDetectingLockFactory$ah$a, CycleDetectingLockFactory.PotentialDeadlockException> valueOf;
    final String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ah$a() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(CycleDetectingLockFactory.valueOf valueof, List<CycleDetectingLockFactory$ah$a> list) {
        for (CycleDetectingLockFactory$ah$a cycleDetectingLockFactory$ah$a : list) {
            ag$a(valueof, cycleDetectingLockFactory$ah$a);
        }
    }

    void ag$a(CycleDetectingLockFactory.valueOf valueof, CycleDetectingLockFactory$ah$a cycleDetectingLockFactory$ah$a) {
        Set<CycleDetectingLockFactory$ah$a> newSetFromMap;
        markViewHoldersUpdated.ah$a(this != cycleDetectingLockFactory$ah$a, "Attempted to acquire multiple locks with the same rank %s", cycleDetectingLockFactory$ah$a.ah$a());
        if (this.ah$a.containsKey(cycleDetectingLockFactory$ah$a)) {
            return;
        }
        CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException = this.valueOf.get(cycleDetectingLockFactory$ah$a);
        if (potentialDeadlockException == null) {
            newSetFromMap = Collections.newSetFromMap(Maps.ag$a());
            CycleDetectingLockFactory.ExampleStackTrace values = cycleDetectingLockFactory$ah$a.values(this, newSetFromMap);
            if (values == null) {
                this.ah$a.put(cycleDetectingLockFactory$ah$a, new CycleDetectingLockFactory.ExampleStackTrace(cycleDetectingLockFactory$ah$a, this));
                return;
            }
            CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException2 = new CycleDetectingLockFactory.PotentialDeadlockException(cycleDetectingLockFactory$ah$a, this, values);
            this.valueOf.put(cycleDetectingLockFactory$ah$a, potentialDeadlockException2);
            valueof.handlePotentialDeadlock(potentialDeadlockException2);
            return;
        }
        valueof.handlePotentialDeadlock(new CycleDetectingLockFactory.PotentialDeadlockException(cycleDetectingLockFactory$ah$a, this, potentialDeadlockException.getConflictingStackTrace()));
    }

    private CycleDetectingLockFactory.ExampleStackTrace values(CycleDetectingLockFactory$ah$a cycleDetectingLockFactory$ah$a, Set<CycleDetectingLockFactory$ah$a> set) {
        if (set.add(this)) {
            CycleDetectingLockFactory.ExampleStackTrace exampleStackTrace = this.ah$a.get(cycleDetectingLockFactory$ah$a);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (Map.Entry<CycleDetectingLockFactory$ah$a, CycleDetectingLockFactory.ExampleStackTrace> entry : this.ah$a.entrySet()) {
                CycleDetectingLockFactory$ah$a key = entry.getKey();
                CycleDetectingLockFactory.ExampleStackTrace values = key.values(cycleDetectingLockFactory$ah$a, set);
                if (values != null) {
                    CycleDetectingLockFactory.ExampleStackTrace exampleStackTrace2 = new CycleDetectingLockFactory.ExampleStackTrace(key, this);
                    exampleStackTrace2.setStackTrace(entry.getValue().getStackTrace());
                    exampleStackTrace2.initCause(values);
                    return exampleStackTrace2;
                }
            }
            return null;
        }
        return null;
    }
}
