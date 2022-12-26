package o;

import android.util.SparseArray;
import o.FingerprintManagerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class getCertificates<V> {
    private final SparseArray<V> ag$a;
    private final FingerprintManagerCompat.AuthenticationCallback<V> ah$a;
    private int values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void ag$a(Object obj) {
    }

    public getCertificates() {
        this(getProvider.valueOf);
    }

    public getCertificates(FingerprintManagerCompat.AuthenticationCallback<V> authenticationCallback) {
        this.ag$a = new SparseArray<>();
        this.ah$a = authenticationCallback;
        this.values = -1;
    }

    public V toString(int i) {
        if (this.values == -1) {
            this.values = 0;
        }
        while (true) {
            int i2 = this.values;
            if (i2 <= 0 || i >= this.ag$a.keyAt(i2)) {
                break;
            }
            this.values--;
        }
        while (this.values < this.ag$a.size() - 1 && i >= this.ag$a.keyAt(this.values + 1)) {
            this.values++;
        }
        return this.ag$a.valueAt(this.values);
    }

    public void values(int i, V v) {
        if (this.values == -1) {
            FingerprintManagerCompat.ah$a(this.ag$a.size() == 0);
            this.values = 0;
        }
        if (this.ag$a.size() > 0) {
            SparseArray<V> sparseArray = this.ag$a;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            FingerprintManagerCompat.toString(i >= keyAt);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.ag$a;
                this.ah$a.toString(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.ag$a.append(i, v);
    }

    public V ah$a() {
        SparseArray<V> sparseArray = this.ag$a;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public void ag$a(int i) {
        int i2 = 0;
        while (i2 < this.ag$a.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.ag$a.keyAt(i3)) {
                return;
            }
            this.ah$a.toString(this.ag$a.valueAt(i2));
            this.ag$a.removeAt(i2);
            int i4 = this.values;
            if (i4 > 0) {
                this.values = i4 - 1;
            }
            i2 = i3;
        }
    }

    public void values(int i) {
        for (int size = this.ag$a.size() - 1; size >= 0 && i < this.ag$a.keyAt(size); size--) {
            this.ah$a.toString(this.ag$a.valueAt(size));
            this.ag$a.removeAt(size);
        }
        this.values = this.ag$a.size() > 0 ? Math.min(this.values, this.ag$a.size() - 1) : -1;
    }

    public void values() {
        for (int i = 0; i < this.ag$a.size(); i++) {
            this.ah$a.toString(this.ag$a.valueAt(i));
        }
        this.values = -1;
        this.ag$a.clear();
    }

    public boolean ag$a() {
        return this.ag$a.size() == 0;
    }
}
