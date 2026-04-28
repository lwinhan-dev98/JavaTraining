package Step8.lesson11;

public class MarkdownConverter {

    public String convertToHtml(String markdown) {
        return "<html><body>" +
                markdown.replace("**", "<b>")
                        .replace("*", "<i>") +
                "</body></html>";
    }
}