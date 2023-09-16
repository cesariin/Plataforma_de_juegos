class Game {

    public Game(AbstractFactory factory) {
        Button button = factory.createButton();
        Window window = factory.createWindow();
        TextBox textBox = factory.createTextBox();
    }
    public void run() {
    }
}