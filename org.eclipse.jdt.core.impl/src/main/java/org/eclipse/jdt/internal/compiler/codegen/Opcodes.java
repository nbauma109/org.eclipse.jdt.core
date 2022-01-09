/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 *     Jesper S Moller - Contributions for
 *							Bug 405066 - [1.8][compiler][codegen] Implement code generation infrastructure for JSR335
 *******************************************************************************/
package org.eclipse.jdt.internal.compiler.codegen;

public interface Opcodes {

	byte OPC_nop = 0;
	byte OPC_aconst_null = 1;
	byte OPC_iconst_m1 = 2;
	byte OPC_iconst_0 = 3;
	byte OPC_iconst_1 = 4;
	byte OPC_iconst_2 = 5;
	byte OPC_iconst_3 = 6;
	byte OPC_iconst_4 = 7;
	byte OPC_iconst_5 = 8;
	byte OPC_lconst_0 = 9;
	byte OPC_lconst_1 = 10;
	byte OPC_fconst_0 = 11;
	byte OPC_fconst_1 = 12;
	byte OPC_fconst_2 = 13;
	byte OPC_dconst_0 = 14;
	byte OPC_dconst_1 = 15;
	byte OPC_bipush = 16;
	byte OPC_sipush = 17;
	byte OPC_ldc = 18;
	byte OPC_ldc_w = 19;
	byte OPC_ldc2_w = 20;
	byte OPC_iload = 21;
	byte OPC_lload = 22;
	byte OPC_fload = 23;
	byte OPC_dload = 24;
	byte OPC_aload = 25;
	byte OPC_iload_0 = 26;
	byte OPC_iload_1 = 27;
	byte OPC_iload_2 = 28;
	byte OPC_iload_3 = 29;
	byte OPC_lload_0 = 30;
	byte OPC_lload_1 = 31;
	byte OPC_lload_2 = 32;
	byte OPC_lload_3 = 33;
	byte OPC_fload_0 = 34;
	byte OPC_fload_1 = 35;
	byte OPC_fload_2 = 36;
	byte OPC_fload_3 = 37;
	byte OPC_dload_0 = 38;
	byte OPC_dload_1 = 39;
	byte OPC_dload_2 = 40;
	byte OPC_dload_3 = 41;
	byte OPC_aload_0 = 42;
	byte OPC_aload_1 = 43;
	byte OPC_aload_2 = 44;
	byte OPC_aload_3 = 45;
	byte OPC_iaload = 46;
	byte OPC_laload = 47;
	byte OPC_faload = 48;
	byte OPC_daload = 49;
	byte OPC_aaload = 50;
	byte OPC_baload = 51;
	byte OPC_caload = 52;
	byte OPC_saload = 53;
	byte OPC_istore = 54;
	byte OPC_lstore = 55;
	byte OPC_fstore = 56;
	byte OPC_dstore = 57;
	byte OPC_astore = 58;
	byte OPC_istore_0 = 59;
	byte OPC_istore_1 = 60;
	byte OPC_istore_2 = 61;
	byte OPC_istore_3 = 62;
	byte OPC_lstore_0 = 63;
	byte OPC_lstore_1 = 64;
	byte OPC_lstore_2 = 65;
	byte OPC_lstore_3 = 66;
	byte OPC_fstore_0 = 67;
	byte OPC_fstore_1 = 68;
	byte OPC_fstore_2 = 69;
	byte OPC_fstore_3 = 70;
	byte OPC_dstore_0 = 71;
	byte OPC_dstore_1 = 72;
	byte OPC_dstore_2 = 73;
	byte OPC_dstore_3 = 74;
	byte OPC_astore_0 = 75;
	byte OPC_astore_1 = 76;
	byte OPC_astore_2 = 77;
	byte OPC_astore_3 = 78;
	byte OPC_iastore = 79;
	byte OPC_lastore = 80;
	byte OPC_fastore = 81;
	byte OPC_dastore = 82;
	byte OPC_aastore = 83;
	byte OPC_bastore = 84;
	byte OPC_castore = 85;
	byte OPC_sastore = 86;
	byte OPC_pop = 87;
	byte OPC_pop2 = 88;
	byte OPC_dup = 89;
	byte OPC_dup_x1 = 90;
	byte OPC_dup_x2 = 91;
	byte OPC_dup2 = 92;
	byte OPC_dup2_x1 = 93;
	byte OPC_dup2_x2 = 94;
	byte OPC_swap = 95;
	byte OPC_iadd = 96;
	byte OPC_ladd = 97;
	byte OPC_fadd = 98;
	byte OPC_dadd = 99;
	byte OPC_isub = 100;
	byte OPC_lsub = 101;
	byte OPC_fsub = 102;
	byte OPC_dsub = 103;
	byte OPC_imul = 104;
	byte OPC_lmul = 105;
	byte OPC_fmul = 106;
	byte OPC_dmul = 107;
	byte OPC_idiv = 108;
	byte OPC_ldiv = 109;
	byte OPC_fdiv = 110;
	byte OPC_ddiv = 111;
	byte OPC_irem = 112;
	byte OPC_lrem = 113;
	byte OPC_frem = 114;
	byte OPC_drem = 115;
	byte OPC_ineg = 116;
	byte OPC_lneg = 117;
	byte OPC_fneg = 118;
	byte OPC_dneg = 119;
	byte OPC_ishl = 120;
	byte OPC_lshl = 121;
	byte OPC_ishr = 122;
	byte OPC_lshr = 123;
	byte OPC_iushr = 124;
	byte OPC_lushr = 125;
	byte OPC_iand = 126;
	byte OPC_land = 127;
	byte OPC_ior = (byte) 128;
	byte OPC_lor = (byte) 129;
	byte OPC_ixor = (byte) 130;
	byte OPC_lxor = (byte) 131;
	byte OPC_iinc = (byte) 132;
	byte OPC_i2l = (byte) 133;
	byte OPC_i2f = (byte) 134;
	byte OPC_i2d = (byte) 135;
	byte OPC_l2i = (byte) 136;
	byte OPC_l2f = (byte) 137;
	byte OPC_l2d = (byte) 138;
	byte OPC_f2i = (byte) 139;
	byte OPC_f2l = (byte) 140;
	byte OPC_f2d = (byte) 141;
	byte OPC_d2i = (byte) 142;
	byte OPC_d2l = (byte) 143;
	byte OPC_d2f = (byte) 144;
	byte OPC_i2b = (byte) 145;
	byte OPC_i2c = (byte) 146;
	byte OPC_i2s = (byte) 147;
	byte OPC_lcmp = (byte) 148;
	byte OPC_fcmpl = (byte) 149;
	byte OPC_fcmpg = (byte) 150;
	byte OPC_dcmpl = (byte) 151;
	byte OPC_dcmpg = (byte) 152;
	byte OPC_ifeq = (byte) 153;
	byte OPC_ifne = (byte) 154;
	byte OPC_iflt = (byte) 155;
	byte OPC_ifge = (byte) 156;
	byte OPC_ifgt = (byte) 157;
	byte OPC_ifle = (byte) 158;
	byte OPC_if_icmpeq = (byte) 159;
	byte OPC_if_icmpne = (byte) 160;
	byte OPC_if_icmplt = (byte) 161;
	byte OPC_if_icmpge = (byte) 162;
	byte OPC_if_icmpgt = (byte) 163;
	byte OPC_if_icmple = (byte) 164;
	byte OPC_if_acmpeq = (byte) 165;
	byte OPC_if_acmpne = (byte) 166;
	byte OPC_goto = (byte) 167;
	byte OPC_jsr = (byte) 168;
	byte OPC_ret = (byte) 169;
	byte OPC_tableswitch = (byte) 170;
	byte OPC_lookupswitch = (byte) 171;
	byte OPC_ireturn = (byte) 172;
	byte OPC_lreturn = (byte) 173;
	byte OPC_freturn = (byte) 174;
	byte OPC_dreturn = (byte) 175;
	byte OPC_areturn = (byte) 176;
	byte OPC_return = (byte) 177;
	byte OPC_getstatic = (byte) 178;
	byte OPC_putstatic = (byte) 179;
	byte OPC_getfield = (byte) 180;
	byte OPC_putfield = (byte) 181;
	byte OPC_invokevirtual = (byte) 182;
	byte OPC_invokespecial = (byte) 183;
	byte OPC_invokestatic = (byte) 184;
	byte OPC_invokeinterface = (byte) 185;
	byte OPC_invokedynamic = (byte) 186;
	byte OPC_new = (byte) 187;
	byte OPC_newarray = (byte) 188;
	byte OPC_anewarray = (byte) 189;
	byte OPC_arraylength = (byte) 190;
	byte OPC_athrow = (byte) 191;
	byte OPC_checkcast = (byte) 192;
	byte OPC_instanceof = (byte) 193;
	byte OPC_monitorenter = (byte) 194;
	byte OPC_monitorexit = (byte) 195;
	byte OPC_wide = (byte) 196;
	byte OPC_multianewarray = (byte) 197;
	byte OPC_ifnull = (byte) 198;
	byte OPC_ifnonnull = (byte) 199;
	byte OPC_goto_w = (byte) 200;
	byte OPC_jsr_w = (byte) 201;
}
