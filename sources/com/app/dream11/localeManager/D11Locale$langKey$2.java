package com.app.dream11.localeManager;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class D11Locale$langKey$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ D11Locale this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11Locale$langKey$2(D11Locale d11Locale) {
        super(0);
        this.this$0 = d11Locale;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        if (this.this$0 == D11Locale.ENGLISH) {
            String androidLangKey = this.this$0.getAndroidLangKey();
            return androidLangKey + "-US";
        } else if (this.this$0 == D11Locale.UNKNOWN) {
            return this.this$0.getAndroidLangKey();
        } else {
            String androidLangKey2 = this.this$0.getAndroidLangKey();
            return androidLangKey2 + "-IN";
        }
    }
}
