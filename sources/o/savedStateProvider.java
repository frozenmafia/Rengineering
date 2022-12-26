package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import o.SavedStateHandleController;
/* loaded from: classes4.dex */
public class savedStateProvider {
    values toString;
    AudioManager valueOf;
    private toString values;
    boolean ah$a = false;
    AudioManager.OnAudioFocusChangeListener ag$a = new AudioManager.OnAudioFocusChangeListener() { // from class: o.setSavedStateProvider
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            savedStateProvider.this.valueOf(i);
        }
    };

    /* loaded from: classes4.dex */
    public interface values {
        void valueOf(boolean z);

        void values();
    }

    public savedStateProvider(Context context) {
        this.valueOf = (AudioManager) context.getSystemService("audio");
        this.values = new toString(context);
    }

    public /* synthetic */ void valueOf(int i) {
        SavedStateHandleController.OnRecreation onRecreation;
        this.ah$a = i > 0;
        onRecreation = SavedStateHandleController.OnRecreation.toString;
        withStarted$$forInline invoke = onRecreation.invoke();
        invoke.toString(4, "AudioFocusManager", "Focus Change " + i);
        ah$b();
    }

    public void valueOf(values valuesVar) {
        this.toString = valuesVar;
        this.values.values();
    }

    public void valueOf() {
        this.toString = null;
        this.values.ah$a();
    }

    public Boolean ag$a() {
        SavedStateHandleController.OnRecreation onRecreation;
        onRecreation = SavedStateHandleController.OnRecreation.toString;
        withStarted$$forInline invoke = onRecreation.invoke();
        invoke.toString(4, "AudioFocusManager", "requestFocus " + this.ah$a);
        if (this.ah$a) {
            return true;
        }
        boolean z = this.valueOf.requestAudioFocus(this.ag$a, 3, 1) == 1;
        this.ah$a = z;
        return Boolean.valueOf(z);
    }

    public void values() {
        SavedStateHandleController.OnRecreation onRecreation;
        onRecreation = SavedStateHandleController.OnRecreation.toString;
        withStarted$$forInline invoke = onRecreation.invoke();
        invoke.toString(4, "AudioFocusManager", "abandonFocus " + this.ah$a);
        if (this.ah$a) {
            this.ah$a = this.valueOf.abandonAudioFocus(this.ag$a) != 1;
        }
    }

    private void ah$b() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.tryToAddRecreator
            @Override // java.lang.Runnable
            public final void run() {
                savedStateProvider.this.ah$a();
            }
        });
    }

    public /* synthetic */ void ah$a() {
        values valuesVar = this.toString;
        if (valuesVar != null) {
            valuesVar.valueOf(this.ah$a);
        }
    }

    /* loaded from: classes4.dex */
    class toString extends BroadcastReceiver {
        private final Context valueOf;

        public toString(Context context) {
            this.valueOf = context.getApplicationContext();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                savedStateProvider.this.toString.values();
            }
        }

        public void values() {
            this.valueOf.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        }

        public void ah$a() {
            try {
                this.valueOf.unregisterReceiver(this);
            } catch (Exception unused) {
            }
        }
    }
}
