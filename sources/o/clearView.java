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
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class clearView<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Map<K, V> HaptikSDK$a;
    private Map<K, V> HaptikSDK$c;
    private boolean ag$a;
    private final int ah$a;
    private List<clearView<K, V>.a> toString;
    /* JADX WARN: Incorrect inner types in field signature: Lo/clearView<TK;TV;>.a; */
    private volatile clearView$ah$a valueOf;
    /* JADX WARN: Incorrect inner types in field signature: Lo/clearView<TK;TV;>.b; */
    private volatile clearView$HaptikSDK$b values;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return valueOf((clearView<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends getSelectedDxDy$ah$a<FieldDescriptorType>> clearView<FieldDescriptorType, Object> valueOf(int i) {
        return (clearView<FieldDescriptorType, Object>) new clearView<FieldDescriptorType, Object>(i) { // from class: o.clearView.5
            @Override // o.clearView
            public void invoke() {
                if (!HaptikSDK$a()) {
                    for (int i2 = 0; i2 < ag$a(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> ag$a = ag$a(i2);
                        if (((getSelectedDxDy$ah$a) ag$a.getKey()).HaptikSDK$b()) {
                            ag$a.setValue(Collections.unmodifiableList((List) ag$a.getValue()));
                        }
                    }
                    Iterator it = HaptikSDK$b().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((getSelectedDxDy$ah$a) entry.getKey()).HaptikSDK$b()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.invoke();
            }
        };
    }

    private clearView(int i) {
        this.ah$a = i;
        this.toString = Collections.emptyList();
        this.HaptikSDK$c = Collections.emptyMap();
        this.HaptikSDK$a = Collections.emptyMap();
    }

    public void invoke() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.ag$a) {
            return;
        }
        if (this.HaptikSDK$c.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.HaptikSDK$c);
        }
        this.HaptikSDK$c = unmodifiableMap;
        if (this.HaptikSDK$a.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.HaptikSDK$a);
        }
        this.HaptikSDK$a = unmodifiableMap2;
        this.ag$a = true;
    }

    public boolean HaptikSDK$a() {
        return this.ag$a;
    }

    public int ag$a() {
        return this.toString.size();
    }

    public Map.Entry<K, V> ag$a(int i) {
        return this.toString.get(i);
    }

    public int ah$a() {
        return this.HaptikSDK$c.size();
    }

    public Iterable<Map.Entry<K, V>> HaptikSDK$b() {
        if (this.HaptikSDK$c.isEmpty()) {
            return toString.ag$a();
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
        return values((clearView<K, V>) comparable) >= 0 || this.HaptikSDK$c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int values2 = values((clearView<K, V>) comparable);
        if (values2 >= 0) {
            return (V) this.toString.get(values2).getValue();
        }
        return this.HaptikSDK$c.get(comparable);
    }

    public V valueOf(K k, V v) {
        ah$b();
        int values2 = values((clearView<K, V>) k);
        if (values2 >= 0) {
            return (V) this.toString.get(values2).setValue(v);
        }
        HaptikSDK$c();
        int i = -(values2 + 1);
        if (i >= this.ah$a) {
            return HaptikSDK$e().put(k, v);
        }
        int size = this.toString.size();
        int i2 = this.ah$a;
        if (size == i2) {
            clearView$ag$a remove = this.toString.remove(i2 - 1);
            HaptikSDK$e().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.toString.add(i, new clearView$ag$a(this, k, v));
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
        int values2 = values((clearView<K, V>) comparable);
        if (values2 >= 0) {
            return (V) toString(values2);
        }
        if (this.HaptikSDK$c.isEmpty()) {
            return null;
        }
        return this.HaptikSDK$c.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V toString(int i) {
        ah$b();
        V v = (V) this.toString.remove(i).getValue();
        if (!this.HaptikSDK$c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = HaptikSDK$e().entrySet().iterator();
            this.toString.add(new clearView$ag$a(this, it.next()));
            it.remove();
        }
        return v;
    }

    private int values(K k) {
        int size = this.toString.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.toString.get(size).getKey());
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
            int compareTo2 = k.compareTo(this.toString.get(i2).getKey());
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
            this.values = new clearView$HaptikSDK$b(this);
        }
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> valueOf() {
        if (this.valueOf == null) {
            this.valueOf = new clearView$ah$a(this);
        }
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$b() {
        if (this.ag$a) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> HaptikSDK$e() {
        ah$b();
        if (this.HaptikSDK$c.isEmpty() && !(this.HaptikSDK$c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.HaptikSDK$c = treeMap;
            this.HaptikSDK$a = treeMap.descendingMap();
        }
        return (SortedMap) this.HaptikSDK$c;
    }

    private void HaptikSDK$c() {
        ah$b();
        if (!this.toString.isEmpty() || (this.toString instanceof ArrayList)) {
            return;
        }
        this.toString = new ArrayList(this.ah$a);
    }

    /* loaded from: classes7.dex */
    class values implements Iterator<Map.Entry<K, V>> {
        private boolean ag$a;
        private Iterator<Map.Entry<K, V>> toString;
        private int valueOf;

        private values() {
            this.valueOf = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valueOf + 1 >= clearView.this.toString.size()) {
                return !clearView.this.HaptikSDK$c.isEmpty() && values().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        /* renamed from: ah$a */
        public Map.Entry<K, V> next() {
            this.ag$a = true;
            int i = this.valueOf + 1;
            this.valueOf = i;
            if (i < clearView.this.toString.size()) {
                return (Map.Entry) clearView.this.toString.get(this.valueOf);
            }
            return values().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.ag$a) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.ag$a = false;
            clearView.this.ah$b();
            if (this.valueOf < clearView.this.toString.size()) {
                clearView clearview = clearView.this;
                int i = this.valueOf;
                this.valueOf = i - 1;
                clearview.toString(i);
                return;
            }
            values().remove();
        }

        private Iterator<Map.Entry<K, V>> values() {
            if (this.toString == null) {
                this.toString = clearView.this.HaptikSDK$c.entrySet().iterator();
            }
            return this.toString;
        }
    }

    /* loaded from: classes7.dex */
    class valueOf implements Iterator<Map.Entry<K, V>> {
        private int ag$a;
        private Iterator<Map.Entry<K, V>> ah$a;

        private valueOf() {
            this.ag$a = clearView.this.toString.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.ag$a;
            return (i > 0 && i <= clearView.this.toString.size()) || valueOf().hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: ag$a */
        public Map.Entry<K, V> next() {
            if (!valueOf().hasNext()) {
                List list = clearView.this.toString;
                int i = this.ag$a - 1;
                this.ag$a = i;
                return (Map.Entry) list.get(i);
            }
            return valueOf().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private Iterator<Map.Entry<K, V>> valueOf() {
            if (this.ah$a == null) {
                this.ah$a = clearView.this.HaptikSDK$a.entrySet().iterator();
            }
            return this.ah$a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class toString {
        private static final Iterator<Object> ah$a = new Iterator<Object>() { // from class: o.clearView.toString.5
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
        private static final Iterable<Object> ag$a = new Iterable<Object>() { // from class: o.clearView.toString.3
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return toString.ah$a;
            }
        };

        static <T> Iterable<T> ag$a() {
            return (Iterable<T>) ag$a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearView)) {
            return super.equals(obj);
        }
        clearView clearview = (clearView) obj;
        int size = size();
        if (size != clearview.size()) {
            return false;
        }
        int ag$a = ag$a();
        if (ag$a != clearview.ag$a()) {
            return entrySet().equals(clearview.entrySet());
        }
        for (int i = 0; i < ag$a; i++) {
            if (!ag$a(i).equals(clearview.ag$a(i))) {
                return false;
            }
        }
        if (ag$a != size) {
            return this.HaptikSDK$c.equals(clearview.HaptikSDK$c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int ag$a = ag$a();
        int i = 0;
        for (int i2 = 0; i2 < ag$a; i2++) {
            i += this.toString.get(i2).hashCode();
        }
        return ah$a() > 0 ? i + this.HaptikSDK$c.hashCode() : i;
    }
}
