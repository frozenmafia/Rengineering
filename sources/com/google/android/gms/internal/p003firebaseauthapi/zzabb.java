package com.google.android.gms.internal.p003firebaseauthapi;

import com.sendbird.android.constant.StringSet;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.http.message.TokenParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabb  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzabb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzaaz zzaazVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzaazVar, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(TokenParser.SP);
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzabx.zza(zzyu.zzp((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzyu) {
                sb.append(": \"");
                sb.append(zzabx.zza((zzyu) obj));
                sb.append('\"');
            } else if (obj instanceof zzzw) {
                sb.append(" {");
                zzd((zzzw) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zzb(sb, i4, StringSet.key, entry2.getKey());
                zzb(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(TokenParser.SP);
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzaaz zzaazVar, StringBuilder sb, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzaazVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzc(concat), zzzw.zzD(method2, zzaazVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), zzzw.zzD(method3, zzaazVar, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object zzD = zzzw.zzD(method4, zzaazVar, new Object[0]);
                    if (method5 == null) {
                        if (zzD instanceof Boolean) {
                            if (((Boolean) zzD).booleanValue()) {
                                zzb(sb, i, zzc(concat3), zzD);
                            }
                        } else if (zzD instanceof Integer) {
                            if (((Integer) zzD).intValue() != 0) {
                                zzb(sb, i, zzc(concat3), zzD);
                            }
                        } else if (zzD instanceof Float) {
                            if (((Float) zzD).floatValue() != 0.0f) {
                                zzb(sb, i, zzc(concat3), zzD);
                            }
                        } else if (zzD instanceof Double) {
                            if (((Double) zzD).doubleValue() != 0.0d) {
                                zzb(sb, i, zzc(concat3), zzD);
                            }
                        } else {
                            if (zzD instanceof String) {
                                equals = zzD.equals("");
                            } else if (zzD instanceof zzyu) {
                                equals = zzD.equals(zzyu.zzb);
                            } else if (zzD instanceof zzaaz) {
                                if (zzD != ((zzaaz) zzD).zzI()) {
                                    zzb(sb, i, zzc(concat3), zzD);
                                }
                            } else {
                                if ((zzD instanceof Enum) && ((Enum) zzD).ordinal() == 0) {
                                }
                                zzb(sb, i, zzc(concat3), zzD);
                            }
                            if (!equals) {
                                zzb(sb, i, zzc(concat3), zzD);
                            }
                        }
                    } else if (((Boolean) zzzw.zzD(method5, zzaazVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, zzc(concat3), zzD);
                    }
                }
            }
        }
        if (!(zzaazVar instanceof zzzt)) {
            zzaca zzacaVar = ((zzzw) zzaazVar).zzc;
            if (zzacaVar != null) {
                zzacaVar.zzg(sb, i);
                return;
            }
            return;
        }
        zzzo zzzoVar = ((zzzt) zzaazVar).zzb;
        throw null;
    }
}
