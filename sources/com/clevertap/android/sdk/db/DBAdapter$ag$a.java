package com.clevertap.android.sdk.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import o.setBoundsInScreen;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class DBAdapter$ag$a extends SQLiteOpenHelper {
    private final int ag$a;
    private final File values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DBAdapter$ag$a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
        this.ag$a = 20971520;
        this.values = context.getDatabasePath(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        setBoundsInScreen.values("Creating CleverTap DB");
        str = DBAdapter.valueOf;
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Executing - ");
        str2 = DBAdapter.valueOf;
        sb.append(str2);
        setBoundsInScreen.values(sb.toString());
        compileStatement.execute();
        str3 = DBAdapter.ag$a;
        SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement(str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Executing - ");
        str4 = DBAdapter.ag$a;
        sb2.append(str4);
        setBoundsInScreen.values(sb2.toString());
        compileStatement2.execute();
        str5 = DBAdapter.HaptikSDK$a;
        SQLiteStatement compileStatement3 = sQLiteDatabase.compileStatement(str5);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Executing - ");
        str6 = DBAdapter.HaptikSDK$a;
        sb3.append(str6);
        setBoundsInScreen.values(sb3.toString());
        compileStatement3.execute();
        str7 = DBAdapter.toString;
        SQLiteStatement compileStatement4 = sQLiteDatabase.compileStatement(str7);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Executing - ");
        str8 = DBAdapter.toString;
        sb4.append(str8);
        setBoundsInScreen.values(sb4.toString());
        compileStatement4.execute();
        str9 = DBAdapter.ah$a;
        SQLiteStatement compileStatement5 = sQLiteDatabase.compileStatement(str9);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Executing - ");
        str10 = DBAdapter.ah$a;
        sb5.append(str10);
        setBoundsInScreen.values(sb5.toString());
        compileStatement5.execute();
        str11 = DBAdapter.invoke;
        SQLiteStatement compileStatement6 = sQLiteDatabase.compileStatement(str11);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Executing - ");
        str12 = DBAdapter.invoke;
        sb6.append(str12);
        setBoundsInScreen.values(sb6.toString());
        compileStatement6.execute();
        str13 = DBAdapter.values;
        SQLiteStatement compileStatement7 = sQLiteDatabase.compileStatement(str13);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Executing - ");
        str14 = DBAdapter.values;
        sb7.append(str14);
        setBoundsInScreen.values(sb7.toString());
        compileStatement7.execute();
        str15 = DBAdapter.HaptikSDK$e;
        SQLiteStatement compileStatement8 = sQLiteDatabase.compileStatement(str15);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Executing - ");
        str16 = DBAdapter.HaptikSDK$e;
        sb8.append(str16);
        setBoundsInScreen.values(sb8.toString());
        compileStatement8.execute();
        str17 = DBAdapter.HaptikWebView;
        SQLiteStatement compileStatement9 = sQLiteDatabase.compileStatement(str17);
        StringBuilder sb9 = new StringBuilder();
        sb9.append("Executing - ");
        str18 = DBAdapter.HaptikWebView;
        sb9.append(str18);
        setBoundsInScreen.values(sb9.toString());
        compileStatement9.execute();
        str19 = DBAdapter.aj$a;
        SQLiteStatement compileStatement10 = sQLiteDatabase.compileStatement(str19);
        StringBuilder sb10 = new StringBuilder();
        sb10.append("Executing - ");
        str20 = DBAdapter.aj$a;
        sb10.append(str20);
        setBoundsInScreen.values(sb10.toString());
        compileStatement10.execute();
        str21 = DBAdapter.HaptikSDK$d;
        SQLiteStatement compileStatement11 = sQLiteDatabase.compileStatement(str21);
        StringBuilder sb11 = new StringBuilder();
        sb11.append("Executing - ");
        str22 = DBAdapter.HaptikSDK$d;
        sb11.append(str22);
        setBoundsInScreen.values(sb11.toString());
        compileStatement11.execute();
        str23 = DBAdapter.getInitSettings;
        SQLiteStatement compileStatement12 = sQLiteDatabase.compileStatement(str23);
        StringBuilder sb12 = new StringBuilder();
        sb12.append("Executing - ");
        str24 = DBAdapter.getInitSettings;
        sb12.append(str24);
        setBoundsInScreen.values(sb12.toString());
        compileStatement12.execute();
        str25 = DBAdapter.getSignupData;
        SQLiteStatement compileStatement13 = sQLiteDatabase.compileStatement(str25);
        StringBuilder sb13 = new StringBuilder();
        sb13.append("Executing - ");
        str26 = DBAdapter.getSignupData;
        sb13.append(str26);
        setBoundsInScreen.values(sb13.toString());
        compileStatement13.execute();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        setBoundsInScreen.values("Upgrading CleverTap DB to version " + i2);
        if (i != 1) {
            if (i != 2) {
                return;
            }
            str23 = DBAdapter.HaptikSDK$c;
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(str23);
            StringBuilder sb = new StringBuilder();
            sb.append("Executing - ");
            str24 = DBAdapter.HaptikSDK$c;
            sb.append(str24);
            setBoundsInScreen.values(sb.toString());
            compileStatement.execute();
            str25 = DBAdapter.values;
            SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement(str25);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Executing - ");
            str26 = DBAdapter.values;
            sb2.append(str26);
            setBoundsInScreen.values(sb2.toString());
            compileStatement2.execute();
            str27 = DBAdapter.getSignupData;
            SQLiteStatement compileStatement3 = sQLiteDatabase.compileStatement(str27);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Executing - ");
            str28 = DBAdapter.getSignupData;
            sb3.append(str28);
            setBoundsInScreen.values(sb3.toString());
            compileStatement3.execute();
            return;
        }
        str = DBAdapter.ah$b;
        SQLiteStatement compileStatement4 = sQLiteDatabase.compileStatement(str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Executing - ");
        str2 = DBAdapter.ah$b;
        sb4.append(str2);
        setBoundsInScreen.values(sb4.toString());
        compileStatement4.execute();
        str3 = DBAdapter.HaptikSDK$b;
        SQLiteStatement compileStatement5 = sQLiteDatabase.compileStatement(str3);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Executing - ");
        str4 = DBAdapter.HaptikSDK$b;
        sb5.append(str4);
        setBoundsInScreen.values(sb5.toString());
        compileStatement5.execute();
        str5 = DBAdapter.HaptikSDK$c;
        SQLiteStatement compileStatement6 = sQLiteDatabase.compileStatement(str5);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Executing - ");
        str6 = DBAdapter.HaptikSDK$c;
        sb6.append(str6);
        setBoundsInScreen.values(sb6.toString());
        compileStatement6.execute();
        str7 = DBAdapter.toString;
        SQLiteStatement compileStatement7 = sQLiteDatabase.compileStatement(str7);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Executing - ");
        str8 = DBAdapter.toString;
        sb7.append(str8);
        setBoundsInScreen.values(sb7.toString());
        compileStatement7.execute();
        str9 = DBAdapter.ah$a;
        SQLiteStatement compileStatement8 = sQLiteDatabase.compileStatement(str9);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Executing - ");
        str10 = DBAdapter.ah$a;
        sb8.append(str10);
        setBoundsInScreen.values(sb8.toString());
        compileStatement8.execute();
        str11 = DBAdapter.invoke;
        SQLiteStatement compileStatement9 = sQLiteDatabase.compileStatement(str11);
        StringBuilder sb9 = new StringBuilder();
        sb9.append("Executing - ");
        str12 = DBAdapter.invoke;
        sb9.append(str12);
        setBoundsInScreen.values(sb9.toString());
        compileStatement9.execute();
        str13 = DBAdapter.values;
        SQLiteStatement compileStatement10 = sQLiteDatabase.compileStatement(str13);
        StringBuilder sb10 = new StringBuilder();
        sb10.append("Executing - ");
        str14 = DBAdapter.values;
        sb10.append(str14);
        setBoundsInScreen.values(sb10.toString());
        compileStatement10.execute();
        str15 = DBAdapter.aj$a;
        SQLiteStatement compileStatement11 = sQLiteDatabase.compileStatement(str15);
        StringBuilder sb11 = new StringBuilder();
        sb11.append("Executing - ");
        str16 = DBAdapter.aj$a;
        sb11.append(str16);
        setBoundsInScreen.values(sb11.toString());
        compileStatement11.execute();
        str17 = DBAdapter.HaptikSDK$d;
        SQLiteStatement compileStatement12 = sQLiteDatabase.compileStatement(str17);
        StringBuilder sb12 = new StringBuilder();
        sb12.append("Executing - ");
        str18 = DBAdapter.HaptikSDK$d;
        sb12.append(str18);
        setBoundsInScreen.values(sb12.toString());
        compileStatement12.execute();
        str19 = DBAdapter.getInitSettings;
        SQLiteStatement compileStatement13 = sQLiteDatabase.compileStatement(str19);
        StringBuilder sb13 = new StringBuilder();
        sb13.append("Executing - ");
        str20 = DBAdapter.getInitSettings;
        sb13.append(str20);
        setBoundsInScreen.values(sb13.toString());
        compileStatement13.execute();
        str21 = DBAdapter.getSignupData;
        SQLiteStatement compileStatement14 = sQLiteDatabase.compileStatement(str21);
        StringBuilder sb14 = new StringBuilder();
        sb14.append("Executing - ");
        str22 = DBAdapter.getSignupData;
        sb14.append(str22);
        setBoundsInScreen.values(sb14.toString());
        compileStatement14.execute();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean values() {
        return !this.values.exists() || Math.max(this.values.getUsableSpace(), 20971520L) >= this.values.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        close();
        this.values.delete();
    }
}
