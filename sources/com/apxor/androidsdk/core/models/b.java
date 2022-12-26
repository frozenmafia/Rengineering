package com.apxor.androidsdk.core.models;

import android.content.ContentValues;
import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apxor.androidsdk.core.Constants;
import o.getShort;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class b extends BaseApxorEvent {
    private static int ag$a = 0;
    private static long ah$a = 0;
    private static int toString = 0;
    private static char valueOf = 0;
    private static int values = 1;
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private String f269b;
    private boolean c;
    private JSONArray d;
    private long e;
    private long f;
    private String g;

    static {
        ag$a();
        try {
            int i = values + 17;
            ag$a = i % 128;
            if ((i % 2 != 0 ? (char) 21 : '\f') != 21) {
                return;
            }
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    public b(String str, int i, long j, long j2, JSONArray jSONArray) {
        this.g = str;
        this.f269b = str + ":" + i;
        this.a = i;
        this.d = jSONArray;
        this.e = j;
        this.f = j2;
    }

    static void ag$a() {
        toString = 0;
        ah$a = -2800995132953155398L;
        valueOf = (char) 0;
    }

    public String a() {
        int i = values + 43;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.f269b;
        int i3 = values + 39;
        ag$a = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public int b() {
        int i = ag$a + 95;
        values = i % 128;
        if ((i % 2 == 0 ? '\t' : (char) 24) != 24) {
            int i2 = 48 / 0;
            return this.a;
        }
        try {
            return this.a;
        } catch (Exception e) {
            throw e;
        }
    }

    public long c() {
        try {
            int i = ag$a + 63;
            values = i % 128;
            int i2 = i % 2;
            long j = this.f;
            int i3 = values + 11;
            ag$a = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 32 / 0;
                return j;
            }
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    public String d() {
        try {
            int i = values + 93;
            ag$a = i % 128;
            if ((i % 2 != 0 ? 'E' : (char) 18) != 18) {
                String str = this.g;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return this.g;
        } catch (Exception e) {
            throw e;
        }
    }

    public long e() {
        int i = values + 57;
        ag$a = i % 128;
        int i2 = i % 2;
        long j = this.e;
        int i3 = ag$a + 97;
        values = i3 % 128;
        if ((i3 % 2 == 0 ? 'C' : (char) 28) != 28) {
            Object[] objArr = null;
            int length = objArr.length;
            return j;
        }
        return j;
    }

    public boolean f() {
        int i = values + 87;
        ag$a = i % 128;
        if ((i % 2 != 0 ? 'U' : '4') != 'U') {
            return this.c;
        }
        boolean z = this.c;
        Object obj = null;
        super.hashCode();
        return z;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public ContentValues getContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ag$a(Color.blue(0), new char[]{7177, 6205, 35422, 52364}, new char[]{43194, 21178, 56772, 55584}, (char) (35978 - View.getDefaultSize(0, 0)), new char[]{50311, 40593}).intern(), this.f269b);
        contentValues.put("sid", this.g);
        contentValues.put("start", Long.valueOf(this.e));
        contentValues.put("end", Long.valueOf(this.f));
        contentValues.put(Constants.SENT_STATUS, Boolean.valueOf(this.c));
        contentValues.put(Constants.REPORTING_TIMES, this.d.toString());
        int i = ag$a + 61;
        values = i % 128;
        int i2 = i % 2;
        return contentValues;
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventType() {
        int i = ag$a + 7;
        values = i % 128;
        if (!(i % 2 != 0)) {
            Object[] objArr = null;
            int length = objArr.length;
            return "chunk_meta";
        }
        return "chunk_meta";
    }

    @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
    public JSONObject getJSONData() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ag$a(ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{7177, 6205, 35422, 52364}, new char[]{43194, 21178, 56772, 55584}, (char) (35977 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), new char[]{50311, 40593}).intern(), this.f269b);
            jSONObject.put(Constants.CHUNK_NUMBER, this.a);
            jSONObject.put(Constants.REPORTING_TIMES, this.d);
            int i = ag$a + 3;
            values = i % 128;
            int i2 = i % 2;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(long j) {
        int i = values + 27;
        ag$a = i % 128;
        if (!(i % 2 != 0)) {
            this.d.put(j);
            return;
        }
        try {
            this.d.put(j);
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    public void a(boolean z) {
        int i = values + 1;
        ag$a = i % 128;
        int i2 = i % 2;
        try {
            this.c = z;
            int i3 = values + 49;
            ag$a = i3 % 128;
            if ((i3 % 2 != 0 ? 'N' : (char) 15) != 'N') {
                return;
            }
            int i4 = 95 / 0;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ag$a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ toString) ^ valueOf);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
