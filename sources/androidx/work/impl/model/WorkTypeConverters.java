package androidx.work.impl.model;

import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
/* loaded from: classes6.dex */
public class WorkTypeConverters {

    /* loaded from: classes6.dex */
    public interface BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final int LINEAR = 1;
    }

    /* loaded from: classes6.dex */
    public interface NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;
    }

    /* loaded from: classes6.dex */
    public interface OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;
    }

    /* loaded from: classes6.dex */
    public interface StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;
    }

    public static int stateToInt(WorkInfo.State state) {
        switch (AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }

    public static WorkInfo.State intToState(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return WorkInfo.State.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i + " to State");
                        }
                        return WorkInfo.State.BLOCKED;
                    }
                    return WorkInfo.State.FAILED;
                }
                return WorkInfo.State.SUCCEEDED;
            }
            return WorkInfo.State.RUNNING;
        }
        return WorkInfo.State.ENQUEUED;
    }

    public static int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        int i = AnonymousClass1.$SwitchMap$androidx$work$BackoffPolicy[backoffPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
        }
        return 0;
    }

    public static BackoffPolicy intToBackoffPolicy(int i) {
        if (i != 0) {
            if (i == 1) {
                return BackoffPolicy.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
        }
        return BackoffPolicy.EXPONENTIAL;
    }

    public static int networkTypeToInt(NetworkType networkType) {
        int i = AnonymousClass1.$SwitchMap$androidx$work$NetworkType[networkType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static NetworkType intToNetworkType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return NetworkType.METERED;
                        }
                        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                            return NetworkType.TEMPORARILY_UNMETERED;
                        }
                        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
                    }
                    return NetworkType.NOT_ROAMING;
                }
                return NetworkType.UNMETERED;
            }
            return NetworkType.CONNECTED;
        }
        return NetworkType.NOT_REQUIRED;
    }

    /* renamed from: androidx.work.impl.model.WorkTypeConverters$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$BackoffPolicy;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$OutOfQuotaPolicy;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$WorkInfo$State;

        static {
            int[] iArr = new int[OutOfQuotaPolicy.values().length];
            $SwitchMap$androidx$work$OutOfQuotaPolicy = iArr;
            try {
                iArr[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$OutOfQuotaPolicy[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NetworkType.values().length];
            $SwitchMap$androidx$work$NetworkType = iArr2;
            try {
                iArr2[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[BackoffPolicy.values().length];
            $SwitchMap$androidx$work$BackoffPolicy = iArr3;
            try {
                iArr3[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$work$BackoffPolicy[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[WorkInfo.State.values().length];
            $SwitchMap$androidx$work$WorkInfo$State = iArr4;
            try {
                iArr4[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int outOfQuotaPolicyToInt(OutOfQuotaPolicy outOfQuotaPolicy) {
        int i = AnonymousClass1.$SwitchMap$androidx$work$OutOfQuotaPolicy[outOfQuotaPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + outOfQuotaPolicy + " to int");
        }
        return 0;
    }

    public static OutOfQuotaPolicy intToOutOfQuotaPolicy(int i) {
        if (i != 0) {
            if (i == 1) {
                return OutOfQuotaPolicy.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
        }
        return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:5|(2:6|7)|(5:9|10|(2:13|11)|14|15)|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
        r4.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] contentUriTriggersToByteArray(androidx.work.ContentUriTriggers r4) {
        /*
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            r2.writeInt(r1)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            java.util.Set r4 = r4.getTriggers()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
        L21:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            androidx.work.ContentUriTriggers$Trigger r1 = (androidx.work.ContentUriTriggers.Trigger) r1     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            android.net.Uri r3 = r1.getUri()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            r2.writeUTF(r3)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            boolean r1 = r1.shouldTriggerForDescendants()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            r2.writeBoolean(r1)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4b
            goto L21
        L40:
            r2.close()     // Catch: java.io.IOException -> L44
            goto L5e
        L44:
            r4 = move-exception
            r4.printStackTrace()
            goto L5e
        L49:
            r4 = move-exception
            goto L6c
        L4b:
            r4 = move-exception
            r1 = r2
            goto L51
        L4e:
            r4 = move-exception
            goto L6b
        L50:
            r4 = move-exception
        L51:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L5e
        L5a:
            r4 = move-exception
            r4.printStackTrace()
        L5e:
            r0.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r4 = move-exception
            r4.printStackTrace()
        L66:
            byte[] r4 = r0.toByteArray()
            return r4
        L6b:
            r2 = r1
        L6c:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r1 = move-exception
            r1.printStackTrace()
        L76:
            r0.close()     // Catch: java.io.IOException -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            r0.printStackTrace()
        L7e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters.contentUriTriggersToByteArray(androidx.work.ContentUriTriggers):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.ContentUriTriggers byteArrayToContentUriTriggers(byte[] r6) {
        /*
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r0.add(r3, r4)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L4b
        L2f:
            r6 = move-exception
            r6.printStackTrace()
            goto L4b
        L34:
            r6 = move-exception
            goto L57
        L36:
            r6 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
            goto L3e
        L3b:
            r0 = move-exception
            goto L59
        L3d:
            r2 = move-exception
        L3e:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L4b
            r6.close()     // Catch: java.io.IOException -> L47
            goto L4b
        L47:
            r6 = move-exception
            r6.printStackTrace()
        L4b:
            r1.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r6 = move-exception
            r6.printStackTrace()
        L53:
            return r0
        L54:
            r0 = move-exception
            r2 = r6
            r6 = r0
        L57:
            r0 = r6
            r6 = r2
        L59:
            if (r6 == 0) goto L63
            r6.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r6 = move-exception
            r6.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r6 = move-exception
            r6.printStackTrace()
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(byte[]):androidx.work.ContentUriTriggers");
    }

    private WorkTypeConverters() {
    }
}
