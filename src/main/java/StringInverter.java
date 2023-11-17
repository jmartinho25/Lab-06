public class StringInverter implements StringTransformer {
    private String originalTest;
    @Override
    public void execute(StringDrink drink) {
        originalTest= drink.getText();
        StringBuilder string= new StringBuilder(drink.getText());
        string.reverse();
        drink.setText(string.toString());
    }
    public void undo(StringDrink drink){
        drink.setText(originalTest);
    }
}
