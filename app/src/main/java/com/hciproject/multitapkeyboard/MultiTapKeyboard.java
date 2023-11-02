package com.hciproject.multitapkeyboard;

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

public class MultiTapKeyboard extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    private KeyboardView keyboardView;

    @Override
    public View onCreateInputView() {
        keyboardView = (KeyboardView) getLayoutInflater().inflate(R.layout.multitap_keyboard_layout, null);
        Keyboard keyboard = new Keyboard(this, R.xml.main_keyboard_layout);
        keyboardView.setKeyboard(keyboard);

        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }

    @Override
    public void onPress(int i) {

    }

    @Override
    public void onRelease(int i) {

    }

    @Override
    public void onKey(int i, int[] ints) {

    }

    @Override
    public void onText(CharSequence charSequence) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
