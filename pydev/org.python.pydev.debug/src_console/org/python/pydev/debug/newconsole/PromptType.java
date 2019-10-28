package org.python.pydev.debug.newconsole;

enum PromptType {
    OK(1), CANCEL(2), YES(4), NO(8), NUM(16), ALPHA(32), LIST(64), YES_NO(128), OK_CANCEL(512), DATE(1024), COMBO(
            2048);
    private int type;

    private PromptType(int type) {
        this.type = type;
    };

    public boolean matches(int promptType) {
        return (promptType & type) > 0;
    }
}