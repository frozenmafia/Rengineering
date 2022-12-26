package o;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class bindViewHolder implements Iterable<detachViewAt>, Comparable<bindViewHolder> {
    private static final bindViewHolder toString = new bindViewHolder("");
    private final int ag$a;
    private final int ah$a;
    private final detachViewAt[] valueOf;

    public static bindViewHolder ah$a(bindViewHolder bindviewholder, bindViewHolder bindviewholder2) {
        detachViewAt ah$a = bindviewholder.ah$a();
        detachViewAt ah$a2 = bindviewholder2.ah$a();
        if (ah$a == null) {
            return bindviewholder2;
        }
        if (ah$a.equals(ah$a2)) {
            return ah$a(bindviewholder.HaptikSDK$c(), bindviewholder2.HaptikSDK$c());
        }
        throw new DatabaseException("INTERNAL ERROR: " + bindviewholder2 + " is not contained in " + bindviewholder);
    }

    public static bindViewHolder ag$a() {
        return toString;
    }

    public bindViewHolder(detachViewAt... detachviewatArr) {
        this.valueOf = (detachViewAt[]) Arrays.copyOf(detachviewatArr, detachviewatArr.length);
        this.ah$a = 0;
        this.ag$a = detachviewatArr.length;
        for (detachViewAt detachviewat : detachviewatArr) {
            RecyclerView.ItemAnimator.AdapterChanges.valueOf(detachviewat != null, "Can't construct a path with a null value!");
        }
    }

    public bindViewHolder(List<String> list) {
        this.valueOf = new detachViewAt[list.size()];
        int i = 0;
        for (String str : list) {
            this.valueOf[i] = detachViewAt.values(str);
            i++;
        }
        this.ah$a = 0;
        this.ag$a = list.size();
    }

    public bindViewHolder(String str) {
        String[] split = str.split("/", -1);
        int i = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                i++;
            }
        }
        this.valueOf = new detachViewAt[i];
        int i2 = 0;
        for (String str3 : split) {
            if (str3.length() > 0) {
                this.valueOf[i2] = detachViewAt.values(str3);
                i2++;
            }
        }
        this.ah$a = 0;
        this.ag$a = this.valueOf.length;
    }

    private bindViewHolder(detachViewAt[] detachviewatArr, int i, int i2) {
        this.valueOf = detachviewatArr;
        this.ah$a = i;
        this.ag$a = i2;
    }

    public bindViewHolder values(bindViewHolder bindviewholder) {
        int HaptikSDK$a = HaptikSDK$a() + bindviewholder.HaptikSDK$a();
        detachViewAt[] detachviewatArr = new detachViewAt[HaptikSDK$a];
        System.arraycopy(this.valueOf, this.ah$a, detachviewatArr, 0, HaptikSDK$a());
        System.arraycopy(bindviewholder.valueOf, bindviewholder.ah$a, detachviewatArr, HaptikSDK$a(), bindviewholder.HaptikSDK$a());
        return new bindViewHolder(detachviewatArr, 0, HaptikSDK$a);
    }

    public bindViewHolder valueOf(detachViewAt detachviewat) {
        int HaptikSDK$a = HaptikSDK$a();
        int i = HaptikSDK$a + 1;
        detachViewAt[] detachviewatArr = new detachViewAt[i];
        System.arraycopy(this.valueOf, this.ah$a, detachviewatArr, 0, HaptikSDK$a);
        detachviewatArr[HaptikSDK$a] = detachviewat;
        return new bindViewHolder(detachviewatArr, 0, i);
    }

    public String toString() {
        if (HaptikSDK$b()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.ah$a; i < this.ag$a; i++) {
            sb.append("/");
            sb.append(this.valueOf[i].valueOf());
        }
        return sb.toString();
    }

    public String invoke() {
        if (HaptikSDK$b()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = this.ah$a; i < this.ag$a; i++) {
            if (i > this.ah$a) {
                sb.append("/");
            }
            sb.append(this.valueOf[i].valueOf());
        }
        return sb.toString();
    }

    public List<String> valueOf() {
        ArrayList arrayList = new ArrayList(HaptikSDK$a());
        Iterator<detachViewAt> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().valueOf());
        }
        return arrayList;
    }

    public detachViewAt ah$a() {
        if (HaptikSDK$b()) {
            return null;
        }
        return this.valueOf[this.ah$a];
    }

    public bindViewHolder HaptikSDK$c() {
        int i = this.ah$a;
        if (!HaptikSDK$b()) {
            i++;
        }
        return new bindViewHolder(this.valueOf, i, this.ag$a);
    }

    public bindViewHolder ah$b() {
        if (HaptikSDK$b()) {
            return null;
        }
        return new bindViewHolder(this.valueOf, this.ah$a, this.ag$a - 1);
    }

    public detachViewAt values() {
        if (HaptikSDK$b()) {
            return null;
        }
        return this.valueOf[this.ag$a - 1];
    }

    public boolean HaptikSDK$b() {
        return this.ah$a >= this.ag$a;
    }

    public int HaptikSDK$a() {
        return this.ag$a - this.ah$a;
    }

    @Override // java.lang.Iterable
    public Iterator<detachViewAt> iterator() {
        return new Iterator<detachViewAt>() { // from class: o.bindViewHolder.4
            int valueOf;

            {
                this.valueOf = bindViewHolder.this.ah$a;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.valueOf < bindViewHolder.this.ag$a;
            }

            @Override // java.util.Iterator
            /* renamed from: valueOf */
            public detachViewAt next() {
                if (hasNext()) {
                    detachViewAt[] detachviewatArr = bindViewHolder.this.valueOf;
                    int i = this.valueOf;
                    detachViewAt detachviewat = detachviewatArr[i];
                    this.valueOf = i + 1;
                    return detachviewat;
                }
                throw new NoSuchElementException("No more elements.");
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
            }
        };
    }

    public boolean HaptikSDK$c(bindViewHolder bindviewholder) {
        if (HaptikSDK$a() > bindviewholder.HaptikSDK$a()) {
            return false;
        }
        int i = this.ah$a;
        int i2 = bindviewholder.ah$a;
        while (i < this.ag$a) {
            if (!this.valueOf[i].equals(bindviewholder.valueOf[i2])) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bindViewHolder) {
            if (this == obj) {
                return true;
            }
            bindViewHolder bindviewholder = (bindViewHolder) obj;
            if (HaptikSDK$a() != bindviewholder.HaptikSDK$a()) {
                return false;
            }
            int i = this.ah$a;
            for (int i2 = bindviewholder.ah$a; i < this.ag$a && i2 < bindviewholder.ag$a; i2++) {
                if (!this.valueOf[i].equals(bindviewholder.valueOf[i2])) {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = this.ah$a; i2 < this.ag$a; i2++) {
            i = (i * 37) + this.valueOf[i2].hashCode();
        }
        return i;
    }

    @Override // java.lang.Comparable
    /* renamed from: ag$a */
    public int compareTo(bindViewHolder bindviewholder) {
        int i;
        int i2 = this.ah$a;
        int i3 = bindviewholder.ah$a;
        while (true) {
            i = this.ag$a;
            if (i2 >= i || i3 >= bindviewholder.ag$a) {
                break;
            }
            int compareTo = this.valueOf[i2].compareTo(bindviewholder.valueOf[i3]);
            if (compareTo != 0) {
                return compareTo;
            }
            i2++;
            i3++;
        }
        if (i2 == i && i3 == bindviewholder.ag$a) {
            return 0;
        }
        return i2 == i ? -1 : 1;
    }
}
