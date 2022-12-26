package com.apxor.androidsdk.core.ce.h;

import android.os.Handler;
import android.os.HandlerThread;
import com.apxor.androidsdk.core.ce.ExecutionListener;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.Stack;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a {
    private static final String a = "com.apxor.androidsdk.core.ce.h.a";

    /* renamed from: b  reason: collision with root package name */
    private static final a f230b = new a();
    private final Handler c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apxor.androidsdk.core.ce.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0251a implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f231b;
        final /* synthetic */ ExecutionListener c;

        RunnableC0251a(String str, JSONObject jSONObject, ExecutionListener executionListener) {
            this.a = str;
            this.f231b = jSONObject;
            this.c = executionListener;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:206:0x0422, code lost:
            throw new java.lang.Exception("Undefined variable " + r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:235:0x04b8, code lost:
            r0 = false;
         */
        /* JADX WARN: Removed duplicated region for block: B:134:0x021d A[Catch: Exception -> 0x03bc, TryCatch #1 {Exception -> 0x03bc, blocks: (B:99:0x0189, B:158:0x02ff, B:100:0x0199, B:102:0x01a5, B:107:0x01b5, B:108:0x01bb, B:110:0x01c7, B:114:0x01d6, B:115:0x01dc, B:117:0x01f0, B:127:0x020b, B:129:0x020f, B:131:0x0213, B:132:0x0217, B:134:0x021d, B:135:0x021f, B:119:0x01f4, B:136:0x0224, B:137:0x023d, B:139:0x0250, B:140:0x027a, B:143:0x029a, B:145:0x02b0, B:147:0x02b6, B:148:0x02c0, B:150:0x02ce, B:151:0x02dc, B:152:0x02e5, B:154:0x02eb, B:156:0x02f1, B:157:0x02fb, B:159:0x0304, B:161:0x030a, B:163:0x0316, B:167:0x0335, B:169:0x0339, B:171:0x0368), top: B:260:0x0189 }] */
        /* JADX WARN: Removed duplicated region for block: B:237:0x04bb A[Catch: Exception -> 0x04c5, TRY_LEAVE, TryCatch #3 {Exception -> 0x04c5, blocks: (B:237:0x04bb, B:231:0x04a5), top: B:264:0x04a5 }] */
        /* JADX WARN: Removed duplicated region for block: B:247:0x04cc  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x04ce A[Catch: Exception -> 0x0503, TryCatch #6 {Exception -> 0x0503, blocks: (B:245:0x04c8, B:249:0x04d2, B:248:0x04ce, B:254:0x04fd), top: B:269:0x000e }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1428
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apxor.androidsdk.core.ce.h.a.RunnableC0251a.run():void");
        }
    }

    private a() {
        HandlerThread handlerThread = new HandlerThread("ApxVM");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a(Stack<Object> stack) {
        return Boolean.valueOf(Boolean.parseBoolean(stack.pop().toString()));
    }

    public static a b() {
        return f230b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Double b(Stack<Object> stack) {
        return Double.valueOf(Double.parseDouble(stack.pop().toString()));
    }

    public void a(String str, JSONObject jSONObject, ExecutionListener executionListener) {
        if (executionListener == null) {
            Logger.e(a, "Listener is null", null);
        } else {
            this.c.postDelayed(new RunnableC0251a(str, jSONObject, executionListener), 0L);
        }
    }
}
