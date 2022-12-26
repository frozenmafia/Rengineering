package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.telephony.cdma.CdmaCellLocation;
import com.app.dream11.core.device.store.database.KeyValueDBTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class SupportActionModeWrapper extends SQLiteOpenHelper {
    private static long ah$a = -6212312438392750042L;
    private static int toString = 1;
    private static int values;
    private final initializeTheme ag$a;
    List<String> valueOf;

    /* loaded from: classes6.dex */
    public class CallbackWrapper {
        public String ah$a(byte[] bArr) {
            return writeBitmap.toString(bArr);
        }

        public byte[] valueOf(String str) {
            return writeBitmap.ag$a(str);
        }
    }

    public SupportActionModeWrapper(Context context, initializeTheme initializetheme) {
        super(context, valueOf(new char[]{30066, 30006, 10662, 10738, 65481, 65504, 43208, 43227, 30087, 10621, 65308, 43398, 29696}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))).intern(), (SQLiteDatabase.CursorFactory) null, 6);
        this.valueOf = new ArrayList();
        this.ag$a = initializetheme;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = values + 51;
        toString = i % 128;
        int i2 = i % 2;
        this.valueOf.add(KeyValueDBTable.ag$a());
        Iterator<String> it = this.valueOf.iterator();
        int i3 = toString + 45;
        values = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            if ((it.hasNext() ? '&' : '%') != '&') {
                return;
            }
            sQLiteDatabase.execSQL(it.next());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            int i3 = toString + 1;
            values = i3 % 128;
            int i4 = i3 % 2;
            try {
                KeyValueDBTable.ag$a(sQLiteDatabase, i, i2, this.ag$a);
                int i5 = values + 119;
                toString = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(ah$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * ah$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
