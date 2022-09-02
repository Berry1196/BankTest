public class Danish extends Dialog{

    @Override
    public String hi() {
        return "Hej og velkommen!";
    }

    @Override
    public String changeLanguage() {
        return "Ønsker du at skifte sprog?";
    }

    @Override
    public String selectLanguage() {
        return "Angiv sprog dk/eng/sve";
    }
}
