package o;

import o.AppCompatViewInflater;
/* loaded from: classes.dex */
public final /* synthetic */ class flushNougats implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ flushNougats ag$a = new flushNougats();

    private /* synthetic */ flushNougats() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        AppCompatViewInflater.DeclaredOnClickListener a;
        a = onItemSelected.a((popOutdatedAttrHolders) obj);
        return a;
    }
}
