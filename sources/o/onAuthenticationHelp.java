package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public final class onAuthenticationHelp<E> implements Iterable<E> {
    private final Object toString = new Object();
    private final Map<E, Integer> ag$a = new HashMap();
    private Set<E> ah$a = Collections.emptySet();
    private List<E> values = Collections.emptyList();

    public void valueOf(E e) {
        synchronized (this.toString) {
            ArrayList arrayList = new ArrayList(this.values);
            arrayList.add(e);
            this.values = Collections.unmodifiableList(arrayList);
            Integer num = this.ag$a.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.ah$a);
                hashSet.add(e);
                this.ah$a = Collections.unmodifiableSet(hashSet);
            }
            this.ag$a.put(e, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void values(E e) {
        synchronized (this.toString) {
            Integer num = this.ag$a.get(e);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.values);
            arrayList.remove(e);
            this.values = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.ag$a.remove(e);
                HashSet hashSet = new HashSet(this.ah$a);
                hashSet.remove(e);
                this.ah$a = Collections.unmodifiableSet(hashSet);
            } else {
                this.ag$a.put(e, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public Set<E> values() {
        Set<E> set;
        synchronized (this.toString) {
            set = this.ah$a;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.toString) {
            it = this.values.iterator();
        }
        return it;
    }

    public int ah$a(E e) {
        int intValue;
        synchronized (this.toString) {
            intValue = this.ag$a.containsKey(e) ? this.ag$a.get(e).intValue() : 0;
        }
        return intValue;
    }
}
