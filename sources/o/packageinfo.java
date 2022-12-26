package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.appsamurai.storyly.exoplayer2.core.ExoPlaybackException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: o.package-info  reason: invalid class name */
/* loaded from: classes3.dex */
public final class packageinfo {
    private static packageinfo toString;
    private final Handler ag$a = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<packageinfo$ag$a>> values = new CopyOnWriteArrayList<>();
    private final Object valueOf = new Object();
    private int ah$a = 0;

    public static packageinfo ag$a(Context context) {
        packageinfo packageinfoVar;
        synchronized (packageinfo.class) {
            if (toString == null) {
                toString = new packageinfo(context);
            }
            packageinfoVar = toString;
        }
        return packageinfoVar;
    }

    private packageinfo(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new valueOf(), intentFilter);
    }

    public void values(final packageinfo$ag$a packageinfo_ag_a) {
        ag$a();
        this.values.add(new WeakReference<>(packageinfo_ag_a));
        this.ag$a.post(new Runnable() { // from class: o.GnssStatusCompat
            @Override // java.lang.Runnable
            public final void run() {
                packageinfo.this.toString(packageinfo_ag_a);
            }

            /* loaded from: classes3.dex */
            final class Callback {
                private toString HaptikSDK$b;
                private boolean HaptikSDK$c;
                private int ag$a;
                private final values invoke;
                private setTargetDensity toString;
                private AudioFocusRequest valueOf;
                private final AudioManager values;
                private float ah$b = 1.0f;
                private int ah$a = 0;

                /* loaded from: classes3.dex */
                public interface toString {
                    void ag$a(int i);

                    void values(float f);
                }

                public Callback(Context context, Handler handler, toString tostring) {
                    this.values = (AudioManager) FingerprintManagerCompat.toString((AudioManager) context.getApplicationContext().getSystemService("audio"));
                    this.HaptikSDK$b = tostring;
                    this.invoke = new values(handler);
                }

                public float valueOf() {
                    return this.ah$b;
                }

                public void valueOf(setTargetDensity settargetdensity) {
                    if (getElevationDegrees.values(this.toString, settargetdensity)) {
                        return;
                    }
                    this.toString = settargetdensity;
                    int callback = toString(settargetdensity);
                    this.ag$a = callback;
                    boolean z = true;
                    if (callback != 1 && callback != 0) {
                        z = false;
                    }
                    FingerprintManagerCompat.toString(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
                }

                public int ah$a(boolean z, int i) {
                    if (values(i)) {
                        ah$a();
                        return z ? 1 : -1;
                    } else if (z) {
                        return invoke();
                    } else {
                        return -1;
                    }
                }

                public void values() {
                    this.HaptikSDK$b = null;
                    ah$a();
                }

                private boolean values(int i) {
                    return i == 1 || this.ag$a != 1;
                }

                private int invoke() {
                    if (this.ah$a == 1) {
                        return 1;
                    }
                    if ((getElevationDegrees.HaptikSDK$b >= 26 ? HaptikSDK$a() : HaptikSDK$b()) == 1) {
                        ag$a(1);
                        return 1;
                    }
                    ag$a(0);
                    return -1;
                }

                private void ah$a() {
                    if (this.ah$a == 0) {
                        return;
                    }
                    if (getElevationDegrees.HaptikSDK$b >= 26) {
                        HaptikSDK$c();
                    } else {
                        ag$a();
                    }
                    ag$a(0);
                }

                private int HaptikSDK$b() {
                    return this.values.requestAudioFocus(this.invoke, getElevationDegrees.toString(((setTargetDensity) FingerprintManagerCompat.toString(this.toString)).HaptikSDK$a), this.ag$a);
                }

                private int HaptikSDK$a() {
                    AudioFocusRequest.Builder builder;
                    AudioFocusRequest audioFocusRequest = this.valueOf;
                    if (audioFocusRequest == null || this.HaptikSDK$c) {
                        if (audioFocusRequest == null) {
                            builder = new AudioFocusRequest.Builder(this.ag$a);
                        } else {
                            builder = new AudioFocusRequest.Builder(this.valueOf);
                        }
                        this.valueOf = builder.setAudioAttributes(((setTargetDensity) FingerprintManagerCompat.toString(this.toString)).valueOf().valueOf).setWillPauseWhenDucked(ah$b()).setOnAudioFocusChangeListener(this.invoke).build();
                        this.HaptikSDK$c = false;
                    }
                    return this.values.requestAudioFocus(this.valueOf);
                }

                private void ag$a() {
                    this.values.abandonAudioFocus(this.invoke);
                }

                private void HaptikSDK$c() {
                    AudioFocusRequest audioFocusRequest = this.valueOf;
                    if (audioFocusRequest != null) {
                        this.values.abandonAudioFocusRequest(audioFocusRequest);
                    }
                }

                private boolean ah$b() {
                    setTargetDensity settargetdensity = this.toString;
                    return settargetdensity != null && settargetdensity.valueOf == 1;
                }

                private static int toString(setTargetDensity settargetdensity) {
                    if (settargetdensity == null) {
                        return 0;
                    }
                    switch (settargetdensity.HaptikSDK$a) {
                        case 0:
                            SupportMenuItem.toString("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                            return 1;
                        case 1:
                        case 14:
                            return 1;
                        case 2:
                        case 4:
                            return 2;
                        case 3:
                            return 0;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                            return 3;
                        case 11:
                            return settargetdensity.valueOf == 1 ? 2 : 3;
                        case 15:
                        default:
                            SupportMenuItem.toString("AudioFocusManager", "Unidentified audio usage: " + settargetdensity.HaptikSDK$a);
                            return 0;
                        case 16:
                            return getElevationDegrees.HaptikSDK$b >= 19 ? 4 : 2;
                    }
                }

                private void ag$a(int i) {
                    if (this.ah$a == i) {
                        return;
                    }
                    this.ah$a = i;
                    float f = i == 3 ? 0.2f : 1.0f;
                    if (this.ah$b == f) {
                        return;
                    }
                    this.ah$b = f;
                    toString tostring = this.HaptikSDK$b;
                    if (tostring != null) {
                        tostring.values(f);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void valueOf(int i) {
                    if (i == -3 || i == -2) {
                        if (i == -2 || ah$b()) {
                            toString(0);
                            ag$a(2);
                            return;
                        }
                        ag$a(3);
                    } else if (i == -1) {
                        toString(-1);
                        ah$a();
                    } else if (i == 1) {
                        ag$a(1);
                        toString(1);
                    } else {
                        SupportMenuItem.toString("AudioFocusManager", "Unknown focus change type: " + i);
                    }
                }

                private void toString(int i) {
                    toString tostring = this.HaptikSDK$b;
                    if (tostring != null) {
                        tostring.ag$a(i);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* loaded from: classes3.dex */
                public class values implements AudioManager.OnAudioFocusChangeListener {
                    private final Handler valueOf;

                    public values(Handler handler) {
                        this.valueOf = handler;
                    }

                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public void onAudioFocusChange(final int i) {
                        this.valueOf.post(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE  
                              (wrap: android.os.Handler : 0x0000: IGET  (r0v0 android.os.Handler A[REMOVE]) = (r2v0 'this' o.GnssStatusCompat$Callback$values A[IMMUTABLE_TYPE, THIS]) o.GnssStatusCompat.Callback.values.valueOf android.os.Handler)
                              (wrap: java.lang.Runnable : 0x0004: CONSTRUCTOR  (r1v0 java.lang.Runnable A[REMOVE]) = (r2v0 'this' o.GnssStatusCompat$Callback$values A[DONT_INLINE, IMMUTABLE_TYPE, THIS]), (r3v0 'i' int A[DONT_INLINE]) call: o.onSatelliteStatusChanged.<init>(o.GnssStatusCompat$Callback$values, int):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: o.GnssStatusCompat.Callback.values.onAudioFocusChange(int):void, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.onSatelliteStatusChanged, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1036)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:837)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:399)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
                            	... 15 more
                            */
                        /*
                            this = this;
                            android.os.Handler r0 = r2.valueOf
                            o.onSatelliteStatusChanged r1 = new o.onSatelliteStatusChanged
                            r1.<init>(r2, r3)
                            r0.post(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.GnssStatusCompat.Callback.values.onAudioFocusChange(int):void");
                    }

                    public /* synthetic */ void values(int i) {
                        Callback.this.valueOf(i);
                    }
                }
            }

            /* loaded from: classes3.dex */
            final class ConstellationType implements install {
                private boolean HaptikSDK$b;
                private install ag$a;
                private startTimeout ah$a;
                private final GnssStatusCompat$ConstellationType$ag$a toString;
                private final installSplashScreen valueOf;
                private boolean values = true;

                public ConstellationType(GnssStatusCompat$ConstellationType$ag$a gnssStatusCompat$ConstellationType$ag$a, hasEnrolledFingerprints hasenrolledfingerprints) {
                    this.toString = gnssStatusCompat$ConstellationType$ag$a;
                    this.valueOf = new installSplashScreen(hasenrolledfingerprints);
                }

                public void values() {
                    this.HaptikSDK$b = true;
                    this.valueOf.ah$a();
                }

                public void ah$a() {
                    this.HaptikSDK$b = false;
                    this.valueOf.values();
                }

                public void toString(long j) {
                    this.valueOf.toString(j);
                }

                public void ag$a(startTimeout starttimeout) throws ExoPlaybackException {
                    install installVar;
                    install ah$b = starttimeout.ah$b();
                    if (ah$b == null || ah$b == (installVar = this.ag$a)) {
                        return;
                    }
                    if (installVar != null) {
                        throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
                    }
                    this.ag$a = ah$b;
                    this.ah$a = starttimeout;
                    ah$b.ah$a(this.valueOf.ag$a());
                }

                public void ah$a(startTimeout starttimeout) {
                    if (starttimeout == this.ah$a) {
                        this.ag$a = null;
                        this.ah$a = null;
                        this.values = true;
                    }
                }

                public long ah$a(boolean z) {
                    toString(z);
                    return valueOf();
                }

                @Override // o.install
                public long valueOf() {
                    if (this.values) {
                        return this.valueOf.valueOf();
                    }
                    return ((install) FingerprintManagerCompat.toString(this.ag$a)).valueOf();
                }

                @Override // o.install
                public void ah$a(typeToString typetostring) {
                    install installVar = this.ag$a;
                    if (installVar != null) {
                        installVar.ah$a(typetostring);
                        typetostring = this.ag$a.ag$a();
                    }
                    this.valueOf.ah$a(typetostring);
                }

                @Override // o.install
                public typeToString ag$a() {
                    install installVar = this.ag$a;
                    if (installVar != null) {
                        return installVar.ag$a();
                    }
                    return this.valueOf.ag$a();
                }

                private void toString(boolean z) {
                    if (values(z)) {
                        this.values = true;
                        if (this.HaptikSDK$b) {
                            this.valueOf.ah$a();
                            return;
                        }
                        return;
                    }
                    install installVar = (install) FingerprintManagerCompat.toString(this.ag$a);
                    long valueOf = installVar.valueOf();
                    if (this.values) {
                        if (valueOf < this.valueOf.valueOf()) {
                            this.valueOf.values();
                            return;
                        }
                        this.values = false;
                        if (this.HaptikSDK$b) {
                            this.valueOf.ah$a();
                        }
                    }
                    this.valueOf.toString(valueOf);
                    typeToString ag$a = installVar.ag$a();
                    if (ag$a.equals(this.valueOf.ag$a())) {
                        return;
                    }
                    this.valueOf.ah$a(ag$a);
                    this.toString.values(ag$a);
                }

                private boolean values(boolean z) {
                    startTimeout starttimeout = this.ah$a;
                    return starttimeout == null || starttimeout.ICustomTabsCallback$Default() || (!this.ah$a.onPostMessage() && (z || this.ah$a.getSignupData()));
                }
            }
        });
    }

    public /* synthetic */ void toString(packageinfo$ag$a packageinfo_ag_a) {
        packageinfo_ag_a.ag$a(ah$a());
    }

    public int ah$a() {
        int i;
        synchronized (this.valueOf) {
            i = this.ah$a;
        }
        return i;
    }

    private void ag$a() {
        Iterator<WeakReference<packageinfo$ag$a>> it = this.values.iterator();
        while (it.hasNext()) {
            WeakReference<packageinfo$ag$a> next = it.next();
            if (next.get() == null) {
                this.values.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void valueOf(int i) {
        synchronized (this.valueOf) {
            if (this.ah$a == i) {
                return;
            }
            this.ah$a = i;
            Iterator<WeakReference<packageinfo$ag$a>> it = this.values.iterator();
            while (it.hasNext()) {
                WeakReference<packageinfo$ag$a> next = it.next();
                packageinfo$ag$a packageinfo_ag_a = next.get();
                if (packageinfo_ag_a != null) {
                    packageinfo_ag_a.ag$a(i);
                } else {
                    this.values.remove(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toString(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            return toString(activeNetworkInfo);
        } catch (SecurityException unused) {
            return 0;
        }
    }

    private static int toString(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return getElevationDegrees.HaptikSDK$b >= 29 ? 9 : 0;
        }
    }

    /* renamed from: o.package-info$valueOf */
    /* loaded from: classes3.dex */
    final class valueOf extends BroadcastReceiver {
        private valueOf() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int packageinfoVar = packageinfo.toString(context);
            if (getElevationDegrees.HaptikSDK$b < 31 || packageinfoVar != 5) {
                packageinfo.this.valueOf(packageinfoVar);
            } else {
                packageinfo$ah$a.valueOf(context, packageinfo.this);
            }
        }
    }
}
