package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchSuggestionsSystem{
  public List<List<String>> suggestedProducts(String[] products, String searchWord) {
    List<List<String>> al = new ArrayList<>();
    Arrays.sort(products);
    for(int i = 0; i < searchWord.length(); i++){
      List<String> nested = new ArrayList<>();
      String str = searchWord.substring(0, i+1);
      for(int j = 0; j < products.length; j++){
        if(nested.size() >= 3){
          break;
        }
        if(products[j].startsWith(str)){
          nested.add(products[j]);
        }
      }
      al.add(nested);
    }
    return al;
  }
}
