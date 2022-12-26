package com.apxor.androidsdk.core.ce.models;

import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.ce.Constants;
import com.apxor.androidsdk.core.ce.ContextEvaluator;
import java.util.Date;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private long f253b;
    private String c;
    private int d;
    private int e;
    private int f;
    private int g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.d;
    }

    public void a(JSONObject jSONObject, String str) {
        this.a = jSONObject.getInt("count");
        this.f253b = jSONObject.getLong(Constants.TIME_INTERVAL);
        this.c = jSONObject.getString(Constants.VALIDITY);
        this.f = jSONObject.optInt(Constants.DAY_LIMIT, Integer.MAX_VALUE);
        this.e = jSONObject.optInt(Constants.LIMIT_PER_SESSION, Integer.MAX_VALUE);
        ContextEvaluator contextEvaluator = ContextEvaluator.getInstance();
        if (this.c.equals(Constants.SESSION)) {
            this.g = 0;
        } else {
            this.d = contextEvaluator.getShownCountForUuid(str, false);
            this.g = contextEvaluator.getShownCountForUuid(str, true, SDKController.getInstance().getDateTimeUtils().getDateString(new Date()));
        }
        this.a -= this.d;
    }

    public int b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f() {
        return this.f253b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.d++;
        this.g++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        String str = this.c;
        return (str == null || str.equals(Constants.SESSION)) ? false : true;
    }
}
