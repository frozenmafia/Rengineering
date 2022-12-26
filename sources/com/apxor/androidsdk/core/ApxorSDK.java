package com.apxor.androidsdk.core;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class ApxorSDK {
    private static final String a = "ApxorSDK";
    private static boolean c;
    private static boolean d;
    private static boolean e;

    /* renamed from: b  reason: collision with root package name */
    private static final LinkedBlockingQueue<Runnable> f158b = new LinkedBlockingQueue<>();
    private static final Bundle f = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Attributes f159b;

        a(String str, Attributes attributes) {
            this.a = str;
            this.f159b = attributes;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f159b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f160b;
        final /* synthetic */ HashMap c;

        b(String str, String str2, HashMap hashMap) {
            this.a = str;
            this.f160b = str2;
            this.c = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f160b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class c implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f161b;
        final /* synthetic */ Attributes c;

        c(String str, String str2, Attributes attributes) {
            this.a = str;
            this.f161b = str2;
            this.c = attributes;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f161b, this.c);
        }
    }

    /* loaded from: classes6.dex */
    class d implements Runnable {
        final /* synthetic */ HashMap a;

        d(HashMap hashMap) {
            this.a = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class e implements Runnable {
        final /* synthetic */ Attributes a;

        e(Attributes attributes) {
            this.a = attributes;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a);
        }
    }

    /* loaded from: classes6.dex */
    class f extends com.apxor.androidsdk.core.c {
        f() {
        }

        @Override // com.apxor.androidsdk.core.c
        public void a(boolean z) {
            boolean unused = ApxorSDK.d = z;
        }

        @Override // com.apxor.androidsdk.core.c
        public void b() {
            boolean unused = ApxorSDK.d = true;
            ApxorSDK.e();
        }

        @Override // com.apxor.androidsdk.core.c
        public void a() {
            boolean unused = ApxorSDK.d = false;
            boolean unused2 = ApxorSDK.c = false;
        }
    }

    /* loaded from: classes6.dex */
    class g implements Runnable {
        final /* synthetic */ Context a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.apxor.androidsdk.core.c f162b;

        g(Context context, com.apxor.androidsdk.core.c cVar) {
            this.a = context;
            this.f162b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f162b);
        }
    }

    /* loaded from: classes6.dex */
    class h implements Runnable {
        final /* synthetic */ Context a;

        h(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SDKController.getInstance().endSession(this.a);
                Logger.debug(ApxorSDK.a, "Current session ended");
            } catch (Exception unused) {
                Logger.e(ApxorSDK.a, "Unable to end current session");
            }
        }
    }

    /* loaded from: classes6.dex */
    class i implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f163b;

        i(String str, String str2) {
            this.a = str;
            this.f163b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().i(this.a);
            Logger.debug(ApxorSDK.a, this.f163b);
        }
    }

    /* loaded from: classes6.dex */
    class j implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f164b;

        j(String str, String str2) {
            this.a = str;
            this.f164b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().f(this.a);
            Logger.debug(ApxorSDK.a, this.f164b);
        }
    }

    /* loaded from: classes3.dex */
    class k extends com.apxor.androidsdk.core.c {
        final /* synthetic */ String a;

        k(String str) {
            this.a = str;
        }

        @Override // com.apxor.androidsdk.core.c
        public void a() {
            Logger.e(ApxorSDK.a, "Failed to initialize ApxorSDK", null);
            boolean unused = ApxorSDK.c = false;
            ApxorSDK.f158b.clear();
        }

        @Override // com.apxor.androidsdk.core.c
        public void b() {
            ApxorSDK.e();
            boolean unused = ApxorSDK.d = true;
            String str = ApxorSDK.a;
            Log.i(str, "ApxorSDK(v285) successfully initialized for: " + this.a);
        }
    }

    /* loaded from: classes6.dex */
    class l implements Runnable {
        final /* synthetic */ String[] a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ApxorDataCallback f165b;

        l(String[] strArr, ApxorDataCallback apxorDataCallback) {
            this.a = strArr;
            this.f165b = apxorDataCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().getAttributes(this.a, this.f165b);
        }
    }

    /* loaded from: classes6.dex */
    class m implements Runnable {
        final /* synthetic */ RedirectionListener a;

        m(RedirectionListener redirectionListener) {
            this.a = redirectionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().setRedirectionListener(this.a);
        }
    }

    /* loaded from: classes6.dex */
    class n implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f166b;

        n(String str, Bundle bundle) {
            this.a = str;
            this.f166b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f166b);
        }
    }

    /* loaded from: classes6.dex */
    class o implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f167b;

        o(String str, JSONObject jSONObject) {
            this.a = str;
            this.f167b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f167b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class p implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HashMap f168b;
        final /* synthetic */ Exception c;

        p(String str, HashMap hashMap, Exception exc) {
            this.a = str;
            this.f168b = hashMap;
            this.c = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().a(this.a, this.f168b, this.c);
        }
    }

    /* loaded from: classes3.dex */
    class q implements Runnable {
        final /* synthetic */ String a;

        q(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = ApxorSDK.a;
            Logger.debug(str, "Set User Identifier = " + this.a);
            SDKController.getInstance().h(this.a);
        }
    }

    /* loaded from: classes6.dex */
    class r implements Runnable {
        final /* synthetic */ HashMap a;

        r(HashMap hashMap) {
            this.a = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class s implements Runnable {
        final /* synthetic */ Attributes a;

        s(Attributes attributes) {
            this.a = attributes;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.b(this.a);
        }
    }

    /* loaded from: classes6.dex */
    class t implements Runnable {
        final /* synthetic */ String a;

        t(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().e(this.a);
        }
    }

    /* loaded from: classes6.dex */
    class u implements Runnable {
        final /* synthetic */ String a;

        u(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKController.getInstance().g(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class v implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f169b;
        final /* synthetic */ HashMap c;
        final /* synthetic */ boolean d;

        v(String str, String str2, HashMap hashMap, boolean z) {
            this.a = str;
            this.f169b = str2;
            this.c = hashMap;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f169b, this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class w implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f170b;
        final /* synthetic */ Attributes c;
        final /* synthetic */ boolean d;

        w(String str, String str2, Attributes attributes, boolean z) {
            this.a = str;
            this.f170b = str2;
            this.c = attributes;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApxorSDK.a(this.a, this.f170b, this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        Iterator<Runnable> it = f158b.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        f158b.clear();
    }

    public static void endSession(Context context) {
        if (!(context instanceof Application)) {
            Logger.e(a, "Application context must be required to end session", null);
        } else if (d()) {
            try {
                SDKController.getInstance().endSession(context);
                Logger.debug(a, "Current session ended");
            } catch (Exception e2) {
                Logger.e(a, "Unable to end current session");
                e2.printStackTrace();
            }
        } else if (!c || e) {
        } else {
            f158b.add(new h(context));
        }
    }

    public static void flushEventsIfAny() {
    }

    public static void getAttributes(String[] strArr, ApxorDataCallback apxorDataCallback) {
        if (strArr != null && strArr.length >= 1) {
            if (d()) {
                SDKController.getInstance().getAttributes(strArr, apxorDataCallback);
                return;
            } else {
                f158b.add(new l(strArr, apxorDataCallback));
                return;
            }
        }
        Logger.e(a, "Provide at least one attribute name", null);
        apxorDataCallback.onFailure();
    }

    public static String getDeviceId(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
        } catch (Exception unused) {
            str = null;
        }
        return str == null ? "UNKNOWN" : str;
    }

    public static void initialize(String str, Context context) {
        if (c) {
            Logger.w(a, "ApxorSDK is already initialized");
        } else if (context != null && (context instanceof Application)) {
            if (str != null && !str.isEmpty()) {
                try {
                    SDKController.getInstance().a(str, context, new k(str));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                c = true;
                return;
            }
            Logger.e(a, "Apxor SDK couldn't be started. Application Id cannot be null", null);
        } else {
            Logger.e(a, "Apxor SDK couldn't be started. Application context cannot be null", null);
        }
    }

    public static void logAppEvent(String str) {
        logAppEvent(str, (Attributes) null);
    }

    public static void logClientEvent(String str) {
        logClientEvent(str, null);
    }

    @Deprecated
    public static void logMetaEvent(String str, HashMap<String, String> hashMap) {
        logMetaEvent((String) null, str, hashMap);
    }

    public static void login() {
        logAppEvent("UserLoggedIn");
    }

    public static void logout() {
        logAppEvent("UserLoggedOut");
    }

    public static void optOut(boolean z) {
        e = z;
    }

    public static void reportCustomError(String str, HashMap<String, String> hashMap, Exception exc) {
        if (str == null) {
            str = "Unknown";
        }
        if (d()) {
            SDKController.getInstance().a(str, hashMap, exc);
        } else if (!c || e) {
        } else {
            f158b.add(new p(str, hashMap, exc));
        }
    }

    public static void setCurrentScreenName(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(a, "Screen Name can't be empty or null", null);
            return;
        }
        String str2 = "Current screen name is set to " + str;
        if (d()) {
            SDKController.getInstance().f(str);
            Logger.debug(a, str2);
        } else if (!c || e) {
        } else {
            f158b.add(new j(str, str2));
        }
    }

    public static void setDefaultParams(Bundle bundle) {
        if (bundle != null) {
            f.putAll(bundle);
        } else {
            f.clear();
        }
    }

    public static void setPushRegistrationToken(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (d()) {
            SDKController.getInstance().g(str);
        } else if (!c || e) {
        } else {
            f158b.add(new u(str));
        }
    }

    public static void setRedirectionListener(RedirectionListener redirectionListener) {
        if (d()) {
            SDKController.getInstance().setRedirectionListener(redirectionListener);
        } else {
            f158b.add(new m(redirectionListener));
        }
    }

    public static void setSessionCustomInfo(String str, String str2) {
        if (str != null && str2 != null) {
            Attributes attributes = new Attributes();
            attributes.putAttribute(str, str2);
            setSessionCustomInfo(attributes);
            return;
        }
        Logger.e(a, "Key or Value cannot be null");
    }

    public static void setUserAcquisitionSource(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (d()) {
            SDKController.getInstance().e(str);
        } else if (!c || e) {
        } else {
            f158b.add(new t(str));
        }
    }

    @Deprecated
    public static void setUserCustomInfo(HashMap<String, String> hashMap) {
        if (hashMap != null && !hashMap.isEmpty()) {
            if (d()) {
                a(hashMap);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new r(hashMap));
                return;
            }
        }
        Logger.e(a, "User Custom Info is NULL", null);
    }

    public static void setUserIdentifier(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (d()) {
            String str2 = a;
            Logger.debug(str2, "Set User Identifier = " + str);
            SDKController.getInstance().h(str);
        } else if (!c || e) {
        } else {
            f158b.add(new q(str));
        }
    }

    public static void startSession(Context context) {
        if (!(context instanceof Application)) {
            Logger.e(a, "Application context must be required to start session", null);
            return;
        }
        f fVar = new f();
        if (d()) {
            a(context, fVar);
        } else if (!c || e) {
        } else {
            f158b.add(new g(context, fVar));
        }
    }

    public static void trackScreen(String str) {
        if (!TextUtils.isEmpty(str) && str.trim().length() >= 1) {
            String str2 = "Tracking Screen " + str;
            if (d()) {
                SDKController.getInstance().i(str);
                Logger.debug(a, str2);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new i(str, str2));
                return;
            }
        }
        Logger.e(a, "Screen name cannot be empty or null", null);
    }

    private static boolean d() {
        if (!c) {
            Logger.e(a, "You must initialize the ApxorSDK before accessing any of it's APIs");
            return false;
        }
        return d;
    }

    @Deprecated
    public static void logAppEvent(String str, HashMap<String, String> hashMap) {
        logAppEvent((String) null, str, hashMap);
    }

    public static void logClientEvent(String str, Attributes attributes) {
        if (str != null && !str.isEmpty()) {
            if (d()) {
                a(str, attributes);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new a(str, attributes));
                return;
            }
        }
        Logger.e(a, "Event name is mandatory for ClientEvent", null);
    }

    @Deprecated
    public static void logMetaEvent(String str, String str2, HashMap<String, String> hashMap) {
        if (str2 != null && !str2.isEmpty()) {
            if (d()) {
                a(str, str2, hashMap);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new b(str, str2, hashMap));
                return;
            }
        }
        Logger.e(a, "Event name is mandatory for MetaEvent", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = new HashMap<>(hashMap);
        SDKController.getInstance().setUserAttributes(hashMap2);
        String str = a;
        Logger.debug(str, "User attributes are set " + hashMap2.toString());
    }

    @Deprecated
    public static void logAppEvent(String str, String str2, HashMap<String, String> hashMap) {
        logAppEvent(str, str2, hashMap, false);
    }

    @Deprecated
    public static void logAppEvent(String str, String str2, HashMap<String, String> hashMap, boolean z) {
        if (str2 != null && !str2.isEmpty()) {
            if (d()) {
                a(str, str2, hashMap, z);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new v(str, str2, hashMap, z));
                return;
            }
        }
        Logger.e(a, "Event name is mandatory for AppEvent", null);
    }

    @Deprecated
    public static void setSessionCustomInfo(HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        if (d()) {
            SDKController.getInstance().a(hashMap);
        } else if (!c || e) {
        } else {
            f158b.add(new d(hashMap));
        }
    }

    public static void reportCustomError(String str, HashMap<String, String> hashMap) {
        reportCustomError(str, hashMap, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, HashMap<String, String> hashMap, boolean z) {
        SDKController.getInstance().logAppEvent(str, str2, hashMap, z);
        String str3 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("App Event= category: ");
        sb.append(str);
        sb.append(", Name: ");
        sb.append(str2);
        sb.append(", Additional: ");
        sb.append(hashMap == null ? "null" : hashMap.toString());
        Logger.debug(str3, sb.toString());
    }

    public static void reportCustomError(String str) {
        reportCustomError(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, Attributes attributes, boolean z) {
        SDKController.getInstance().logAppEvent(str, str2, attributes, z);
        String str3 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("App Event= category: ");
        sb.append(str);
        sb.append(", Name: ");
        sb.append(str2);
        sb.append(", Additional: ");
        sb.append(attributes == null ? "null" : attributes.getAttributes().toString());
        Logger.debug(str3, sb.toString());
    }

    public static void setUserCustomInfo(Attributes attributes) {
        if (attributes == null) {
            Logger.e(a, "User Custom Info is NULL", null);
        } else if (d()) {
            b(attributes);
        } else if (!c || e) {
        } else {
            f158b.add(new s(attributes));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Attributes attributes) {
        try {
            JSONObject jSONObject = new JSONObject(attributes.getAttributes().toString());
            Attributes attributes2 = new Attributes();
            attributes2.putAttributes(jSONObject);
            SDKController.getInstance().c(attributes2);
            String str = a;
            Logger.debug(str, "User attributes are set: " + jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void logMetaEvent(String str, Attributes attributes) {
        logMetaEvent((String) null, str, attributes);
    }

    public static void logMetaEvent(String str, String str2, Attributes attributes) {
        if (str2 != null && !str2.isEmpty()) {
            if (d()) {
                a(str, str2, attributes);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new c(str, str2, attributes));
                return;
            }
        }
        Logger.e(a, "Event name is mandatory for MetaEvent", null);
    }

    public static void setSessionCustomInfo(Attributes attributes) {
        if (attributes == null || attributes.getAttributes().length() < 1) {
            return;
        }
        if (d()) {
            a(attributes);
        } else if (!c || e) {
        } else {
            f158b.add(new e(attributes));
        }
    }

    public static void logAppEvent(String str, Attributes attributes) {
        logAppEvent(str, attributes, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, Attributes attributes) {
        SDKController.getInstance().a(str, attributes);
        String str2 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Client Event= Name: ");
        sb.append(str);
        sb.append(", Additional: ");
        sb.append(attributes == null ? "null" : attributes.getAttributes().toString());
        Logger.debug(str2, sb.toString());
    }

    public static void logAppEvent(String str, Attributes attributes, boolean z) {
        logAppEvent((String) null, str, attributes, z);
    }

    public static void logAppEvent(String str, String str2, Attributes attributes) {
        logAppEvent(str, str2, attributes, false);
    }

    public static void logAppEvent(String str, String str2, Attributes attributes, boolean z) {
        if (str2 != null && !str2.isEmpty()) {
            if (d()) {
                a(str, str2, attributes, z);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new w(str, str2, attributes, z));
                return;
            }
        }
        Logger.e(a, "Event name is mandatory for AppEvent", null);
    }

    public static void setUserCustomInfo(String str, String str2) {
        Attributes attributes = new Attributes();
        attributes.putAttribute(str, str2);
        setUserCustomInfo(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, HashMap<String, String> hashMap) {
        SDKController.getInstance().a(str, str2, hashMap);
        String str3 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Meta Event= category: ");
        sb.append(str);
        sb.append(", Name: ");
        sb.append(str2);
        sb.append(", Additional: ");
        sb.append(hashMap == null ? "null" : hashMap.toString());
        Logger.debug(str3, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, Attributes attributes) {
        SDKController.getInstance().a(str, str2, attributes);
        String str3 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Meta Event= category: ");
        sb.append(str);
        sb.append(", Name: ");
        sb.append(str2);
        sb.append(", Additional: ");
        sb.append(attributes == null ? "null" : attributes.getAttributes().toString());
        Logger.debug(str3, sb.toString());
    }

    public static void logAppEvent(String str, Bundle bundle) {
        if (str != null && !str.isEmpty()) {
            if (d()) {
                a(str, bundle);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new n(str, bundle));
                return;
            }
        }
        Logger.e(a, "Event name is mandatory for AppEvent", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Attributes attributes) {
        SDKController.getInstance().b(attributes);
        String str = a;
        Logger.debug(str, "Session Attributes= " + attributes.getAttributes().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context, com.apxor.androidsdk.core.c cVar) {
        try {
            SDKController.getInstance().a(context, cVar);
            Logger.debug(a, "New session started");
        } catch (Exception unused) {
            c = false;
            Logger.e(a, "Unable to start new session");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = f;
        if (bundle2.size() > 0) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        for (String str2 : bundle.keySet()) {
            if (bundle.get(str2) == null) {
                f.remove(str2);
                bundle.remove(str2);
            }
        }
        Attributes attributes = new Attributes(bundle);
        SDKController.getInstance().logAppEvent(null, str, attributes);
        String str3 = a;
        Logger.debug(str3, "App Event= Name: " + str + ", Additional: " + attributes.getAttributes().toString());
    }

    public static void logAppEvent(String str, JSONObject jSONObject) {
        if (str != null && !str.isEmpty()) {
            if (d()) {
                a(str, jSONObject);
                return;
            } else if (!c || e) {
                return;
            } else {
                f158b.add(new o(str, jSONObject));
                return;
            }
        }
        Logger.e(a, "Event name is mandatory for AppEvent", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, JSONObject jSONObject) {
        Attributes attributes = new Attributes(jSONObject);
        SDKController.getInstance().logAppEvent(null, str, attributes);
        String str2 = a;
        Logger.debug(str2, "App Event= Name: " + str + ", Additional: " + attributes.getAttributes().toString());
    }
}
