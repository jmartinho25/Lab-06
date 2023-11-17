public class StringReplacer implements StringTransformer{
    private char char1;
    public char char2;
    private String originalText;
    public StringReplacer(char char1, char char2){
        this.char1=char1;
        this.char2=char2;
        
    }
    public void execute(StringDrink drink){
        originalText= drink.getText();
        drink.setText(drink.getText().replace(char1, char2));

    }
    public void undo(StringDrink drink){
        drink.setText(originalText);
    }
}
