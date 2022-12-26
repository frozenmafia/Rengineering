package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes7.dex */
public class interpolateOutOfBoundsScroll extends AbstractList<String> implements moveIfNecessary, RandomAccess {
    private final moveIfNecessary values;

    @Override // o.moveIfNecessary
    public moveIfNecessary HaptikSDK$a() {
        return this;
    }

    public interpolateOutOfBoundsScroll(moveIfNecessary moveifnecessary) {
        this.values = moveifnecessary;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public String get(int i) {
        return (String) this.values.get(i);
    }

    @Override // o.moveIfNecessary
    public Object ah$a(int i) {
        return this.values.ah$a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.values.size();
    }

    @Override // o.moveIfNecessary
    public void valueOf(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) { // from class: o.interpolateOutOfBoundsScroll.1
            final /* synthetic */ int toString;
            ListIterator<String> values;

            {
                this.toString = i;
                this.values = interpolateOutOfBoundsScroll.this.values.listIterator(i);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.values.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            /* renamed from: values */
            public String next() {
                return this.values.next();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.values.hasPrevious();
            }

            @Override // java.util.ListIterator
            /* renamed from: ag$a */
            public String previous() {
                return this.values.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.values.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.values.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            /* renamed from: ag$a */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            /* renamed from: ah$a */
            public void add(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new Iterator<String>() { // from class: o.interpolateOutOfBoundsScroll.4
            Iterator<String> ag$a;

            {
                this.ag$a = interpolateOutOfBoundsScroll.this.values.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.ag$a.hasNext();
            }

            @Override // java.util.Iterator
            /* renamed from: ah$a */
            public String next() {
                return this.ag$a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // o.moveIfNecessary
    public List<?> values() {
        return this.values.values();
    }
}
