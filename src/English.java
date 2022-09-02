public class English extends Dialog{
    @Override
    public String hi() {
        return "Hello and welcome!";
    }

    @Override
    public String changeLanguage() {
        return "Do you want to switch language?";
    }

    @Override
    public String selectLanguage() {
        return "Select language dk/eng/sve";
    }
}
