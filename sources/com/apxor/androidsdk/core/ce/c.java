package com.apxor.androidsdk.core.ce;

import com.apxor.androidsdk.core.utils.Logger;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c {
    private static final String a = "c";

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, LinkedBlockingQueue<e>> f225b = new ConcurrentHashMap<>();
    private boolean c = false;
    private boolean d = false;
    private CopyOnWriteArrayList<a> e = new CopyOnWriteArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {
        String a;

        /* renamed from: b  reason: collision with root package name */
        String f226b;
        double c;
        String d;
        JSONObject e;

        a(String str, double d, String str2, String str3, JSONObject jSONObject) {
            this.a = str;
            this.c = d;
            this.f226b = str2;
            this.d = str3;
            this.e = jSONObject;
        }
    }

    private void a(String str, double d, String str2, String str3, JSONObject jSONObject) {
        if (this.f225b.containsKey(str)) {
            c(str, d, str2, str3, jSONObject);
        }
        String concat = str.concat("___").concat(str2);
        if (this.f225b.containsKey(concat)) {
            c(concat, d, str2, str3, jSONObject);
            return;
        }
        String str4 = a;
        Logger.w(str4, "listeners are null for -> " + str);
    }

    private void b() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.e.get(i);
            a(aVar.a, aVar.c, aVar.f226b, aVar.d, aVar.e);
        }
        this.e.clear();
    }

    private void c(String str, double d, String str2, String str3, JSONObject jSONObject) {
        Iterator<e> it = this.f225b.get(str).iterator();
        while (it.hasNext()) {
            it.next().a(d, str2, str3, jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.e.clear();
        this.f225b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, e eVar) {
        LinkedBlockingQueue<e> linkedBlockingQueue = this.f225b.get(str);
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.remove(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (this.c) {
            return;
        }
        if (!z) {
            this.c = false;
            return;
        }
        this.c = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, double d, String str2, String str3, JSONObject jSONObject) {
        if (this.d) {
            return;
        }
        if (this.c) {
            a(str, d, str2, str3, jSONObject);
            return;
        }
        String str4 = a;
        Logger.d(str4, "Adding data to dataList: " + str + com.dreampay.commons.constants.Constants.WHITE_SPACE + str2);
        this.e.add(new a(str, d, str2, str3, jSONObject));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, e eVar) {
        LinkedBlockingQueue<e> linkedBlockingQueue = this.f225b.get(str);
        if (linkedBlockingQueue == null) {
            linkedBlockingQueue = new LinkedBlockingQueue<>();
        }
        linkedBlockingQueue.add(eVar);
        this.f225b.put(str, linkedBlockingQueue);
    }
}
