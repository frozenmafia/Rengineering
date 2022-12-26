package com.apxor.androidsdk.plugins.realtimeui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.text.TextUtils;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.plugins.realtimeui.i.g;
import com.facebook.react.uimanager.ViewProps;
import com.sendbird.android.constant.StringSet;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import o.isClosed;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.message.TokenParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class d extends com.apxor.androidsdk.plugins.realtimeui.b {
    private static char[] ah$a = {137, 270, 270, 265, 257, 259, 258};
    private static int toString = 0;
    private static int values = 1;
    private double A;
    private String B;
    private boolean C;
    private boolean D;
    private String E;
    private JSONObject F;
    private JSONObject G;
    private boolean H;
    private long I;
    private String J;
    private String K;
    private String L;
    private String M;
    private String N;
    private String O;
    private f P;
    private f Q;
    private JSONArray R;
    private JSONArray S;
    private JSONArray T;
    private JSONArray U;
    private boolean V;
    private String W;
    private double X;
    private boolean Y;
    private String Z;
    private int a0;
    private ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> b0;
    private ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> c0;
    private boolean d0;
    private String e0;
    private g f0;
    private g g0;
    private boolean h0;
    private String i0;
    private JSONObject j0;
    private g k0;
    private g l0;
    private g m0;
    private g n0;
    private JSONObject o0;
    private boolean p0;
    private String q0;
    private String r0;
    private JSONObject s0;
    private String t;
    private int t0;
    private boolean u;
    private boolean u0;
    private double v;
    private boolean v0;
    private String w;
    private com.apxor.androidsdk.plugins.realtimeui.a w0;
    private int x;
    private double x0;
    private boolean y;
    private final f y0;
    private int z;
    private Rect z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f310b;

        a(String str, File file) {
            this.a = str;
            this.f310b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InputStream openStream = new URL(this.a).openStream();
                Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                if (decodeStream != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f310b);
                    decodeStream.compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    openStream.close();
                    d.a(d.this, true);
                    if (d.a(d.this) != null) {
                        d.a(d.this).a();
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f311b;

        b(String str, File file) {
            this.a = str;
            this.f311b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InputStream openStream = new URL(this.a).openStream();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(openStream);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = bufferedInputStream.read();
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(read);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(this.f311b);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
                openStream.close();
                d.a(d.this, true);
                if (d.a(d.this) != null) {
                    d.a(d.this).a();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class c implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f312b;

        c(String str, File file) {
            this.a = str;
            this.f312b = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InputStream openStream = new URL(this.a).openStream();
                Bitmap decodeStream = BitmapFactory.decodeStream(openStream);
                if (decodeStream != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f312b);
                    decodeStream.compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    openStream.close();
                    d.a(d.this, true);
                    if (d.a(d.this) != null) {
                        d.a(d.this).a();
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public d() {
        try {
            this.w = "#a0a0a0";
            try {
                this.x = 0;
                this.z = 400;
                this.A = 1.0d;
                this.B = "";
                this.D = false;
                this.P = new f();
                this.Q = new f();
                this.R = new JSONArray();
                this.S = new JSONArray();
                this.T = new JSONArray();
                this.U = new JSONArray();
                this.u0 = false;
                this.v0 = false;
                this.w0 = null;
                this.y0 = new f();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ com.apxor.androidsdk.plugins.realtimeui.a a(d dVar) {
        int i = toString + 69;
        values = i % 128;
        int i2 = i % 2;
        try {
            com.apxor.androidsdk.plugins.realtimeui.a aVar = dVar.w0;
            int i3 = toString + 71;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                super.hashCode();
                return aVar;
            }
            return aVar;
        } catch (Exception e) {
            throw e;
        }
    }

    private ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> a(JSONArray jSONArray, boolean z) {
        int i = toString + 115;
        values = i % 128;
        int i2 = i % 2;
        if (jSONArray == null) {
            return null;
        }
        try {
            int length = jSONArray.length();
            int i3 = 0;
            if ((!z ? '_' : (char) 2) != 2) {
                if (!(length <= 2)) {
                    length = 2;
                }
            }
            ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> arrayList = new ArrayList<>();
            while (i3 < length) {
                com.apxor.androidsdk.plugins.realtimeui.i.e aVar = z ? new com.apxor.androidsdk.plugins.realtimeui.i.a() : new com.apxor.androidsdk.plugins.realtimeui.i.e();
                aVar.a(jSONArray.getJSONObject(i3));
                arrayList.add(aVar);
                i3++;
                int i4 = toString + 113;
                values = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = values + 29;
            toString = i6 % 128;
            int i7 = i6 % 2;
            return arrayList;
        } catch (Exception e) {
            throw e;
        }
    }

    private void a(String str, String str2) {
        Thread thread;
        int i = toString + 25;
        values = i % 128;
        int i2 = i % 2;
        if (!str.isEmpty()) {
            this.u0 = true;
            String str3 = SDKController.getInstance().getFilesDirPath() + "apx_sgr_" + o();
            if (str2.equals("image")) {
                File file = new File(str3 + ".png");
                if (file.exists()) {
                    this.v0 = true;
                    this.u0 = true;
                } else {
                    thread = new Thread(new a(str, file));
                    thread.start();
                }
            } else if (str2.equals("gif")) {
                File file2 = new File(str3 + ".gif");
                if (file2.exists()) {
                    this.u0 = false;
                } else {
                    thread = new Thread(new b(str, file2));
                    thread.start();
                }
            }
        }
        int i3 = values + 81;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        int i4 = 47 / 0;
    }

    private void a(JSONObject jSONObject) {
        try {
            int i = toString + 7;
            values = i % 128;
            char c2 = i % 2 == 0 ? 'A' : '\"';
            JSONObject jSONObject2 = jSONObject.getJSONObject("animation");
            if (c2 == 'A') {
                int length = jSONObject2.length();
                Object obj = null;
                super.hashCode();
                if ((length > 0 ? (char) 1 : (char) 30) == 30) {
                    return;
                }
            } else if (jSONObject2.length() <= 0) {
                return;
            }
            this.y = jSONObject2.getBoolean(ViewProps.ENABLED);
            this.t = jSONObject2.getString("type");
            this.z = jSONObject2.getInt("duration");
            int i2 = values + 57;
            toString = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ boolean a(d dVar, boolean z) {
        int i = toString + 95;
        values = i % 128;
        int i2 = i % 2;
        dVar.v0 = z;
        int i3 = toString + 7;
        values = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
            return z;
        }
        return z;
    }

    private boolean b(JSONObject jSONObject) {
        int i = toString + 97;
        values = i % 128;
        char c2 = i % 2 == 0 ? '(' : (char) 5;
        JSONObject optJSONObject = jSONObject.optJSONObject("border");
        if (c2 != 5) {
            Object obj = null;
            super.hashCode();
            if (optJSONObject == null) {
                return true;
            }
        } else if (optJSONObject == null) {
            return true;
        }
        String string = optJSONObject.getString("color");
        this.w = string;
        if ((!TextUtils.isEmpty(string) ? (char) 30 : '7') != 30) {
            return false;
        }
        try {
            int i2 = toString + 13;
            values = i2 % 128;
            if ((i2 % 2 == 0 ? '7' : '5') != '7') {
                if (this.w.length() < 7) {
                    return false;
                }
            } else if (this.w.length() < 103) {
                return false;
            }
            this.x = optJSONObject.getInt("width");
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    private void c(JSONObject jSONObject) {
        int i = toString + 69;
        values = i % 128;
        if ((i % 2 == 0 ? Soundex.SILENT_MARKER : '_') == '_') {
            this.L = jSONObject.optString("button_position", "right");
            this.b0 = a(jSONObject.optJSONArray("buttons_config"), false);
            this.c0 = a(jSONObject.optJSONArray("action_buttons_config"), true);
            return;
        }
        try {
            this.L = jSONObject.optString("button_position", "right");
            this.b0 = a(jSONObject.optJSONArray("buttons_config"), false);
            this.c0 = a(jSONObject.optJSONArray("action_buttons_config"), false);
        } catch (Exception e) {
            throw e;
        }
    }

    private boolean d(JSONObject jSONObject) {
        if (this.f305b.equals("inline")) {
            return true;
        }
        int i = toString + 87;
        values = i % 128;
        int i2 = i % 2;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("coach_mark_details");
            this.B = jSONObject2.getString("type");
            this.a = jSONObject2.getBoolean("has_ripple");
            boolean z = jSONObject2.getBoolean("has_arrow");
            this.Y = z;
            if ((z ? 'b' : 'G') != 'G') {
                int i3 = toString + 37;
                values = i3 % 128;
                int i4 = i3 % 2;
                String string = jSONObject2.getString("arrow_color");
                this.Z = string;
                if ((!TextUtils.isEmpty(string) ? '1' : '_') == '_' || this.Z.length() < 7) {
                    return false;
                }
                this.a0 = jSONObject2.getInt("arrow_stroke_width");
                return true;
            }
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    private void e(JSONObject jSONObject) {
        String str;
        int i = toString + 125;
        values = i % 128;
        int i2 = i % 2;
        this.D = jSONObject.optBoolean("localization_enabled");
        String optString = jSONObject.optString("language_attribute");
        this.E = optString;
        if (optString.isEmpty()) {
            str = null;
        } else {
            str = this.E;
            int i3 = toString + 113;
            values = i3 % 128;
            int i4 = i3 % 2;
        }
        try {
            this.E = str;
            try {
                this.H = jSONObject.optBoolean("dismiss_outside_touch", true);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("corners");
            if (jSONObject2.length() <= 0) {
                return;
            }
            int i = values + 45;
            toString = i % 128;
            if (i % 2 != 0) {
                this.u = jSONObject2.getBoolean(ViewProps.ENABLED);
                this.v = jSONObject2.getDouble("width");
                int i2 = 69 / 0;
            } else {
                this.u = jSONObject2.getBoolean(ViewProps.ENABLED);
                this.v = jSONObject2.getDouble("width");
            }
            int i3 = toString + 79;
            values = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private boolean g(JSONObject jSONObject) {
        this.V = jSONObject.optBoolean("dim_background", false);
        this.W = jSONObject.optString("dim_background_color", "#5c5c5c");
        this.X = jSONObject.optDouble("dim_background_opacity", 0.9d);
        this.q0 = jSONObject.optString("dim_view");
        this.r0 = jSONObject.optString("dim_search_type");
        if (!TextUtils.isEmpty(this.W)) {
            if ((this.W.length() < 7 ? ':' : (char) 20) == ':') {
                int i = values + 125;
                toString = i % 128;
                if ((i % 2 != 0 ? ';' : 'D') != ';') {
                    return false;
                }
                Object obj = null;
                super.hashCode();
                return false;
            }
        }
        int i2 = values + 11;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    private void h(JSONObject jSONObject) {
        int i = toString + 63;
        values = i % 128;
        try {
            if ((i % 2 == 0 ? '<' : 'I') != '<') {
                this.y0.a(jSONObject.optJSONObject("d_pad"));
            } else {
                this.y0.a(jSONObject.optJSONObject("d_pad"));
                int i2 = 75 / 0;
            }
        } catch (JSONException unused) {
        }
        int i3 = toString + 71;
        values = i3 % 128;
        int i4 = i3 % 2;
    }

    private void i(JSONObject jSONObject) {
        if ((jSONObject.has("carousal") ? (char) 26 : '?') != 26) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("carousal");
        this.s0 = jSONObject2;
        if ((jSONObject2.length() > 0 ? (char) 2 : '/') != '/') {
            int i = values + 37;
            toString = i % 128;
            int i2 = i % 2;
            if ((this.s0.has("i_url") ? '$' : '+') != '$') {
                return;
            }
            try {
                try {
                    String trim = this.s0.optString("i_url").trim();
                    if (trim.isEmpty()) {
                        this.u0 = false;
                        return;
                    }
                    this.u0 = true;
                    File file = new File(SDKController.getInstance().getFilesDirPath() + ("apx_onboarding_" + o() + "_img_" + this.t0 + ".png"));
                    if (file.exists()) {
                        this.v0 = true;
                        this.u0 = true;
                        return;
                    }
                    new Thread(new c(trim, file)).start();
                    int i3 = values + 103;
                    toString = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private void j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("skip");
        if (optJSONObject != null) {
            g gVar = new g();
            this.k0 = gVar;
            gVar.a(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("prev");
        if (optJSONObject2 != null) {
            g gVar2 = new g();
            this.l0 = gVar2;
            gVar2.a(optJSONObject2);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject(StringSet.next);
        if (optJSONObject3 != null) {
            g gVar3 = new g();
            try {
                this.m0 = gVar3;
                gVar3.a(optJSONObject3);
                try {
                    int i = toString + 79;
                    values = i % 128;
                    int i2 = i % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("counter");
        if (optJSONObject4 != null) {
            g gVar4 = new g();
            this.n0 = gVar4;
            gVar4.a(optJSONObject4);
        }
        this.j0 = jSONObject;
        this.t = jSONObject.optString("anim_type", "tran");
        this.z = jSONObject.optInt("duration", 300);
        this.x0 = jSONObject.optDouble("f_alpha", 0.8500000238418579d);
        int i3 = toString + 7;
        values = i3 % 128;
        int i4 = i3 % 2;
    }

    private boolean k(JSONObject jSONObject) {
        int i = toString + 21;
        values = i % 128;
        int i2 = i % 2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("text_config");
        if ((jSONObject2.length() > 0 ? (char) 1 : '.') == 1) {
            try {
                if (this.D) {
                    this.G = jSONObject2.optJSONObject("localized_messages");
                }
                g gVar = new g();
                try {
                    this.g0 = gVar;
                    gVar.a(jSONObject2);
                    this.P.a(jSONObject2.optJSONObject("margin_config"));
                    this.Q.a(jSONObject2.optJSONObject("padding_config"));
                    this.T = jSONObject2.optJSONArray("margins");
                    this.U = jSONObject2.optJSONArray("paddings");
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (!this.f305b.equals("inline")) {
            int i3 = toString + 79;
            values = i3 % 128;
            int i4 = i3 % 2;
            boolean z = false;
            if (jSONObject2.length() <= 0) {
                int i5 = toString + 55;
                values = i5 % 128;
                int i6 = i5 % 2;
            } else {
                z = true;
            }
            this.C = z;
        }
        return true;
    }

    private boolean l(JSONObject jSONObject) {
        int i = values + 53;
        toString = i % 128;
        int i2 = i % 2;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("title_config");
            if (optJSONObject != null) {
                if (optJSONObject.length() > 0) {
                    int i3 = toString + 59;
                    values = i3 % 128;
                    int i4 = i3 % 2;
                    if ((this.D ? '.' : '\f') == '.') {
                        try {
                            this.F = optJSONObject.optJSONObject("localized_messages");
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    g gVar = new g();
                    this.f0 = gVar;
                    gVar.a(optJSONObject);
                    this.P.a(optJSONObject.optJSONObject("margin_config"));
                    this.Q.a(optJSONObject.optJSONObject("padding_config"));
                    this.R = optJSONObject.optJSONArray("margins");
                    this.S = optJSONObject.optJSONArray("paddings");
                }
            }
            int i5 = values + 13;
            toString = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return true;
            }
            return true;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String A() {
        int i = values + 115;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.w;
        int i3 = values + 3;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public String A0() {
        int i = values + 11;
        toString = i % 128;
        if ((i % 2 != 0 ? 'b' : '^') == '^') {
            try {
                return this.i0;
            } catch (Exception e) {
                throw e;
            }
        }
        String str = this.i0;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public int B() {
        int i = values + 119;
        toString = i % 128;
        int i2 = i % 2;
        int i3 = this.x;
        int i4 = toString + 5;
        values = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public boolean B0() {
        int i = toString + 37;
        values = i % 128;
        int i2 = i % 2;
        boolean z = this.u0;
        int i3 = values + 97;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    public String C() {
        try {
            int i = values + 103;
            toString = i % 128;
            if ((i % 2 != 0 ? TokenParser.CR : '\'') != '\'') {
                String str = this.L;
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return this.L;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean C0() {
        boolean z;
        int i;
        try {
            int i2 = values + 97;
            toString = i2 % 128;
            int i3 = i2 % 2;
            if ((this.g0 != null ? ']' : 'Z') != ']') {
                z = false;
                i = values + 19;
            } else {
                z = true;
                i = values + 5;
            }
            toString = i % 128;
            int i4 = i % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
        r0 = new java.util.ArrayList<>();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> D() {
        /*
            r3 = this;
            int r0 = com.apxor.androidsdk.plugins.realtimeui.d.toString     // Catch: java.lang.Exception -> L32
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r1     // Catch: java.lang.Exception -> L32
            int r0 = r0 % 2
            r1 = 53
            if (r0 != 0) goto L11
            r0 = 51
            goto L13
        L11:
            r0 = 53
        L13:
            if (r0 == r1) goto L1e
            java.util.ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> r0 = r3.b0
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L27
            goto L22
        L1c:
            r0 = move-exception
            throw r0
        L1e:
            java.util.ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> r0 = r3.b0
            if (r0 != 0) goto L27
        L22:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L27:
            int r1 = com.apxor.androidsdk.plugins.realtimeui.d.values
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.toString = r2
            int r1 = r1 % 2
            return r0
        L32:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.d.D():java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if ((r4.f0 == null) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
        if ((r0 != null) != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
        r0 = com.apxor.androidsdk.plugins.realtimeui.d.toString + 111;
        com.apxor.androidsdk.plugins.realtimeui.d.values = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D0() {
        /*
            r4 = this;
            int r0 = com.apxor.androidsdk.plugins.realtimeui.d.toString     // Catch: java.lang.Exception -> L37
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r1     // Catch: java.lang.Exception -> L37
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L1d
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r4.f0
            if (r0 == 0) goto L19
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == r2) goto L28
            goto L33
        L1d:
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r4.f0
            r3 = 0
            int r3 = r3.length     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == r2) goto L33
        L28:
            int r0 = com.apxor.androidsdk.plugins.realtimeui.d.toString
            int r0 = r0 + 111
            int r2 = r0 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r2
            int r0 = r0 % 2
            goto L34
        L33:
            r1 = 1
        L34:
            return r1
        L35:
            r0 = move-exception
            throw r0
        L37:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.d.D0():boolean");
    }

    public JSONObject E() {
        JSONObject jSONObject;
        int i = toString + 47;
        values = i % 128;
        if ((i % 2 == 0 ? (char) 30 : '!') != '!') {
            jSONObject = this.s0;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            jSONObject = this.s0;
        }
        try {
            int i2 = toString + 85;
            values = i2 % 128;
            int i3 = i2 % 2;
            return jSONObject;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean E0() {
        int i = toString + 55;
        values = i % 128;
        int i2 = i % 2;
        boolean z = this.y;
        int i3 = values + 97;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    public String F() {
        int i = toString + 9;
        values = i % 128;
        int i2 = i % 2;
        try {
            String str = this.B;
            int i3 = values + 17;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean F0() {
        int i = toString + 27;
        values = i % 128;
        if ((i % 2 == 0 ? 'J' : 'Y') == 'Y') {
            try {
                return this.V;
            } catch (Exception e) {
                throw e;
            }
        }
        boolean z = this.V;
        Object obj = null;
        super.hashCode();
        return z;
    }

    public double G() {
        int i = values + 35;
        toString = i % 128;
        int i2 = i % 2;
        try {
            double d = this.v;
            int i3 = toString + 81;
            values = i3 % 128;
            int i4 = i3 % 2;
            return d;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G0() {
        /*
            r5 = this;
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r5.g0     // Catch: java.lang.Exception -> L3c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            int r3 = com.apxor.androidsdk.plugins.realtimeui.d.values
            int r3 = r3 + 61
            int r4 = r3 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.toString = r4
            int r3 = r3 % 2
            boolean r0 = r0.q()
            r3 = 20
            if (r0 == 0) goto L1b
            r0 = 20
            goto L1c
        L1b:
            r0 = 7
        L1c:
            if (r0 == r3) goto L1f
            goto L21
        L1f:
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            int r3 = com.apxor.androidsdk.plugins.realtimeui.d.toString
            int r3 = r3 + 109
            int r4 = r3 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r4
            int r3 = r3 % 2
            r4 = 18
            if (r3 != 0) goto L33
            r3 = 59
            goto L35
        L33:
            r3 = 18
        L35:
            if (r3 == r4) goto L3b
            int r1 = r1 / r2
            return r0
        L39:
            r0 = move-exception
            throw r0
        L3b:
            return r0
        L3c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.d.G0():boolean");
    }

    public g H() {
        int i = values + 25;
        toString = i % 128;
        int i2 = i % 2;
        g gVar = this.n0;
        try {
            int i3 = values + 25;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return gVar;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean H0() {
        try {
            g gVar = this.f0;
            if ((gVar != null ? '#' : (char) 18) != 18) {
                int i = values + 101;
                toString = i % 128;
                int i2 = i % 2;
                if (gVar.q()) {
                    int i3 = values + 21;
                    toString = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = toString + 105;
                    values = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw e;
        }
    }

    public String I() {
        String str;
        try {
            int i = values + 101;
            toString = i % 128;
            if ((i % 2 != 0 ? 'I' : (char) 31) != 'I') {
                str = this.e0;
            } else {
                try {
                    str = this.e0;
                    Object obj = null;
                    super.hashCode();
                } catch (Exception e) {
                    throw e;
                }
            }
            int i2 = toString + 89;
            values = i2 % 128;
            if (!(i2 % 2 == 0)) {
                return str;
            }
            int i3 = 59 / 0;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean I0() {
        try {
            int i = values + 121;
            try {
                toString = i % 128;
                int i2 = i % 2;
                boolean z = this.v0;
                int i3 = values + 67;
                toString = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public JSONArray J() {
        int i = values + 93;
        toString = i % 128;
        if ((i % 2 != 0 ? '%' : '(') != '%') {
            return this.T;
        }
        int i2 = 24 / 0;
        return this.T;
    }

    public boolean J0() {
        boolean z;
        try {
            int i = values + 11;
            toString = i % 128;
            Object[] objArr = null;
            if (!(i % 2 == 0)) {
                z = this.h0;
                int length = objArr.length;
            } else {
                z = this.h0;
            }
            try {
                int i2 = toString + 5;
                values = i2 % 128;
                if (i2 % 2 == 0) {
                    int length2 = objArr.length;
                    return z;
                }
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public JSONArray K() {
        int i = toString + 79;
        values = i % 128;
        if ((i % 2 == 0 ? (char) 20 : '6') != 20) {
            return this.U;
        }
        JSONArray jSONArray = this.U;
        Object obj = null;
        super.hashCode();
        return jSONArray;
    }

    public boolean K0() {
        try {
            int i = toString + 37;
            values = i % 128;
            int i2 = i % 2;
            boolean z = this.p0;
            int i3 = values + 107;
            toString = i3 % 128;
            if ((i3 % 2 != 0 ? '/' : ';') != ';') {
                int i4 = 34 / 0;
                return z;
            }
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public String L() {
        int i = toString + 41;
        values = i % 128;
        int i2 = i % 2;
        String str = this.W;
        int i3 = toString + 27;
        values = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
        if ((r0 != null) != true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
        if (r0.r() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        r0 = r5.m0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0036, code lost:
        r1 = com.apxor.androidsdk.plugins.realtimeui.d.values + 63;
        com.apxor.androidsdk.plugins.realtimeui.d.toString = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
        if (r0.r() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
        r0 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
        r0 = 'P';
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
        if (r0 == 'P') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        r0 = r5.n0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
        if (r0.r() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
        r1 = com.apxor.androidsdk.plugins.realtimeui.d.toString + 73;
        com.apxor.androidsdk.plugins.realtimeui.d.values = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
        if ((r1 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0068, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
        r1 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0073, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean L0() {
        /*
            r5 = this;
            int r0 = com.apxor.androidsdk.plugins.realtimeui.d.toString     // Catch: java.lang.Exception -> L76
            int r0 = r0 + 3
            int r1 = r0 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r1     // Catch: java.lang.Exception -> L76
            int r0 = r0 % 2
            r1 = 42
            if (r0 != 0) goto L11
            r0 = 42
            goto L13
        L11:
            r0 = 81
        L13:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L21
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r5.l0
            if (r0 == 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == r2) goto L27
            goto L32
        L21:
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r5.l0
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L32
        L27:
            boolean r0 = r0.r()     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L2f
            r0 = 1
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L59
        L32:
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r5.m0
            if (r0 == 0) goto L4f
            int r1 = com.apxor.androidsdk.plugins.realtimeui.d.values
            int r1 = r1 + 63
            int r4 = r1 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.toString = r4
            int r1 = r1 % 2
            boolean r0 = r0.r()
            r1 = 80
            if (r0 != 0) goto L4b
            r0 = 21
            goto L4d
        L4b:
            r0 = 80
        L4d:
            if (r0 == r1) goto L59
        L4f:
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r5.n0
            if (r0 == 0) goto L5b
            boolean r0 = r0.r()
            if (r0 == 0) goto L5b
        L59:
            r0 = 1
            goto L5c
        L5b:
            r0 = 0
        L5c:
            int r1 = com.apxor.androidsdk.plugins.realtimeui.d.toString     // Catch: java.lang.Exception -> L72
            int r1 = r1 + 73
            int r4 = r1 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r4     // Catch: java.lang.Exception -> L72
            int r1 = r1 % 2
            if (r1 != 0) goto L69
            r2 = 0
        L69:
            if (r2 == 0) goto L6c
            return r0
        L6c:
            r1 = 59
            int r1 = r1 / r3
            return r0
        L70:
            r0 = move-exception
            throw r0
        L72:
            r0 = move-exception
            throw r0
        L74:
            r0 = move-exception
            throw r0
        L76:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.d.L0():boolean");
    }

    public double M() {
        double d;
        try {
            int i = toString + 1;
            values = i % 128;
            if ((i % 2 == 0 ? '8' : 'W') != '8') {
                d = this.X;
            } else {
                d = this.X;
                Object[] objArr = null;
                int length = objArr.length;
            }
            int i2 = values + 107;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return d;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean M0() {
        int i = values + 37;
        toString = i % 128;
        int i2 = i % 2;
        try {
            boolean z = this.u;
            int i3 = toString + 7;
            values = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public String N() {
        try {
            int i = toString + 17;
            try {
                values = i % 128;
                int i2 = i % 2;
                String str = this.r0;
                int i3 = toString + 35;
                values = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean N0() {
        int i = toString + 13;
        values = i % 128;
        int i2 = i % 2;
        boolean p = this.g0.p();
        try {
            int i3 = toString + 69;
            try {
                values = i3 % 128;
                if ((i3 % 2 == 0 ? (char) 21 : 'c') != 'c') {
                    Object obj = null;
                    super.hashCode();
                    return p;
                }
                return p;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String O() {
        int i = toString + 123;
        values = i % 128;
        int i2 = i % 2;
        String str = this.q0;
        try {
            int i3 = toString + 95;
            values = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean O0() {
        int i = toString + 77;
        values = i % 128;
        if ((i % 2 == 0 ? 'b' : '_') == 'b') {
            int i2 = 36 / 0;
            return this.f0.p();
        }
        try {
            return this.f0.p();
        } catch (Exception e) {
            throw e;
        }
    }

    public f P() {
        int i = values + 97;
        toString = i % 128;
        if (!(i % 2 != 0)) {
            return this.y0;
        }
        int i2 = 2 / 0;
        return this.y0;
    }

    public boolean P0() {
        boolean z;
        int i = toString + 111;
        values = i % 128;
        if (i % 2 != 0) {
            z = this.d0;
        } else {
            z = this.d0;
            int i2 = 82 / 0;
        }
        int i3 = toString + 35;
        values = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    public boolean Q() {
        int i = values + 109;
        toString = i % 128;
        if ((i % 2 != 0 ? (char) 17 : (char) 26) != 17) {
            try {
                return this.H;
            } catch (Exception e) {
                throw e;
            }
        }
        boolean z = this.H;
        Object[] objArr = null;
        int length = objArr.length;
        return z;
    }

    public void Q0() {
        int i = values + 1;
        toString = i % 128;
        if (!(i % 2 == 0)) {
            this.d0 = false;
            return;
        }
        try {
            this.d0 = true;
        } catch (Exception e) {
            throw e;
        }
    }

    public double R() {
        int i = toString + 115;
        values = i % 128;
        int i2 = i % 2;
        double d = this.x0;
        try {
            int i3 = values + 71;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return d;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean S() {
        boolean z;
        int i = toString + 3;
        values = i % 128;
        if ((i % 2 == 0 ? '\f' : (char) 18) != 18) {
            z = this.Y;
            Object obj = null;
            super.hashCode();
        } else {
            try {
                z = this.Y;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = toString + 49;
        values = i2 % 128;
        int i3 = i2 % 2;
        return z;
    }

    public boolean T() {
        try {
            int i = toString + 105;
            values = i % 128;
            if ((i % 2 == 0 ? TokenParser.ESCAPE : (char) 28) == 28) {
                try {
                    return this.C;
                } catch (Exception e) {
                    throw e;
                }
            }
            boolean z = this.C;
            Object[] objArr = null;
            int length = objArr.length;
            return z;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String U() {
        int i = values + 109;
        toString = i % 128;
        if ((i % 2 != 0 ? '1' : 'K') != '1') {
            return this.K;
        }
        String str = this.K;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public String V() {
        int i = values + 91;
        toString = i % 128;
        if ((i % 2 != 0 ? '[' : Soundex.SILENT_MARKER) != '[') {
            try {
                return this.N;
            } catch (Exception e) {
                throw e;
            }
        }
        String str = this.N;
        Object obj = null;
        super.hashCode();
        return str;
    }

    public int W() {
        int i = values + 103;
        toString = i % 128;
        int i2 = i % 2;
        int i3 = this.t0;
        int i4 = values + 69;
        toString = i4 % 128;
        if ((i4 % 2 != 0 ? 'B' : 'W') != 'W') {
            int i5 = 90 / 0;
            return i3;
        }
        return i3;
    }

    public float X() {
        int i = toString + 85;
        values = i % 128;
        int i2 = i % 2;
        try {
            JSONObject jSONObject = this.j0;
            if ((jSONObject == null ? 'P' : '^') != 'P') {
                float optDouble = (float) jSONObject.optDouble("rx", 7.199999809265137d);
                int i3 = values + 43;
                toString = i3 % 128;
                if ((i3 % 2 != 0 ? 'Z' : '.') != '.') {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return optDouble;
                }
                return optDouble;
            }
            return 7.2f;
        } catch (Exception e) {
            throw e;
        }
    }

    public float Y() {
        int i = toString + 1;
        values = i % 128;
        int i2 = i % 2;
        JSONObject jSONObject = this.j0;
        if ((jSONObject == null ? (char) 22 : (char) 21) != 22) {
            return (float) jSONObject.optDouble("ry", 7.199999809265137d);
        }
        int i3 = values + 67;
        toString = i3 % 128;
        int i4 = i3 % 2;
        int i5 = values + 57;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return 7.2f;
    }

    public String Z() {
        int i = values + 27;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.J;
        try {
            int i3 = values + 55;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void a(long j) {
        int i = toString + 111;
        values = i % 128;
        if ((i % 2 == 0 ? '<' : TokenParser.SP) != '<') {
            this.I = j;
            return;
        }
        try {
            this.I = j;
            Object obj = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    public void a(Rect rect) {
        int i = toString + 31;
        values = i % 128;
        int i2 = i % 2;
        this.z0 = rect;
        int i3 = values + 125;
        toString = i3 % 128;
        if ((i3 % 2 != 0 ? '1' : 'P') != 'P') {
            Object obj = null;
            super.hashCode();
        }
    }

    public void a(com.apxor.androidsdk.plugins.realtimeui.a aVar) {
        int i = toString + 25;
        values = i % 128;
        int i2 = i % 2;
        this.w0 = aVar;
        int i3 = values + 93;
        toString = i3 % 128;
        if ((i3 % 2 != 0 ? (char) 22 : '@') != 22) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        int i = values + 19;
        toString = i % 128;
        int i2 = i % 2;
        this.h0 = z;
        try {
            int i3 = values + 15;
            try {
                toString = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r2 != (-1091287984)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r2 != (-1091287984)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r10.equals("overlay") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
        r10 = '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r10 = 'U';
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r10 == 'U') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f0, code lost:
        if ((!g(r9)) != true) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0102, code lost:
        if ((!g(r9) ? 24 : '%') != '%') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0104, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0105, code lost:
        e(r9);
        r8.K = r9.optString("image");
        h(r9);
        f(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0118, code lost:
        if (b(r9) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011f, code lost:
        if (l(r9) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0121, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0126, code lost:
        if (k(r9) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0128, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012b, code lost:
        if (r10 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0131, code lost:
        if (d(r9) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0133, code lost:
        r9 = com.apxor.androidsdk.plugins.realtimeui.d.toString + 51;
        com.apxor.androidsdk.plugins.realtimeui.d.values = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013c, code lost:
        c(r9);
        j(r9);
        a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0147, code lost:
        return false;
     */
    @Override // com.apxor.androidsdk.plugins.realtimeui.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(org.json.JSONObject r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.d.a(org.json.JSONObject, java.lang.String, java.lang.String):boolean");
    }

    public f a0() {
        int i = toString + 115;
        values = i % 128;
        if ((i % 2 == 0 ? '9' : (char) 11) != '9') {
            return this.P;
        }
        f fVar = this.P;
        Object obj = null;
        super.hashCode();
        return fVar;
    }

    public void b(int i) {
        int i2 = values + 79;
        toString = i2 % 128;
        char c2 = i2 % 2 != 0 ? 'Q' : (char) 19;
        this.t0 = i;
        if (c2 != 19) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        int i = toString + 39;
        values = i % 128;
        try {
            if (!(i % 2 == 0)) {
                this.i0 = str;
                return;
            }
            this.i0 = str;
            Object obj = null;
            super.hashCode();
        } catch (Exception e) {
            throw e;
        }
    }

    public void b(boolean z) {
        int i = toString + 5;
        values = i % 128;
        int i2 = i % 2;
        this.p0 = z;
        int i3 = values + 31;
        toString = i3 % 128;
        if ((i3 % 2 != 0 ? '\b' : TokenParser.SP) != ' ') {
            int i4 = 48 / 0;
        }
    }

    public String b0() {
        String n;
        int i = toString + 71;
        values = i % 128;
        if ((i % 2 == 0 ? 'R' : ')') != 'R') {
            n = this.g0.n();
            if (!this.D) {
                return n;
            }
        } else {
            n = this.g0.n();
            boolean z = this.D;
            Object obj = null;
            super.hashCode();
            if (!z) {
                return n;
            }
        }
        try {
            if (this.E != null) {
                int i2 = toString + 33;
                values = i2 % 128;
                int i3 = i2 % 2;
                if (this.G != null) {
                    try {
                        return this.G.getString(SDKController.getInstance().getUserAttributes().getString(this.E));
                    } catch (JSONException e) {
                        SDKController.getInstance().logException("uic_g_msg", e);
                        return n;
                    }
                }
                return n;
            }
            return n;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public long c0() {
        int i = toString + 7;
        values = i % 128;
        int i2 = i % 2;
        long j = this.I;
        int i3 = values + 57;
        toString = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object obj = null;
            super.hashCode();
            return j;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        if ((r6.D ? 'M' : 24) != 'M') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        if ((r2 != null ? 30 : '!') != 30) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
        if (r6.E != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6.D != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String d0() {
        /*
            r6 = this;
            int r0 = com.apxor.androidsdk.plugins.realtimeui.d.toString
            int r0 = r0 + 65
            int r1 = r0 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L22
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r6.f0     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r0.n()     // Catch: java.lang.Exception -> L1d
            boolean r2 = r6.D     // Catch: java.lang.Exception -> L20
            r3 = 29
            int r3 = r3 / r1
            if (r2 == 0) goto Lb8
            goto L37
        L1b:
            r0 = move-exception
            throw r0
        L1d:
            r0 = move-exception
            goto Lad
        L20:
            r0 = move-exception
            throw r0
        L22:
            com.apxor.androidsdk.plugins.realtimeui.i.g r0 = r6.f0
            java.lang.String r0 = r0.n()
            boolean r2 = r6.D
            r3 = 77
            if (r2 == 0) goto L31
            r2 = 77
            goto L33
        L31:
            r2 = 24
        L33:
            if (r2 == r3) goto L37
            goto Lb8
        L37:
            int r2 = com.apxor.androidsdk.plugins.realtimeui.d.values
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.toString = r3
            int r2 = r2 % 2
            r3 = 1
            if (r2 == 0) goto L46
            r2 = 1
            goto L47
        L46:
            r2 = 0
        L47:
            r4 = 0
            if (r2 == 0) goto L5d
            java.lang.String r2 = r6.E
            super.hashCode()     // Catch: java.lang.Throwable -> L5b
            r5 = 30
            if (r2 == 0) goto L56
            r2 = 30
            goto L58
        L56:
            r2 = 33
        L58:
            if (r2 == r5) goto L61
            goto Lb8
        L5b:
            r0 = move-exception
            throw r0
        L5d:
            java.lang.String r2 = r6.E
            if (r2 == 0) goto Lb8
        L61:
            org.json.JSONObject r2 = r6.F
            if (r2 == 0) goto L66
            goto L67
        L66:
            r1 = 1
        L67:
            if (r1 == r3) goto Lb8
            int r1 = com.apxor.androidsdk.plugins.realtimeui.d.toString
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L8e
            com.apxor.androidsdk.core.SDKController r1 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: org.json.JSONException -> Lae
            org.json.JSONObject r1 = r1.getUserAttributes()     // Catch: org.json.JSONException -> Lae
            java.lang.String r2 = r6.E     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> Lae
            org.json.JSONObject r2 = r6.F     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = r2.getString(r1)     // Catch: org.json.JSONException -> Lae
            int r0 = r4.length     // Catch: java.lang.Throwable -> L8c org.json.JSONException -> Lae
            r0 = r1
            goto La2
        L8c:
            r0 = move-exception
            throw r0
        L8e:
            com.apxor.androidsdk.core.SDKController r1 = com.apxor.androidsdk.core.SDKController.getInstance()     // Catch: org.json.JSONException -> Lae
            org.json.JSONObject r1 = r1.getUserAttributes()     // Catch: org.json.JSONException -> Lae
            java.lang.String r2 = r6.E     // Catch: org.json.JSONException -> Lae
            java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> Lae
            org.json.JSONObject r2 = r6.F     // Catch: org.json.JSONException -> Lae
            java.lang.String r0 = r2.getString(r1)     // Catch: org.json.JSONException -> Lae
        La2:
            int r1 = com.apxor.androidsdk.plugins.realtimeui.d.toString     // Catch: java.lang.Exception -> L1d
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.apxor.androidsdk.plugins.realtimeui.d.values = r2     // Catch: java.lang.Exception -> L1d
            int r1 = r1 % 2
            goto Lb8
        Lad:
            throw r0
        Lae:
            r1 = move-exception
            com.apxor.androidsdk.core.SDKController r2 = com.apxor.androidsdk.core.SDKController.getInstance()
            java.lang.String r3 = "uic_g_msg"
            r2.logException(r3, r1)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.plugins.realtimeui.d.d0():java.lang.String");
    }

    public g e0() {
        int i = toString + 115;
        values = i % 128;
        if ((i % 2 == 0 ? 'L' : '(') != 'L') {
            return this.m0;
        }
        g gVar = this.m0;
        Object[] objArr = null;
        int length = objArr.length;
        return gVar;
    }

    public double f0() {
        int i = toString + 5;
        values = i % 128;
        if ((i % 2 == 0 ? TokenParser.CR : '9') != '\r') {
            return this.A;
        }
        double d = this.A;
        Object[] objArr = null;
        int length = objArr.length;
        return d;
    }

    public f g0() {
        try {
            int i = values + 97;
            toString = i % 128;
            int i2 = i % 2;
            f fVar = this.Q;
            int i3 = values + 81;
            toString = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return fVar;
            }
            int i4 = 52 / 0;
            return fVar;
        } catch (Exception e) {
            throw e;
        }
    }

    public g h0() {
        try {
            int i = toString + 53;
            values = i % 128;
            if ((i % 2 == 0 ? 'B' : '@') != '@') {
                int i2 = 86 / 0;
                return this.l0;
            }
            return this.l0;
        } catch (Exception e) {
            throw e;
        }
    }

    public g i0() {
        int i = values + 47;
        toString = i % 128;
        int i2 = i % 2;
        g gVar = this.k0;
        int i3 = values + 93;
        toString = i3 % 128;
        if ((i3 % 2 != 0 ? '5' : 'G') != 'G') {
            Object[] objArr = null;
            int length = objArr.length;
            return gVar;
        }
        return gVar;
    }

    public String j0() {
        int i = values + 91;
        toString = i % 128;
        if ((i % 2 != 0 ? TokenParser.CR : '_') != '\r') {
            return this.M;
        }
        String str = this.M;
        Object obj = null;
        super.hashCode();
        return str;
    }

    public String k0() {
        try {
            int i = toString + 125;
            try {
                values = i % 128;
                int i2 = i % 2;
                String str = this.O;
                int i3 = values + 75;
                toString = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Rect l0() {
        int i = toString + 81;
        values = i % 128;
        int i2 = i % 2;
        try {
            Rect rect = this.z0;
            int i3 = values + 67;
            try {
                toString = i3 % 128;
                int i4 = i3 % 2;
                return rect;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(JSONObject jSONObject) {
        int i = toString + 95;
        values = i % 128;
        int i2 = i % 2;
        this.j0 = jSONObject;
        int i3 = toString + 31;
        values = i3 % 128;
        int i4 = i3 % 2;
    }

    public String m0() {
        String c2;
        int i = toString + 13;
        values = i % 128;
        if ((i % 2 == 0 ? '\"' : '*') != '\"') {
            c2 = this.g0.c();
        } else {
            c2 = this.g0.c();
            Object obj = null;
            super.hashCode();
        }
        try {
            int i2 = toString + 73;
            values = i2 % 128;
            if ((i2 % 2 == 0 ? 'F' : 'E') != 'E') {
                int i3 = 25 / 0;
                return c2;
            }
            return c2;
        } catch (Exception e) {
            throw e;
        }
    }

    public g n0() {
        int i = values + 125;
        toString = i % 128;
        int i2 = i % 2;
        try {
            g gVar = this.g0;
            int i3 = values + 53;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return gVar;
        } catch (Exception e) {
            throw e;
        }
    }

    public String o0() {
        String i;
        int i2 = toString + 121;
        values = i2 % 128;
        if ((i2 % 2 == 0 ? '=' : '\"') != '\"') {
            i = this.g0.i();
            int i3 = 52 / 0;
        } else {
            try {
                i = this.g0.i();
            } catch (Exception e) {
                throw e;
            }
        }
        int i4 = values + 41;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    public int p0() {
        int j;
        try {
            int i = toString + 69;
            values = i % 128;
            Object[] objArr = null;
            if ((i % 2 == 0 ? '\f' : '9') != '9') {
                j = this.g0.j();
                int length = objArr.length;
            } else {
                j = this.g0.j();
            }
            int i2 = values + 1;
            toString = i2 % 128;
            if (!(i2 % 2 == 0)) {
                int length2 = objArr.length;
                return j;
            }
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    public String q0() {
        int i = toString + 5;
        values = i % 128;
        int i2 = i % 2;
        String m = this.g0.m();
        int i3 = values + 49;
        toString = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return m;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return m;
    }

    public String r0() {
        int i = values + 53;
        toString = i % 128;
        try {
            if (!(i % 2 != 0)) {
                try {
                    return this.f0.c();
                } catch (Exception e) {
                    throw e;
                }
            }
            String c2 = this.f0.c();
            Object obj = null;
            super.hashCode();
            return c2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public g s0() {
        int i = toString + 89;
        values = i % 128;
        int i2 = i % 2;
        try {
            g gVar = this.f0;
            int i3 = toString + 21;
            values = i3 % 128;
            if ((i3 % 2 == 0 ? 'F' : (char) 6) != 6) {
                Object[] objArr = null;
                int length = objArr.length;
                return gVar;
            }
            return gVar;
        } catch (Exception e) {
            throw e;
        }
    }

    public String t0() {
        try {
            int i = toString + 7;
            values = i % 128;
            int i2 = i % 2;
            String i3 = this.f0.i();
            int i4 = toString + 111;
            values = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    public JSONArray u0() {
        JSONArray jSONArray;
        int i = values + 29;
        toString = i % 128;
        if ((i % 2 != 0 ? '_' : 'V') != '_') {
            try {
                jSONArray = this.R;
            } catch (Exception e) {
                throw e;
            }
        } else {
            jSONArray = this.R;
            int i2 = 35 / 0;
        }
        try {
            int i3 = toString + 27;
            values = i3 % 128;
            if ((i3 % 2 == 0 ? '=' : 'D') != '=') {
                return jSONArray;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return jSONArray;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public ArrayList<? extends com.apxor.androidsdk.plugins.realtimeui.i.e> v() {
        try {
            int i = values + 67;
            try {
                toString = i % 128;
                if (!(i % 2 != 0)) {
                    ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> arrayList = this.c0;
                    if (arrayList != null) {
                        return arrayList;
                    }
                } else {
                    ArrayList<com.apxor.androidsdk.plugins.realtimeui.i.e> arrayList2 = this.c0;
                    Object obj = null;
                    super.hashCode();
                    if (arrayList2 != null) {
                        return arrayList2;
                    }
                }
                ArrayList<? extends com.apxor.androidsdk.plugins.realtimeui.i.e> arrayList3 = new ArrayList<>();
                int i2 = values + 67;
                toString = i2 % 128;
                int i3 = i2 % 2;
                return arrayList3;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public JSONArray v0() {
        JSONArray jSONArray;
        int i = values + 31;
        toString = i % 128;
        if (i % 2 == 0) {
            jSONArray = this.S;
        } else {
            jSONArray = this.S;
            Object obj = null;
            super.hashCode();
        }
        int i2 = values + 81;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return jSONArray;
    }

    public int w() {
        int i = toString + 33;
        values = i % 128;
        if (!(i % 2 == 0)) {
            try {
                return this.z;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = this.z;
        Object obj = null;
        super.hashCode();
        return i2;
    }

    public int w0() {
        int i = toString + 105;
        values = i % 128;
        int i2 = i % 2;
        int j = this.f0.j();
        int i3 = values + 109;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return j;
    }

    public String x() {
        int i = toString + 11;
        values = i % 128;
        int i2 = i % 2;
        String str = this.t;
        int i3 = toString + 95;
        values = i3 % 128;
        if ((i3 % 2 == 0 ? 'M' : 'D') != 'M') {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    public String x0() {
        String m;
        int i = values + 105;
        toString = i % 128;
        Object[] objArr = null;
        if (!(i % 2 == 0)) {
            m = this.f0.m();
            super.hashCode();
        } else {
            m = this.f0.m();
        }
        int i2 = values + 23;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return m;
        }
        int length = objArr.length;
        return m;
    }

    public String y() {
        int i = toString + 83;
        values = i % 128;
        int i2 = i % 2;
        String str = this.Z;
        int i3 = values + 89;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        int i4 = 32 / 0;
        return str;
    }

    public JSONObject y0() {
        try {
            int i = values + 21;
            try {
                toString = i % 128;
                int i2 = i % 2;
                JSONObject jSONObject = this.j0;
                int i3 = values + 71;
                toString = i3 % 128;
                if ((i3 % 2 != 0 ? '\b' : 'W') != '\b') {
                    return jSONObject;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return jSONObject;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int z() {
        int i = values + 97;
        toString = i % 128;
        int i2 = i % 2;
        int i3 = this.a0;
        int i4 = toString + 123;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        Object obj = null;
        super.hashCode();
        return i3;
    }

    public JSONObject z0() {
        JSONObject jSONObject;
        int i = toString + 91;
        values = i % 128;
        if (!(i % 2 != 0)) {
            try {
                jSONObject = this.o0;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                jSONObject = this.o0;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = toString + 101;
        values = i2 % 128;
        int i3 = i2 % 2;
        return jSONObject;
    }

    private static String ah$a(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ah$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c2 = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c2);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c2);
                    }
                    c2 = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
