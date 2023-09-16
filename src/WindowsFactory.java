class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}