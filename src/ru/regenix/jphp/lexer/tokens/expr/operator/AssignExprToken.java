package ru.regenix.jphp.lexer.tokens.expr.operator;

import ru.regenix.jphp.lexer.TokenType;
import ru.regenix.jphp.lexer.tokens.TokenMeta;
import ru.regenix.jphp.lexer.tokens.expr.OperatorExprToken;

public class AssignExprToken extends OperatorExprToken {

    public AssignExprToken(TokenMeta meta) {
        super(meta, TokenType.T_J_EQUAL);
    }

    @Override
    public int getPriority() {
        return 150;
    }
}
