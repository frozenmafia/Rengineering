package com.facebook.soloader;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import o.AbstractSavedStateViewModelFactory;
import o.onRequery;
/* loaded from: classes4.dex */
public final class MinElf {

    /* loaded from: classes4.dex */
    public enum ISA {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        
        private final String value;

        ISA(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    private static String[] values(AbstractSavedStateViewModelFactory abstractSavedStateViewModelFactory) throws IOException {
        int i = 0;
        while (true) {
            try {
                return ah$a(abstractSavedStateViewModelFactory);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i > 4) {
                    throw e;
                }
                Thread.interrupted();
                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                abstractSavedStateViewModelFactory.ag$a();
            }
        }
    }

    public static String[] valueOf(onRequery onrequery) throws IOException {
        if (onrequery instanceof AbstractSavedStateViewModelFactory) {
            return values((AbstractSavedStateViewModelFactory) onrequery);
        }
        return ah$a(onrequery);
    }

    private static String[] ah$a(onRequery onrequery) throws IOException {
        long values;
        long j;
        boolean z;
        long minElf;
        long j2;
        long j3;
        long values2;
        long j4;
        long minElf2;
        long minElf3;
        long minElf4;
        long values3;
        long values4;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (values(onrequery, allocate, 0L) != 1179403647) {
            throw new ElfError("file is not ELF: 0x" + Long.toHexString(values));
        }
        boolean z2 = ah$a(onrequery, allocate, 4L) == 1;
        if (ah$a(onrequery, allocate, 5L) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        long values5 = z2 ? values(onrequery, allocate, 28L) : toString(onrequery, allocate, 32L);
        long valueOf = z2 ? valueOf(onrequery, allocate, 44L) : valueOf(onrequery, allocate, 56L);
        int valueOf2 = valueOf(onrequery, allocate, z2 ? 42L : 54L);
        if (valueOf == 65535) {
            long values6 = z2 ? values(onrequery, allocate, 32L) : toString(onrequery, allocate, 40L);
            if (z2) {
                values4 = values(onrequery, allocate, values6 + 28);
            } else {
                values4 = values(onrequery, allocate, values6 + 44);
            }
            valueOf = values4;
        }
        long j5 = values5;
        long j6 = 0;
        while (true) {
            if (j6 >= valueOf) {
                j = 0;
                break;
            }
            if (z2) {
                values3 = values(onrequery, allocate, j5 + 0);
            } else {
                values3 = values(onrequery, allocate, j5 + 0);
            }
            if (values3 != 2) {
                j5 += valueOf2;
                j6++;
            } else if (z2) {
                j = values(onrequery, allocate, j5 + 4);
            } else {
                j = toString(onrequery, allocate, j5 + 8);
            }
        }
        long j7 = 0;
        if (j == 0) {
            throw new ElfError("ELF file does not contain dynamic linking information");
        }
        long j8 = j;
        long j9 = 0;
        int i = 0;
        while (true) {
            if (z2) {
                z = z2;
                minElf = values(onrequery, allocate, j8 + j7);
            } else {
                z = z2;
                minElf = toString(onrequery, allocate, j8 + j7);
            }
            if (minElf == 1) {
                j2 = j;
                if (i == Integer.MAX_VALUE) {
                    throw new ElfError("malformed DT_NEEDED section");
                }
                i++;
            } else {
                j2 = j;
                if (minElf == 5) {
                    j9 = z ? values(onrequery, allocate, j8 + 4) : toString(onrequery, allocate, j8 + 8);
                }
            }
            long j10 = 16;
            j8 += z ? 8L : 16L;
            j7 = 0;
            if (minElf != 0) {
                z2 = z;
                j = j2;
            } else if (j9 == 0) {
                throw new ElfError("Dynamic section string-table not found");
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= valueOf) {
                        j3 = 0;
                        break;
                    }
                    if (z) {
                        values2 = values(onrequery, allocate, values5 + j7);
                    } else {
                        values2 = values(onrequery, allocate, values5 + j7);
                    }
                    if (values2 == 1) {
                        if (z) {
                            minElf2 = values(onrequery, allocate, values5 + 8);
                        } else {
                            minElf2 = toString(onrequery, allocate, values5 + j10);
                        }
                        if (z) {
                            j4 = valueOf;
                            minElf3 = values(onrequery, allocate, values5 + 20);
                        } else {
                            j4 = valueOf;
                            minElf3 = toString(onrequery, allocate, values5 + 40);
                        }
                        if (minElf2 <= j9 && j9 < minElf3 + minElf2) {
                            if (z) {
                                minElf4 = values(onrequery, allocate, values5 + 4);
                            } else {
                                minElf4 = toString(onrequery, allocate, values5 + 8);
                            }
                            j3 = minElf4 + (j9 - minElf2);
                        }
                    } else {
                        j4 = valueOf;
                    }
                    values5 += valueOf2;
                    i2++;
                    valueOf = j4;
                    j10 = 16;
                    j7 = 0;
                }
                long j11 = 0;
                if (j3 == 0) {
                    throw new ElfError("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i];
                int i3 = 0;
                while (true) {
                    long j12 = j2 + j11;
                    long values7 = z ? values(onrequery, allocate, j12) : toString(onrequery, allocate, j12);
                    if (values7 == 1) {
                        strArr[i3] = ag$a(onrequery, allocate, (z ? values(onrequery, allocate, j2 + 4) : toString(onrequery, allocate, j2 + 8)) + j3);
                        if (i3 == Integer.MAX_VALUE) {
                            throw new ElfError("malformed DT_NEEDED section");
                        }
                        i3++;
                    }
                    j2 += z ? 8L : 16L;
                    if (values7 == 0) {
                        if (i3 == i) {
                            return strArr;
                        }
                        throw new ElfError("malformed DT_NEEDED section");
                    }
                    j11 = 0;
                }
            }
        }
    }

    private static String ag$a(onRequery onrequery, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            short ah$a = ah$a(onrequery, byteBuffer, j);
            if (ah$a != 0) {
                sb.append((char) ah$a);
                j++;
            } else {
                return sb.toString();
            }
        }
    }

    private static void values(onRequery onrequery, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int ah$a;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (ah$a = onrequery.ah$a(byteBuffer, j)) != -1) {
            j += ah$a;
        }
        if (byteBuffer.remaining() > 0) {
            throw new ElfError("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    private static long toString(onRequery onrequery, ByteBuffer byteBuffer, long j) throws IOException {
        values(onrequery, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    private static long values(onRequery onrequery, ByteBuffer byteBuffer, long j) throws IOException {
        values(onrequery, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static int valueOf(onRequery onrequery, ByteBuffer byteBuffer, long j) throws IOException {
        values(onrequery, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    private static short ah$a(onRequery onrequery, ByteBuffer byteBuffer, long j) throws IOException {
        values(onrequery, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class ElfError extends RuntimeException {
        ElfError(String str) {
            super(str);
        }
    }
}
