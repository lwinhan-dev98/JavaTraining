package Step8.lesson11;

public class Client {

    public static void main(String[] args) {

        TextEditor editor = new TextEditorClient();

        editor.display("plaintext", "This is plain text.");
        editor.display("markdown", "**Bold** and *Italic* text.");
        editor.display("xml", "<tag>Unsupported format</tag>");
    }
}