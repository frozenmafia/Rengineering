package com.apxor.androidsdk.plugins.realtimeui;

import android.graphics.Point;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import com.apxor.androidsdk.core.utils.Logger;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class c {
    private static final String a = "c";
    private String E;
    private int K;
    private int N;
    private int O;
    private String P;
    private boolean Q;
    private boolean R;

    /* renamed from: b  reason: collision with root package name */
    private String f307b;
    private String c;
    private String d;
    private String f;
    private String h;
    private String j;
    private boolean k;
    private double l;
    private boolean m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private long f308o;
    private boolean p;
    private JSONObject q;
    private boolean r;
    private int s;
    private int t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private boolean z;
    private Point e = new Point();
    private long g = -1;
    private long i = 200;
    private final com.apxor.androidsdk.plugins.realtimeui.i.e A = new com.apxor.androidsdk.plugins.realtimeui.i.e();
    private boolean B = false;
    private com.apxor.androidsdk.plugins.realtimeui.a C = null;
    private boolean D = true;
    private boolean F = false;
    private boolean G = true;
    private boolean H = true;
    private boolean I = true;
    private boolean J = true;
    private boolean L = true;
    private boolean M = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(c.this.u).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.a));
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                byte[] bArr = new byte[1024];
                long j = (contentLength / 1024) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                c.this.N = (int) j;
                int i = 0;
                if (j <= c.this.K) {
                    int i2 = 0;
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        i2 += read;
                    }
                    i = i2;
                } else {
                    Logger.e(c.a, "Video File size is too large to show", null);
                    new File(this.a).delete();
                }
                fileOutputStream.close();
                inputStream.close();
                httpURLConnection.disconnect();
                if (i != contentLength) {
                    UIManager.getInstance().a(c.this.h, "apx_via_");
                    c.this.F = true;
                    return;
                }
                c.this.B = true;
                if (c.this.C != null) {
                    c.this.C.a();
                }
            } catch (MalformedURLException unused) {
                c.this.F = true;
                str = c.a;
                str2 = "Failed to save video file";
                Logger.e(str, str2, null);
            } catch (IOException | Exception unused2) {
                c.this.F = true;
                str = c.a;
                str2 = "Failed to save video file ";
                Logger.e(str, str2, null);
            }
        }
    }

    public String A() {
        return this.P;
    }

    public int B() {
        return this.s;
    }

    public boolean C() {
        return this.n;
    }

    public boolean D() {
        return this.F;
    }

    public boolean E() {
        return this.p;
    }

    public boolean F() {
        return this.I;
    }

    public boolean G() {
        return this.k;
    }

    public boolean H() {
        return this.J;
    }

    public boolean I() {
        return this.H;
    }

    public boolean J() {
        return this.m;
    }

    public boolean K() {
        return this.G;
    }

    public boolean L() {
        return this.Q;
    }

    public boolean M() {
        return this.R;
    }

    public boolean N() {
        return this.B;
    }

    public boolean O() {
        return this.z;
    }

    public boolean P() {
        return this.r;
    }

    public void a(long j) {
        this.g = j;
    }

    public void a(com.apxor.androidsdk.plugins.realtimeui.a aVar) {
        this.C = aVar;
    }

    public void a(String str) {
        this.c = str;
    }

    public boolean a(JSONObject jSONObject, String str, String str2, boolean z) {
        this.h = str;
        this.j = str2;
        try {
            this.i = jSONObject.optLong("delay", this.i);
            boolean optBoolean = jSONObject.optBoolean("is_via", false);
            this.r = optBoolean;
            if (optBoolean) {
                this.E = jSONObject.optString(Constants.ACTIVITY, "");
                this.s = jSONObject.getInt("width");
                this.t = jSONObject.getInt("height");
                this.u = jSONObject.getString("v_url");
                JSONArray optJSONArray = jSONObject.optJSONArray("buttons_config");
                if (optJSONArray != null) {
                    this.A.a(optJSONArray.getJSONObject(0));
                }
                boolean optBoolean2 = jSONObject.optBoolean("is_full_scr", true);
                this.z = optBoolean2;
                if (!optBoolean2) {
                    this.v = jSONObject.optString("bg_color", "#000000");
                }
                this.w = jSONObject.optString("x_icon_color", "#FFFFFF");
                this.x = jSONObject.optString("sound_icon_color", "#FFFFFF");
                this.L = jSONObject.optBoolean("add_close", true);
                this.M = jSONObject.optBoolean("add_audio", true);
                this.J = jSONObject.optBoolean("can_minimize", true);
                this.y = jSONObject.optString("mini_color", "#FFFFFF");
                this.G = jSONObject.optBoolean("mute_audio", true);
                this.H = jSONObject.optBoolean("enable_PIP", true);
                this.D = jSONObject.optBoolean("download", true);
                this.I = jSONObject.optBoolean("auto_replay", true);
                this.O = jSONObject.optInt("border_radius", 10);
                this.P = jSONObject.optString("vi_position", TtmlNode.TAG_BR);
                this.Q = jSONObject.optBoolean("show_mute_in_overlay", false);
                this.R = jSONObject.optBoolean("show_play_in_overlay", false);
                if (this.D) {
                    this.K = jSONObject.optInt("video_size", 3);
                    if (!this.u.isEmpty()) {
                        if (new File(SDKController.getInstance().getFilesDirPath() + "apx_via_" + y() + ".mp4").exists()) {
                            this.B = true;
                            this.F = false;
                        } else if (!z) {
                            d();
                        }
                    }
                }
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("html_config");
                this.e.x = jSONObject2.optInt("width", 100);
                this.e.y = jSONObject2.optInt("height", 100);
                this.c = jSONObject2.optString("data");
                this.f307b = jSONObject2.optString("url");
                boolean optBoolean3 = jSONObject2.optBoolean("has_scripts");
                this.p = optBoolean3;
                if (optBoolean3) {
                    this.q = jSONObject2.getJSONObject("script");
                }
                String replaceAllMacros = ContextEvaluator.getInstance().replaceAllMacros(this.c);
                this.c = replaceAllMacros;
                this.d = replaceAllMacros;
                JSONObject optJSONObject = jSONObject.optJSONObject("window_attributes");
                if (optJSONObject != null) {
                    this.f = optJSONObject.getString("position");
                    this.k = optJSONObject.optBoolean("dimmed_background", true);
                    this.l = optJSONObject.optDouble("dim_amount", 0.8d);
                    this.m = optJSONObject.optBoolean("dismiss_outside_touch", true);
                    this.n = optJSONObject.optBoolean("has_animation", false);
                    this.f308o = optJSONObject.optLong("animation_duration", 800L);
                }
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean b() {
        return this.M;
    }

    public boolean c() {
        return this.L;
    }

    public void d() {
        if (this.u.isEmpty()) {
            return;
        }
        String str = SDKController.getInstance().getFilesDirPath() + "apx_via_" + y() + ".mp4";
        if (!new File(str).exists()) {
            new Thread(new a(str)).start();
            return;
        }
        this.B = true;
        this.F = false;
    }

    public boolean e() {
        return this.D;
    }

    public String f() {
        return this.E;
    }

    public long g() {
        return this.f308o;
    }

    public String h() {
        return this.v;
    }

    public float i() {
        return this.O;
    }

    public com.apxor.androidsdk.plugins.realtimeui.i.e j() {
        return this.A;
    }

    public String k() {
        return this.w;
    }

    public long l() {
        return this.i;
    }

    public double m() {
        return this.l;
    }

    public int n() {
        return this.N;
    }

    public long o() {
        return this.g;
    }

    public int p() {
        return this.t;
    }

    public String q() {
        return !TextUtils.isEmpty(this.c) ? this.c : this.f307b;
    }

    public String r() {
        return this.j;
    }

    public String s() {
        return this.y;
    }

    public String t() {
        return this.d;
    }

    public Point u() {
        return this.e;
    }

    public String v() {
        return this.f;
    }

    public JSONObject w() {
        return this.q;
    }

    public String x() {
        return this.x;
    }

    public String y() {
        return this.h;
    }

    public String z() {
        return this.u;
    }
}
