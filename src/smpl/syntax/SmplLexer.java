/* The following code was generated by JFlex 1.4.3 on 12/17/16 12:49 AM */

package smpl.syntax;

/* Specification for ArithExp tokens */

// user customisations
import java_cup.runtime.*;

// Jlex directives
    

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/17/16 12:49 AM from the specification file
 * <tt>SmplLexer</tt>
 */
public class SmplLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\2\1\2\1\13\1\0\1\2\1\1\22\0\1\2\1\30"+
    "\1\12\1\56\1\0\1\17\1\23\1\0\1\41\1\42\1\16\1\6"+
    "\1\45\1\7\1\5\1\15\2\70\10\4\1\21\1\46\1\27\1\22"+
    "\1\26\1\55\1\47\6\11\24\3\1\43\1\14\1\44\1\20\1\3"+
    "\1\0\1\34\1\62\1\53\1\35\1\51\1\10\1\3\1\66\1\54"+
    "\2\3\1\50\1\3\1\31\1\32\1\52\1\63\1\36\1\57\1\33"+
    "\1\61\1\64\1\3\1\67\1\65\1\60\1\37\1\24\1\40\1\25"+
    "\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\0\1\6"+
    "\2\0\1\7\1\10\4\3\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\5\3\1\0\1\3"+
    "\17\0\1\22\2\0\1\23\1\0\1\24\1\0\1\25"+
    "\4\3\1\26\11\3\1\27\1\30\1\31\1\32\3\0"+
    "\2\3\1\33\1\34\1\35\1\36\1\37\1\40\1\0"+
    "\1\41\1\42\1\43\1\44\1\0\1\45\5\0\2\3"+
    "\1\46\2\3\1\47\7\3\1\50\2\3\1\51\2\52"+
    "\1\0\1\53\1\54\2\3\1\55\1\56\1\57\1\60"+
    "\1\61\1\0\1\24\1\62\1\63\1\64\1\65\1\66"+
    "\1\67\1\3\1\70\1\71\1\72\1\3\1\73\1\74"+
    "\1\0\1\75\1\3\1\76\2\3\1\77\1\100\1\0"+
    "\2\3\1\101\1\3\1\102\1\103\1\104";

  private static int [] zzUnpackAction() {
    int [] result = new int[156];
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
    "\0\0\0\71\0\71\0\162\0\253\0\344\0\u011d\0\u011d"+
    "\0\u0156\0\u018f\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5"+
    "\0\u0201\0\u0201\0\u0201\0\u0201\0\u031e\0\u0201\0\u0201\0\u0201"+
    "\0\u0201\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad"+
    "\0\u04e6\0\u051f\0\u0558\0\u0591\0\u05ca\0\u0603\0\u063c\0\u0675"+
    "\0\u06ae\0\u06e7\0\u0720\0\u0759\0\u0792\0\u07cb\0\u0804\0\344"+
    "\0\344\0\u083d\0\u0201\0\u0876\0\u08af\0\u08e8\0\u0201\0\u0921"+
    "\0\u095a\0\u0993\0\u09cc\0\u0201\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0"+
    "\0\u0ae9\0\u0b22\0\u0b5b\0\u0b94\0\u0bcd\0\162\0\u0201\0\u0201"+
    "\0\u0201\0\u0c06\0\u0c3f\0\u0c78\0\u0cb1\0\u0cea\0\u0201\0\u0201"+
    "\0\u0201\0\u0201\0\u0201\0\u0201\0\u0d23\0\u0201\0\u0201\0\u0201"+
    "\0\u0201\0\u0d5c\0\u0201\0\u0d95\0\u0dce\0\u0e07\0\u0e40\0\u0e79"+
    "\0\u0eb2\0\u0eeb\0\162\0\u0f24\0\u0f5d\0\162\0\u0f96\0\u0fcf"+
    "\0\u1008\0\u1041\0\u107a\0\u10b3\0\u10ec\0\162\0\u1125\0\u115e"+
    "\0\162\0\u0201\0\u1197\0\u11d0\0\u0c3f\0\u0c78\0\u1209\0\u1242"+
    "\0\u0201\0\u0201\0\u0201\0\u0201\0\u0201\0\u127b\0\u0201\0\u0201"+
    "\0\162\0\u12b4\0\162\0\162\0\162\0\u12ed\0\u0201\0\u1326"+
    "\0\162\0\u135f\0\162\0\162\0\u1398\0\162\0\u13d1\0\u0201"+
    "\0\u140a\0\u1443\0\u0201\0\u147c\0\u14b5\0\u14ee\0\u1527\0\u0201"+
    "\0\u1560\0\162\0\162\0\162";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[156];
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
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\2\4\1\11\1\2\1\0\1\12\3\0\1\13\3\0"+
    "\1\14\3\0\1\15\1\4\1\16\1\4\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\0\1\37"+
    "\1\40\10\4\1\5\6\0\1\41\1\42\5\0\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\0"+
    "\1\53\1\54\1\55\1\0\1\56\1\0\1\57\37\0"+
    "\2\4\1\0\4\4\17\0\6\4\11\0\5\4\2\0"+
    "\12\4\4\0\1\5\1\60\62\0\1\5\4\0\1\60"+
    "\63\0\1\60\4\0\1\5\1\61\50\0\1\62\11\0"+
    "\1\5\12\11\1\63\1\0\1\64\54\11\15\0\1\65"+
    "\1\66\116\0\1\67\120\0\2\4\1\0\4\4\17\0"+
    "\1\4\1\70\4\4\11\0\5\4\2\0\12\4\3\0"+
    "\2\4\1\0\4\4\17\0\6\4\11\0\5\4\2\0"+
    "\7\4\1\71\2\4\3\0\2\4\1\0\4\4\17\0"+
    "\6\4\11\0\1\4\1\72\3\4\2\0\12\4\3\0"+
    "\2\4\1\0\4\4\17\0\6\4\11\0\1\4\1\73"+
    "\3\4\2\0\12\4\21\0\1\74\52\0\2\4\1\0"+
    "\4\4\17\0\3\4\1\75\2\4\11\0\1\4\1\76"+
    "\2\4\1\77\2\0\12\4\3\0\2\4\1\0\4\4"+
    "\17\0\6\4\11\0\1\100\4\4\2\0\4\4\1\101"+
    "\5\4\3\0\2\4\1\0\4\4\17\0\3\4\1\102"+
    "\1\4\1\103\11\0\5\4\2\0\12\4\3\0\2\4"+
    "\1\0\4\4\17\0\3\4\1\104\1\105\1\4\11\0"+
    "\5\4\2\0\12\4\3\0\2\4\1\0\2\4\1\106"+
    "\1\4\17\0\6\4\11\0\5\4\2\0\12\4\10\0"+
    "\1\107\22\0\1\110\15\0\1\111\1\0\1\112\6\0"+
    "\1\113\4\0\1\114\4\0\2\4\1\0\4\4\17\0"+
    "\6\4\11\0\4\4\1\115\2\0\2\4\1\116\7\4"+
    "\1\0\2\117\10\0\1\117\56\0\2\120\10\0\1\120"+
    "\56\0\2\121\10\0\1\121\56\0\2\122\10\0\1\122"+
    "\56\0\2\123\10\0\1\123\56\0\2\124\10\0\1\124"+
    "\77\0\1\125\47\0\2\126\10\0\1\126\56\0\2\127"+
    "\10\0\1\127\56\0\2\130\10\0\1\130\56\0\2\131"+
    "\10\0\1\131\6\0\1\132\47\0\2\133\10\0\1\133"+
    "\6\0\1\134\70\0\1\135\104\0\1\136\63\0\1\137"+
    "\121\0\1\113\4\0\1\114\1\0\13\11\1\0\55\11"+
    "\13\65\1\0\55\65\16\66\1\140\52\66\3\0\2\4"+
    "\1\0\4\4\17\0\2\4\1\141\3\4\11\0\5\4"+
    "\2\0\12\4\3\0\2\4\1\0\4\4\17\0\6\4"+
    "\11\0\1\4\1\142\3\4\2\0\12\4\3\0\2\4"+
    "\1\0\2\4\1\143\1\4\17\0\6\4\11\0\5\4"+
    "\2\0\12\4\3\0\2\4\1\0\4\4\17\0\3\4"+
    "\1\144\2\4\11\0\5\4\2\0\12\4\3\0\2\4"+
    "\1\0\4\4\17\0\6\4\11\0\5\4\2\0\1\4"+
    "\1\145\10\4\3\0\2\4\1\0\4\4\17\0\2\4"+
    "\1\146\3\4\11\0\5\4\2\0\12\4\3\0\2\4"+
    "\1\0\4\4\17\0\6\4\11\0\5\4\2\0\1\147"+
    "\11\4\3\0\2\4\1\0\4\4\17\0\6\4\11\0"+
    "\5\4\2\0\1\150\11\4\3\0\2\4\1\0\4\4"+
    "\17\0\6\4\11\0\5\4\2\0\2\4\1\151\2\4"+
    "\1\152\4\4\3\0\2\4\1\0\4\4\17\0\6\4"+
    "\11\0\4\4\1\153\2\0\12\4\3\0\2\4\1\0"+
    "\4\4\17\0\1\4\1\154\4\4\11\0\4\4\1\155"+
    "\2\0\12\4\3\0\2\4\1\0\4\4\17\0\5\4"+
    "\1\156\11\0\1\157\4\4\2\0\1\160\11\4\3\0"+
    "\2\4\1\0\4\4\17\0\5\4\1\161\11\0\5\4"+
    "\2\0\12\4\4\162\1\163\3\162\2\163\2\0\1\164"+
    "\17\162\2\163\13\162\1\163\1\162\1\163\6\162\1\163"+
    "\5\162\1\163\70\0\1\165\4\0\1\166\3\0\2\166"+
    "\22\0\2\166\13\0\1\166\1\0\1\166\6\0\1\166"+
    "\5\0\1\166\3\0\2\4\1\0\4\4\17\0\6\4"+
    "\11\0\5\4\2\0\1\4\1\167\10\4\3\0\2\4"+
    "\1\0\4\4\17\0\6\4\11\0\5\4\2\0\3\4"+
    "\1\170\6\4\1\0\2\171\10\0\1\171\56\0\2\172"+
    "\10\0\1\172\56\0\2\173\10\0\1\173\56\0\2\174"+
    "\10\0\1\174\56\0\2\175\10\0\1\175\112\0\1\176"+
    "\33\0\15\66\1\177\1\140\52\66\1\0\2\200\2\4"+
    "\1\0\4\4\1\0\1\200\15\0\6\4\11\0\5\4"+
    "\2\0\12\4\3\0\2\4\1\0\4\4\17\0\1\201"+
    "\5\4\11\0\5\4\2\0\12\4\3\0\2\4\1\0"+
    "\4\4\17\0\4\4\1\202\1\4\11\0\5\4\2\0"+
    "\12\4\3\0\2\4\1\0\4\4\17\0\6\4\11\0"+
    "\5\4\2\0\6\4\1\203\3\4\3\0\2\4\1\0"+
    "\4\4\17\0\2\4\1\204\3\4\11\0\5\4\2\0"+
    "\12\4\3\0\2\4\1\0\4\4\17\0\6\4\11\0"+
    "\1\4\1\205\3\4\2\0\12\4\3\0\2\4\1\0"+
    "\4\4\17\0\3\4\1\206\2\4\11\0\5\4\2\0"+
    "\12\4\3\0\2\4\1\0\4\4\17\0\6\4\11\0"+
    "\5\4\1\207\1\0\12\4\3\0\2\4\1\0\4\4"+
    "\17\0\5\4\1\210\11\0\5\4\2\0\12\4\3\0"+
    "\2\4\1\0\4\4\17\0\6\4\11\0\3\4\1\211"+
    "\1\4\2\0\12\4\3\0\2\4\1\0\4\4\17\0"+
    "\1\212\5\4\11\0\5\4\2\0\12\4\3\0\2\4"+
    "\1\0\4\4\17\0\6\4\11\0\1\213\4\4\2\0"+
    "\12\4\3\0\2\4\1\0\4\4\17\0\6\4\11\0"+
    "\1\4\1\214\3\4\2\0\12\4\4\0\1\215\3\0"+
    "\2\215\22\0\2\215\13\0\1\215\1\0\1\215\6\0"+
    "\1\215\5\0\1\215\13\162\1\0\55\162\3\0\2\4"+
    "\1\0\4\4\17\0\6\4\11\0\1\4\1\216\3\4"+
    "\2\0\12\4\3\0\2\4\1\0\4\4\17\0\6\4"+
    "\11\0\5\4\2\0\1\217\11\4\1\0\2\220\10\0"+
    "\1\220\60\0\2\4\1\0\4\4\17\0\6\4\11\0"+
    "\4\4\1\221\2\0\12\4\3\0\2\4\1\0\4\4"+
    "\17\0\6\4\11\0\1\222\4\4\2\0\12\4\3\0"+
    "\2\4\1\0\4\4\17\0\6\4\11\0\5\4\1\223"+
    "\1\0\12\4\3\0\2\4\1\0\4\4\17\0\2\4"+
    "\1\224\3\4\11\0\5\4\2\0\12\4\4\0\1\225"+
    "\3\0\2\225\22\0\2\225\13\0\1\225\1\0\1\225"+
    "\6\0\1\225\5\0\1\225\3\0\2\4\1\0\4\4"+
    "\17\0\2\4\1\226\3\4\11\0\5\4\2\0\12\4"+
    "\3\0\2\4\1\0\4\4\17\0\1\227\5\4\11\0"+
    "\5\4\2\0\12\4\3\0\2\4\1\0\4\4\17\0"+
    "\6\4\11\0\5\4\1\230\1\0\12\4\3\0\2\4"+
    "\1\0\4\4\17\0\6\4\11\0\1\231\4\4\2\0"+
    "\12\4\4\0\1\162\3\0\2\162\22\0\2\162\13\0"+
    "\1\162\1\0\1\162\6\0\1\162\5\0\1\162\3\0"+
    "\2\4\1\0\4\4\17\0\5\4\1\232\11\0\5\4"+
    "\2\0\12\4\3\0\2\4\1\0\4\4\17\0\2\4"+
    "\1\233\3\4\11\0\5\4\2\0\12\4\3\0\2\4"+
    "\1\0\4\4\17\0\1\234\5\4\11\0\5\4\2\0"+
    "\12\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5529];
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
    "\1\0\5\1\1\0\1\1\2\0\1\1\1\11\4\1"+
    "\4\11\1\1\4\11\5\1\1\0\1\1\17\0\1\1"+
    "\2\0\1\11\1\0\1\1\1\0\1\11\4\1\1\11"+
    "\12\1\3\11\3\0\2\1\6\11\1\0\4\11\1\0"+
    "\1\11\5\0\21\1\1\11\1\1\1\0\4\1\5\11"+
    "\1\0\2\11\6\1\1\11\5\1\1\0\2\1\1\11"+
    "\2\1\1\11\1\1\1\0\2\1\1\11\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[156];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public int getChar() {
	return yychar + 1;
    }

    public int getColumn() {
    	return yycolumn + 1;
    }

    public int getLine() {
	return yyline + 1;
    }

    public String getText() {
	return yytext();
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public SmplLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public SmplLexer(java.io.InputStream in) {
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
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 32: 
          { return new Symbol(sym.POW);
          }
        case 69: break;
        case 63: 
          { return new Symbol(sym.PAIRCHECK);
          }
        case 70: break;
        case 31: 
          { return new Symbol(sym.MOD);
          }
        case 71: break;
        case 4: 
          { // INTEGER
		    	return new Symbol(sym.INTEGER, 
					new Integer(yytext()));
          }
        case 72: break;
        case 7: 
          { return new Symbol(sym.COLON);
          }
        case 73: break;
        case 58: 
          { return new Symbol(sym.PROC);
          }
        case 74: break;
        case 19: 
          { return new Symbol(sym.STRING,
					yytext().substring(1, yytext().length()-1));
          }
        case 75: break;
        case 62: 
          { return new Symbol(sym.LAND);
          }
        case 76: break;
        case 50: 
          { return new Symbol(sym.LNOT);
          }
        case 77: break;
        case 54: 
          { return new Symbol(sym.LIST);
          }
        case 78: break;
        case 23: 
          { return new Symbol(sym.IF);
          }
        case 79: break;
        case 65: 
          { return new Symbol(sym.EQUAL);
          }
        case 80: break;
        case 48: 
          { return new Symbol(sym.NEQ);
          }
        case 81: break;
        case 14: 
          { return new Symbol(sym.RBRACKET);
          }
        case 82: break;
        case 38: 
          { return new Symbol(sym.DEF);
          }
        case 83: break;
        case 67: 
          { return new Symbol(sym.READINT);
          }
        case 84: break;
        case 33: 
          { return new Symbol(sym.EQ);
          }
        case 85: break;
        case 2: 
          { // skip whitespace
          }
        case 86: break;
        case 6: 
          { return new Symbol(sym.NEG);
          }
        case 87: break;
        case 12: 
          { return new Symbol(sym.RPAREN);
          }
        case 88: break;
        case 24: 
          { return new Symbol(sym.BOOL, false);
          }
        case 89: break;
        case 66: 
          { return new Symbol(sym.SUBSTR);
          }
        case 90: break;
        case 39: 
          { return new Symbol(sym.LET);
          }
        case 91: break;
        case 28: 
          { return new Symbol(sym.MINUS);
          }
        case 92: break;
        case 27: 
          { return new Symbol(sym.PLUS);
          }
        case 93: break;
        case 17: 
          { return new Symbol(sym.LSTCONCAT);
          }
        case 94: break;
        case 61: 
          { return new Symbol(sym.SIZE);
          }
        case 95: break;
        case 64: 
          { return new Symbol(sym.PRINT);
          }
        case 96: break;
        case 40: 
          { return new Symbol(sym.CAR);
          }
        case 97: break;
        case 26: 
          { return new Symbol(sym.EMPTYLIST);
          }
        case 98: break;
        case 60: 
          { return new Symbol(sym.CASE);
          }
        case 99: break;
        case 35: 
          { return new Symbol(sym.BOR);
          }
        case 100: break;
        case 46: 
          { return new Symbol(sym.GE);
          }
        case 101: break;
        case 68: 
          { return new Symbol(sym.PRINTLN);
          }
        case 102: break;
        case 55: 
          { return new Symbol(sym.ELSE);
          }
        case 103: break;
        case 9: 
          { return new Symbol(sym.LBRACE);
          }
        case 104: break;
        case 47: 
          { return new Symbol(sym.LE);
          }
        case 105: break;
        case 15: 
          { return new Symbol(sym.COMMA);
          }
        case 106: break;
        case 51: 
          { return new Symbol(sym.THEN);
          }
        case 107: break;
        case 57: 
          { return new Symbol(sym.PAIR);
          }
        case 108: break;
        case 18: 
          { // REAL NUMBER
				return new Symbol(sym.REAL,
					new Double(yytext()));
          }
        case 109: break;
        case 45: 
          { return new Symbol(sym.ASSIGN);
          }
        case 110: break;
        case 30: 
          { return new Symbol(sym.MUL);
          }
        case 111: break;
        case 53: 
          { return new Symbol(sym.LAZY);
          }
        case 112: break;
        case 44: 
          { // HEXADECIMAL INTEGER
				return new Symbol(sym.INTEGER,
					Integer.parseInt(yytext().replace("#x", ""), 16));
          }
        case 113: break;
        case 5: 
          { return new Symbol(sym.PERIOD);
          }
        case 114: break;
        case 3: 
          { // VARIABLE
				return new Symbol(sym.VARIABLE, yytext());
          }
        case 115: break;
        case 41: 
          { return new Symbol(sym.CDR);
          }
        case 116: break;
        case 49: 
          { return new Symbol(sym.LOR);
          }
        case 117: break;
        case 16: 
          { return new Symbol(sym.SEMI);
          }
        case 118: break;
        case 36: 
          { return new Symbol(sym.GT);
          }
        case 119: break;
        case 1: 
          { //skip newline, but reset char counter
			 yychar = 0;
          }
        case 120: break;
        case 25: 
          { return new Symbol(sym.BOOL, true);
          }
        case 121: break;
        case 59: 
          { return new Symbol(sym.CALL);
          }
        case 122: break;
        case 37: 
          { return new Symbol(sym.LT);
          }
        case 123: break;
        case 43: 
          { // BINARY INTEGER
				return new Symbol(sym.INTEGER,
					Integer.parseInt(yytext().replace("#b", ""), 2));
          }
        case 124: break;
        case 22: 
          { return new Symbol(sym.LVEC);
          }
        case 125: break;
        case 20: 
          { // skip comment
          }
        case 126: break;
        case 52: 
          { return new Symbol(sym.READ);
          }
        case 127: break;
        case 11: 
          { return new Symbol(sym.LPAREN);
          }
        case 128: break;
        case 13: 
          { return new Symbol(sym.LBRACKET);
          }
        case 129: break;
        case 42: 
          { return new Symbol(sym.CHARACTER,
					yytext().replace("#c",""));
          }
        case 130: break;
        case 21: 
          { return new Symbol(sym.RVEC);
          }
        case 131: break;
        case 10: 
          { return new Symbol(sym.RBRACE);
          }
        case 132: break;
        case 29: 
          { return new Symbol(sym.DIV);
          }
        case 133: break;
        case 56: 
          { return new Symbol(sym.EQV);
          }
        case 134: break;
        case 8: 
          { return new Symbol(sym.BNOT);
          }
        case 135: break;
        case 34: 
          { return new Symbol(sym.BAND);
          }
        case 136: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { 	return new Symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
