package com.facebook.imagepipeline.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o.Fragment;
/* loaded from: classes4.dex */
public class CountingLruMap<K, V> {
    private final LinkedHashMap<K, V> mMap = new LinkedHashMap<>();
    private int mSizeInBytes = 0;
    private final ValueDescriptor<V> mValueDescriptor;

    public CountingLruMap(ValueDescriptor<V> valueDescriptor) {
        this.mValueDescriptor = valueDescriptor;
    }

    ArrayList<K> getKeys() {
        ArrayList<K> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>(this.mMap.keySet());
        }
        return arrayList;
    }

    ArrayList<V> getValues() {
        ArrayList<V> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>((Collection<? extends V>) this.mMap.values());
        }
        return arrayList;
    }

    public int getCount() {
        int size;
        synchronized (this) {
            size = this.mMap.size();
        }
        return size;
    }

    public int getSizeInBytes() {
        int i;
        synchronized (this) {
            i = this.mSizeInBytes;
        }
        return i;
    }

    public K getFirstKey() {
        K next;
        synchronized (this) {
            next = this.mMap.isEmpty() ? null : this.mMap.keySet().iterator().next();
        }
        return next;
    }

    public ArrayList<Map.Entry<K, V>> getMatchingEntries(Fragment.InstantiationException<K> instantiationException) {
        ArrayList<Map.Entry<K, V>> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>(this.mMap.entrySet().size());
            for (Map.Entry<K, V> entry : this.mMap.entrySet()) {
                if (instantiationException == null || instantiationException.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        }
        return arrayList;
    }

    public boolean contains(K k) {
        boolean containsKey;
        synchronized (this) {
            containsKey = this.mMap.containsKey(k);
        }
        return containsKey;
    }

    public V get(K k) {
        V v;
        synchronized (this) {
            v = this.mMap.get(k);
        }
        return v;
    }

    public V put(K k, V v) {
        V remove;
        synchronized (this) {
            remove = this.mMap.remove(k);
            this.mSizeInBytes -= getValueSizeInBytes(remove);
            this.mMap.put(k, v);
            this.mSizeInBytes += getValueSizeInBytes(v);
        }
        return remove;
    }

    public V remove(K k) {
        V remove;
        synchronized (this) {
            remove = this.mMap.remove(k);
            this.mSizeInBytes -= getValueSizeInBytes(remove);
        }
        return remove;
    }

    public ArrayList<V> removeAll(Fragment.InstantiationException<K> instantiationException) {
        ArrayList<V> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>();
            Iterator<Map.Entry<K, V>> it = this.mMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (instantiationException == null || instantiationException.apply(next.getKey())) {
                    arrayList.add(next.getValue());
                    this.mSizeInBytes -= getValueSizeInBytes(next.getValue());
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public ArrayList<V> clear() {
        ArrayList<V> arrayList;
        synchronized (this) {
            arrayList = new ArrayList<>((Collection<? extends V>) this.mMap.values());
            this.mMap.clear();
            this.mSizeInBytes = 0;
        }
        return arrayList;
    }

    public void resetSize() {
        synchronized (this) {
            if (this.mMap.isEmpty()) {
                this.mSizeInBytes = 0;
            }
        }
    }

    private int getValueSizeInBytes(V v) {
        if (v == null) {
            return 0;
        }
        return this.mValueDescriptor.getSizeInBytes(v);
    }
}
