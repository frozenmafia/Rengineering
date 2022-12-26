package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.Styleable;
import o.isTransitionRequired;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class SQLiteDatabaseKt {
    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, Styleable.ChangeBounds changeBounds, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        runAnimators.ag$a(sQLiteDatabase, "<this>");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = changeBounds.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            isTransitionRequired.toString(1);
            sQLiteDatabase.endTransaction();
            isTransitionRequired.values(1);
        }
    }

    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, Styleable.ChangeBounds<? super SQLiteDatabase, ? extends T> changeBounds) {
        runAnimators.ag$a(sQLiteDatabase, "<this>");
        runAnimators.ag$a(changeBounds, TtmlNode.TAG_BODY);
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = changeBounds.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            isTransitionRequired.toString(1);
            sQLiteDatabase.endTransaction();
            isTransitionRequired.values(1);
        }
    }
}
