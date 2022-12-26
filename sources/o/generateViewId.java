package o;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes3.dex */
public final class generateViewId implements View.OnTouchListener {
    public generateViewId$HaptikSDK$b HaptikSDK$b;
    public final com.appsamurai.storyly.storylypresenter.e ag$a;
    public generateViewId$HaptikSDK$c ah$a;
    public Float ah$b;
    public float invoke;
    public generateViewId$ah$b toString;
    public generateViewId$ah$a valueOf;
    public values values;

    /* loaded from: classes3.dex */
    public static final class toString {
        public static int ag$a;
        public static boolean valueOf;
        public static float values;
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public static float ah$a;
        public static boolean toString;
        public static float values;
    }

    /* loaded from: classes3.dex */
    public final class values implements generateViewId$HaptikSDK$c {
        public final /* synthetic */ generateViewId valueOf;

        public values(generateViewId generateviewid) {
            runAnimators.ag$a(generateviewid, "this$0");
            this.valueOf = generateviewid;
        }

        @Override // o.generateViewId$HaptikSDK$c
        public boolean ag$a(MotionEvent motionEvent) {
            runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
            return false;
        }

        @Override // o.generateViewId$HaptikSDK$c
        public void toString(generateViewId$HaptikSDK$c generateviewid_haptiksdk_c) {
            runAnimators.ag$a(generateviewid_haptiksdk_c, "fromState");
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        @Override // o.generateViewId$HaptikSDK$c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean values(android.view.MotionEvent r8) {
            /*
                r7 = this;
                java.lang.String r0 = "event"
                o.runAnimators.ag$a(r8, r0)
                o.generateViewId r1 = r7.valueOf
                com.appsamurai.storyly.storylypresenter.e r1 = r1.ag$a
                java.lang.String r2 = "view"
                o.runAnimators.ag$a(r1, r2)
                o.runAnimators.ag$a(r8, r0)
                int r0 = r8.getHistorySize()
                r2 = 1
                r3 = 0
                if (r0 != 0) goto L1a
                goto L38
            L1a:
                float r0 = r8.getY(r3)
                float r4 = r8.getHistoricalY(r3, r3)
                float r5 = r8.getX(r3)
                float r6 = r8.getHistoricalX(r3, r3)
                float r5 = r5 - r6
                float r6 = java.lang.Math.abs(r5)
                float r0 = r0 - r4
                float r0 = java.lang.Math.abs(r0)
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 >= 0) goto L3a
            L38:
                r0 = 0
                goto L4d
            L3a:
                float r0 = r1.getTranslationX()
                o.generateViewId.valueOf.values = r0
                o.generateViewId.valueOf.ah$a = r5
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 <= 0) goto L49
                r0 = 1
                goto L4a
            L49:
                r0 = 0
            L4a:
                o.generateViewId.valueOf.toString = r0
                r0 = 1
            L4d:
                if (r0 != 0) goto L50
                return r3
            L50:
                o.generateViewId r0 = r7.valueOf
                com.appsamurai.storyly.storylypresenter.e r0 = r0.ag$a
                r1 = -1
                boolean r0 = r0.canScrollHorizontally(r1)
                r0 = r0 ^ r2
                if (r0 == 0) goto L60
                boolean r0 = o.generateViewId.valueOf.toString
                if (r0 != 0) goto L6f
            L60:
                o.generateViewId r0 = r7.valueOf
                com.appsamurai.storyly.storylypresenter.e r0 = r0.ag$a
                boolean r0 = r0.canScrollHorizontally(r2)
                r0 = r0 ^ r2
                if (r0 == 0) goto L8d
                boolean r0 = o.generateViewId.valueOf.toString
                if (r0 != 0) goto L8d
            L6f:
                int r0 = r8.getPointerId(r3)
                o.generateViewId.toString.ag$a = r0
                float r0 = o.generateViewId.valueOf.values
                o.generateViewId.toString.values = r0
                boolean r0 = o.generateViewId.valueOf.toString
                o.generateViewId.toString.valueOf = r0
                o.generateViewId r0 = r7.valueOf
                o.generateViewId$ah$b r1 = r0.toString
                r0.toString(r1)
                o.generateViewId r0 = r7.valueOf
                o.generateViewId$ah$b r0 = r0.toString
                boolean r8 = r0.values(r8)
                return r8
            L8d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.generateViewId.values.values(android.view.MotionEvent):boolean");
        }
    }

    public generateViewId(com.appsamurai.storyly.storylypresenter.e eVar) {
        runAnimators.ag$a(eVar, "recyclerView");
        this.ag$a = eVar;
        this.valueOf = new generateViewId$ah$a(this, -2.0f);
        this.toString = new generateViewId$ah$b(this, 3.0f, 1.0f);
        values valuesVar = new values(this);
        this.values = valuesVar;
        this.ah$a = valuesVar;
        valueOf();
    }

    public final void ah$a(generateViewId$HaptikSDK$b generateviewid_haptiksdk_b) {
        this.HaptikSDK$b = generateviewid_haptiksdk_b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Integer valueOf2 = motionEvent == null ? null : Integer.valueOf(motionEvent.getAction());
        if (valueOf2 != null && valueOf2.intValue() == 2) {
            return this.ah$a.values(motionEvent);
        }
        boolean z = true;
        if ((valueOf2 == null || valueOf2.intValue() != 3) && (valueOf2 == null || valueOf2.intValue() != 1)) {
            z = false;
        }
        if (z) {
            return this.ah$a.ag$a(motionEvent);
        }
        return false;
    }

    public final void valueOf() {
        this.ag$a.setOnTouchListener(this);
        this.ag$a.setOverScrollMode(2);
    }

    public final void toString(generateViewId$HaptikSDK$c generateviewid_haptiksdk_c) {
        runAnimators.ag$a(generateviewid_haptiksdk_c, "state");
        generateViewId$HaptikSDK$c generateviewid_haptiksdk_c2 = this.ah$a;
        this.ah$a = generateviewid_haptiksdk_c;
        generateviewid_haptiksdk_c.toString(generateviewid_haptiksdk_c2);
    }
}
