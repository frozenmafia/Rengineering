package o;

import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import o.AutoClosingRoomOpenHelper;
/* loaded from: classes5.dex */
public class isDisappearing extends calculateCachedEnd<String> implements addToPostLayout, RandomAccess {
    public static final addToPostLayout ag$a;
    private static final isDisappearing values;
    private final List<Object> valueOf;

    @Override // o.calculateCachedEnd, o.ViewInfoStore$HaptikSDK$b
    public /* bridge */ /* synthetic */ boolean ag$a() {
        return super.ag$a();
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    static {
        isDisappearing isdisappearing = new isDisappearing();
        values = isdisappearing;
        isdisappearing.valueOf();
        ag$a = isdisappearing;
    }

    public isDisappearing() {
        this(10);
    }

    public isDisappearing(int i) {
        this(new ArrayList(i));
    }

    private isDisappearing(ArrayList<Object> arrayList) {
        this.valueOf = arrayList;
    }

    @Override // o.ViewInfoStore$HaptikSDK$b
    /* renamed from: values */
    public isDisappearing valueOf(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.valueOf);
        return new isDisappearing(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: ag$a */
    public String get(int i) {
        Object obj = this.valueOf.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.valueOf.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String ah$a = ViewInfoStore.ah$a(bArr);
        if (ViewInfoStore.toString(bArr)) {
            this.valueOf.set(i, ah$a);
        }
        return ah$a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.valueOf.size();
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: toString */
    public String set(int i, String str) {
        values();
        return toString(this.valueOf.set(i, str));
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: ag$a */
    public void add(int i, String str) {
        values();
        this.valueOf.add(i, str);
        this.modCount++;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        values();
        if (collection instanceof addToPostLayout) {
            collection = ((addToPostLayout) collection).ah$a();
        }
        boolean addAll = this.valueOf.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.List
    /* renamed from: ah$a */
    public String remove(int i) {
        values();
        Object remove = this.valueOf.remove(i);
        this.modCount++;
        return toString(remove);
    }

    @Override // o.calculateCachedEnd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        values();
        this.valueOf.clear();
        this.modCount++;
    }

    @Override // o.addToPostLayout
    public void toString(ByteString byteString) {
        values();
        this.valueOf.add(byteString);
        this.modCount++;
    }

    @Override // o.addToPostLayout
    public Object toString(int i) {
        return this.valueOf.get(i);
    }

    private static String toString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return ViewInfoStore.ah$a((byte[]) obj);
    }

    @Override // o.addToPostLayout
    public List<?> ah$a() {
        return Collections.unmodifiableList(this.valueOf);
    }

    @Override // o.addToPostLayout
    public addToPostLayout invoke() {
        return ag$a() ? new AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase(this) : this;
    }
}
