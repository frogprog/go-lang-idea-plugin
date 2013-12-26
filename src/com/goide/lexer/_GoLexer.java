/* The following code was generated by JFlex 1.4.3 on 12/26/13 2:28 PM */

package com.goide.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.goide.GoTypes;
import java.util.*;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import static com.goide.GoParserDefinition.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/26/13 2:28 PM from the specification file
 * <tt>go.flex</tt>
 */
public class _GoLexer implements FlexLexer, GoTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int MAYBE_SEMICOLON = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\42\1\20"+
    "\2\0\1\47\1\44\1\0\1\34\1\35\1\24\1\43\1\40\1\16"+
    "\1\17\1\4\1\12\7\11\1\30\1\10\1\36\1\37\1\46\1\41"+
    "\1\50\2\0\4\7\1\15\1\7\16\5\1\27\2\5\1\14\2\5"+
    "\1\31\1\26\1\33\1\45\1\5\1\25\1\54\1\51\1\65\1\67"+
    "\1\53\1\22\1\63\1\60\1\66\1\5\1\55\1\56\1\72\1\64"+
    "\1\61\1\70\1\5\1\52\1\71\1\57\1\62\1\21\1\73\1\13"+
    "\1\74\1\5\1\31\1\23\1\32\54\0\1\5\12\0\1\5\4\0"+
    "\1\5\5\0\27\5\1\0\37\5\1\0\u013f\5\31\0\162\5\4\0"+
    "\14\5\16\0\5\5\11\0\1\5\213\0\1\5\13\0\1\5\1\0"+
    "\3\5\1\0\1\5\1\0\24\5\1\0\54\5\1\0\46\5\1\0"+
    "\5\5\4\0\202\5\10\0\105\5\1\0\46\5\2\0\2\5\6\0"+
    "\20\5\41\0\46\5\2\0\1\5\7\0\47\5\110\0\33\5\5\0"+
    "\3\5\56\0\32\5\5\0\13\5\25\0\12\6\4\0\2\5\1\0"+
    "\143\5\1\0\1\5\17\0\2\5\7\0\2\5\12\6\3\5\2\0"+
    "\1\5\20\0\1\5\1\0\36\5\35\0\3\5\60\0\46\5\13\0"+
    "\1\5\u0152\0\66\5\3\0\1\5\22\0\1\5\7\0\12\5\4\0"+
    "\12\6\25\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5\1\0"+
    "\1\5\3\0\4\5\3\0\1\5\36\0\2\5\1\0\3\5\4\0"+
    "\12\6\2\5\23\0\6\5\4\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\2\5\1\0\2\5\37\0\4\5\1\0\1\5"+
    "\7\0\12\6\2\0\3\5\20\0\11\5\1\0\3\5\1\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\5\5\3\0\1\5\22\0\1\5"+
    "\17\0\2\5\4\0\12\6\25\0\10\5\2\0\2\5\2\0\26\5"+
    "\1\0\7\5\1\0\2\5\1\0\5\5\3\0\1\5\36\0\2\5"+
    "\1\0\3\5\4\0\12\6\1\0\1\5\21\0\1\5\1\0\6\5"+
    "\3\0\3\5\1\0\4\5\3\0\2\5\1\0\1\5\1\0\2\5"+
    "\3\0\2\5\3\0\3\5\3\0\10\5\1\0\3\5\55\0\11\6"+
    "\25\0\10\5\1\0\3\5\1\0\27\5\1\0\12\5\1\0\5\5"+
    "\46\0\2\5\4\0\12\6\25\0\10\5\1\0\3\5\1\0\27\5"+
    "\1\0\12\5\1\0\5\5\3\0\1\5\40\0\1\5\1\0\2\5"+
    "\4\0\12\6\25\0\10\5\1\0\3\5\1\0\27\5\1\0\20\5"+
    "\46\0\2\5\4\0\12\6\25\0\22\5\3\0\30\5\1\0\11\5"+
    "\1\0\1\5\2\0\7\5\72\0\60\5\1\0\2\5\14\0\7\5"+
    "\11\0\12\6\47\0\2\5\1\0\1\5\2\0\2\5\1\0\1\5"+
    "\2\0\1\5\6\0\4\5\1\0\7\5\1\0\3\5\1\0\1\5"+
    "\1\0\1\5\2\0\2\5\1\0\4\5\1\0\2\5\11\0\1\5"+
    "\2\0\5\5\1\0\1\5\11\0\12\6\2\0\2\5\42\0\1\5"+
    "\37\0\12\6\26\0\10\5\1\0\42\5\35\0\4\5\164\0\42\5"+
    "\1\0\5\5\1\0\2\5\25\0\12\6\6\0\6\5\112\0\46\5"+
    "\12\0\51\5\7\0\132\5\5\0\104\5\5\0\122\5\6\0\7\5"+
    "\1\0\77\5\1\0\1\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\47\5\1\0\1\5\1\0\4\5\2\0\37\5"+
    "\1\0\1\5\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5"+
    "\2\0\7\5\1\0\7\5\1\0\27\5\1\0\37\5\1\0\1\5"+
    "\1\0\4\5\2\0\7\5\1\0\47\5\1\0\23\5\16\0\11\6"+
    "\56\0\125\5\14\0\u026c\5\2\0\10\5\12\0\32\5\5\0\113\5"+
    "\25\0\15\5\1\0\4\5\16\0\22\5\16\0\22\5\16\0\15\5"+
    "\1\0\3\5\17\0\64\5\43\0\1\5\4\0\1\5\3\0\12\6"+
    "\46\0\12\6\6\0\130\5\10\0\51\5\127\0\35\5\51\0\12\6"+
    "\36\5\2\0\5\5\u038b\0\154\5\224\0\234\5\4\0\132\5\6\0"+
    "\26\5\2\0\6\5\2\0\46\5\2\0\6\5\2\0\10\5\1\0"+
    "\1\5\1\0\1\5\1\0\1\5\1\0\37\5\2\0\65\5\1\0"+
    "\7\5\1\0\1\5\3\0\3\5\1\0\7\5\3\0\4\5\2\0"+
    "\6\5\4\0\15\5\5\0\3\5\1\0\7\5\164\0\1\5\15\0"+
    "\1\5\202\0\1\5\4\0\1\5\2\0\12\5\1\0\1\5\3\0"+
    "\5\5\6\0\1\5\1\0\1\5\1\0\1\5\1\0\4\5\1\0"+
    "\3\5\1\0\7\5\3\0\3\5\5\0\5\5\u0ebb\0\2\5\52\0"+
    "\5\5\5\0\2\5\4\0\126\5\6\0\3\5\1\0\132\5\1\0"+
    "\4\5\5\0\50\5\4\0\136\5\21\0\30\5\70\0\20\5\u0200\0"+
    "\u19b6\5\112\0\u51a6\5\132\0\u048d\5\u0773\0\u2ba4\5\u215c\0\u012e\5\2\0"+
    "\73\5\225\0\7\5\14\0\5\5\5\0\1\5\1\0\12\5\1\0"+
    "\15\5\1\0\5\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0"+
    "\154\5\41\0\u016b\5\22\0\100\5\2\0\66\5\50\0\14\5\164\0"+
    "\5\5\1\0\207\5\23\0\12\6\7\0\32\5\6\0\32\5\13\0"+
    "\131\5\3\0\6\5\2\0\6\5\2\0\6\5\2\0\3\5\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\1\2\6"+
    "\1\7\1\10\1\11\2\5\1\12\1\13\1\11\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\13\5"+
    "\1\34\2\35\1\34\1\36\1\37\1\40\2\0\1\41"+
    "\1\42\1\43\1\0\1\44\1\45\1\0\1\11\1\0"+
    "\4\5\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
    "\1\65\1\66\1\67\5\5\1\70\3\5\1\71\10\5"+
    "\1\72\1\73\1\37\1\41\1\0\1\74\1\75\1\76"+
    "\1\77\1\5\1\100\1\5\1\101\1\102\1\103\20\5"+
    "\1\104\1\73\1\37\1\0\1\5\1\105\3\5\1\106"+
    "\1\107\1\110\1\111\1\112\12\5\1\73\1\0\1\5"+
    "\1\113\1\5\1\114\1\5\1\115\2\5\1\116\6\5"+
    "\1\117\2\5\1\120\2\5\1\121\1\122\1\123\3\5"+
    "\1\124\1\125\1\5\1\126\2\5\1\127\1\5\1\130";

  private static int [] zzUnpackAction() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\75\0\172\0\267\0\172\0\364\0\u0131\0\u016e"+
    "\0\u01ab\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319\0\u0356"+
    "\0\u0393\0\u03d0\0\172\0\172\0\172\0\172\0\172\0\u040d"+
    "\0\172\0\172\0\u044a\0\u0487\0\u04c4\0\u0501\0\u053e\0\u057b"+
    "\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac\0\u06e9\0\u0726\0\u0763"+
    "\0\u07a0\0\u07dd\0\u081a\0\u0857\0\u0894\0\172\0\172\0\u08d1"+
    "\0\u090e\0\u094b\0\u0988\0\172\0\u016e\0\u09c5\0\u0a02\0\172"+
    "\0\u0a3f\0\u0a7c\0\172\0\172\0\u0ab9\0\172\0\u0af6\0\u0b33"+
    "\0\u0b70\0\u0bad\0\u0bea\0\172\0\172\0\172\0\172\0\172"+
    "\0\172\0\172\0\172\0\172\0\172\0\u0c27\0\172\0\172"+
    "\0\172\0\u0c64\0\172\0\172\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58"+
    "\0\u0d95\0\u0dd2\0\u0e0f\0\u0e4c\0\u0e89\0\u0ec6\0\u0131\0\u0f03"+
    "\0\u0f40\0\u0f7d\0\u0fba\0\u0ff7\0\u1034\0\u1071\0\u10ae\0\u10eb"+
    "\0\u1128\0\u1165\0\u11a2\0\u11df\0\172\0\u0a7c\0\172\0\u0131"+
    "\0\u121c\0\u0131\0\u1259\0\172\0\172\0\172\0\u1296\0\u12d3"+
    "\0\u1310\0\u134d\0\u138a\0\u13c7\0\u1404\0\u1441\0\u147e\0\u14bb"+
    "\0\u14f8\0\u1535\0\u1572\0\u15af\0\u15ec\0\u1629\0\u0131\0\u1666"+
    "\0\172\0\u1165\0\u16a3\0\u0131\0\u16e0\0\u171d\0\u175a\0\u0131"+
    "\0\u0131\0\u0131\0\u0131\0\u0131\0\u1797\0\u17d4\0\u1811\0\u184e"+
    "\0\u188b\0\u18c8\0\u1905\0\u1942\0\u197f\0\u19bc\0\172\0\u1666"+
    "\0\u19f9\0\u0131\0\u1a36\0\u0131\0\u1a73\0\u0131\0\u1ab0\0\u1aed"+
    "\0\u0131\0\u1b2a\0\u1b67\0\u1ba4\0\u1be1\0\u1c1e\0\u1c5b\0\u0131"+
    "\0\u1c98\0\u1cd5\0\u0131\0\u1d12\0\u1d4f\0\u0131\0\u0131\0\u0131"+
    "\0\u1d8c\0\u1dc9\0\u1e06\0\u0131\0\u0131\0\u1e43\0\u0131\0\u1e80"+
    "\0\u1ebd\0\u0131\0\u1efa\0\u0131";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\7\1\10\1\7\2\11"+
    "\1\12\3\7\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\3\1\7\1\11\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\3\7\1\46\3\7\1\47\1\7\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\2\7\1\56\1\57\1\60\1\5"+
    "\1\61\70\56\76\0\2\4\76\0\1\62\17\0\1\63"+
    "\14\0\1\64\40\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\24\7\6\0\1\65\1\0\3\65\2\0\1\66"+
    "\1\0\1\67\10\0\1\65\22\0\1\66\12\0\1\70"+
    "\14\0\1\65\1\0\3\11\2\0\1\66\1\0\1\67"+
    "\10\0\1\11\22\0\1\66\12\0\1\70\14\0\1\65"+
    "\1\0\1\65\2\71\2\72\1\66\1\0\1\67\10\0"+
    "\1\65\22\0\1\66\12\0\1\70\24\0\1\73\22\0"+
    "\1\74\41\0\1\67\1\0\3\67\4\0\1\75\10\0"+
    "\1\67\44\0\1\15\2\0\15\15\1\76\5\15\1\77"+
    "\46\15\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\3\7\1\100\20\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\3\7\1\101\4\7\1\102\1\103\12\7"+
    "\23\0\1\104\15\0\1\105\74\0\1\106\33\0\25\22"+
    "\1\76\47\22\41\0\1\107\74\0\1\110\74\0\1\111"+
    "\74\0\1\112\1\0\1\113\72\0\1\114\2\0\1\115"+
    "\1\116\70\0\1\117\51\0\1\120\22\0\1\121\4\0"+
    "\1\122\67\0\1\123\74\0\1\124\6\0\1\125\31\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\1\7\1\126"+
    "\22\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\2\7\1\127\1\130\20\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\5\7\1\131\16\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\20\0\23\7\1\132\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\10\7\1\133"+
    "\13\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\3\7\1\134\3\7\1\135\1\136\13\7\5\0\11\7"+
    "\3\0\1\7\1\137\4\0\2\7\20\0\13\7\1\140"+
    "\5\7\1\141\2\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\2\7\1\142\21\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\3\7\1\143\20\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\2\7\1\144"+
    "\3\7\1\145\13\7\1\146\1\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\3\7\1\147\20\7\1\0"+
    "\1\57\77\0\1\150\17\0\1\151\50\0\1\62\2\0"+
    "\72\62\24\63\1\152\50\63\6\0\1\153\1\0\3\153"+
    "\3\0\1\154\11\0\1\153\12\0\1\154\37\0\1\67"+
    "\1\0\3\67\2\0\1\66\12\0\1\67\22\0\1\66"+
    "\12\0\1\155\14\0\1\65\1\0\1\65\2\71\2\0"+
    "\1\66\1\0\1\67\10\0\1\65\22\0\1\66\12\0"+
    "\1\70\15\0\4\156\2\0\1\156\4\0\1\156\5\0"+
    "\1\156\20\0\1\156\1\0\2\156\10\0\1\156\1\0"+
    "\1\156\24\0\1\157\66\0\3\15\4\0\3\15\3\0"+
    "\3\15\20\0\2\15\1\0\1\15\2\0\1\15\2\0"+
    "\1\15\1\0\1\15\15\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\1\7\1\160\22\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\5\7\1\161\16\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\1\7\1\162"+
    "\22\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\13\7\1\163\10\7\41\0\1\164\74\0\1\165\74\0"+
    "\1\166\40\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\2\7\1\167\21\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\6\7\1\170\15\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\13\7\1\171\10\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\20\7\1\172"+
    "\3\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\17\7\1\173\4\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\6\7\1\174\15\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\20\7\1\175\3\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\3\7\1\176"+
    "\20\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\13\7\1\177\10\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\6\7\1\200\15\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\17\7\1\201\4\7\5\0"+
    "\11\7\3\0\1\7\1\202\4\0\2\7\20\0\24\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\20\0\14\7"+
    "\1\203\7\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\5\7\1\204\16\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\1\7\1\205\22\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\20\0\15\7\1\206\6\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\20\0\17\7"+
    "\1\207\4\7\1\150\2\0\72\150\24\151\1\210\50\151"+
    "\4\63\1\211\17\63\1\212\50\63\6\0\1\153\1\0"+
    "\3\153\15\0\1\153\35\0\1\155\14\0\1\153\1\0"+
    "\3\153\15\0\1\153\51\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\5\7\1\213\16\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\14\7\1\214\7\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\3\7\1\215"+
    "\20\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\11\7\1\216\12\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\12\7\1\217\11\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\2\7\1\220\21\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\2\7\1\221"+
    "\21\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\10\7\1\222\13\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\2\7\1\223\21\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\13\7\1\224\10\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\6\7\1\225"+
    "\11\7\1\226\3\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\2\7\1\227\21\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\10\7\1\230\13\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\2\7\1\231"+
    "\1\232\20\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\4\7\1\233\17\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\2\7\1\234\21\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\20\0\11\7\1\235\12\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\20\0\6\7"+
    "\1\236\15\7\4\151\1\237\17\151\1\240\50\151\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\6\7\1\241"+
    "\15\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\4\7\1\242\17\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\1\7\1\243\22\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\2\7\1\244\21\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\15\7\1\245"+
    "\6\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\6\7\1\246\15\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\1\7\1\247\22\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\1\7\1\250\22\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\1\7\1\251"+
    "\22\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\11\7\1\252\12\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\3\7\1\253\20\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\14\7\1\254\7\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\14\7\1\255"+
    "\7\7\5\0\11\7\3\0\2\7\4\0\2\7\20\0"+
    "\14\7\1\256\7\7\5\0\11\7\3\0\2\7\4\0"+
    "\2\7\20\0\7\7\1\257\14\7\5\0\11\7\3\0"+
    "\2\7\4\0\2\7\20\0\13\7\1\260\10\7\5\0"+
    "\11\7\3\0\2\7\4\0\2\7\20\0\13\7\1\261"+
    "\10\7\5\0\11\7\3\0\1\7\1\262\4\0\2\7"+
    "\20\0\24\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\6\7\1\263\15\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\5\7\1\264\16\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\20\0\12\7\1\265\11\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\20\0\6\7"+
    "\1\266\15\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\6\7\1\267\15\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\7\7\1\270\14\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\20\0\1\7\1\271\22\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\20\0\11\7"+
    "\1\272\12\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\3\7\1\273\20\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\6\7\1\274\15\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\20\0\2\7\1\275\21\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\20\0\10\7"+
    "\1\276\13\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\2\7\1\277\21\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\14\7\1\300\7\7\5\0\11\7"+
    "\3\0\2\7\4\0\2\7\20\0\11\7\1\301\12\7"+
    "\5\0\11\7\3\0\2\7\4\0\2\7\20\0\2\7"+
    "\1\302\21\7\5\0\11\7\3\0\2\7\4\0\2\7"+
    "\20\0\12\7\1\303\11\7\5\0\11\7\3\0\2\7"+
    "\4\0\2\7\20\0\7\7\1\304\14\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7991];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\15\1\5\11\1\1\2\11"+
    "\23\1\2\11\4\1\1\11\2\0\1\1\1\11\1\1"+
    "\1\0\2\11\1\0\1\11\1\0\4\1\12\11\1\1"+
    "\3\11\1\1\2\11\27\1\1\0\1\11\1\1\1\11"+
    "\4\1\3\11\22\1\1\11\1\0\24\1\1\11\1\0"+
    "\44\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[196];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _GoLexer() {
    this((java.io.Reader)null);
  }

  private Stack<IElementType> gStringStack = new Stack<IElementType>();
  private Stack<IElementType> blockStack = new Stack<IElementType>();

  private int afterComment = YYINITIAL;
  private int afterNls = YYINITIAL;
  private int afterBrace = YYINITIAL;

  private void clearStacks(){
    gStringStack.clear();
    blockStack.clear();
  }

  private Stack<IElementType> braceCount = new Stack<IElementType>();



  public _GoLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _GoLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1320) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 52: 
          { return SHIFT_LEFT;
          }
        case 89: break;
        case 59: 
          { return MULTILINE_COMMENT;
          }
        case 90: break;
        case 65: 
          { return BIT_CLEAR_ASSIGN;
          }
        case 91: break;
        case 69: 
          { return( FUNC );
          }
        case 92: break;
        case 2: 
          { return NLS;
          }
        case 93: break;
        case 15: 
          { return LPAREN;
          }
        case 94: break;
        case 25: 
          { return LESS;
          }
        case 95: break;
        case 50: 
          { return SEND_CHANNEL;
          }
        case 96: break;
        case 81: 
          { return( SELECT );
          }
        case 97: break;
        case 47: 
          { return COND_AND;
          }
        case 98: break;
        case 36: 
          { yybegin(MAYBE_SEMICOLON); return MINUS_MINUS;
          }
        case 99: break;
        case 44: 
          { return PLUS_ASSIGN;
          }
        case 100: break;
        case 9: 
          { yybegin(MAYBE_SEMICOLON); return STRING;
          }
        case 101: break;
        case 33: 
          { yybegin(MAYBE_SEMICOLON); return FLOAT;
          }
        case 102: break;
        case 72: 
          { return( GOTO );
          }
        case 103: break;
        case 17: 
          { return COLON;
          }
        case 104: break;
        case 42: 
          { return EQ;
          }
        case 105: break;
        case 16: 
          { yybegin(MAYBE_SEMICOLON); return RPAREN;
          }
        case 106: break;
        case 84: 
          { return( DEFAULT );
          }
        case 107: break;
        case 68: 
          { return( MAP );
          }
        case 108: break;
        case 3: 
          { return WS;
          }
        case 109: break;
        case 77: 
          { return( CONST );
          }
        case 110: break;
        case 56: 
          { return( GO );
          }
        case 111: break;
        case 18: 
          { return SEMICOLON;
          }
        case 112: break;
        case 79: 
          { yybegin(MAYBE_SEMICOLON); return RETURN ;
          }
        case 113: break;
        case 19: 
          { return COMMA;
          }
        case 114: break;
        case 74: 
          { return( CHAN );
          }
        case 115: break;
        case 60: 
          { yybegin(MAYBE_SEMICOLON); return FLOAT_I;
          }
        case 116: break;
        case 35: 
          { yybegin(MAYBE_SEMICOLON); return OCT;
          }
        case 117: break;
        case 57: 
          { return IF ;
          }
        case 118: break;
        case 38: 
          { return COND_OR;
          }
        case 119: break;
        case 66: 
          { return SHIFT_LEFT_ASSIGN;
          }
        case 120: break;
        case 80: 
          { return IMPORT ;
          }
        case 121: break;
        case 22: 
          { return PLUS;
          }
        case 122: break;
        case 71: 
          { return TYPE;
          }
        case 123: break;
        case 23: 
          { return BIT_AND;
          }
        case 124: break;
        case 46: 
          { return BIT_AND_ASSIGN;
          }
        case 125: break;
        case 82: 
          { return( STRUCT );
          }
        case 126: break;
        case 61: 
          { yybegin(MAYBE_SEMICOLON); return HEX;
          }
        case 127: break;
        case 4: 
          { return QUOTIENT;
          }
        case 128: break;
        case 10: 
          { return BIT_OR;
          }
        case 129: break;
        case 37: 
          { return MINUS_ASSIGN;
          }
        case 130: break;
        case 8: 
          { return DOT;
          }
        case 131: break;
        case 75: 
          { yybegin(MAYBE_SEMICOLON); return BREAK;
          }
        case 132: break;
        case 53: 
          { return REMAINDER_ASSIGN;
          }
        case 133: break;
        case 49: 
          { return BIT_XOR_ASSIGN;
          }
        case 134: break;
        case 41: 
          { return VAR_ASSIGN;
          }
        case 135: break;
        case 73: 
          { return( CASE );
          }
        case 136: break;
        case 88: 
          { yybegin(MAYBE_SEMICOLON); return FALLTHROUGH;
          }
        case 137: break;
        case 58: 
          { return LINE_COMMENT;
          }
        case 138: break;
        case 5: 
          { yybegin(MAYBE_SEMICOLON); return IDENTIFIER;
          }
        case 139: break;
        case 28: 
          { yybegin(YYINITIAL); yypushback(yytext().length());
          }
        case 140: break;
        case 39: 
          { return BIT_OR_ASSIGN;
          }
        case 141: break;
        case 48: 
          { return BIT_CLEAR;
          }
        case 142: break;
        case 12: 
          { return LBRACE;
          }
        case 143: break;
        case 20: 
          { return ASSIGN;
          }
        case 144: break;
        case 24: 
          { return BIT_XOR;
          }
        case 145: break;
        case 64: 
          { return FOR ;
          }
        case 146: break;
        case 63: 
          { return VAR;
          }
        case 147: break;
        case 30: 
          { return( LINE_COMMENT );
          }
        case 148: break;
        case 26: 
          { return REMAINDER;
          }
        case 149: break;
        case 21: 
          { return NOT;
          }
        case 150: break;
        case 43: 
          { return NOT_EQ;
          }
        case 151: break;
        case 40: 
          { return MUL_ASSIGN;
          }
        case 152: break;
        case 87: 
          { return( INTERFACE );
          }
        case 153: break;
        case 62: 
          { return TRIPLE_DOT;
          }
        case 154: break;
        case 29: 
          { yybegin(YYINITIAL); yypushback(yytext().length()); return SEMICOLON_SYNTHETIC;
          }
        case 155: break;
        case 78: 
          { return( DEFER );
          }
        case 156: break;
        case 6: 
          { yybegin(MAYBE_SEMICOLON); return INT;
          }
        case 157: break;
        case 11: 
          { return MUL;
          }
        case 158: break;
        case 45: 
          { yybegin(MAYBE_SEMICOLON); return PLUS_PLUS;
          }
        case 159: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 160: break;
        case 85: 
          { return( PACKAGE );
          }
        case 161: break;
        case 14: 
          { yybegin(MAYBE_SEMICOLON); return RBRACK;
          }
        case 162: break;
        case 7: 
          { return MINUS;
          }
        case 163: break;
        case 76: 
          { return RANGE;
          }
        case 164: break;
        case 31: 
          { return( MULTILINE_COMMENT );
          }
        case 165: break;
        case 86: 
          { yybegin(MAYBE_SEMICOLON); return CONTINUE ;
          }
        case 166: break;
        case 27: 
          { return GREATER;
          }
        case 167: break;
        case 34: 
          { yybegin(MAYBE_SEMICOLON); return DECIMAL_I;
          }
        case 168: break;
        case 51: 
          { return LESS_OR_EQUAL;
          }
        case 169: break;
        case 83: 
          { return( SWITCH );
          }
        case 170: break;
        case 67: 
          { return SHIFT_RIGHT_ASSIGN;
          }
        case 171: break;
        case 70: 
          { return( ELSE );
          }
        case 172: break;
        case 55: 
          { return SHIFT_RIGHT;
          }
        case 173: break;
        case 32: 
          { return QUOTIENT_ASSIGN;
          }
        case 174: break;
        case 13: 
          { yybegin(MAYBE_SEMICOLON); return LBRACE;
          }
        case 175: break;
        case 54: 
          { return GREATER_OR_EQUAL;
          }
        case 176: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}