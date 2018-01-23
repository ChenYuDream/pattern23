package com.chenyu;

/**
 * 键盘转接器
 *
 * @author yu_chen
 * @create 2018-01-23 18:26
 **/
public class KeyToComputerAdapter implements Adapter {

    private KeyBoard keyBoard;

    public KeyToComputerAdapter(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public void handlerRequest() {
        keyBoard.typing();
    }
}
