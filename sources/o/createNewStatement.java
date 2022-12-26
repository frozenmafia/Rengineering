package o;

import android.database.Cursor;
/* loaded from: classes7.dex */
final class createNewStatement implements Transaction {
    private final Cursor ah$a;

    public createNewStatement(Cursor cursor) {
        runAnimators.ag$a(cursor, "cursor");
        this.ah$a = cursor;
    }

    @Override // o.Transaction
    public boolean ag$a() {
        return this.ah$a.moveToNext();
    }

    @Override // o.Transaction
    public String valueOf(int i) {
        if (this.ah$a.isNull(i)) {
            return null;
        }
        return this.ah$a.getString(i);
    }

    @Override // o.Transaction
    public Long toString(int i) {
        if (this.ah$a.isNull(i)) {
            return null;
        }
        return Long.valueOf(this.ah$a.getLong(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.ah$a.close();
    }
}
