public class Main {
    public static void main(String[] args) {
        AbstractFactory windowsFactory = new WindowsFactory();
        Game windowsGame = new Game(windowsFactory);
        windowsGame.run();

        AbstractFactory macFactory = new MacOSFactory();
        Game macGame = new Game(macFactory);
        macGame.run();

        AbstractFactory linuxFactory = new LinuxFactory();
        Game linuxGame = new Game(linuxFactory);
        linuxGame.run();
    }
}