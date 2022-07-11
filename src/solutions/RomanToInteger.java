public class RomanToInteger{
  public int romanToInt(String s) {
    int result=0, i=0;
    while(i < s.length()) {
      if(i+1 < s.length()) {
        if(s.charAt(i) == 'I') {
          if(s.charAt(i+1) == 'V') {
            result += 4;
            i+=2;
            continue;
          } else if(s.charAt(i+1) == 'X') {
            result += 9;
            i+=2;
            continue;
          }
        }
        if(s.charAt(i) == 'X') {
          if(s.charAt(i+1) == 'L') {
            result += 40;
            i+=2;
            continue;
          } else if(s.charAt(i+1) == 'C') {
            result += 90;
            i+=2;
            continue;
          }
        }
        if(s.charAt(i) == 'C') {
          if(s.charAt(i+1) == 'D') {
            result += 400;
            i+=2;
            continue;
          } else if(s.charAt(i+1) == 'M') {
            result += 900;
            i+=2;
            continue;
          }
        }
      }
        switch(s.charAt(i)) {
          case 'I': result += 1;
            break;
          case 'V': result += 5;
            break;
          case 'X': result += 10;
            break;
          case 'L': result += 50;
            break;
          case 'C': result += 100;
            break;
          case 'D': result += 500;
            break;
          case 'M': result += 1000;
            break;
        }
        i++;
      } 
      return result;
  }
}
