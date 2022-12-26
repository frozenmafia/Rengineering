package com.dreampay.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class DreamPayWebView extends WebView {
    private Integer ah$a;
    private long valueOf;
    private int values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamPayWebView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        ag$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamPayWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        ag$a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamPayWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        ag$a();
    }

    public final void ag$a() {
        this.ah$a = null;
        this.valueOf = 0L;
        this.values = 300;
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        runAnimators.ag$a(editorInfo, "editorInfo");
        Integer num = this.ah$a;
        if (num != null) {
            int intValue = num.intValue();
            if (System.currentTimeMillis() - this.valueOf <= this.values) {
                editorInfo.inputType = intValue;
            }
        }
        if (editorInfo.inputType == 1) {
            editorInfo.inputType |= 224;
        }
        return super.onCreateInputConnection(editorInfo);
    }

    private final void values() {
        this.valueOf = System.currentTimeMillis();
    }

    public final void ah$a() {
        this.ah$a = 18;
        values();
    }
}
