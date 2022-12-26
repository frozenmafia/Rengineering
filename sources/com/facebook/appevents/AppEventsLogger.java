package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.google.android.exoplayer2.util.MimeTypes;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import o.ensureAnimationInfo;
import o.getEnterAnim;
import o.getTargetTypes;
import o.onHasView;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class AppEventsLogger {
    private final ensureAnimationInfo values;
    public static final values valueOf = new values(null);
    private static final String ag$a = AppEventsLogger.class.getCanonicalName();

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, getTargetTypes gettargettypes) {
        this(context, str, accessToken);
    }

    public static final AppEventsLogger toString(Context context) {
        return valueOf.values(context);
    }

    public static final void toString(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        valueOf.valueOf(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public static final String valueOf(Context context) {
        return valueOf.toString(context);
    }

    public static final void valueOf(String str) {
        valueOf.toString(str);
    }

    public static final String values() {
        return valueOf.ah$a();
    }

    public static final void values(String str) {
        valueOf.values(str);
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.values = new ensureAnimationInfo(context, str, accessToken);
    }

    /* loaded from: classes4.dex */
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FlushBehavior[] valuesCustom() {
            FlushBehavior[] valuesCustom = values();
            return (FlushBehavior[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes6.dex */
    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ProductAvailability[] valuesCustom() {
            ProductAvailability[] valuesCustom = values();
            return (ProductAvailability[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes6.dex */
    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ProductCondition[] valuesCustom() {
            ProductCondition[] valuesCustom = values();
            return (ProductCondition[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public final void toString(String str, Bundle bundle) {
        this.values.toString(str, bundle);
    }

    public final void valueOf(String str, double d, Bundle bundle) {
        this.values.toString(str, d, bundle);
    }

    public final void values(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.values.ah$a(bigDecimal, currency, bundle);
    }

    public final void ah$a(Bundle bundle) {
        runAnimators.ag$a(bundle, "payload");
        this.values.ag$a(bundle, null);
    }

    public final void valueOf(String str, ProductAvailability productAvailability, ProductCondition productCondition, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        this.values.ag$a(str, productAvailability, productCondition, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void ag$a() {
        this.values.HaptikSDK$b();
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final void valueOf(Application application, String str) {
            runAnimators.ag$a(application, MimeTypes.BASE_TYPE_APPLICATION);
            ensureAnimationInfo.toString.valueOf(application, str);
        }

        public final void toString(Context context, String str) {
            runAnimators.ag$a(context, "context");
            ensureAnimationInfo.toString.values(context, str);
        }

        public final AppEventsLogger values(Context context) {
            runAnimators.ag$a(context, "context");
            return new AppEventsLogger(context, null, null, null);
        }

        public final FlushBehavior ag$a() {
            return ensureAnimationInfo.toString.ah$a();
        }

        public final void valueOf(FlushBehavior flushBehavior) {
            runAnimators.ag$a(flushBehavior, "flushBehavior");
            ensureAnimationInfo.toString.ag$a(flushBehavior);
        }

        public final void values() {
            ensureAnimationInfo.toString.HaptikSDK$b();
        }

        public final void values(String str) {
            ensureAnimationInfo.toString.ag$a(str);
        }

        public final String ah$a() {
            onHasView onhasview = onHasView.ag$a;
            return onHasView.values();
        }

        public final void toString(String str) {
            onHasView onhasview = onHasView.ag$a;
            onHasView.ag$a(str);
        }

        public final void valueOf() {
            onHasView onhasview = onHasView.ag$a;
            onHasView.ag$a(null);
        }

        public final void valueOf(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            getEnterAnim getenteranim = getEnterAnim.ah$a;
            getEnterAnim.valueOf(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        public final String toString(Context context) {
            runAnimators.ag$a(context, "context");
            return ensureAnimationInfo.toString.ag$a(context);
        }
    }
}
