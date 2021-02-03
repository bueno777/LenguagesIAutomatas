public class Configuraciones {
    public static final String[]KEYWORDS = new String[]{
            "kg","sarten","cebolla","chiles","casuela","sumar","mantequilla","declarar", "como",
            "entero", "print", "cocinar"
    };

    public static final String KEYWORD_PATTERN = "\\b("+ String.join("|", KEYWORDS) + ") + \\b";
    public static final String PAREN_PATTERN = "\\(/\\)";
    public static final String BRACE_PATTERN = "\\{/\\}";
    public static final String BRACKET_PATTERN = "\\[\\]";
    public static final String SEMICOLON_PATTERN = "\\;";
    public static final String STRING_PATTERN = "\"([^\"\\\\]/\\\\.)*\"";

    public static final Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>"+ KEYWORD_PATTERN + ")"
            + "/?<PAREN>"+ PAREN_PATTERN + ")"
            + "/?<BRACE>"+ BRACE_PATTERN + ")"
            + "/?<BRACKET>"+ BRACKET_PATTERN + ")"
            + "/?<SEMICOLON>"+ SEMICOLON_PATTERN + ")"
            + "/?<STRING>"+ STRING_PATTERN + ")"
            + "/?<COMMENT>"+ COMMENT_PATTERN  + ")"

    );

    public static final String sampleCode = String.join("\n", new String[]{
            "print(10)",

    });

    public static String[] expressiones ={
            "sumar [a-z]{1,} mas [a-z]{1,}",
            "declarar [a-z]{1,} como (sarten|cebolla)",
            "print[(][a-z0-9]{1,}[)]",
            "cocinar[(][a-z0-9]{1,}[)]"
    };

}
