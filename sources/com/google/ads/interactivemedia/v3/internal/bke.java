package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes4.dex */
public final class bke extends AbstractMap implements Serializable {
    private static final Comparator f = new bjx();
    final Comparator a;

    /* renamed from: b  reason: collision with root package name */
    bkd f862b;
    int c;
    int d;
    final bkd e;
    private bjz g;
    private bkb h;

    public bke() {
        Comparator comparator = f;
        this.c = 0;
        this.d = 0;
        this.e = new bkd();
        this.a = comparator;
    }

    private final void f(bkd bkdVar, boolean z) {
        while (bkdVar != null) {
            bkd bkdVar2 = bkdVar.f861b;
            bkd bkdVar3 = bkdVar.c;
            int i = bkdVar2 != null ? bkdVar2.h : 0;
            int i2 = bkdVar3 != null ? bkdVar3.h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                bkd bkdVar4 = bkdVar3.f861b;
                bkd bkdVar5 = bkdVar3.c;
                int i4 = (bkdVar4 != null ? bkdVar4.h : 0) - (bkdVar5 != null ? bkdVar5.h : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    h(bkdVar);
                } else {
                    i(bkdVar3);
                    h(bkdVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                bkd bkdVar6 = bkdVar2.f861b;
                bkd bkdVar7 = bkdVar2.c;
                int i5 = (bkdVar6 != null ? bkdVar6.h : 0) - (bkdVar7 != null ? bkdVar7.h : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    i(bkdVar);
                } else {
                    h(bkdVar2);
                    i(bkdVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                bkdVar.h = i + 1;
                if (z) {
                    return;
                }
            } else {
                bkdVar.h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            bkdVar = bkdVar.a;
        }
    }

    private final void g(bkd bkdVar, bkd bkdVar2) {
        bkd bkdVar3 = bkdVar.a;
        bkdVar.a = null;
        if (bkdVar2 != null) {
            bkdVar2.a = bkdVar3;
        }
        if (bkdVar3 == null) {
            this.f862b = bkdVar2;
        } else if (bkdVar3.f861b == bkdVar) {
            bkdVar3.f861b = bkdVar2;
        } else {
            bkdVar3.c = bkdVar2;
        }
    }

    private final void h(bkd bkdVar) {
        bkd bkdVar2 = bkdVar.f861b;
        bkd bkdVar3 = bkdVar.c;
        bkd bkdVar4 = bkdVar3.f861b;
        bkd bkdVar5 = bkdVar3.c;
        bkdVar.c = bkdVar4;
        if (bkdVar4 != null) {
            bkdVar4.a = bkdVar;
        }
        g(bkdVar, bkdVar3);
        bkdVar3.f861b = bkdVar;
        bkdVar.a = bkdVar3;
        int max = Math.max(bkdVar2 != null ? bkdVar2.h : 0, bkdVar4 != null ? bkdVar4.h : 0) + 1;
        bkdVar.h = max;
        bkdVar3.h = Math.max(max, bkdVar5 != null ? bkdVar5.h : 0) + 1;
    }

    private final void i(bkd bkdVar) {
        bkd bkdVar2 = bkdVar.f861b;
        bkd bkdVar3 = bkdVar.c;
        bkd bkdVar4 = bkdVar2.f861b;
        bkd bkdVar5 = bkdVar2.c;
        bkdVar.f861b = bkdVar5;
        if (bkdVar5 != null) {
            bkdVar5.a = bkdVar;
        }
        g(bkdVar, bkdVar2);
        bkdVar2.c = bkdVar;
        bkdVar.a = bkdVar2;
        int max = Math.max(bkdVar3 != null ? bkdVar3.h : 0, bkdVar5 != null ? bkdVar5.h : 0) + 1;
        bkdVar.h = max;
        bkdVar2.h = Math.max(max, bkdVar4 != null ? bkdVar4.h : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    final bkd a(Object obj, boolean z) {
        int i;
        bkd bkdVar;
        Comparator comparator = this.a;
        bkd bkdVar2 = this.f862b;
        if (bkdVar2 != null) {
            Comparable comparable = comparator == f ? (Comparable) obj : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(bkdVar2.f);
                } else {
                    i = comparator.compare(obj, bkdVar2.f);
                }
                if (i == 0) {
                    return bkdVar2;
                }
                bkd bkdVar3 = i < 0 ? bkdVar2.f861b : bkdVar2.c;
                if (bkdVar3 == null) {
                    break;
                }
                bkdVar2 = bkdVar3;
            }
        } else {
            i = 0;
        }
        if (z) {
            bkd bkdVar4 = this.e;
            if (bkdVar2 == null) {
                if (comparator != f || (obj instanceof Comparable)) {
                    bkdVar = new bkd(null, obj, bkdVar4, bkdVar4.e);
                    this.f862b = bkdVar;
                } else {
                    throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
                }
            } else {
                bkdVar = new bkd(bkdVar2, obj, bkdVar4, bkdVar4.e);
                if (i < 0) {
                    bkdVar2.f861b = bkdVar;
                } else {
                    bkdVar2.c = bkdVar;
                }
                f(bkdVar2, true);
            }
            this.c++;
            this.d++;
            return bkdVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bkd b(Map.Entry entry) {
        bkd c = c(entry.getKey());
        if (c != null) {
            Object obj = c.g;
            Object value = entry.getValue();
            if (obj == value || (obj != null && obj.equals(value))) {
                return c;
            }
            return null;
        }
        return null;
    }

    final bkd c(Object obj) {
        if (obj != null) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f862b = null;
        this.c = 0;
        this.d++;
        bkd bkdVar = this.e;
        bkdVar.e = bkdVar;
        bkdVar.d = bkdVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bkd d(Object obj) {
        bkd c = c(obj);
        if (c != null) {
            e(c, true);
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(bkd bkdVar, boolean z) {
        int i;
        if (z) {
            bkd bkdVar2 = bkdVar.e;
            bkdVar2.d = bkdVar.d;
            bkdVar.d.e = bkdVar2;
        }
        bkd bkdVar3 = bkdVar.f861b;
        bkd bkdVar4 = bkdVar.c;
        bkd bkdVar5 = bkdVar.a;
        int i2 = 0;
        if (bkdVar3 == null || bkdVar4 == null) {
            if (bkdVar3 != null) {
                g(bkdVar, bkdVar3);
                bkdVar.f861b = null;
            } else if (bkdVar4 != null) {
                g(bkdVar, bkdVar4);
                bkdVar.c = null;
            } else {
                g(bkdVar, null);
            }
            f(bkdVar5, false);
            this.c--;
            this.d++;
            return;
        }
        if (bkdVar3.h > bkdVar4.h) {
            while (true) {
                bkd bkdVar6 = bkdVar3.c;
                if (bkdVar6 == null) {
                    break;
                }
                bkdVar3 = bkdVar6;
            }
        } else {
            while (true) {
                bkd bkdVar7 = bkdVar4.f861b;
                if (bkdVar7 == null) {
                    break;
                }
                bkdVar4 = bkdVar7;
            }
            bkdVar3 = bkdVar4;
        }
        e(bkdVar3, false);
        bkd bkdVar8 = bkdVar.f861b;
        if (bkdVar8 != null) {
            i = bkdVar8.h;
            bkdVar3.f861b = bkdVar8;
            bkdVar8.a = bkdVar3;
            bkdVar.f861b = null;
        } else {
            i = 0;
        }
        bkd bkdVar9 = bkdVar.c;
        if (bkdVar9 != null) {
            i2 = bkdVar9.h;
            bkdVar3.c = bkdVar9;
            bkdVar9.a = bkdVar3;
            bkdVar.c = null;
        }
        bkdVar3.h = Math.max(i, i2) + 1;
        g(bkdVar, bkdVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        bjz bjzVar = this.g;
        if (bjzVar != null) {
            return bjzVar;
        }
        bjz bjzVar2 = new bjz(this);
        this.g = bjzVar2;
        return bjzVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        bkd c = c(obj);
        if (c != null) {
            return c.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        bkb bkbVar = this.h;
        if (bkbVar != null) {
            return bkbVar;
        }
        bkb bkbVar2 = new bkb(this);
        this.h = bkbVar2;
        return bkbVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Objects.requireNonNull(obj, "key == null");
        bkd a = a(obj, true);
        Object obj3 = a.g;
        a.g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        bkd d = d(obj);
        if (d != null) {
            return d.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }
}
