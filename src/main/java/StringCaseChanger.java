public class StringCaseChanger implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        String text= drink.getText();
        StringBuilder newtext= new StringBuilder();
        for (int i=0;i<text.length();i++){
              if  (Character.isLowerCase(text.charAt(i))){
                 char elem = Character.toUpperCase(text.charAt(i));
                 newtext.append(elem);
              }
              else {
                  char elem = Character.toLowerCase(text.charAt(i));
                  newtext.append(elem);
              }

        }
        drink.setText(newtext.toString());

    }
}
