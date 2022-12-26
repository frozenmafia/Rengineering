package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes7.dex */
public class stopGestureDetection extends setUsingSpansToEstimateScrollbarDimensions<String> implements moveIfNecessary, RandomAccess {
    private static final stopGestureDetection valueOf;
    public static final moveIfNecessary values;
    private final List<Object> toString;

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, o.checkSelectForSwipe$ah$b
    public /* bridge */ /* synthetic */ boolean ah$a() {
        return super.ah$a();
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    static {
        stopGestureDetection stopgesturedetection = new stopGestureDetection();
        valueOf = stopgesturedetection;
        stopgesturedetection.valueOf();
        values = stopgesturedetection;
    }

    public stopGestureDetection() {
        this(10);
    }

    public stopGestureDetection(int i) {
        this(new ArrayList(i));
    }

    private stopGestureDetection(ArrayList<Object> arrayList) {
        this.toString = arrayList;
    }

    @Override // o.checkSelectForSwipe$ah$b
    /* renamed from: valueOf */
    public stopGestureDetection toString(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.toString);
        return new stopGestureDetection(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: values */
    public String get(int i) {
        boolean ah$a;
        Object obj = this.toString.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.toString.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String values2 = checkSelectForSwipe.values(bArr);
        ah$a = Utf8.ah$a(bArr);
        if (ah$a) {
            this.toString.set(i, values2);
        }
        return values2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.toString.size();
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public String set(int i, String str) {
        ag$a();
        return ah$a(this.toString.set(i, str));
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public void add(int i, String str) {
        ag$a();
        this.toString.add(i, str);
        this.modCount++;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        ag$a();
        if (collection instanceof moveIfNecessary) {
            collection = ((moveIfNecessary) collection).values();
        }
        boolean addAll = this.toString.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.List
    /* renamed from: ag$a */
    public String remove(int i) {
        ag$a();
        Object remove = this.toString.remove(i);
        this.modCount++;
        return ah$a(remove);
    }

    @Override // o.setUsingSpansToEstimateScrollbarDimensions, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ag$a();
        this.toString.clear();
        this.modCount++;
    }

    @Override // o.moveIfNecessary
    public void valueOf(ByteString byteString) {
        ag$a();
        this.toString.add(byteString);
        this.modCount++;
    }

    @Override // o.moveIfNecessary
    public Object ah$a(int i) {
        return this.toString.get(i);
    }

    private static String ah$a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return checkSelectForSwipe.values((byte[]) obj);
    }

    @Override // o.moveIfNecessary
    public List<?> values() {
        return Collections.unmodifiableList(this.toString);
    }

    @Override // o.moveIfNecessary
    public moveIfNecessary HaptikSDK$a() {
        return ah$a() ? new interpolateOutOfBoundsScroll(this) : this;
    }
}
