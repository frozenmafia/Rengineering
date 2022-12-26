package com.app.dream11.contest.pdfdownload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.reactivex.subjects.PublishSubject;
import o.SupportSQLiteQuery;
import o.runAnimators;
/* loaded from: classes.dex */
public final class PdfDownloadBroadcastReceiver extends BroadcastReceiver {
    private PublishSubject<Long> ag$a = PublishSubject.invoke();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Long valueOf = intent == null ? null : Long.valueOf(intent.getLongExtra("extra_download_id", -1L));
        if (valueOf == null || valueOf.longValue() == -1) {
            return;
        }
        valueOf(valueOf.longValue());
    }

    private final PublishSubject<Long> values() {
        if (this.ag$a == null) {
            this.ag$a = PublishSubject.invoke();
        }
        return this.ag$a;
    }

    public final void valueOf(long j) {
        PublishSubject<Long> values = values();
        if (values == null) {
            return;
        }
        values.onNext(Long.valueOf(j));
    }

    public final SupportSQLiteQuery<Long> ag$a() {
        PublishSubject<Long> values = values();
        runAnimators.toString(values);
        return values;
    }

    public final void ah$a() {
        PublishSubject<Long> values = values();
        if (values != null) {
            values.onComplete();
        }
        this.ag$a = null;
    }
}
