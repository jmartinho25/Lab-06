public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        StringBuilder string= new StringBuilder(drink.getText());
        string.reverse();
        drink.setText(string.toString());
    }
}
