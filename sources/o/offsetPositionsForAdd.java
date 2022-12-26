package o;

import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes5.dex */
public final class offsetPositionsForAdd {
    private final int ah$a;
    private final offsetPositionsForAdd$ah$a toString;
    private final applyPendingUpdatesToPosition valueOf;
    private final boolean values;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private offsetPositionsForAdd(o.offsetPositionsForAdd$ah$a r4) {
        /*
            r3 = this;
            o.applyPendingUpdatesToPosition r0 = o.applyPendingUpdatesToPosition.ag$a()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3.<init>(r4, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.offsetPositionsForAdd.<init>(o.offsetPositionsForAdd$ah$a):void");
    }

    private offsetPositionsForAdd(offsetPositionsForAdd$ah$a offsetpositionsforadd_ah_a, boolean z, applyPendingUpdatesToPosition applypendingupdatestoposition, int i) {
        this.toString = offsetpositionsforadd_ah_a;
        this.values = z;
        this.valueOf = applypendingupdatestoposition;
        this.ah$a = i;
    }

    public static offsetPositionsForAdd valueOf(char c) {
        return ag$a(applyPendingUpdatesToPosition.valueOf(c));
    }

    public static offsetPositionsForAdd ag$a(final applyPendingUpdatesToPosition applypendingupdatestoposition) {
        markViewHoldersUpdated.toString(applypendingupdatestoposition);
        return new offsetPositionsForAdd(new offsetPositionsForAdd$ah$a() { // from class: o.offsetPositionsForAdd.5
            @Override // o.offsetPositionsForAdd$ah$a
            /* renamed from: valueOf */
            public valueOf toString(offsetPositionsForAdd offsetpositionsforadd, CharSequence charSequence) {
                return new valueOf(offsetpositionsforadd, charSequence) { // from class: o.offsetPositionsForAdd.5.1
                    @Override // o.offsetPositionsForAdd.valueOf
                    int valueOf(int i) {
                        return i + 1;
                    }

                    @Override // o.offsetPositionsForAdd.valueOf
                    int ah$a(int i) {
                        return applyPendingUpdatesToPosition.this.toString(this.valueOf, i);
                    }
                };
            }
        });
    }

    private Iterator<String> valueOf(CharSequence charSequence) {
        return this.toString.toString(this, charSequence);
    }

    public List<String> toString(CharSequence charSequence) {
        markViewHoldersUpdated.toString(charSequence);
        Iterator<String> valueOf2 = valueOf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (valueOf2.hasNext()) {
            arrayList.add(valueOf2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes5.dex */
    static abstract class valueOf extends AbstractIterator<String> {
        int ag$a;
        final applyPendingUpdatesToPosition invoke;
        int toString = 0;
        final CharSequence valueOf;
        final boolean values;

        abstract int ah$a(int i);

        abstract int valueOf(int i);

        protected valueOf(offsetPositionsForAdd offsetpositionsforadd, CharSequence charSequence) {
            this.invoke = offsetpositionsforadd.valueOf;
            this.values = offsetpositionsforadd.values;
            this.ag$a = offsetpositionsforadd.ah$a;
            this.valueOf = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractIterator
        /* renamed from: valueOf */
        public String values() {
            int ah$a;
            int i = this.toString;
            while (true) {
                int i2 = this.toString;
                if (i2 != -1) {
                    ah$a = ah$a(i2);
                    if (ah$a == -1) {
                        ah$a = this.valueOf.length();
                        this.toString = -1;
                    } else {
                        this.toString = valueOf(ah$a);
                    }
                    int i3 = this.toString;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.toString = i4;
                        if (i4 > this.valueOf.length()) {
                            this.toString = -1;
                        }
                    } else {
                        while (i < ah$a && this.invoke.ag$a(this.valueOf.charAt(i))) {
                            i++;
                        }
                        while (ah$a > i && this.invoke.ag$a(this.valueOf.charAt(ah$a - 1))) {
                            ah$a--;
                        }
                        if (!this.values || i != ah$a) {
                            break;
                        }
                        i = this.toString;
                    }
                } else {
                    return ah$a();
                }
            }
            int i5 = this.ag$a;
            if (i5 == 1) {
                ah$a = this.valueOf.length();
                this.toString = -1;
                while (ah$a > i && this.invoke.ag$a(this.valueOf.charAt(ah$a - 1))) {
                    ah$a--;
                }
            } else {
                this.ag$a = i5 - 1;
            }
            return this.valueOf.subSequence(i, ah$a).toString();
        }
    }
}
