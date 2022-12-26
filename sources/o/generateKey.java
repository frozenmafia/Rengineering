package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.view.Gravity;
import droidninja.filepicker.models.Document;
import droidninja.filepicker.models.FileType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class generateKey extends AsyncTask<Void, Void, Map<FileType, List<Document>>> {
    private static int HaptikSDK$a = 0;
    private static char[] HaptikSDK$b = {'t', 35371, 5360, 40618, 10605};
    private static long HaptikSDK$c = 3511897035782326850L;
    private static int invoke = 1;
    private final Comparator<Document> ag$a;
    private final createAES256GCMKeyGenParameterSpec ah$a;
    private final List<FileType> toString;
    final String[] valueOf = {"_id", "_data", "mime_type", "_size", "date_added", ag$a((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 4, Gravity.getAbsoluteGravity(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()};
    private final ContentResolver values;

    @Override // android.os.AsyncTask
    protected /* synthetic */ Map<FileType, List<Document>> doInBackground(Void[] voidArr) {
        int i = HaptikSDK$a + 111;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            Map<FileType, List<Document>> ag$a = ag$a(voidArr);
            int i3 = HaptikSDK$a + 7;
            invoke = i3 % 128;
            if (i3 % 2 != 0) {
                return ag$a;
            }
            int i4 = 2 / 0;
            return ag$a;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(Map<FileType, List<Document>> map) {
        int i = HaptikSDK$a + 123;
        invoke = i % 128;
        if (i % 2 == 0) {
            values(map);
            int i2 = 59 / 0;
        } else {
            try {
                try {
                    values(map);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i3 = HaptikSDK$a + 61;
        invoke = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        int i4 = 22 / 0;
    }

    public generateKey(Context context, List<FileType> list, Comparator<Document> comparator, createAES256GCMKeyGenParameterSpec createaes256gcmkeygenparameterspec) {
        this.values = context.getContentResolver();
        this.toString = list;
        this.ag$a = comparator;
        this.ah$a = createaes256gcmkeygenparameterspec;
    }

    private HashMap<FileType, List<Document>> toString(ArrayList<Document> arrayList) {
        Document next;
        HashMap<FileType, List<Document>> hashMap = new HashMap<>();
        Iterator<FileType> it = this.toString.iterator();
        int i = invoke + 103;
        HaptikSDK$a = i % 128;
        while (true) {
            int i2 = i % 2;
            if (!it.hasNext()) {
                return hashMap;
            }
            FileType next2 = it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Document> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i3 = HaptikSDK$a + 7;
                invoke = i3 % 128;
                if (i3 % 2 != 0) {
                    next = it2.next();
                    if ((next.values(next2.toString) ? '/' : (char) 1) == '/') {
                        arrayList2.add(next);
                    }
                } else {
                    next = it2.next();
                    boolean values = next.values(next2.toString);
                    Object obj = null;
                    super.hashCode();
                    if (values) {
                        arrayList2.add(next);
                    }
                }
            }
            hashMap.put(next2, arrayList2);
            i = invoke + 71;
            HaptikSDK$a = i % 128;
        }
    }

    protected Map<FileType, List<Document>> ag$a(Void... voidArr) {
        ArrayList<Document> arrayList = new ArrayList<>();
        try {
            Cursor query = this.values.query(MediaStore.Files.getContentUri("external"), this.valueOf, "media_type!=1 AND media_type!=3", null, "date_added DESC");
            if (!(query == null)) {
                int i = invoke + 53;
                HaptikSDK$a = i % 128;
                if (!(i % 2 == 0)) {
                    arrayList = toString(query);
                    query.close();
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    arrayList = toString(query);
                    query.close();
                }
            }
            HashMap<FileType, List<Document>> generatekey = toString(arrayList);
            int i2 = HaptikSDK$a + 83;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            return generatekey;
        } catch (Exception e) {
            throw e;
        }
    }

    protected void values(Map<FileType, List<Document>> map) {
        int i = invoke + 113;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        createAES256GCMKeyGenParameterSpec createaes256gcmkeygenparameterspec = this.ah$a;
        if ((createaes256gcmkeygenparameterspec != null ? '?' : '9') != '?') {
            return;
        }
        int i3 = invoke + 5;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
        try {
            createaes256gcmkeygenparameterspec.ah$a(map);
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if ((r3 ? false : true) != true) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r6.valueOf(r2);
        r2 = o.generateKey.invoke + 75;
        o.generateKey.HaptikSDK$a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0007 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList<droidninja.filepicker.models.Document> toString(android.database.Cursor r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.generateKey.toString(android.database.Cursor):java.util.ArrayList");
    }

    private FileType toString(ArrayList<FileType> arrayList, String str) {
        int i = invoke + 85;
        HaptikSDK$a = i % 128;
        if (i % 2 != 0) {
        }
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                int i3 = invoke + 1;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            int i5 = invoke + 25;
            HaptikSDK$a = i5 % 128;
            int i6 = i5 % 2;
            for (String str2 : arrayList.get(i2).toString) {
                int i7 = invoke + 61;
                HaptikSDK$a = i7 % 128;
                int i8 = i7 % 2;
                if (str.endsWith(str2)) {
                    int i9 = invoke + 49;
                    HaptikSDK$a = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        try {
                            return arrayList.get(i2);
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
            i2++;
        }
    }

    private static String ag$a(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((HaptikSDK$b[move.values + i2] ^ (move.values * HaptikSDK$c)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
