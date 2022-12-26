package com.google.ads.interactivemedia.v3.internal;

import androidx.databinding.library.baseAdapters.BR;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class brt {
    private static final brt a = new brt(0, new int[0], new Object[0], false);

    /* renamed from: b  reason: collision with root package name */
    private int f961b;
    private int[] c;
    private Object[] d;
    private int e;
    private boolean f;

    private brt() {
        this(0, new int[8], new Object[8], true);
    }

    private brt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.f961b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public static brt c() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static brt d(brt brtVar, brt brtVar2) {
        int i = brtVar.f961b + brtVar2.f961b;
        int[] copyOf = Arrays.copyOf(brtVar.c, i);
        System.arraycopy(brtVar2.c, 0, copyOf, brtVar.f961b, brtVar2.f961b);
        Object[] copyOf2 = Arrays.copyOf(brtVar.d, i);
        System.arraycopy(brtVar2.d, 0, copyOf2, brtVar.f961b, brtVar2.f961b);
        return new brt(i, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static brt e() {
        return new brt(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int x;
        int i = this.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f961b; i3++) {
                int i4 = this.c[i3];
                int a2 = bsi.a(i4);
                int b2 = bsi.b(i4);
                if (b2 == 0) {
                    x = boh.x(a2, ((Long) this.d[i3]).longValue());
                } else if (b2 == 1) {
                    ((Long) this.d[i3]).longValue();
                    x = boh.aj(a2);
                } else if (b2 == 2) {
                    x = boh.b(a2, (bnz) this.d[i3]);
                } else if (b2 == 3) {
                    int u = boh.u(a2);
                    x = u + u + ((brt) this.d[i3]).a();
                } else if (b2 == 5) {
                    ((Integer) this.d[i3]).intValue();
                    x = boh.ai(a2);
                } else {
                    throw new IllegalStateException(bpt.a());
                }
                i2 += x;
            }
            this.e = i2;
            return i2;
        }
        return i;
    }

    public final int b() {
        int i = this.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f961b; i3++) {
                int i4 = this.c[i3];
                int u = boh.u(1);
                i2 += u + u + boh.v(2, bsi.a(i4)) + boh.b(3, (bnz) this.d[i3]);
            }
            this.e = i2;
            return i2;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof brt)) {
            brt brtVar = (brt) obj;
            int i = this.f961b;
            if (i == brtVar.f961b) {
                int[] iArr = this.c;
                int[] iArr2 = brtVar.c;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.d;
                        Object[] objArr2 = brtVar.d;
                        int i3 = this.f961b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final void f() {
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f961b; i2++) {
            bsk.E(sb, i, String.valueOf(bsi.a(this.c[i2])), this.d[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i, Object obj) {
        if (this.f) {
            int i2 = this.f961b;
            int[] iArr = this.c;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.c = Arrays.copyOf(iArr, i3);
                this.d = Arrays.copyOf(this.d, i3);
            }
            int[] iArr2 = this.c;
            int i4 = this.f961b;
            iArr2[i4] = i;
            this.d[i4] = obj;
            this.f961b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f961b;
        int[] iArr = this.c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        Object[] objArr = this.d;
        int i5 = this.f961b;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return ((((i + BR.userTeamVM) * 31) + i3) * 31) + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(bsj bsjVar) throws IOException {
        for (int i = 0; i < this.f961b; i++) {
            bsjVar.x(bsi.a(this.c[i]), this.d[i]);
        }
    }

    public final void j(bsj bsjVar) throws IOException {
        if (this.f961b != 0) {
            for (int i = 0; i < this.f961b; i++) {
                k(this.c[i], this.d[i], bsjVar);
            }
        }
    }

    private static void k(int i, Object obj, bsj bsjVar) throws IOException {
        int a2 = bsi.a(i);
        int b2 = bsi.b(i);
        if (b2 == 0) {
            bsjVar.t(a2, ((Long) obj).longValue());
        } else if (b2 == 1) {
            bsjVar.m(a2, ((Long) obj).longValue());
        } else if (b2 == 2) {
            bsjVar.d(a2, (bnz) obj);
        } else if (b2 != 3) {
            if (b2 == 5) {
                bsjVar.k(a2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(bpt.a());
        } else {
            bsjVar.G(a2);
            ((brt) obj).j(bsjVar);
            bsjVar.h(a2);
        }
    }
}
