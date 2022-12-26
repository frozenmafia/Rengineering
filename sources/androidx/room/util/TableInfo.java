package androidx.room.util;

import android.database.Cursor;
import android.os.Build;
import android.view.KeyEvent;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o.isBeforeFirst;
import org.apache.http.message.TokenParser;
/* loaded from: classes6.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;
    private static long ag$a = -6997529012574823175L;
    private static int valueOf = 0;
    private static int values = 1;
    public final Map<String, Column> columns;
    public final Set<ForeignKey> foreignKeys;
    public final Set<Index> indices;
    public final String name;

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set, Set<Index> set2) {
        Set<Index> unmodifiableSet;
        this.name = str;
        this.columns = Collections.unmodifiableMap(map);
        this.foreignKeys = Collections.unmodifiableSet(set);
        if (set2 == null) {
            unmodifiableSet = null;
            try {
                int i = valueOf + 75;
                values = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set2);
        }
        this.indices = unmodifiableSet;
        int i3 = values + 105;
        valueOf = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 7 : 'F') != 'F') {
            int i4 = 68 / 0;
        }
    }

    public TableInfo(String str, Map<String, Column> map, Set<ForeignKey> set) {
        this(str, map, set, Collections.emptySet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        if ((r6 == r7 ? 'X' : 'P') != 'P') goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
        if ((r7 instanceof androidx.room.util.TableInfo) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        r0 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        r0 = '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
        if (r0 == '\b') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
        r7 = (androidx.room.util.TableInfo) r7;
        r0 = r6.name;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
        if (r0 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
        r5 = '2';
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r5 == 6) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r0.equals(r7.name) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
        r7 = androidx.room.util.TableInfo.values + 1;
        androidx.room.util.TableInfo.valueOf = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
        if (r7.name == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
        r0 = r6.columns;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
        r3 = androidx.room.util.TableInfo.valueOf + 81;
        androidx.room.util.TableInfo.values = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        if ((r3 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
        r0 = r0.equals(r7.columns);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0073, code lost:
        r3 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
        if (r0.equals(r7.columns) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
        if (r7.columns == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0088, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0089, code lost:
        r0 = r6.foreignKeys;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008b, code lost:
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008d, code lost:
        r3 = androidx.room.util.TableInfo.valueOf + 15;
        androidx.room.util.TableInfo.values = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r0.equals(r7.foreignKeys) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a2, code lost:
        if (r7.foreignKeys == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a4, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a6, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a7, code lost:
        if (r0 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a9, code lost:
        r0 = r6.indices;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ab, code lost:
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
        r3 = androidx.room.util.TableInfo.values + 23;
        androidx.room.util.TableInfo.valueOf = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
        if ((r3 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b9, code lost:
        r7 = r7.indices;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bb, code lost:
        r1 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bc, code lost:
        if (r7 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c1, code lost:
        r7 = r7.indices;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
        if (r7 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ca, code lost:
        return r0.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cb, code lost:
        r7 = androidx.room.util.TableInfo.valueOf + 105;
        androidx.room.util.TableInfo.values = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d5, code lost:
        if ((r7 % 2) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d9, code lost:
        r7 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00da, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00dd, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00de, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e1, code lost:
        r7 = androidx.room.util.TableInfo.valueOf + 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e5, code lost:
        androidx.room.util.TableInfo.values = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e7, code lost:
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e9, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ea, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00eb, code lost:
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if ((r6 == r7 ? 'E' : '<') != '<') goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        String str = this.name;
        int i2 = 0;
        if (str != null) {
            int i3 = valueOf + 35;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                i = str.hashCode();
                int i4 = 69 / 0;
            } else {
                i = str.hashCode();
            }
        } else {
            i = 0;
        }
        Map<String, Column> map = this.columns;
        int hashCode = map != null ? map.hashCode() : 0;
        Set<ForeignKey> set = this.foreignKeys;
        if ((set != null ? TokenParser.ESCAPE : '4') != '4') {
            int i5 = values + 45;
            valueOf = i5 % 128;
            if ((i5 % 2 != 0 ? '^' : (char) 27) != '^') {
                try {
                    i2 = set.hashCode();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                i2 = set.hashCode();
                Object obj = null;
                super.hashCode();
            }
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public String toString() {
        String str = "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
        try {
            int i = values + 83;
            valueOf = i % 128;
            if (!(i % 2 == 0)) {
                int i2 = 78 / 0;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public static TableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        TableInfo tableInfo = new TableInfo(str, readColumns(supportSQLiteDatabase, str), readForeignKeys(supportSQLiteDatabase, str), readIndices(supportSQLiteDatabase, str));
        int i = values + 19;
        valueOf = i % 128;
        int i2 = i % 2;
        return tableInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
        if (r1.getInt(r4) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Set<androidx.room.util.TableInfo.ForeignKey> readForeignKeys(androidx.sqlite.db.SupportSQLiteDatabase r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.readForeignKeys(androidx.sqlite.db.SupportSQLiteDatabase, java.lang.String):java.util.Set");
    }

    private static List<ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(ah$a(new char[]{56464, 7572}, 49417 - KeyEvent.getDeadChar(0, 0)).intern());
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        int i = valueOf + 91;
        values = i % 128;
        int i2 = i % 2;
        for (int i3 = 0; i3 < count; i3++) {
            cursor.moveToPosition(i3);
            arrayList.add(new ForeignKeyWithSequence(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        int i4 = valueOf + 79;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return arrayList;
        }
        Object obj = null;
        super.hashCode();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r1.getInt(r4) != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> readColumns(androidx.sqlite.db.SupportSQLiteDatabase r18, java.lang.String r19) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA table_info(`"
            r0.append(r1)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = "`)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r18
            android.database.Cursor r1 = r1.query(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r2 = r1.getColumnCount()     // Catch: java.lang.Throwable -> Lbd
            if (r2 <= 0) goto Lb9
            java.lang.String r2 = "name"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = "type"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = "notnull"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r5 = "pk"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r6 = "dflt_value"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lbd
        L47:
            boolean r7 = r1.moveToNext()     // Catch: java.lang.Throwable -> Lbd
            r8 = 5
            if (r7 == 0) goto L51
            r7 = 81
            goto L52
        L51:
            r7 = 5
        L52:
            if (r7 == r8) goto Lb9
            int r7 = androidx.room.util.TableInfo.valueOf
            int r7 = r7 + 25
            int r8 = r7 % 128
            androidx.room.util.TableInfo.values = r8
            int r7 = r7 % 2
            r8 = 1
            r9 = 0
            if (r7 != 0) goto L64
            r7 = 1
            goto L65
        L64:
            r7 = 0
        L65:
            if (r7 == 0) goto L78
            java.lang.String r7 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r10 = r1.getString(r3)     // Catch: java.lang.Throwable -> Lbd
            int r11 = r1.getInt(r4)     // Catch: java.lang.Throwable -> Lbd
            r12 = 0
            int r12 = r12.length     // Catch: java.lang.Throwable -> Lbd
            if (r11 == 0) goto L98
            goto L86
        L78:
            java.lang.String r7 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r10 = r1.getString(r3)     // Catch: java.lang.Throwable -> Lbd
            int r11 = r1.getInt(r4)     // Catch: java.lang.Throwable -> Lbd
            if (r11 == 0) goto L98
        L86:
            int r9 = androidx.room.util.TableInfo.valueOf     // Catch: java.lang.Exception -> L95
            int r9 = r9 + 65
            int r11 = r9 % 128
            androidx.room.util.TableInfo.values = r11     // Catch: java.lang.Exception -> L93
            int r9 = r9 % 2
            r13 = r10
            r14 = 1
            goto L9a
        L93:
            r0 = move-exception
            throw r0
        L95:
            r0 = move-exception
            r1 = r0
            throw r1
        L98:
            r13 = r10
            r14 = 0
        L9a:
            int r15 = r1.getInt(r5)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r16 = r1.getString(r6)     // Catch: java.lang.Throwable -> Lbd
            androidx.room.util.TableInfo$Column r8 = new androidx.room.util.TableInfo$Column     // Catch: java.lang.Throwable -> Lbd
            r17 = 2
            r11 = r8
            r12 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lbd
            r0.put(r7, r8)     // Catch: java.lang.Throwable -> Lbd
            int r7 = androidx.room.util.TableInfo.values
            int r7 = r7 + 109
            int r8 = r7 % 128
            androidx.room.util.TableInfo.valueOf = r8
            int r7 = r7 % 2
            goto L47
        Lb9:
            r1.close()
            return r0
        Lbd:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.readColumns(androidx.sqlite.db.SupportSQLiteDatabase, java.lang.String):java.util.Map");
    }

    private static Set<Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor query = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("origin");
            int columnIndex3 = query.getColumnIndex("unique");
            if (!(columnIndex == -1)) {
                if (!(columnIndex2 == -1)) {
                    int i = values + 77;
                    valueOf = i % 128;
                    int i2 = i % 2;
                    if (columnIndex3 != -1) {
                        HashSet hashSet = new HashSet();
                        while (query.moveToNext()) {
                            if ("c".equals(query.getString(columnIndex2))) {
                                Index readIndex = readIndex(supportSQLiteDatabase, query.getString(columnIndex), query.getInt(columnIndex3) == 1);
                                if ((readIndex == null ? '7' : ';') == '7') {
                                    try {
                                        return null;
                                    } catch (Exception e) {
                                        throw e;
                                    }
                                }
                                hashSet.add(readIndex);
                            }
                        }
                        return hashSet;
                    }
                }
            }
            query.close();
            int i3 = values + 115;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } finally {
            query.close();
        }
    }

    private static Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("PRAGMA index_xinfo(`");
            sb.append(str);
            sb.append("`)");
            Cursor query = supportSQLiteDatabase.query(sb.toString());
            try {
                int columnIndex = query.getColumnIndex("seqno");
                int columnIndex2 = query.getColumnIndex("cid");
                int columnIndex3 = query.getColumnIndex("name");
                if (columnIndex != -1) {
                    if (!(columnIndex2 == -1)) {
                        if (columnIndex3 == -1) {
                            int i = values + 83;
                            valueOf = i % 128;
                            int i2 = i % 2;
                        } else {
                            TreeMap treeMap = new TreeMap();
                            while (true) {
                                if (query.moveToNext()) {
                                    if (query.getInt(columnIndex2) >= 0) {
                                        treeMap.put(Integer.valueOf(query.getInt(columnIndex)), query.getString(columnIndex3));
                                    }
                                } else {
                                    ArrayList arrayList = new ArrayList(treeMap.size());
                                    arrayList.addAll(treeMap.values());
                                    return new Index(str, z, arrayList);
                                }
                            }
                        }
                    }
                }
                query.close();
                int i3 = values + 117;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                return null;
            } finally {
                query.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Column {
        public final int affinity;
        public final String defaultValue;
        private final int mCreatedFrom;
        public final String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final String type;

        @Deprecated
        public Column(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, null, 0);
        }

        public Column(String str, String str2, boolean z, int i, String str3, int i2) {
            this.name = str;
            this.type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.affinity = findAffinity(str2);
            this.defaultValue = str3;
            this.mCreatedFrom = i2;
        }

        private static int findAffinity(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Column) {
                Column column = (Column) obj;
                if (Build.VERSION.SDK_INT >= 20) {
                    if (this.primaryKeyPosition != column.primaryKeyPosition) {
                        return false;
                    }
                } else if (isPrimaryKey() != column.isPrimaryKey()) {
                    return false;
                }
                if (this.name.equals(column.name) && this.notNull == column.notNull) {
                    if (this.mCreatedFrom != 1 || column.mCreatedFrom != 2 || (str3 = this.defaultValue) == null || str3.equals(column.defaultValue)) {
                        if (this.mCreatedFrom != 2 || column.mCreatedFrom != 1 || (str2 = column.defaultValue) == null || str2.equals(this.defaultValue)) {
                            int i = this.mCreatedFrom;
                            return (i == 0 || i != column.mCreatedFrom || ((str = this.defaultValue) == null ? column.defaultValue == null : str.equals(column.defaultValue))) && this.affinity == column.affinity;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode();
            return (((((hashCode * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public String toString() {
            return "Column{name='" + this.name + "', type='" + this.type + "', affinity='" + this.affinity + "', notNull=" + this.notNull + ", primaryKeyPosition=" + this.primaryKeyPosition + ", defaultValue='" + this.defaultValue + "'}";
        }
    }

    /* loaded from: classes6.dex */
    public static final class ForeignKey {
        public final List<String> columnNames;
        public final String onDelete;
        public final String onUpdate;
        public final List<String> referenceColumnNames;
        public final String referenceTable;

        public ForeignKey(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = Collections.unmodifiableList(list);
            this.referenceColumnNames = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ForeignKey) {
                ForeignKey foreignKey = (ForeignKey) obj;
                if (this.referenceTable.equals(foreignKey.referenceTable) && this.onDelete.equals(foreignKey.onDelete) && this.onUpdate.equals(foreignKey.onUpdate) && this.columnNames.equals(foreignKey.columnNames)) {
                    return this.referenceColumnNames.equals(foreignKey.referenceColumnNames);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.referenceTable.hashCode();
            int hashCode2 = this.onDelete.hashCode();
            return (((((((hashCode * 31) + hashCode2) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + "', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        final String mFrom;
        final int mId;
        final int mSequence;
        final String mTo;

        ForeignKeyWithSequence(int i, int i2, String str, String str2) {
            this.mId = i;
            this.mSequence = i2;
            this.mFrom = str;
            this.mTo = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(ForeignKeyWithSequence foreignKeyWithSequence) {
            int i = this.mId - foreignKeyWithSequence.mId;
            return i == 0 ? this.mSequence - foreignKeyWithSequence.mSequence : i;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Index {
        public static final String DEFAULT_PREFIX = "index_";
        public final List<String> columns;
        public final String name;
        public final boolean unique;

        public Index(String str, boolean z, List<String> list) {
            this.name = str;
            this.unique = z;
            this.columns = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Index) {
                Index index = (Index) obj;
                if (this.unique == index.unique && this.columns.equals(index.columns)) {
                    if (this.name.startsWith(DEFAULT_PREFIX)) {
                        return index.name.startsWith(DEFAULT_PREFIX);
                    }
                    return this.name.equals(index.name);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return ((((this.name.startsWith(DEFAULT_PREFIX) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + '}';
        }
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ag$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
