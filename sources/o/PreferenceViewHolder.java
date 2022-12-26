package o;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import o.SeekBarPreference;
/* loaded from: classes5.dex */
final class PreferenceViewHolder implements SeekBarPreference.SavedState {
    final /* synthetic */ Activity valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PreferenceViewHolder(shouldUseGeneratedIds shouldusegeneratedids, Activity activity) {
        this.valueOf = activity;
    }

    @Override // o.SeekBarPreference.SavedState
    public final void ah$a(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.valueOf.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
