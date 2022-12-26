package o;
/* loaded from: classes7.dex */
public final class SkipQueryVerification implements TypeConverter {
    private final androidx.sqlite.db.SupportSQLiteStatement valueOf;

    public SkipQueryVerification(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement) {
        runAnimators.ag$a(supportSQLiteStatement, "statement");
        this.valueOf = supportSQLiteStatement;
    }

    @Override // o.TypeConverter
    public /* synthetic */ Transaction valueOf() {
        return (Transaction) values();
    }

    @Override // o.scheduleNext
    public void valueOf(int i, String str) {
        if (str == null) {
            this.valueOf.bindNull(i);
        } else {
            this.valueOf.bindString(i, str);
        }
    }

    public Void values() {
        throw new UnsupportedOperationException();
    }

    @Override // o.TypeConverter
    public void ah$a() {
        this.valueOf.execute();
    }

    @Override // o.TypeConverter
    public void ag$a() {
        this.valueOf.close();
    }
}
