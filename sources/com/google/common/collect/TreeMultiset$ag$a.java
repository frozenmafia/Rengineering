package com.google.common.collect;

import java.util.Comparator;
import o.AsyncListUtil;
import o.hasUpdates;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class TreeMultiset$ag$a<E> {
    private TreeMultiset$ag$a<E> HaptikSDK$a;
    private long HaptikSDK$c;
    private int ag$a;
    private int ah$a;
    private TreeMultiset$ag$a<E> ah$b;
    private TreeMultiset$ag$a<E> invoke;
    private int toString;
    private TreeMultiset$ag$a<E> valueOf;
    private final E values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TreeMultiset$ag$a(E e, int i) {
        markViewHoldersUpdated.values(i > 0);
        this.values = e;
        this.ah$a = i;
        this.HaptikSDK$c = i;
        this.toString = 1;
        this.ag$a = 1;
        this.valueOf = null;
        this.HaptikSDK$a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TreeMultiset$ag$a() {
        this.values = null;
        this.ah$a = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TreeMultiset$ag$a<E> HaptikSDK$a() {
        TreeMultiset$ag$a<E> treeMultiset$ag$a = this.ah$b;
        treeMultiset$ag$a.getClass();
        return treeMultiset$ag$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TreeMultiset$ag$a<E> getSignupData() {
        TreeMultiset$ag$a<E> treeMultiset$ag$a = this.invoke;
        treeMultiset$ag$a.getClass();
        return treeMultiset$ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public int ah$a(Comparator<? super E> comparator, E e) {
        int compare = comparator.compare(e, ag$a());
        if (compare < 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
            if (treeMultiset$ag$a == null) {
                return 0;
            }
            return treeMultiset$ag$a.ah$a((Comparator<? super Comparator<? super E>>) comparator, (Comparator<? super E>) e);
        } else if (compare > 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.HaptikSDK$a;
            if (treeMultiset$ag$a2 == null) {
                return 0;
            }
            return treeMultiset$ag$a2.ah$a((Comparator<? super Comparator<? super E>>) comparator, (Comparator<? super E>) e);
        } else {
            return this.ah$a;
        }
    }

    private TreeMultiset$ag$a<E> ag$a(E e, int i) {
        TreeMultiset$ag$a<E> treeMultiset$ag$a = new TreeMultiset$ag$a<>(e, i);
        this.HaptikSDK$a = treeMultiset$ag$a;
        TreeMultiset.access$1800(this, treeMultiset$ag$a, getSignupData());
        this.ag$a = Math.max(2, this.ag$a);
        this.toString++;
        this.HaptikSDK$c += i;
        return this;
    }

    private TreeMultiset$ag$a<E> toString(E e, int i) {
        this.valueOf = new TreeMultiset$ag$a<>(e, i);
        TreeMultiset.access$1800(HaptikSDK$a(), this.valueOf, this);
        this.ag$a = Math.max(2, this.ag$a);
        this.toString++;
        this.HaptikSDK$c += i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public TreeMultiset$ag$a<E> toString(Comparator<? super E> comparator, E e, int i, int[] iArr) {
        int compare = comparator.compare(e, ag$a());
        if (compare < 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
            if (treeMultiset$ag$a == null) {
                iArr[0] = 0;
                return toString((TreeMultiset$ag$a<E>) e, i);
            }
            int i2 = treeMultiset$ag$a.ag$a;
            TreeMultiset$ag$a<E> treeMultiset$ag$a2 = treeMultiset$ag$a.toString(comparator, e, i, iArr);
            this.valueOf = treeMultiset$ag$a2;
            if (iArr[0] == 0) {
                this.toString++;
            }
            this.HaptikSDK$c += i;
            return treeMultiset$ag$a2.ag$a == i2 ? this : invoke();
        } else if (compare > 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a3 = this.HaptikSDK$a;
            if (treeMultiset$ag$a3 == null) {
                iArr[0] = 0;
                return ag$a((TreeMultiset$ag$a<E>) e, i);
            }
            int i3 = treeMultiset$ag$a3.ag$a;
            TreeMultiset$ag$a<E> treeMultiset$ag$a4 = treeMultiset$ag$a3.toString(comparator, e, i, iArr);
            this.HaptikSDK$a = treeMultiset$ag$a4;
            if (iArr[0] == 0) {
                this.toString++;
            }
            this.HaptikSDK$c += i;
            return treeMultiset$ag$a4.ag$a == i3 ? this : invoke();
        } else {
            int i4 = this.ah$a;
            iArr[0] = i4;
            long j = i;
            markViewHoldersUpdated.values(((long) i4) + j <= 2147483647L);
            this.ah$a += i;
            this.HaptikSDK$c += j;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public TreeMultiset$ag$a<E> ag$a(Comparator<? super E> comparator, E e, int i, int[] iArr) {
        int compare = comparator.compare(e, ag$a());
        if (compare < 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
            if (treeMultiset$ag$a == null) {
                iArr[0] = 0;
                return this;
            }
            this.valueOf = treeMultiset$ag$a.ag$a(comparator, e, i, iArr);
            if (iArr[0] > 0) {
                if (i >= iArr[0]) {
                    this.toString--;
                    this.HaptikSDK$c -= iArr[0];
                } else {
                    this.HaptikSDK$c -= i;
                }
            }
            return iArr[0] == 0 ? this : invoke();
        } else if (compare > 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.HaptikSDK$a;
            if (treeMultiset$ag$a2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.HaptikSDK$a = treeMultiset$ag$a2.ag$a(comparator, e, i, iArr);
            if (iArr[0] > 0) {
                if (i >= iArr[0]) {
                    this.toString--;
                    this.HaptikSDK$c -= iArr[0];
                } else {
                    this.HaptikSDK$c -= i;
                }
            }
            return invoke();
        } else {
            int i2 = this.ah$a;
            iArr[0] = i2;
            if (i >= i2) {
                return ah$a();
            }
            this.ah$a = i2 - i;
            this.HaptikSDK$c -= i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public TreeMultiset$ag$a<E> valueOf(Comparator<? super E> comparator, E e, int i, int[] iArr) {
        int i2;
        int compare = comparator.compare(e, ag$a());
        if (compare < 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
            if (treeMultiset$ag$a == null) {
                iArr[0] = 0;
                return i > 0 ? toString((TreeMultiset$ag$a<E>) e, i) : this;
            }
            this.valueOf = treeMultiset$ag$a.valueOf(comparator, e, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.toString--;
            } else if (i > 0 && iArr[0] == 0) {
                this.toString++;
            }
            this.HaptikSDK$c += i - iArr[0];
            return invoke();
        } else if (compare > 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.HaptikSDK$a;
            if (treeMultiset$ag$a2 == null) {
                iArr[0] = 0;
                return i > 0 ? ag$a((TreeMultiset$ag$a<E>) e, i) : this;
            }
            this.HaptikSDK$a = treeMultiset$ag$a2.valueOf(comparator, e, i, iArr);
            if (i == 0 && iArr[0] != 0) {
                this.toString--;
            } else if (i > 0 && iArr[0] == 0) {
                this.toString++;
            }
            this.HaptikSDK$c += i - iArr[0];
            return invoke();
        } else {
            iArr[0] = this.ah$a;
            if (i == 0) {
                return ah$a();
            }
            this.HaptikSDK$c += i - i2;
            this.ah$a = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public TreeMultiset$ag$a<E> values(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
        int compare = comparator.compare(e, ag$a());
        if (compare < 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
            if (treeMultiset$ag$a == null) {
                iArr[0] = 0;
                return (i != 0 || i2 <= 0) ? this : toString((TreeMultiset$ag$a<E>) e, i2);
            }
            this.valueOf = treeMultiset$ag$a.values(comparator, e, i, i2, iArr);
            if (iArr[0] == i) {
                if (i2 == 0 && iArr[0] != 0) {
                    this.toString--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.toString++;
                }
                this.HaptikSDK$c += i2 - iArr[0];
            }
            return invoke();
        } else if (compare > 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.HaptikSDK$a;
            if (treeMultiset$ag$a2 == null) {
                iArr[0] = 0;
                return (i != 0 || i2 <= 0) ? this : ag$a((TreeMultiset$ag$a<E>) e, i2);
            }
            this.HaptikSDK$a = treeMultiset$ag$a2.values(comparator, e, i, i2, iArr);
            if (iArr[0] == i) {
                if (i2 == 0 && iArr[0] != 0) {
                    this.toString--;
                } else if (i2 > 0 && iArr[0] == 0) {
                    this.toString++;
                }
                this.HaptikSDK$c += i2 - iArr[0];
            }
            return invoke();
        } else {
            int i3 = this.ah$a;
            iArr[0] = i3;
            if (i == i3) {
                if (i2 == 0) {
                    return ah$a();
                }
                this.HaptikSDK$c += i2 - i3;
                this.ah$a = i2;
            }
            return this;
        }
    }

    private TreeMultiset$ag$a<E> ah$a() {
        int i = this.ah$a;
        this.ah$a = 0;
        TreeMultiset.access$1900(HaptikSDK$a(), getSignupData());
        TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
        if (treeMultiset$ag$a == null) {
            return this.HaptikSDK$a;
        }
        TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.HaptikSDK$a;
        if (treeMultiset$ag$a2 == null) {
            return treeMultiset$ag$a;
        }
        if (treeMultiset$ag$a.ag$a >= treeMultiset$ag$a2.ag$a) {
            TreeMultiset$ag$a<E> HaptikSDK$a = HaptikSDK$a();
            HaptikSDK$a.valueOf = this.valueOf.invoke(HaptikSDK$a);
            HaptikSDK$a.HaptikSDK$a = this.HaptikSDK$a;
            HaptikSDK$a.toString = this.toString - 1;
            HaptikSDK$a.HaptikSDK$c = this.HaptikSDK$c - i;
            return HaptikSDK$a.invoke();
        }
        TreeMultiset$ag$a<E> signupData = getSignupData();
        signupData.HaptikSDK$a = this.HaptikSDK$a.ah$b(signupData);
        signupData.valueOf = this.valueOf;
        signupData.toString = this.toString - 1;
        signupData.HaptikSDK$c = this.HaptikSDK$c - i;
        return signupData.invoke();
    }

    private TreeMultiset$ag$a<E> ah$b(TreeMultiset$ag$a<E> treeMultiset$ag$a) {
        TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.valueOf;
        if (treeMultiset$ag$a2 == null) {
            return this.HaptikSDK$a;
        }
        this.valueOf = treeMultiset$ag$a2.ah$b(treeMultiset$ag$a);
        this.toString--;
        this.HaptikSDK$c -= treeMultiset$ag$a.ah$a;
        return invoke();
    }

    private TreeMultiset$ag$a<E> invoke(TreeMultiset$ag$a<E> treeMultiset$ag$a) {
        TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.HaptikSDK$a;
        if (treeMultiset$ag$a2 == null) {
            return this.valueOf;
        }
        this.HaptikSDK$a = treeMultiset$ag$a2.invoke(treeMultiset$ag$a);
        this.toString--;
        this.HaptikSDK$c -= treeMultiset$ag$a.ah$a;
        return invoke();
    }

    private void HaptikSDK$b() {
        this.toString = TreeMultiset.distinctElements(this.valueOf) + 1 + TreeMultiset.distinctElements(this.HaptikSDK$a);
        this.HaptikSDK$c = this.ah$a + HaptikSDK$e(this.valueOf) + HaptikSDK$e(this.HaptikSDK$a);
    }

    private void ah$b() {
        this.ag$a = Math.max(HaptikSDK$c(this.valueOf), HaptikSDK$c(this.HaptikSDK$a)) + 1;
    }

    private void HaptikSDK$c() {
        HaptikSDK$b();
        ah$b();
    }

    private TreeMultiset$ag$a<E> invoke() {
        int values = values();
        if (values == -2) {
            this.HaptikSDK$a.getClass();
            if (this.HaptikSDK$a.values() > 0) {
                this.HaptikSDK$a = this.HaptikSDK$a.HaptikWebView();
            }
            return HaptikSDK$e();
        } else if (values == 2) {
            this.valueOf.getClass();
            if (this.valueOf.values() < 0) {
                this.valueOf = this.valueOf.HaptikSDK$e();
            }
            return HaptikWebView();
        } else {
            ah$b();
            return this;
        }
    }

    private int values() {
        return HaptikSDK$c(this.valueOf) - HaptikSDK$c(this.HaptikSDK$a);
    }

    private TreeMultiset$ag$a<E> HaptikSDK$e() {
        markViewHoldersUpdated.ag$a(this.HaptikSDK$a != null);
        TreeMultiset$ag$a<E> treeMultiset$ag$a = this.HaptikSDK$a;
        this.HaptikSDK$a = treeMultiset$ag$a.valueOf;
        treeMultiset$ag$a.valueOf = this;
        treeMultiset$ag$a.HaptikSDK$c = this.HaptikSDK$c;
        treeMultiset$ag$a.toString = this.toString;
        HaptikSDK$c();
        treeMultiset$ag$a.ah$b();
        return treeMultiset$ag$a;
    }

    private TreeMultiset$ag$a<E> HaptikWebView() {
        markViewHoldersUpdated.ag$a(this.valueOf != null);
        TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
        this.valueOf = treeMultiset$ag$a.HaptikSDK$a;
        treeMultiset$ag$a.HaptikSDK$a = this;
        treeMultiset$ag$a.HaptikSDK$c = this.HaptikSDK$c;
        treeMultiset$ag$a.toString = this.toString;
        HaptikSDK$c();
        treeMultiset$ag$a.ah$b();
        return treeMultiset$ag$a;
    }

    private static long HaptikSDK$e(TreeMultiset$ag$a<?> treeMultiset$ag$a) {
        if (treeMultiset$ag$a == null) {
            return 0L;
        }
        return ((TreeMultiset$ag$a) treeMultiset$ag$a).HaptikSDK$c;
    }

    private static int HaptikSDK$c(TreeMultiset$ag$a<?> treeMultiset$ag$a) {
        if (treeMultiset$ag$a == null) {
            return 0;
        }
        return ((TreeMultiset$ag$a) treeMultiset$ag$a).ag$a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public TreeMultiset$ag$a<E> ag$a(Comparator<? super E> comparator, E e) {
        int compare = comparator.compare(e, ag$a());
        if (compare < 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a = this.valueOf;
            return treeMultiset$ag$a == null ? this : (TreeMultiset$ag$a) hasUpdates.values(treeMultiset$ag$a.ag$a((Comparator<? super Comparator<? super E>>) comparator, (Comparator<? super E>) e), this);
        } else if (compare == 0) {
            return this;
        } else {
            TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.HaptikSDK$a;
            if (treeMultiset$ag$a2 == null) {
                return null;
            }
            return treeMultiset$ag$a2.ag$a((Comparator<? super Comparator<? super E>>) comparator, (Comparator<? super E>) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public TreeMultiset$ag$a<E> values(Comparator<? super E> comparator, E e) {
        int compare = comparator.compare(e, ag$a());
        if (compare > 0) {
            TreeMultiset$ag$a<E> treeMultiset$ag$a = this.HaptikSDK$a;
            return treeMultiset$ag$a == null ? this : (TreeMultiset$ag$a) hasUpdates.values(treeMultiset$ag$a.values((Comparator<? super Comparator<? super E>>) comparator, (Comparator<? super E>) e), this);
        } else if (compare == 0) {
            return this;
        } else {
            TreeMultiset$ag$a<E> treeMultiset$ag$a2 = this.valueOf;
            if (treeMultiset$ag$a2 == null) {
                return null;
            }
            return treeMultiset$ag$a2.values((Comparator<? super Comparator<? super E>>) comparator, (Comparator<? super E>) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public E ag$a() {
        return (E) AsyncListUtil.ViewCallback.ag$a(this.values);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int valueOf() {
        return this.ah$a;
    }

    public String toString() {
        return Multisets.values(ag$a(), valueOf()).toString();
    }
}
