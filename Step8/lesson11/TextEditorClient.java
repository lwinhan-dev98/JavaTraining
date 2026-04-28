package Step8.lesson11;

public class TextEditorClient implements TextEditor {

    private FormatAdapter adapter;

    @Override
    public void display(String format, String content) {

        if (format.equalsIgnoreCase("markdown") ||
            format.equalsIgnoreCase("plaintext")) {

            adapter = new FormatAdapter(format);
            adapter.display(format, content);

        } else {
            System.out.println("Invalid format: " + format);
        }
    }
}