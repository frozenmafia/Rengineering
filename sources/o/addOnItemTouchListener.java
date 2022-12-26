package o;

import java.io.File;
/* loaded from: classes5.dex */
public class addOnItemTouchListener {
    private static final toString toString = new toString();
    private setAdapterInternal ag$a;
    private final getRecycledViewPool valueOf;

    public addOnItemTouchListener(getRecycledViewPool getrecycledviewpool) {
        this.valueOf = getrecycledviewpool;
        this.ag$a = toString;
    }

    public addOnItemTouchListener(getRecycledViewPool getrecycledviewpool, String str) {
        this(getrecycledviewpool);
        valueOf(str);
    }

    public final void valueOf(String str) {
        this.ag$a.ah$a();
        this.ag$a = toString;
        if (str == null) {
            return;
        }
        ag$a(values(str), 65536);
    }

    public void toString(long j, String str) {
        this.ag$a.ah$a(j, str);
    }

    public byte[] values() {
        return this.ag$a.values();
    }

    public String ag$a() {
        return this.ag$a.ag$a();
    }

    public void ah$a() {
        this.ag$a.valueOf();
    }

    void ag$a(File file, int i) {
        this.ag$a = new addItemDecoration(file, i);
    }

    private File values(String str) {
        return this.valueOf.ah$a(str, "userlog");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class toString implements setAdapterInternal {
        @Override // o.setAdapterInternal
        public String ag$a() {
            return null;
        }

        @Override // o.setAdapterInternal
        public void ah$a() {
        }

        @Override // o.setAdapterInternal
        public void ah$a(long j, String str) {
        }

        @Override // o.setAdapterInternal
        public void valueOf() {
        }

        @Override // o.setAdapterInternal
        public byte[] values() {
            return null;
        }

        private toString() {
        }
    }
}
