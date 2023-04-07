package solid.lsp.impl;

/**
 * Пример несоблюдения принципов LSP
 */
public class Snake implements Animal{
    @Override
    public int legCount() {
        throw new RuntimeException("Snake has no legs");
    }
}
