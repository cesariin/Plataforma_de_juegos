class MacOSFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }
    @Override
    public TextBox createTextBox() {
        return new MacOSTextBox();
    }
}