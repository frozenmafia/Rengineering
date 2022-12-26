package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import o.resetFlags;
/* loaded from: classes5.dex */
public class getRefCountForTest<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Map<K, V> HaptikSDK$b;
    private Map<K, V> HaptikSDK$c;
    private volatile getRefCountForTest<K, V>.toString ag$a;
    private final int ah$a;
    private List<getRefCountForTest<K, V>.a> toString;
    private boolean valueOf;
    private volatile getRefCountForTest$HaptikSDK$c values;

    public static <FieldDescriptorType extends resetFlags.toString<FieldDescriptorType>> getRefCountForTest<FieldDescriptorType, Object> ag$a(int i) {
        return (getRefCountForTest<FieldDescriptorType, Object>) new getRefCountForTest<FieldDescriptorType, Object>(i) { // from class: o.getRefCountForTest.4
            @Override // o.getRefCountForTest, java.util.AbstractMap, java.util.Map
            public /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((resetFlags.toString) obj, obj2);
            }

            @Override // o.getRefCountForTest
            public void HaptikSDK$c() {
                if (!HaptikSDK$a()) {
                    for (int i2 = 0; i2 < valueOf(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> values2 = values(i2);
                        if (((resetFlags.toString) values2.getKey()).HaptikSDK$c()) {
                            values2.setValue(Collections.unmodifiableList((List) values2.getValue()));
                        }
                    }
                    Iterator it = HaptikSDK$b().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((resetFlags.toString) entry.getKey()).HaptikSDK$c()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.HaptikSDK$c();
            }
        };
    }

    private getRefCountForTest(int i) {
        this.ah$a = i;
        this.toString = Collections.emptyList();
        this.HaptikSDK$c = Collections.emptyMap();
        this.HaptikSDK$b = Collections.emptyMap();
    }

    public void HaptikSDK$c() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.valueOf) {
            return;
        }
        if (this.HaptikSDK$c.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.HaptikSDK$c);
        }
        this.HaptikSDK$c = unmodifiableMap;
        if (this.HaptikSDK$b.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.HaptikSDK$b);
        }
        this.HaptikSDK$b = unmodifiableMap2;
        this.valueOf = true;
    }

    public boolean HaptikSDK$a() {
        return this.valueOf;
    }

    public int valueOf() {
        return this.toString.size();
    }

    public Map.Entry<K, V> values(int i) {
        return this.toString.get(i);
    }

    public int ah$a() {
        return this.HaptikSDK$c.size();
    }

    public Iterable<Map.Entry<K, V>> HaptikSDK$b() {
        if (this.HaptikSDK$c.isEmpty()) {
            return valueOf.ah$a();
        }
        return this.HaptikSDK$c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.toString.size() + this.HaptikSDK$c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return values((getRefCountForTest<K, V>) comparable) >= 0 || this.HaptikSDK$c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int values2 = values((getRefCountForTest<K, V>) comparable);
        if (values2 >= 0) {
            return (V) this.toString.get(values2).getValue();
        }
        return this.HaptikSDK$c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: ag$a */
    public V put(K k, V v) {
        ah$b();
        int values2 = values((getRefCountForTest<K, V>) k);
        if (values2 >= 0) {
            return (V) this.toString.get(values2).setValue(v);
        }
        invoke();
        int i = -(values2 + 1);
        if (i >= this.ah$a) {
            return HaptikSDK$d().put(k, v);
        }
        int size = this.toString.size();
        int i2 = this.ah$a;
        if (size == i2) {
            getRefCountForTest$ag$a remove = this.toString.remove(i2 - 1);
            HaptikSDK$d().put((K) remove.ag$a(), (V) remove.getValue());
        }
        this.toString.add(i, new getRefCountForTest$ag$a(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        ah$b();
        if (!this.toString.isEmpty()) {
            this.toString.clear();
        }
        if (this.HaptikSDK$c.isEmpty()) {
            return;
        }
        this.HaptikSDK$c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        ah$b();
        Comparable comparable = (Comparable) obj;
        int values2 = values((getRefCountForTest<K, V>) comparable);
        if (values2 >= 0) {
            return (V) toString(values2);
        }
        if (this.HaptikSDK$c.isEmpty()) {
            return null;
        }
        return this.HaptikSDK$c.remove(comparable);
    }

    public V toString(int i) {
        ah$b();
        V v = (V) this.toString.remove(i).getValue();
        if (!this.HaptikSDK$c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = HaptikSDK$d().entrySet().iterator();
            this.toString.add(new getRefCountForTest$ag$a(this, it.next()));
            it.remove();
        }
        return v;
    }

    private int values(K k) {
        int size = this.toString.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.toString.get(size).ag$a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.toString.get(i2).ag$a());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.values == null) {
            this.values = new getRefCountForTest$HaptikSDK$c(this);
        }
        return this.values;
    }

    public Set<Map.Entry<K, V>> ag$a() {
        if (this.ag$a == null) {
            this.ag$a = new toString();
        }
        return this.ag$a;
    }

    public void ah$b() {
        if (this.valueOf) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> HaptikSDK$d() {
        ah$b();
        if (this.HaptikSDK$c.isEmpty() && !(this.HaptikSDK$c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.HaptikSDK$c = treeMap;
            this.HaptikSDK$b = treeMap.descendingMap();
        }
        return (SortedMap) this.HaptikSDK$c;
    }

    private void invoke() {
        ah$b();
        if (!this.toString.isEmpty() || (this.toString instanceof ArrayList)) {
            return;
        }
        this.toString = new ArrayList(this.ah$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class toString extends getRefCountForTest$HaptikSDK$c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private toString() {
            super(r2);
            getRefCountForTest.this = r2;
        }

        @Override // o.getRefCountForTest$HaptikSDK$c, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new getRefCountForTest$ah$a(getRefCountForTest.this);
        }
    }

    /* loaded from: classes5.dex */
    class values implements Iterator<Map.Entry<K, V>> {
        private int toString;
        private Iterator<Map.Entry<K, V>> valueOf;
        private boolean values;

        /* JADX INFO: Access modifiers changed from: private */
        public values() {
            getRefCountForTest.this = r1;
            this.toString = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.toString + 1 >= getRefCountForTest.this.toString.size()) {
                return !getRefCountForTest.this.HaptikSDK$c.isEmpty() && ag$a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        /* renamed from: values */
        public Map.Entry<K, V> next() {
            this.values = true;
            int i = this.toString + 1;
            this.toString = i;
            if (i < getRefCountForTest.this.toString.size()) {
                return (Map.Entry) getRefCountForTest.this.toString.get(this.toString);
            }
            return ag$a().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.values) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.values = false;
            getRefCountForTest.this.ah$b();
            if (this.toString < getRefCountForTest.this.toString.size()) {
                getRefCountForTest getrefcountfortest = getRefCountForTest.this;
                int i = this.toString;
                this.toString = i - 1;
                getrefcountfortest.toString(i);
                return;
            }
            ag$a().remove();
        }

        private Iterator<Map.Entry<K, V>> ag$a() {
            if (this.valueOf == null) {
                this.valueOf = getRefCountForTest.this.HaptikSDK$c.entrySet().iterator();
            }
            return this.valueOf;
        }
    }

    /* loaded from: classes5.dex */
    public static class valueOf {
        private static final Iterator<Object> ag$a = new Iterator<Object>() { // from class: o.getRefCountForTest.valueOf.3
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> values = new Iterable<Object>() { // from class: o.getRefCountForTest.valueOf.1
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return valueOf.ag$a;
            }
        };

        static <T> Iterable<T> ah$a() {
            return (Iterable<T>) values;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRefCountForTest)) {
            return super.equals(obj);
        }
        getRefCountForTest getrefcountfortest = (getRefCountForTest) obj;
        int size = size();
        if (size != getrefcountfortest.size()) {
            return false;
        }
        int valueOf2 = valueOf();
        if (valueOf2 != getrefcountfortest.valueOf()) {
            return entrySet().equals(getrefcountfortest.entrySet());
        }
        for (int i = 0; i < valueOf2; i++) {
            if (!values(i).equals(getrefcountfortest.values(i))) {
                return false;
            }
        }
        if (valueOf2 != size) {
            return this.HaptikSDK$c.equals(getrefcountfortest.HaptikSDK$c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int valueOf2 = valueOf();
        int i = 0;
        for (int i2 = 0; i2 < valueOf2; i2++) {
            i += this.toString.get(i2).hashCode();
        }
        return ah$a() > 0 ? i + this.HaptikSDK$c.hashCode() : i;
    }
}
