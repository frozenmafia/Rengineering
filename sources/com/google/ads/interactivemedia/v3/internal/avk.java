package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes4.dex */
public abstract class avk<E> extends auv<E> implements Set<E> {
    private transient avb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        atc.f(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static avk l(Collection collection) {
        if ((collection instanceof avk) && !(collection instanceof SortedSet)) {
            avk avkVar = (avk) collection;
            if (!avkVar.f()) {
                return avkVar;
            }
        }
        Object[] array = collection.toArray();
        return j(array.length, array);
    }

    public static avk m(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return n(objArr[0]);
            }
            return j(length, (Object[]) objArr.clone());
        }
        return aws.a;
    }

    public static avk n(Object obj) {
        return new awz(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public avb d() {
        avb avbVar = this.a;
        if (avbVar == null) {
            avb i = i();
            this.a = i;
            return i;
        }
        return avbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract axd iterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof avk) && h() && ((avk) obj).h() && hashCode() != obj.hashCode()) {
            return false;
        }
        return axb.g(this, obj);
    }

    boolean h() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return axb.b(this);
    }

    avb i() {
        return avb.k(toArray());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    Object writeReplace() {
        return new avj(toArray());
    }

    private static avk j(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return n(obj);
            }
            int k = k(i);
            Object[] objArr2 = new Object[k];
            int i2 = k - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr[i5];
                axb.k(obj2, i5);
                int hashCode = obj2.hashCode();
                int E = axb.E(hashCode);
                while (true) {
                    int i6 = E & i2;
                    Object obj3 = objArr2[i6];
                    if (obj3 != null) {
                        if (obj3.equals(obj2)) {
                            break;
                        }
                        E++;
                    } else {
                        objArr[i4] = obj2;
                        objArr2[i6] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new awz(obj4);
            } else if (k(i4) < k / 2) {
                return j(i4, objArr);
            } else {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new aws(objArr, i3, objArr2, i2, i4);
            }
        }
        return aws.a;
    }
}
